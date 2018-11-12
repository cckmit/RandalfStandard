/**
 * 
 */
package mx.randalf.mag;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;

import org.apache.log4j.Logger;
import org.im4java.core.InfoException;
import org.xml.sax.SAXParseException;

import mx.randalf.digest.MD5;
import mx.randalf.digital.img.reader.CalcImg;

import org.niso.pdfs.datadict.CompressiontypeNiso;
import org.niso.pdfs.datadict.Format;
import org.niso.pdfs.datadict.ImgMimetype;
import org.niso.pdfs.datadict.Photometricinterpretationtype;
import org.niso.pdfs.datadict.Dimensions;
import org.niso.pdfs.datadict.Spatialmetrics;
import org.purl.dc.elements._1.SimpleLiteral;

import mx.randalf.interfacException.exception.PubblicaException;
import mx.randalf.parser.Parser;
import mx.randalf.parser.exception.ParserException;
import mx.randalf.xsd.ReadXsd;
import mx.randalf.xsd.exception.XsdException;
import it.sbn.iccu.metaag1.Img;
import it.sbn.iccu.metaag1.Img.Altimg;
import it.sbn.iccu.metaag1.Metadigit;

/**
 * @author massi
 * 
 */
public class MagXsd extends ReadXsd<Metadigit> {

	private Logger log = Logger.getLogger(getClass());

	/**
	 * 
	 */
	public MagXsd() {
	}

	public String write(Metadigit obj) throws XsdException {
		String schemaLocation = null;

		schemaLocation = "http://www.iccu.sbn.it/metaAG1.pdf http://www.bncf.firenze.sbn.it/SchemaXML/Mag/2.0.1/metadigit.xsd";
		return write(obj, new MagNamespacePrefix(), null, null, schemaLocation);
	}

	public boolean write(Metadigit obj, File fMag) throws XsdException,
			PubblicaException {
		return write(obj, fMag, "cert");
	}
	@SuppressWarnings("unused")
	public boolean write(Metadigit obj, File fMag, String extCert) throws XsdException,
			PubblicaException {
		ParserException errors = null;
		Parser parser = null;
		String schemaLocation = null;
		MD5 md5Tools = null;
		String md5 = null;
		File fCert = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		boolean result = false;

		try {
			schemaLocation = "http://www.iccu.sbn.it/metaAG1.pdf http://www.bncf.firenze.sbn.it/SchemaXML/Mag/2.0.1/metadigit.xsd";
			write(obj, fMag, new MagNamespacePrefix(), null, null,
					schemaLocation);

			errors = new ParserException();
			parser = new Parser(fMag.getAbsolutePath(), errors, true);
			if (errors.getNumErr() == 0) {
				result = true;
				md5Tools = new MD5(fMag);
				md5 = md5Tools.getDigest();

				fCert = new File(fMag.getAbsolutePath() + "."+extCert);
				fw = new FileWriter(fCert);
				bw = new BufferedWriter(fw);
				bw.write(md5);
			} else {
				for (SAXParseException e : errors.getMsgErr()) {
					log.error(e.getMessage(), e);
				}
			}
		} catch (SAXParseException e) {
			log.error(e.getMessage(), e);
			throw new XsdException(e.getMessage(), e);
		} catch (NoSuchAlgorithmException e) {
			log.error(e.getMessage(), e);
			throw new XsdException(e.getMessage(), e);
		} catch (FileNotFoundException e) {
			log.error(e.getMessage(), e);
			throw new XsdException(e.getMessage(), e);
		} catch (PubblicaException e) {
			throw e;
		} catch (IOException e) {
			log.error(e.getMessage(), e);
			throw new XsdException(e.getMessage(), e);
		} finally {
			try {
				if (bw != null){
					bw.flush();
					bw.close();
				}
				if (fw != null){
					fw.close();
				}
			} catch (IOException e) {
				log.error(e.getMessage(), e);
				throw new XsdException(e.getMessage(), e);
			}
		}
		return result;
	}

	public void calcImg(Img img, boolean basic, String pathMag) throws XsdException{
		calcImg(img, basic, pathMag, true, null);
	}

	public void calcImg(Img img, String pathMag) throws XsdException{
		calcImg(img, pathMag, true, null);
	}

	public void calcImg(Img img, boolean basic, String pathMag, boolean anaAltImg) throws XsdException{
		calcImg(img, basic, pathMag, anaAltImg, null);
	}

	public void calcImg(Img img, String pathMag, boolean anaAltImg) throws XsdException{
		calcImg(img, pathMag, anaAltImg, null);
	}

	public void calcImg(Img img, boolean basic, String pathMag, String[] usages) throws XsdException{
		calcImg(img, basic, pathMag, true, usages);
	}

	public void calcImg(Img img, String pathMag, String[] usages) throws XsdException{
		calcImg(img, pathMag, true, usages);
	}

	public void calcImg(Img img, String pathMag, boolean anaAltImg, String[] usages) throws XsdException{
		calcImg(img, false, pathMag, anaAltImg, usages);
	}

	public void calcImg(Img img, boolean basic, String pathMag, boolean anaAltImg, String[] usages) throws XsdException{
		CalcImg calcImg = null;
		File fImg = null;
		
		try {
			if (img != null){
				if (checkUsage(img.getUsage(), usages)){
					if (img.getFile()!= null &&
							img.getFile().getHref() != null){
						fImg = new File (pathMag+File.separator+img.getFile().getHref().replace("./", ""));
						if (fImg.exists()){
							calcImg = new CalcImg(fImg,basic);
							readImg(img, calcImg, fImg);
						} else {
							throw new XsdException("Il file ["+fImg.getAbsolutePath()+"] non è presente");
						}
					} else {
						throw new XsdException("L'oggetto hRef non è inizializzato");
					}
				}
				if (anaAltImg){
					if (img.getAltimg() != null &&
							img.getAltimg().size()>0){
						for (int x=0; x<img.getAltimg().size(); x++){
							if (checkUsage(img.getAltimg().get(x).getUsage(), usages)){
								if (img.getAltimg().get(x).getFile()!= null &&
										img.getAltimg().get(x).getFile().getHref() != null){
									fImg = new File (pathMag+File.separator+img.getAltimg().get(x).getFile().getHref());
									if (fImg.exists()){
										calcImg = new CalcImg(fImg);
										readImg(img.getAltimg().get(x), calcImg, fImg);
									} else {
										throw new XsdException("Il file ["+fImg.getAbsolutePath()+"] non è presente");
									}
								} else {
									throw new XsdException("L'oggetto hRef non è inizializzato");
								}
							}
						}
					}
				}
			}else {
				throw new XsdException("L'oggetto Img non è inizializzato");
			}
		} catch (InfoException e) {
			throw new XsdException(e.getMessage(), e);
		} catch (DatatypeConfigurationException e) {
			throw new XsdException(e.getMessage(), e);
		} catch (XsdException e) {
			throw e;
		} catch (Exception e) {
			throw new XsdException(e.getMessage(), e);
		}
	}

	private boolean checkUsage(List<String> usageMag, String[] usages){
		boolean result = false;
		
		if (usages!= null){
			if (usageMag!= null){
				for (int x=0;x <usageMag.size(); x++){
					if (checkUsage(usageMag.get(x), usages)){
						result = true;
						break;
					}
				}
			}
		} else {
			result = true;
		}
		return result;
	}

	private boolean checkUsage(String usageMag, String[] usages){
		boolean result = false;
		
		if (usages!= null){
			for (int x=0; x<usages.length; x++){
				if (usages[x].equals(usageMag)){
					result = true;
					break;
				}
			}
		} else {
			result = true;
		}
		return result;
	}

	/**
	 * Questo metodo viene utilizzato per leggere le informazioni relative alle
	 * imamgini
	 * 
	 * @param img
	 *            Oggetto img
	 */
	private void readImg(Img img, CalcImg calcImg, File fImg) throws DatatypeConfigurationException,
			InfoException, Exception {
		Dimensions imageDimensions = null;
		Spatialmetrics imageMetrics = null;
		Format format = null;
		MD5 md5 = null;

		try {
			md5 = new MD5(fImg);
			img.setMd5(md5.getDigest());
			img.setFilesize(BigInteger.valueOf(fImg.length()));

			if (img.getImageDimensions() == null){
				imageDimensions = new Dimensions();
			} else {
				imageDimensions = img.getImageDimensions();
			}
			img.setImageDimensions(setImageDimensions(imageDimensions, calcImg));

			img.setDatetimecreated(calcImg.getDateTimeCreate());

			if (img.getImageMetrics() == null){
				imageMetrics = new Spatialmetrics();
			} else {
				imageMetrics = img.getImageMetrics();
			}
			img.setImageMetrics(setImageMetrics(imageMetrics, calcImg));

			img.setPpi(calcImg.getDpi());

			if (img.getFormat() == null){
				format = new Format();
			} else {
				format = img.getFormat();
			}
			img.setFormat(setFormat(format, calcImg));
			//
			// if (this.imgGroup)
			// checkImgGroup(img);
		}
		catch (DatatypeConfigurationException e) {
			throw e;
		} catch (InfoException e) {
			throw e;
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * Questo metodo viene utilizzato per leggere le informazioni relative alle
	 * imamgini
	 * 
	 * @param img
	 *            Oggetto altImg
	 * @throws DatatypeConfigurationException
	 * @throws InfoException
	 *             , Exception
	 */
	private void readImg(Altimg img, CalcImg calcImg, File fImg) throws DatatypeConfigurationException,
			InfoException, Exception {
		Dimensions imageDimensions = null;
		Spatialmetrics imageMetrics = null;
		Format format = null;
		MD5 md5 = null;

		try {
			md5 = new MD5(fImg);
			img.setMd5(md5.getDigest());
			img.setFilesize(BigInteger.valueOf(fImg.length()));

			if (img.getImageDimensions() == null){
				imageDimensions = new Dimensions();
			} else {
				imageDimensions = img.getImageDimensions();
			}
			img.setImageDimensions(setImageDimensions(imageDimensions, calcImg));

			img.setDatetimecreated(calcImg.getDateTimeCreate());

			if (img.getImageMetrics() == null){
				imageMetrics = new Spatialmetrics();
			} else {
				imageMetrics = img.getImageMetrics();
			}
			img.setImageMetrics(setImageMetrics(imageMetrics, calcImg));

			img.setPpi(calcImg.getDpi());

			if (img.getFormat() == null){
				format = new Format();
			} else {
				format = img.getFormat();
			}
			img.setFormat(setFormat(format, calcImg));
			//
			// if (this.imgGroup)
			// checkImgGroup(img);
		}
		catch (DatatypeConfigurationException e) {
			throw e;
		} catch (InfoException e) {
			throw e;
		} catch (Exception e) {
			throw e;
		}
	}

	private Dimensions setImageDimensions(Dimensions imageDimensions, CalcImg calcImg) throws InfoException{
		imageDimensions.setImagelength(calcImg.getImageLength());
		imageDimensions.setImagewidth(calcImg.getImageWidth());
	
		if (calcImg.getLarOggScan() != null && calcImg.getAltOggScan() != null) {
			imageDimensions.setSourceXdimension(calcImg.getLarOggScan());
			imageDimensions.setSourceYdimension(calcImg.getAltOggScan());
		}
		return imageDimensions;
	}

	private Spatialmetrics setImageMetrics(Spatialmetrics imageMetrics, CalcImg calcImg) throws InfoException{

		if (calcImg.getFreqUnit() != null) {
			imageMetrics.setSamplingfrequencyunit(calcImg.getFreqUnit());
		}
		if (calcImg.getFreqPlan() != null) {
			imageMetrics.setSamplingfrequencyplane(calcImg.getFreqPlan());
		}
		imageMetrics.setXsamplingfrequency(calcImg.getDpi());
		imageMetrics.setYsamplingfrequency(calcImg.getDpi());

		imageMetrics.setPhotometricinterpretation(getPhotoInterValue(calcImg));
		imageMetrics.setBitpersample(calcImg.getBitPerSampleValue());
		return imageMetrics;
	}

	/**
	 * Questo metodo viene utilizzata leggere la decodifica dell'interpretazione
	 * fotometrica dei bit del campione
	 * 
	 * @return descrizione dell'interpretazione fotometrica dei bit del campione
	 */
	private Photometricinterpretationtype getPhotoInterValue(CalcImg calcImg) {
		Photometricinterpretationtype ris = null;
		if (calcImg.getInfo().getProperty("Colorspace") != null) {
			if (calcImg.getInfo().getProperty("Colorspace").equals("sRGB")){
				ris = Photometricinterpretationtype.RGB;
			} else if (calcImg.getInfo().getProperty("Colorspace").equals("Gray")){
					ris = Photometricinterpretationtype.BLACK_IS_ZERO;
			} else {
				ris = Photometricinterpretationtype.fromValue(calcImg.getInfo()
						.getProperty("Colorspace"));
			}
		}
		return ris;
	}

	private Format setFormat(Format format, CalcImg calcImg){
		format.setMime(getMimeType(calcImg));
		format.setName(calcImg.getMimeName());
		format.setCompression(getCompressionDesc(calcImg));
		return format;
	}
	/**
	 * Questo metodo viene utilizzato per leggere il tipo di compressione
	 * associata all'immagine
	 * 
	 * @return Compressione associata all'immagine
	 */
	public CompressiontypeNiso getCompressionDesc(CalcImg calcImg) {
		CompressiontypeNiso ris = null;
		String compression = null;

		compression = calcImg.getInfo().getProperty("Compression");
		if (compression == null){
			compression = calcImg.getInfo().getProperty("Compression", 0);
		}
		if (compression == null || compression.equalsIgnoreCase("None")) {
			ris = CompressiontypeNiso.UNCOMPRESSED;
		} else if (compression.equalsIgnoreCase("JPEG")){
			ris = CompressiontypeNiso.JPG;
		}
		return ris;
	}

	/**
	 * Questo metodo viene utilizzato per leggere il codice Mime Type
	 * dell'immagine
	 * 
	 * @return Codice Mime Type
	 */
	public ImgMimetype getMimeType(CalcImg calcImg) {
		ImgMimetype ris = null;
		ris = getMine(calcImg.getMimeName());
		return ris;
	}

	/**
	 * Questo metodo viene utilizzato per indicare il codice Mime
	 * 
	 * @param code
	 *            Codice di riferimento del Mime Type da decodificare
	 * @return Valore Decodificato del Mime Type
	 */
	public ImgMimetype getMine(String code) {
		ImgMimetype ris = null;
		code = code.toUpperCase();
		if (code.equals("GIF"))
			ris = ImgMimetype.IMAGE_GIF;
		else if (code.equals("JPEG"))
			ris = ImgMimetype.IMAGE_JPEG;
		else if (code.equals("TIFF") || code.equals("TIF"))
			ris = ImgMimetype.IMAGE_TIFF;
		else if (code.equals("PNG"))
			ris = ImgMimetype.IMAGE_PNG;
		else if (code.equals("PDF"))
			ris = ImgMimetype.APPLICATION_PDF;
		return ris;
	}

	public SimpleLiteral genSimpleLiteral(String value){
		return genSimpleLiteral(value, null);
	}

	public SimpleLiteral genSimpleLiteral(String value, String lang){
		SimpleLiteral simpleLiteral = null;
		
		simpleLiteral = new SimpleLiteral();
		if (lang != null){
			simpleLiteral.setLang(lang);
		}
		simpleLiteral.getContent().add(value);
		return simpleLiteral;
	}
}
