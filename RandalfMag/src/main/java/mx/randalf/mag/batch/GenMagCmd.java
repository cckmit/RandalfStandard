/**
 * 
 */
package mx.randalf.mag.batch;

import java.io.File;
import java.io.FileFilter;
import java.math.BigInteger;
import java.util.Arrays;

import org.apache.log4j.Logger;
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
public class GenMagCmd {

	private Logger log = Logger.getLogger(GenMagCmd.class);

	/**
	 * 
	 */
	public GenMagCmd() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GenMagCmd genMagCmd = null;

		if (args.length==1){
			genMagCmd = new GenMagCmd();
			genMagCmd.esegui(args[0]);
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
		
		pathMag = new File(path);
		if (pathMag.exists()){
			fileMag = new File(pathMag.getAbsolutePath()+".xml");
			if (!fileMag.exists()){
				pathArchivio = new File(pathMag.getAbsolutePath()+File.separator+"Archivio");
				if (pathArchivio.exists()){
					pathInternet = new File(pathMag.getAbsolutePath()+File.separator+"Internet");
					if (pathInternet.exists()){
						pathIntranet = new File(pathMag.getAbsolutePath()+File.separator+"Intranet");
						if (pathIntranet.exists()){
							genMag(pathMag.getName(), pathArchivio, fileMag);
						} else {
							log.error("\n"+"La cartella ["+pathIntranet.getAbsolutePath()+"] non esiste");
						}
					} else {
						log.error("\n"+"La cartella ["+pathInternet.getAbsolutePath()+"] non esiste");
					}
				} else {
					log.error("\n"+"La cartella ["+pathArchivio.getAbsolutePath()+"] non esiste");
				}
			} else {
				log.error("\n"+"Il file ["+fileMag.getAbsolutePath()+"] esiste");
			}
		} else {
			log.error("\n"+"La cartella ["+pathMag.getAbsolutePath()+"] non esiste");
		}
	}

	private void genMag(String identifier, File pathArchivio, File fileMag){
		Metadigit mag = null;
		MagXsd magXsd = null;
		File[] files = null;
		int sequenceNumber = 0;
		
		try {
			mag = new Metadigit();
			mag.setGen(genGen());
			mag.setBib(genBib(identifier));

			files = pathArchivio.listFiles(new FileFilter() {
				
				@Override
				public boolean accept(File pathname) {
					boolean result = false;
					if (pathname.isFile()){
						if (!pathname.getName().startsWith("._") &&
								pathname.getName().toLowerCase().endsWith(".tif")){
							result = true;
						}
					}
					return result;
				}
			});
			Arrays.sort(files);

			for(File file : files){
				sequenceNumber++;
				mag.getImg().add(genImg(new BigInteger(sequenceNumber+""), "Pagina: "+sequenceNumber, identifier, file.getName()));
			}
			
			magXsd = new MagXsd("http://www.bncf.firenze.sbn.it/SchemaXML/Mag/2.0.1/metadigit.xsd");
			magXsd.write(mag, fileMag, new MagNamespacePrefix(), null, null, 
					"http://www.iccu.sbn.it/metaAG1.pdf http://www.bncf.firenze.sbn.it/SchemaXML/Mag/2.0.1/metadigit.xsd");
		} catch (XsdException e) {
			e.printStackTrace();
		}
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
		bib.getTitle().add(genSimpleLiteral("Title"));
		bib.getCreator().add(genSimpleLiteral("getCreator"));
		bib.getPublisher().add(genSimpleLiteral("getPublisher"));
		bib.getSubject().add(genSimpleLiteral("getSubject"));
		bib.getDescription().add(genSimpleLiteral("getDescription"));
		bib.getContributor().add(genSimpleLiteral("getContributor"));
		bib.getDate().add(genSimpleLiteral("getDate"));
		bib.getType().add(genSimpleLiteral("getType"));
		bib.getFormat().add(genSimpleLiteral("getFormat"));
		bib.getSource().add(genSimpleLiteral("getSource"));
		bib.getLanguage().add(genSimpleLiteral("getLanguage"));
		bib.getRelation().add(genSimpleLiteral("getRelation"));
		bib.getCoverage().add(genSimpleLiteral("getCoverage"));
		bib.getRights().add(genSimpleLiteral("getRights"));

		return bib;
	}

	private SimpleLiteral genSimpleLiteral(String value){
		SimpleLiteral simpleLiteral = null;
		
		simpleLiteral = new SimpleLiteral();
		simpleLiteral.getContent().add(value);

		return simpleLiteral;
	}

	private Img genImg(BigInteger sequenceNumber, String nomenclature, String folder, String fileImg){
		Img img = null;
		Dimensions imageDimensions = null;
		Link file = null;

		img = new Img();
		img.setSequenceNumber(sequenceNumber);
		img.setNomenclature(nomenclature);
		img.getUsage().add("1");

		file = new Link();
		file.setHref("./"+folder+"/Archivio/"+fileImg);

		img.setFile(file);
		img.setMd5("MD5MD5MD5MD5MD5MD5MD5MD5MD5MD5MD");
		
		imageDimensions = new Dimensions();
		imageDimensions.setImagelength(new BigInteger("1"));
		imageDimensions.setImagewidth(new BigInteger("1"));
		img.setImageDimensions(imageDimensions);

		img.getAltimg().add(genAltimg("2", folder, "Intranet", fileImg.replace(".TIF", ".jpg")));
		img.getAltimg().add(genAltimg("3", folder, "Internet", fileImg.replace(".TIF", ".jpg")));

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
