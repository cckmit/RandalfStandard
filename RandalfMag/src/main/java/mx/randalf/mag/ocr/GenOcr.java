/**
 * 
 */
package mx.randalf.mag.ocr;

import it.sbn.iccu.metaag1.Img;
import it.sbn.iccu.metaag1.Link;
import it.sbn.iccu.metaag1.Metadigit;
import it.sbn.iccu.metaag1.Ocr;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import mx.randalf.digest.MD5;
import mx.randalf.digital.ocr.convert.ConvertOcr;
import mx.randalf.interfacException.exception.PubblicaException;
import mx.randalf.mag.MagXsd;
import mx.randalf.mag.ocr.exception.GenOcrException;
import mx.randalf.xsd.exception.XsdException;
import net.sourceforge.tess4j.TesseractException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.niso.pdfs.datadict.DocCompressiontypeNiso;
import org.niso.pdfs.datadict.DocFormat;
import org.niso.pdfs.datadict.DocMimetypeNiso;

/**
 * Classe utilizzata per analizzare i tracciari Mag di una cartella in modo da
 * generare i relativi OCR
 * 
 * @author massi
 * 
 */
public class GenOcr {

	private Logger log = LogManager.getLogger(getClass());

	/**
	 * Variabile utilizzata per indicare la cartella da analizzare che contiene
	 * i file Xml
	 */
	private String folderXml = null;

	/**
	 * Variabile utilizzata per indicare se eseguire il test della presenza del
	 * file Certificato prima di procedere all'aggiornamento del Mag
	 */
	private boolean checkCert = true;

	/**
	 * Variabile utilizzata per indicare l'usage dell'oggetto digitale da
	 * utilizzare per generare l'Ocr
	 */
	private String usage = "1";

	private ConvertOcr convertOcr = null;

	/**
	 * Costruttore
	 */
	public GenOcr() {
		convertOcr = new ConvertOcr();
	}

	/**
	 * Metodo che viene invocato quando la classe viene usata come applicazione
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		GenOcr genOcr = null;

		try {
			genOcr = new GenOcr();
			for (int x = 0; x < args.length; x++) {
				if (args[x].equals("-pi")) {
					x++;
					genOcr.setFolderXml(args[x]);
				} else if (args[x].equals("-dc")) {
					genOcr.setCheckCert(false);
				} else if (args[x].equals("-ec")) {
					genOcr.setCheckCert(true);
				} else if (args[x].equals("-u")) {
					x++;
					genOcr.setUsage(args[x]);
				}
			}

			if (genOcr.isValid()) {
				genOcr.esegui();
			} else {
				System.out
						.println("I parametri necessari per l'esecuzione del programma sono:");
				System.out
						.println("1) -pi <Path> indica il percorso in cui si trovano i file Xml (Obbligatorio)");
				System.out
						.println("2) -dc Utilizzato per disabilitare i test dei File Certificati prima della elaborazione dei Mag (Opzionali)");
				System.out
						.println("3) -ec Utilizzato per abilitaare i test dei File Certificati prima della elaborazione dei Mag (Default)");
				System.out
						.println("4) -u <Usage> Utilizzato per indicare l'usage dell'oggetto digitale da usare per la generazione dei files OCR (Opzionale, Default 1)");
			}
		} catch (GenOcrException e) {
			e.printStackTrace();
		}
	}

	public void esegui() throws GenOcrException {
		File pathMag = null;

		try {
			if (isValid()) {
				if (pathMag == null) {
					pathMag = new File(folderXml);
				}
				esegui(pathMag);
			} else {
				throw new GenOcrException(
						"Non risultano valorizzati tutti i parametri necessari");
			}
		} catch (GenOcrException e) {
			throw e;
		}

	}

	private void esegui(File pathMag) throws GenOcrException {
		File[] fMags = null;

		try {
			if (pathMag.exists()) {
				fMags = pathMag.listFiles(new FileFilter() {

					@Override
					public boolean accept(File f) {
						boolean result = false;

						if (!f.getName().trim().startsWith(".")
								&& (f.isDirectory() || f.getName().trim()
										.endsWith(".xml"))) {
							result = true;
						}
						return result;
					}
				});

				for (File f : fMags) {
					if (f.isDirectory()) {
						esegui(f);
					} else {
						elabMag(f);
					}
				}
			} else {
				throw new GenOcrException("La cartella ["
						+ pathMag.getAbsolutePath() + "] non esiste");
			}
		} catch (GenOcrException e) {
			throw e;
		}
	}

	private void elabMag(File fMag) throws GenOcrException {
		Metadigit mag = null;
		File fXmlOcr = null;
		File fXmlCert = null;
		File fOcr = null;
		File fImage = null;
		int conta = 0;
		DecimalFormat df = new DecimalFormat("00000");
		Ocr ocr = null;
		Link ocrFile = null;
		String fImg = null;
		String imgOgg = null;
		MagXsd magXsd = null;
		MD5 md5 = null;

		try {
			magXsd = new MagXsd();
			fXmlOcr = new File(fMag.getAbsolutePath() + ".ocr");
			if (!fXmlOcr.exists()) {
				fXmlCert = new File(fMag.getAbsolutePath() + ".cert");
				if ((checkCert && !fXmlCert.exists()) || !checkCert) {
					mag = magXsd.read(fMag);
					if (mag.getOcr() == null
							|| mag.getOcr().size() < mag.getImg().size()) {

						for (int x = 0; x < mag.getImg().size(); x++) {

							conta = x + 1;
							if (!checkOcr(mag, conta)) {
								if (mag.getOcr().size() < (x + 1)) {
									fImg = getImg(mag.getImg().get(x));
									if (fImg != null) {
										fImage = new File(fMag.getParentFile()
												.getAbsolutePath()
												+ File.separator + fImg);

										if (fImage.exists()) {

											imgOgg = "./"
													+ fImage.getParentFile()
															.getParentFile()
															.getName();

											fOcr = new File(fImage
													.getParentFile()
													.getParentFile()
													.getAbsolutePath()
													+ File.separator
													+ "Ocr"
													+ File.separator
													+ df.format(conta) + ".txt");
											convertOcr.convertOcr(fImage, fOcr);
											if (fOcr.length() > 0) {
												ocr = new Ocr();
												ocr.setSequenceNumber(new BigInteger(
														conta + ""));
												ocr.setNomenclature(mag.getImg().get(x).getNomenclature());
												ocr.getUsage().add("a");
												ocrFile = new Link();
												ocrFile.setHref(imgOgg
														+ "/Ocr/"
														+ df.format(conta)
														+ ".txt");
												ocr.setFile(ocrFile);
												md5 = new MD5(fOcr);
												ocr.setMd5(md5.getDigest());
												ocr.setSource(mag.getImg()
														.get(x).getFile());
												ocr.setFilesize(BigInteger
														.valueOf(fOcr.length()));
												ocr.setFormat(new DocFormat());
												ocr.getFormat().setName("TXT");
												ocr.getFormat()
														.setMime(
																DocMimetypeNiso.TEXT_PLAIN);
												ocr.getFormat()
														.setCompression(
																DocCompressiontypeNiso.UNCOMPRESSED);
												ocr.setSoftwareOcr("tesseract 3.03");
												ocr.setDatetimecreated(getDateTimeCreate(fOcr));
												mag.getOcr().add(ocr);
											}
										}
									}
								}
							}
						}

						if (magXsd.write(mag, fMag)) {
							genFileCertOcr(fMag);
						}

					} else {
						genFileCertOcr(fMag);
					}
				}
			}
		} catch (NoSuchAlgorithmException e) {
			log.error(e.getMessage(), e);
			throw new GenOcrException(e.getMessage(), e);
		} catch (FileNotFoundException e) {
			log.error(e.getMessage(), e);
			throw new GenOcrException(e.getMessage(), e);
		} catch (XsdException e) {
			log.error(e.getMessage(), e);
			throw new GenOcrException(e.getMessage(), e);
		} catch (TesseractException e) {
			log.error(e.getMessage(), e);
			throw new GenOcrException(e.getMessage(), e);
		} catch (IOException e) {
			log.error(e.getMessage(), e);
			throw new GenOcrException(e.getMessage(), e);
		} catch (DatatypeConfigurationException e) {
			log.error(e.getMessage(), e);
			throw new GenOcrException(e.getMessage(), e);
		} catch (PubblicaException e) {
			log.error(e.getMessage(), e);
			throw new GenOcrException(e.getMessage(), e);
		} catch (GenOcrException e) {
			throw e;
		}
	}

	private void genFileCertOcr(File fMag) throws GenOcrException {
		MD5 md5Tools = null;
		String md5 = null;
		File fXmlOcr = null;
		FileWriter fwOcr = null;
		BufferedWriter bwOcr = null;

		try {
			md5Tools = new MD5(fMag);
			md5 = md5Tools.getDigest();

			fXmlOcr = new File(fMag.getAbsolutePath() + ".ocr");
			fwOcr = new FileWriter(fXmlOcr);
			bwOcr = new BufferedWriter(fwOcr);
			bwOcr.write(md5);
		} catch (NoSuchAlgorithmException e) {
			log.error(e.getMessage(), e);
			throw new GenOcrException(e.getMessage(), e);
		} catch (FileNotFoundException e) {
			log.error(e.getMessage(), e);
			throw new GenOcrException(e.getMessage(), e);
		} catch (IOException e) {
			log.error(e.getMessage(), e);
			throw new GenOcrException(e.getMessage(), e);
		} finally {
			try {
				if (bwOcr != null) {
					bwOcr.flush();
					bwOcr.close();
				}
				if (fwOcr != null) {
					fwOcr.close();
				}
			} catch (IOException e) {
				log.error(e.getMessage(), e);
				throw new GenOcrException(e.getMessage(), e);
			}
		}
	}

	private XMLGregorianCalendar getDateTimeCreate(File fOcr)
			throws DatatypeConfigurationException {
		XMLGregorianCalendar ris = null;
		GregorianCalendar gc = null;
		gc = new GregorianCalendar();
		gc.setTimeInMillis(fOcr.lastModified());
		ris = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
		return ris;
	}

	private boolean checkOcr(Metadigit mag, int sequenceNumber) {
		boolean result = false;
		for (int x = 0; x < mag.getOcr().size(); x++) {
			if (mag.getOcr().get(x).getSequenceNumber().intValue() == sequenceNumber) {
				result = true;
				break;
			}
		}
		return result;
	}

	private String getImg(Img img) {
		String result = null;
		if (img.getUsage().get(0).equals(usage)) {
			result = img.getFile().getHref();
		}
		for (int x = 0; x < img.getAltimg().size(); x++) {
			if (img.getAltimg().get(x).getUsage().get(0).equals(usage)) {
				result = img.getAltimg().get(x).getFile().getHref();
			}
		}
		return result;
	}

	/**
	 * Metodo utilizzato per leggere la cartella indicata come contenitore dei
	 * file Xml
	 * 
	 * @return the folderXml
	 */
	public String getFolderXml() {
		return folderXml;
	}

	/**
	 * Metodo utilizzato per indicare la cartella indicata come contenitore dei
	 * file Xml
	 * 
	 * @param folderXml
	 *            the folderXml to set
	 */
	public void setFolderXml(String folderXml) {
		this.folderXml = folderXml;
	}

	/**
	 * Metodo utilizzato per testare se eseguire il controlli dei certificati
	 * oppure no
	 * 
	 * @return the checkCert
	 */
	public boolean isCheckCert() {
		return checkCert;
	}

	/**
	 * Metodo utilizzato per indicare se eseguire i Test dei certificati
	 * 
	 * @param checkCert
	 *            the checkCert to set
	 */
	public void setCheckCert(boolean checkCert) {
		this.checkCert = checkCert;
	}

	/**
	 * Metodo utilizzato per testare che tutti i Parametri necessari per
	 * l'esecuzione del programma siano stati volorizzati
	 * 
	 * @return Risultato del test
	 */
	public boolean isValid() {
		if (folderXml != null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @return the usage
	 */
	public String getUsage() {
		return usage;
	}

	/**
	 * @param usage
	 *            the usage to set
	 */
	public void setUsage(String usage) {
		this.usage = usage;
	}
}
