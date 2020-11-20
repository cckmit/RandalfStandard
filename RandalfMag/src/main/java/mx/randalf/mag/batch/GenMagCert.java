/**
 * 
 */
package mx.randalf.mag.batch;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

import org.im4java.process.ProcessStarter;

import it.sbn.iccu.metaag1.Img;
import it.sbn.iccu.metaag1.Metadigit;
import it.sbn.iccu.metaag1.Img.Altimg;
import mx.randalf.interfacException.exception.PubblicaException;
import mx.randalf.mag.MagXsd;
import mx.randalf.xsd.exception.XsdException;

/**
 * @author massi
 *
 */
public class GenMagCert {

	private String schemaXsd = "http://www.bncf.firenze.sbn.it/SchemaXML/Mag/2.0.1/metadigit.xsd";

	/**
	 * 
	 */
	public GenMagCert(String calcImgPath, String schemaXsd) {
		if (calcImgPath != null){
			ProcessStarter.setGlobalSearchPath(calcImgPath);
		}
		this.schemaXsd = schemaXsd;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GenMagCert genMagCert = null;
		try {
			if (args.length==3) {
				genMagCert = new GenMagCert(args[0], args[1]);
				genMagCert.esegui(args[2], new File(args[3]));
			}
		} catch (XsdException e) {
			e.printStackTrace();
		} catch (PubblicaException e) {
			e.printStackTrace();
		}
	}

	public void esegui(String pathElab, File fileMd5) throws XsdException, PubblicaException {
		File fElab = null;
		
		try {
			fElab = new File(pathElab);
			if (fElab.isDirectory()) {
				scanFolder(fElab, schemaXsd, fileMd5);
			} else {
				elabFile(fElab, schemaXsd, fileMd5);
			}
		} catch (XsdException e) {
			throw e;
		} catch (PubblicaException e) {
			throw e;
		}
	}

	private void scanFolder(File fElab, String schemaXsd, File fileMd5) throws XsdException, PubblicaException {
		File[] fl = null;
		
		try {
			fl = fElab.listFiles(new FileFilter() {
				
				@Override
				public boolean accept(File pathname) {
					boolean result = false;
					File fCert = null;

					if (!pathname.getName().startsWith(".")) {
						if (pathname.isDirectory()) {
							result = true;
						} else if (pathname.getName().endsWith(".xml")) {
							fCert = new File(pathname.getAbsolutePath()+".cert");
							if (!fCert.exists()) {
								result = true;
							}
						}
					}
					return result;
				}
			});
			
			Arrays.sort(fl);
			for(File f : fl) {
				if (f.isDirectory()) {
					scanFolder(f, schemaXsd, fileMd5);
				} else {
					elabFile(f, schemaXsd, fileMd5);
				}
			}
		} catch (XsdException e) {
			throw e;
		} catch (PubblicaException e) {
			throw e;
		}
	}

	private void elabFile(File fMag, String schemaXsd, File fileMd5) throws XsdException, PubblicaException {
		Metadigit mag = null;
		MagXsd magXsd = null;
		String[] usages =null;
		File fElabOK = null;
		File fElabKO = null;
		File fSolr = null;
		
		try {
			magXsd = new MagXsd(schemaXsd);
			mag = magXsd.read(fMag);
			usages = new String[1];
			usages[0]="3";
			for(Img img: mag.getImg()) {
				img.getFile().setHref(img.getFile().getHref().replaceAll("\\\\", "/"));
				for (Altimg altimg : img.getAltimg()) {
					altimg.getFile().setHref(altimg.getFile().getHref().replaceAll("\\\\", "/"));
				}
				magXsd.calcImg(img, fMag.getParentFile().getAbsolutePath(), usages);
			}
			if (magXsd.write(mag, fMag, true, fileMd5)) {
				fElabOK = new File(fMag.getAbsolutePath()+".elabOK");
				if (fElabOK.exists()) {
					if (!fElabOK.delete()) {
						throw new PubblicaException("Problemi nella cancellazione del file "+fElabOK.getAbsolutePath());
					}
				}
				fElabKO = new File(fMag.getAbsolutePath()+".elabKO");
				if (fElabKO.exists()) {
					if (!fElabKO.delete()) {
						throw new PubblicaException("Problemi nella cancellazione del file "+fElabKO.getAbsolutePath());
					}
				}
				fSolr = new File(fMag.getAbsolutePath()+".solr");
				if (fSolr.exists()) {
					if (!fSolr.delete()) {
						throw new PubblicaException("Problemi nella cancellazione del file "+fSolr.getAbsolutePath());
					}
				}
			}
		} catch (XsdException e) {
			throw e;
		} catch (PubblicaException e) {
			throw e;
		}
	}

}
