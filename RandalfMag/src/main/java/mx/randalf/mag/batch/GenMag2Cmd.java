/**
 * 
 */
package mx.randalf.mag.batch;

import java.io.File;
import java.io.FileFilter;
import java.math.BigInteger;
import java.util.Arrays;

import org.im4java.process.ProcessStarter;
import org.niso.pdfs.datadict.Dimensions;
import org.purl.dc.elements._1.SimpleLiteral;

import it.sbn.iccu.metaag1.Bib;
import it.sbn.iccu.metaag1.BibliographicLevel;
import it.sbn.iccu.metaag1.Gen;
import it.sbn.iccu.metaag1.Img;
import it.sbn.iccu.metaag1.Link;
import it.sbn.iccu.metaag1.Metadigit;
import it.sbn.iccu.metaag1.Img.Altimg;
import mx.randalf.mag.MagNamespacePrefix;
import mx.randalf.mag.MagXsd;
import mx.randalf.xsd.exception.XsdException;

/**
 * @author massi
 *
 */
public class GenMag2Cmd {

	/**
	 * 
	 */
	public GenMag2Cmd(String pathImageMagick) {
		ProcessStarter.setGlobalSearchPath(pathImageMagick);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GenMag2Cmd genMagCmd = null;

		if (args.length==2){
			genMagCmd = new GenMag2Cmd(args[0]);
			genMagCmd.esegui(args[1]);
		} else {
			System.out.println("Indicare la cartella da analizzare");
		}
	}

	public void esegui(String path){
		File pathMag = null;
		File fileMag = null;
		File pathArchivio = null;
		File pathInternet = null;
		File pathIntranet = null;
		boolean isArchivio = false;
		boolean isInternet = false;
		boolean isIntranet = false;
		
		pathMag = new File(path);
		if (pathMag.exists()){
			fileMag = new File(pathMag.getAbsolutePath()+".xml");
			if (!fileMag.exists()){
				pathArchivio = new File(pathMag.getAbsolutePath()+File.separator+"Archivio");
				if (pathArchivio.exists()){
					isArchivio=true;
				}
				pathInternet = new File(pathMag.getAbsolutePath()+File.separator+"Internet");
				if (pathInternet.exists()){
					isInternet = true;
				}
				pathIntranet = new File(pathMag.getAbsolutePath()+File.separator+"Intranet");
				if (pathIntranet.exists()){
					isIntranet = true;
				}
				if (isArchivio || isInternet|| isIntranet){
					System.out.println("Inizio elaborare il file: "+fileMag.getAbsolutePath());
					genMag(pathMag.getName(), isArchivio, isInternet, isIntranet, pathMag, fileMag);
					System.out.println("Fine elaborare il file: "+fileMag.getAbsolutePath());
				} else {
					System.out.println("Mancano le cartelle delle immagini in ["+pathMag.getAbsolutePath()+"]");
				}
			} else {
				System.out.println("Il file ["+fileMag.getAbsolutePath()+"] esiste");
			}
		} else {
			System.out.println("La cartella ["+pathMag.getAbsolutePath()+"] non esiste");
		}
	}

	private void genMag(String identifier, boolean isArchivio, boolean isInternet, boolean isIntranet, File pathMag, 
			File fileMag){
		Metadigit mag = null;
		MagXsd magXsd = null;
		File[] files = null;
		int sequenceNumber = 0;
		Img img = null;
		
		try {
			mag = new Metadigit();
			mag.setGen(genGen());
			mag.setBib(genBib(identifier));

			files= getFile(isArchivio, isInternet, isIntranet, pathMag);
			Arrays.sort(files);

			magXsd = new MagXsd();
			for(File file : files){
				sequenceNumber++;
				if ((sequenceNumber%10)==0){
					System.out.println("Elaboati: "+sequenceNumber+"/"+files.length);
				}
				img=null;
				if (isArchivio){
					img = genImg(new BigInteger(sequenceNumber+""), 
							"Pagina: "+sequenceNumber, 
							identifier, 
							"Archivio", 
							"1", 
							file.getName());
					if (isIntranet){
						img.getAltimg().add(genAltimg("2", identifier, "Intranet", file.getName().replace(".TIF", ".jpg").replace(".tif", ".jpg")));
					}
					if (isInternet){
						img.getAltimg().add(genAltimg("3", identifier, "Internet", file.getName().replace(".TIF", ".jpg").replace(".tif", ".jpg")));
					}
				} else if(isIntranet){
					img = genImg(new BigInteger(sequenceNumber+""), 
							"Pagina: "+sequenceNumber, 
							identifier, 
							"Intranet", 
							"2", 
							file.getName());
					if (isInternet){
						img.getAltimg().add(genAltimg("3", identifier, "Internet", file.getName()));
					}
				} else {
					img = genImg(new BigInteger(sequenceNumber+""), 
							"Pagina: "+sequenceNumber, 
							identifier, 
							"Internet", 
							"3", 
							file.getName());
				}
				magXsd.calcImg(img, pathMag.getParentFile().getAbsolutePath());
				mag.getImg().add(img);
			}
			
			magXsd.write(mag, fileMag, new MagNamespacePrefix(), null, null, 
					"http://www.iccu.sbn.it/metaAG1.pdf http://www.bncf.firenze.sbn.it/SchemaXML/Mag/2.0.1/metadigit.xsd");
		} catch (XsdException e) {
			e.printStackTrace();
		}
	}

	private File[] getFile( boolean isArchivio, boolean isInternet, boolean isIntranet, File pathMag){
		File[] files = null;
		File pathImg = null;

		if (isArchivio){
			pathImg = new File(pathMag.getAbsolutePath()+File.separator+"Archivio");
			files = pathImg.listFiles(new FileFilter() {
				
				@Override
				public boolean accept(File pathname) {
					boolean result = false;
					if (pathname.isFile()){
						if (!pathname.getName().startsWith(".") &&
								pathname.getName().toLowerCase().endsWith(".tif")){
							result = true;
						}
					}
					return result;
				}
			});
		} else if (isIntranet){
			pathImg = new File(pathMag.getAbsolutePath()+File.separator+"Intranet");
			files = pathImg.listFiles(new FileFilter() {
				
				@Override
				public boolean accept(File pathname) {
					boolean result = false;
					if (pathname.isFile()){
						if (!pathname.getName().startsWith(".") &&
								pathname.getName().toLowerCase().endsWith(".jpg")){
							result = true;
						}
					}
					return result;
				}
			});
		} else if (isInternet){
			pathImg = new File(pathMag.getAbsolutePath()+File.separator+"Internet");
			files = pathImg.listFiles(new FileFilter() {
				
				@Override
				public boolean accept(File pathname) {
					boolean result = false;
					if (pathname.isFile()){
						if (!pathname.getName().startsWith(".") &&
								pathname.getName().toLowerCase().endsWith(".jpg")){
							result = true;
						}
					}
					return result;
				}
			});
		}
		return files;
	}

	private Gen genGen(){
		Gen gen = null;
		
		gen = new Gen();
		gen.setStprog("stprog");
		gen.setCollection("collection");
		gen.setAgency("agency");
		gen.setAccessRights(new BigInteger("1"));
		gen.setCompleteness(new BigInteger("0"));
		return gen;
	}

	private Bib genBib(String identifier){
		Bib bib = null;
		
		bib = new Bib();
		bib.setLevel(BibliographicLevel.M);
		bib.getIdentifier().add(genSimpleLiteral(identifier));

		return bib;
	}

	private SimpleLiteral genSimpleLiteral(String value){
		SimpleLiteral simpleLiteral = null;
		
		simpleLiteral = new SimpleLiteral();
		simpleLiteral.getContent().add(value);

		return simpleLiteral;
	}

	private Img genImg(BigInteger sequenceNumber, String nomenclature, String folder, String subFolder, String usage, String fileImg){
		Img img = null;
		Dimensions imageDimensions = null;
		Link file = null;

		img = new Img();
		img.setSequenceNumber(sequenceNumber);
		img.setNomenclature(nomenclature);
		img.getUsage().add(usage);

		file = new Link();
		file.setHref("./"+folder+"/"+subFolder+"/"+fileImg);

		img.setFile(file);
		img.setMd5("MD5MD5MD5MD5MD5MD5MD5MD5MD5MD5MD");
		
		imageDimensions = new Dimensions();
		imageDimensions.setImagelength(new BigInteger("1"));
		imageDimensions.setImagewidth(new BigInteger("1"));
		img.setImageDimensions(imageDimensions);

		return img;
	}

	private Altimg genAltimg(String usage, String folder, String folderImg, String fileImg){
		Altimg altimg = null;
		Dimensions imageDimensions = null;
		Link file = null;
		
		altimg = new Altimg();
		altimg.getUsage().add(usage);

		file = new Link();
		file.setHref("./"+folder+"/"+folderImg+"/"+fileImg);

		altimg.setFile(file);
		altimg.setMd5("MD5MD5MD5MD5MD5MD5MD5MD5MD5MD5MD");
		
		imageDimensions = new Dimensions();
		imageDimensions.setImagelength(new BigInteger("1"));
		imageDimensions.setImagewidth(new BigInteger("1"));
		altimg.setImageDimensions(imageDimensions);

		return altimg;
	}
}
