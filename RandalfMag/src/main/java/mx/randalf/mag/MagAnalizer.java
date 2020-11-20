/**
 * 
 */
package mx.randalf.mag;

import it.sbn.iccu.metaag1.Img;
import it.sbn.iccu.metaag1.Img.Altimg;
import it.sbn.iccu.metaag1.Metadigit;

import java.io.File;
import java.io.FileFilter;
import java.util.Hashtable;

import org.apache.log4j.Logger;

import mx.randalf.interfacException.exception.PubblicaException;
import mx.randalf.xsd.exception.XsdException;


/**
 * Questa classe viene utilizzata come tools per l'analisi dei mag con i
 * relativi controlli
 * 
 * @author massi
 * 
 */
public class MagAnalizer {

	private Logger log = Logger.getLogger(getClass());

	private String folderScan;

	private String collection;

	private boolean checkIdentifierDuplicate = false;

	private Hashtable<String, String> identifierDuplicate = null;

	private String folderUsage1 = null;

	private String folderUsage2 = null;

	private String folderUsage3 = null;

	private boolean aggUsage = false;

	private String schemaXsd = "http://www.bncf.firenze.sbn.it/SchemaXML/Mag/2.0.1/metadigit.xsd";
	
	public void setSchemaXsd(String schemaXsd) {
		this.schemaXsd = schemaXsd;
	}

	/**
	 * 
	 */
	public MagAnalizer() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MagAnalizer magAnalizer = null;
		File fileMd5 = null;
		if (args.length > 0) {
			magAnalizer = new MagAnalizer();
			for (int x = 0; x < args.length; x++) {
				if (args[x].equalsIgnoreCase("-h")) {
					printHelp();
					System.exit(0);
				} else if (args[x].equalsIgnoreCase("-p")) {
					x++;
					magAnalizer.setFolderScan(args[x]);
				} else if (args[x].equalsIgnoreCase("-c")) {
					x++;
					magAnalizer.setCollection(args[x]);
				} else if (args[x].equalsIgnoreCase("-cid")) {
					magAnalizer.setCheckIdentifierDuplicate(true);
				} else if (args[x].equalsIgnoreCase("-cu1")) {
					x++;
					magAnalizer.setFolderUsage1(args[x]);
				} else if (args[x].equalsIgnoreCase("-cu2")) {
					x++;
					magAnalizer.setFolderUsage2(args[x]);
				} else if (args[x].equalsIgnoreCase("-cu3")) {
					x++;
					magAnalizer.setFolderUsage3(args[x]);
				} else if (args[x].equalsIgnoreCase("-au")) {
					magAnalizer.setAggUsage(true);
				} else if (args[x].equals("-sx")) {
					x++;
					magAnalizer.setSchemaXsd(args[x]);
				} else if (args[x].equals("-md5")) {
					x++;
					fileMd5 = new File(args[x]);
				}
			}
			magAnalizer.scan(fileMd5);
		} else {
			printHelp();
		}
	}

	public static void printHelp() {
		System.out
				.println("Per eseguire il programma è necessario indicare i seguenti parametri");
		System.out
				.println("* -p <Path da analizzare> (Obbligatorio) la ricerca avverrà anche nelle sottocartelle");
		System.out
				.println("* -c <Descrizione Collection> (Opzionale) sostituisce la collection presente con quella idnicata");
		System.out
				.println("* -cid (Opzionale) Viene utilizzato per abilitare la verifica la presenza degli identificativi");
		System.out
				.println("* -cu1 (Opzionale) Viene utilizzato indicare il nome della Cartella che contiene i file per usage 1");
		System.out
				.println("* -cu2 (Opzionale) Viene utilizzato indicare il nome della Cartella che contiene i file per usage 2");
		System.out
				.println("* -cu3 (Opzionale) Viene utilizzato indicare il nome della Cartella che contiene i file per usage 3");
		System.out
		.println("* -au (Opzionale) Viene utilizzato indicare se aggiornare il campo usage se necessario");
		System.out.println(
				"* -sw <schemaXsd> Utilizzzto per indircare lo Schema Xsd da utilizzare per la validazione (Opzionale, Default http://www.bncf.firenze.sbn.it/SchemaXML/Mag/2.0.1/metadigit.xsd)");
	}

	public void scan(File fileMd5) {
		scan(new File(folderScan), schemaXsd, fileMd5);
	}

	private void scan(File folder, String schemaXsd, File fileMd5) {
		File[] fl = null;

		fl = folder.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				boolean ris = false;

				if (!pathname.getName().startsWith(".")) {
					if (pathname.isDirectory()) {
						ris = true;
					} else if (pathname.getName().toLowerCase()
							.endsWith(".xml")) {
						ris = true;
					}
				}
				return ris;
			}
		});
		for (File file : fl) {
			if (file.isDirectory()) {
				scan(file, schemaXsd, fileMd5);
			} else {
				check(file, schemaXsd, fileMd5);
			}
		}
	}

	private void check(File file, String schemaXsd, File fileMd5) {
		MagXsd magXsd = null;
		Metadigit mag = null;
		String key = null;
		Img img;
		Altimg altimg;
		boolean isError = false;
		File fCert = null;
		try {
			fCert = new File(file.getAbsolutePath() + ".cert");
			magXsd = new MagXsd(schemaXsd);
			mag = magXsd.read(file);
			if (!fCert.exists()) {
				log.info("\n"+"Analizzo il file ["+file.getAbsolutePath()+"]");
				if (collection != null) {
					if (!mag.getGen().getCollection().equals(collection)) {
						log.warn("\n"+"Nel file [" + file.getAbsolutePath()
								+ "] risulta la collection ["
								+ mag.getGen().getCollection()
								+ "] invece di [" + collection + "]");
						mag.getGen().setCollection(collection);
					}
				}
				if (isCheckIdentifierDuplicate()) {
					if (identifierDuplicate == null) {
						identifierDuplicate = new Hashtable<String, String>();
					}
					key = mag.getBib().getIdentifier().get(0).getContent()
							.get(0);
					if (mag.getBib().getPiece() != null) {
						if (mag.getBib().getPiece().getYear() != null
								&& mag.getBib().getPiece().getIssue() != null) {
							key += "#" + mag.getBib().getPiece().getYear()
									+ "_"
									+ mag.getBib().getPiece().getIssue();
						} else
							if (mag.getBib().getPiece().getPartNumber() != null
									&& mag.getBib().getPiece().getPartName() != null) {
								key += "#"
										+ mag.getBib().getPiece()
												.getPartNumber() + "_"
										+ mag.getBib().getPiece().getPartName();
							}
					}
					if (identifierDuplicate.containsKey(key)) {
						isError = true;
						log.error("\n"+"Mag con Identificativi duplicati ["
								+ identifierDuplicate.get(key) + "] e ["
								+ file.getAbsolutePath() + "]");
					} else {
						identifierDuplicate.put(key, file.getAbsolutePath());
					}
				}

				if (mag.getImg() != null) {
					for (int x = 0; x < mag.getImg().size(); x++) {
						img = mag.getImg().get(x);
						isError = checkUsage(img, isError, file, x);
						if (img.getAltimg() != null) {
							for (int y = 0; y < img.getAltimg().size(); y++) {
								altimg = img.getAltimg().get(y);
								isError = checkUsage(altimg, isError, file, x);
							}
						}
					}
				}
				if (!isError) {
					magXsd.write(mag, file, true, fileMd5);
				}
			} else {
				if (isCheckIdentifierDuplicate()) {
					if (identifierDuplicate == null) {
						identifierDuplicate = new Hashtable<String, String>();
					}
					key = mag.getBib().getIdentifier().get(0).getContent()
							.get(0);
					if (mag.getBib().getPiece() != null) {
						if (mag.getBib().getPiece().getYear() != null
								&& mag.getBib().getPiece().getIssue() != null) {
							key += "#" + mag.getBib().getPiece().getYear()
									+ "_"
									+ mag.getBib().getPiece().getIssue();
						} else
							if (mag.getBib().getPiece().getPartNumber() != null
									&& mag.getBib().getPiece().getPartName() != null) {
								key += "#"
										+ mag.getBib().getPiece()
												.getPartNumber() + "_"
										+ mag.getBib().getPiece().getPartName();
							}
					}
					if (identifierDuplicate.containsKey(key)) {
						isError = true;
						log.error("\n"+"Mag con Identificativi duplicati ["
								+ identifierDuplicate.get(key) + "] e ["
								+ file.getAbsolutePath() + "]");
					} else {
						identifierDuplicate.put(key, file.getAbsolutePath());
					}
				}
				
			}
		} catch (XsdException e) {
			log.error("\n"+"FILE con problemi di Parsing: "+file.getAbsolutePath());
			log.error(e.getMessage(), e);
		} catch (PubblicaException e) {
			log.error(e.getMessage(), e);
		}
	}

	private boolean checkUsage(Img altimg, boolean isError, File file, int x){
		if (aggUsage){
			if (altimg.getFile().getHref()
					.indexOf("/" + folderUsage1 + "/") > -1) {
				if (!altimg.getUsage().get(0).equals("1")){
					altimg.getUsage().set(0,"1");
				}
			} else if (altimg.getFile().getHref()
					.indexOf("/" + folderUsage2 + "/") > -1) {
				if (!altimg.getUsage().get(0).equals("2")){
					altimg.getUsage().set(0,"2");
				}
			} else if (altimg.getFile().getHref()
					.indexOf("/" + folderUsage3 + "/") > -1) {
				if (!altimg.getUsage().get(0).equals("3")){
					altimg.getUsage().set(0,"3");
				}
			} else {
				isError = true;
				log.error("\n"+"Nel file ["
						+ file.getAbsolutePath()
						+ "] nell'immagine numero ["
						+ (x + 1)
						+ "] per usage non contemplato ["
						+ altimg.getUsage().get(0) + "]");
			}
		} else {
			if (altimg.getUsage().get(0).equals("1")) {
				if (altimg.getFile().getHref()
						.indexOf("/" + folderUsage1 + "/") == -1) {
					isError = true;
					log.error("\n"+"Nel file ["
							+ file.getAbsolutePath()
							+ "] nell'immagine numero ["
							+ (x + 1)
							+ "] per usage 1 errata definizione della path");
				}
			} else if (altimg.getUsage().get(0).equals("2")) {
				if (altimg.getFile().getHref()
						.indexOf("/" + folderUsage2 + "/") == -1) {
					isError = true;
					log.error("\n"+"Nel file ["
							+ file.getAbsolutePath()
							+ "] nell'immagine numero ["
							+ (x + 1)
							+ "] per usage 2 errata definizione della path");
				}
			} else if (altimg.getUsage().get(0).equals("3")) {
				if (altimg.getFile().getHref()
						.indexOf("/" + folderUsage3 + "/") == -1) {
					isError = true;
					log.error("\n"+"Nel file ["
							+ file.getAbsolutePath()
							+ "] nell'immagine numero ["
							+ (x + 1)
							+ "] per usage 3 errata definizione della path");
				}
			} else {
				isError = true;
				log.error("\n"+"Nel file ["
						+ file.getAbsolutePath()
						+ "] nell'immagine numero ["
						+ (x + 1)
						+ "] per usage non contemplato ["
						+ altimg.getUsage().get(0) + "]");
			}
		}
		return isError;
	}

	private boolean checkUsage(Altimg altimg, boolean isError, File file, int x){
		if (aggUsage){
			if (altimg.getFile().getHref()
					.indexOf("/" + folderUsage1 + "/") > -1) {
				if (!altimg.getUsage().get(0).equals("1")){
					altimg.getUsage().set(0,"1");
				}
			} else if (altimg.getFile().getHref()
					.indexOf("/" + folderUsage2 + "/") > -1) {
				if (!altimg.getUsage().get(0).equals("2")){
					altimg.getUsage().set(0,"2");
				}
			} else if (altimg.getFile().getHref()
					.indexOf("/" + folderUsage3 + "/") > -1) {
				if (!altimg.getUsage().get(0).equals("3")){
					altimg.getUsage().set(0,"3");
				}
			} else {
				isError = true;
				log.error("\n"+"Nel file ["
						+ file.getAbsolutePath()
						+ "] nell'immagine numero ["
						+ (x + 1)
						+ "] per usage non contemplato ["
						+ altimg.getUsage().get(0) + "]");
			}
		} else {
			if (altimg.getUsage().get(0).equals("1")) {
				if (altimg.getFile().getHref()
						.indexOf("/" + folderUsage1 + "/") == -1) {
					isError = true;
					log.error("\n"+"Nel file ["
							+ file.getAbsolutePath()
							+ "] nell'immagine numero ["
							+ (x + 1)
							+ "] per usage 1 errata definizione della path");
				}
			} else if (altimg.getUsage().get(0).equals("2")) {
				if (altimg.getFile().getHref()
						.indexOf("/" + folderUsage2 + "/") == -1) {
					isError = true;
					log.error("\n"+"Nel file ["
							+ file.getAbsolutePath()
							+ "] nell'immagine numero ["
							+ (x + 1)
							+ "] per usage 2 errata definizione della path");
				}
			} else if (altimg.getUsage().get(0).equals("3")) {
				if (altimg.getFile().getHref()
						.indexOf("/" + folderUsage3 + "/") == -1) {
					isError = true;
					log.error("\n"+"Nel file ["
							+ file.getAbsolutePath()
							+ "] nell'immagine numero ["
							+ (x + 1)
							+ "] per usage 3 errata definizione della path");
				}
			} else {
				isError = true;
				log.error("\n"+"Nel file ["
						+ file.getAbsolutePath()
						+ "] nell'immagine numero ["
						+ (x + 1)
						+ "] per usage non contemplato ["
						+ altimg.getUsage().get(0) + "]");
			}
		}
		return isError;
	}

	/**
	 * @return the folderScan
	 */
	public String getFolderScan() {
		return folderScan;
	}

	/**
	 * @param folderScan
	 *            the folderScan to set
	 */
	public void setFolderScan(String folderScan) {
		this.folderScan = folderScan;
	}

	/**
	 * @return the collection
	 */
	public String getCollection() {
		return collection;
	}

	/**
	 * @param collection
	 *            the collection to set
	 */
	public void setCollection(String collection) {
		this.collection = collection;
	}

	/**
	 * @return the checkIdentifierDuplicate
	 */
	public boolean isCheckIdentifierDuplicate() {
		return checkIdentifierDuplicate;
	}

	/**
	 * @param checkIdentifierDuplicate
	 *            the checkIdentifierDuplicate to set
	 */
	public void setCheckIdentifierDuplicate(boolean checkIdentifierDuplicate) {
		this.checkIdentifierDuplicate = checkIdentifierDuplicate;
	}

	public String getFolderUsare1() {
		return folderUsage1;
	}

	public void setFolderUsage1(String folderUsare1) {
		this.folderUsage1 = folderUsare1;
	}

	public String getFolderUsare2() {
		return folderUsage2;
	}

	public void setFolderUsage2(String folderUsare2) {
		this.folderUsage2 = folderUsare2;
	}

	public String getFolderUsare3() {
		return folderUsage3;
	}

	public void setFolderUsage3(String folderUsare3) {
		this.folderUsage3 = folderUsare3;
	}

	/**
	 * @param aggUsage the aggUsage to set
	 */
	public void setAggUsage(boolean aggUsage) {
		this.aggUsage = aggUsage;
	}
}
