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

	/**
	 * 
	 */
	public GenMagCert(String calcImgPath) {
		if (calcImgPath != null){
			ProcessStarter.setGlobalSearchPath(calcImgPath);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GenMagCert genMagCert = null;
		try {
			if (args.length==2) {
				genMagCert = new GenMagCert(args[0]);
				genMagCert.esegui(args[1]);
			}
		} catch (XsdException e) {
			e.printStackTrace();
		} catch (PubblicaException e) {
			e.printStackTrace();
		}
	}

	public void esegui(String pathElab) throws XsdException, PubblicaException {
		File fElab = null;
		
		try {
			fElab = new File(pathElab);
			if (fElab.isDirectory()) {
				scanFolder(fElab);
			} else {
				elabFile(fElab);
			}
		} catch (XsdException e) {
			throw e;
		} catch (PubblicaException e) {
			throw e;
		}
	}

	private void scanFolder(File fElab) throws XsdException, PubblicaException {
		File[] fl = null;
		
		try {
			System.out.println("Elaboro: "+fElab.getAbsolutePath());
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
					scanFolder(f);
				} else {
					elabFile(f);
				}
			}
		} catch (XsdException e) {
			throw e;
		} catch (PubblicaException e) {
			throw e;
		}
	}

	private void elabFile(File fMag) throws XsdException, PubblicaException {
		Metadigit mag = null;
		MagXsd magXsd = null;
		String[] usages =null;
		File fElabOK = null;
		File fElabKO = null;
		File fSolr = null;
		
		try {
			magXsd = new MagXsd();
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
			if (magXsd.write(mag, fMag)) {
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
