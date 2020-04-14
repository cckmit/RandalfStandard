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
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.im4java.core.InfoException;
import org.xml.sax.SAXParseException;

import mx.randalf.digest.MD5;
import mx.randalf.digital.img.reader.CalcImg;

import org.niso.pdfs.datadict.CompressiontypeNiso;
import org.niso.pdfs.datadict.Format;
import org.niso.pdfs.datadict.ImageCreation;
import org.niso.pdfs.datadict.ImgMimetype;
import org.niso.pdfs.datadict.Photometricinterpretationtype;
import org.niso.pdfs.datadict.Dimensions;
import org.niso.pdfs.datadict.Spatialmetrics;
import org.niso.pdfs.datadict.ImageCreation.Scanningsystem;
import org.purl.dc.elements._1.SimpleLiteral;

import mx.randalf.interfacException.exception.PubblicaException;
import mx.randalf.parser.Parser;
import mx.randalf.parser.exception.ParserException;
import mx.randalf.xsd.ReadXsd;
import mx.randalf.xsd.exception.XsdException;
import it.sbn.iccu.metaag1.Doc;
import it.sbn.iccu.metaag1.Gen;
import it.sbn.iccu.metaag1.Img;
import it.sbn.iccu.metaag1.Img.Altimg;
import it.sbn.iccu.metaag1.ImgGroup;
import it.sbn.iccu.metaag1.Metadigit;
import it.sbn.iccu.metaag1.Ocr;

/**
 * @author massi
 * 
 */
public class MagXsd extends ReadXsd<Metadigit> {

	private Logger log = LogManager.getLogger(getClass());

	/**
	 * 
	 */
	public MagXsd() {
	}

	public String write(Metadigit obj, Boolean jaxbFormattedOutput) throws XsdException {
		String schemaLocation = null;

		schemaLocation = "http://www.iccu.sbn.it/metaAG1.pdf http://www.bncf.firenze.sbn.it/SchemaXML/Mag/2.0.1/metadigit.xsd";
		return write(obj, new MagNamespacePrefix(), null, null, schemaLocation, jaxbFormattedOutput);
	}

	public boolean write(Metadigit obj, File fMag, Boolean jaxbFormattedOutput) throws XsdException,
			PubblicaException {
		return write(obj, fMag, "cert", true, jaxbFormattedOutput);
	}

	public boolean write(Metadigit obj, File fMag, boolean isParser, Boolean jaxbFormattedOutput) throws XsdException,
			PubblicaException {
		return write(obj, fMag, "cert", isParser, jaxbFormattedOutput);
	}

	public boolean write(Metadigit obj, File fMag, String extCert, Boolean jaxbFormattedOutput) throws XsdException,
			PubblicaException {
		return write(obj, fMag, extCert, true, jaxbFormattedOutput);
	}

	@SuppressWarnings("unused")
	public boolean write(Metadigit obj, File fMag, String extCert, boolean isParser, Boolean jaxbFormattedOutput) throws XsdException,
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
		GregorianCalendar gc = null;
		XMLGregorianCalendar xgc = null;

		try {
			if (obj.getGen() != null) {
				gc = new GregorianCalendar();
				xgc = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
				if (obj.getGen().getCreation()==null) {
					obj.getGen().setCreation(xgc);
				}
				obj.getGen().setLastUpdate(xgc);
			}
			schemaLocation = "http://www.iccu.sbn.it/metaAG1.pdf http://www.bncf.firenze.sbn.it/SchemaXML/Mag/2.0.1/metadigit.xsd";
			write(obj, fMag, new MagNamespacePrefix(), null, null,
					schemaLocation, jaxbFormattedOutput);

			if (isParser) {
				errors = new ParserException();
				parser = new Parser(fMag.getAbsolutePath(), errors, true);
				if (errors.getNumErr() == 0) {
					result = true;
	
					if ( extCert != null) {
						md5Tools = new MD5(fMag);
						md5 = md5Tools.getDigest();

						fCert = new File(fMag.getAbsolutePath() + "."+extCert);
						fw = new FileWriter(fCert);
						bw = new BufferedWriter(fw);
						bw.write(md5);
					}
				} else {
					for (SAXParseException e : errors.getMsgErr()) {
						log.error(e.getMessage(), e);
					}
				}
			} else {
				result = true;
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
		} catch (DatatypeConfigurationException e) {
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

	public void calcImg(Img img, boolean basic, String pathMag, Gen gen) throws XsdException{
		calcImg(img, basic, pathMag, true, null,  gen);
	}

	public void calcImg(Img img, String pathMag) throws XsdException{
		calcImg(img, pathMag, true, null,  null);
	}

	public void calcImg(Img img, String pathMag, Gen gen) throws XsdException{
		calcImg(img, pathMag, true, null,  gen);
	}

	public void calcImg(Img img, boolean basic, String pathMag, boolean anaAltImg) throws XsdException{
		calcImg(img, basic, pathMag, anaAltImg, null,  null);
	}

	public void calcImg(Img img, boolean basic, String pathMag, boolean anaAltImg, Gen gen) throws XsdException{
		calcImg(img, basic, pathMag, anaAltImg, null,  gen);
	}

	public void calcImg(Img img, String pathMag, boolean anaAltImg) throws XsdException{
		calcImg(img, pathMag, anaAltImg, null,  null);
	}

	public void calcImg(Img img, String pathMag, boolean anaAltImg, Gen gen) throws XsdException{
		calcImg(img, pathMag, anaAltImg, null,  gen);
	}

	public void calcImg(Img img, boolean basic, String pathMag, String[] usages) throws XsdException{
		calcImg(img, basic, pathMag, true, usages, null);
	}

	public void calcImg(Img img, boolean basic, String pathMag, String[] usages, Gen gen) throws XsdException{
		calcImg(img, basic, pathMag, true, usages, gen);
	}

	public void calcImg(Img img, String pathMag, String[] usages) throws XsdException{
		calcImg(img, pathMag, true, usages, null);
	}

	public void calcImg(Img img, String pathMag, String[] usages, Gen gen) throws XsdException{
		calcImg(img, pathMag, true, usages, gen);
	}

	public void calcImg(Img img, String pathMag, boolean anaAltImg, String[] usages) throws XsdException{
		calcImg(img, false, pathMag, anaAltImg, usages, null);
	}

	public void calcImg(Img img, String pathMag, boolean anaAltImg, String[] usages, Gen gen) throws XsdException{
		calcImg(img, false, pathMag, anaAltImg, usages, gen);
	}

	public void calcImg(Img img, boolean basic, String pathMag, boolean anaAltImg, String[] usages) throws XsdException{
		calcImg(img, basic, pathMag, anaAltImg, usages, null);
	}

	public void calcImg(Img img, boolean basic, String pathMag, boolean anaAltImg, String[] usages, Gen gen) throws XsdException{
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
							readImg(img, calcImg, fImg, gen);
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
										readImg(img.getAltimg().get(x), calcImg, fImg, gen);
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
	private void readImg(Img img, CalcImg calcImg, File fImg, Gen gen) throws DatatypeConfigurationException,
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

			if (gen != null) {				
				img.setImggroupID(getImggroupID(img, calcImg, gen));
				img.setScanning(null);
			} else {

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
			}

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

	private ImgGroup getImggroupID(Img img, CalcImg calcImg, Gen gen) throws InfoException {
		String id = null;
		ImgGroup result = null;
		DecimalFormat df4 = new DecimalFormat("0000");
		if (gen.getImgGroup()==null || gen.getImgGroup().size()==0) {
			id = "IMG-GRP_"+df4.format(1);
			result = addImgGroup(img.getScanning(), calcImg, id);
			gen.getImgGroup().add(result);
		} else {
			for (int x=0; x<gen.getImgGroup().size(); x++) {
				if (testImgGroup(gen.getImgGroup().get(x), calcImg, img.getScanning())) {
					result = gen.getImgGroup().get(x);
					break;
				}
			}
			if (result == null) {
				id = "IMG-GRP_"+df4.format(gen.getImgGroup().size()+1);
				result = addImgGroup(img.getScanning(), calcImg, id);
				gen.getImgGroup().add(result);
			}
		}
		return result;
	}

	private boolean testImgGroup(ImgGroup imgGroup, CalcImg calcImg, ImageCreation scanning) throws InfoException {
		
		if (testImgGroup(imgGroup.getImageMetrics(), calcImg) &&
				imgGroup.getPpi().intValue()==calcImg.getDpi().intValue() &&
						testImgGroup(imgGroup.getFormat(), calcImg) &&
						testImgGroup(imgGroup.getScanning(), scanning)) {
			return true;
		} else {
			return false;
		}
	}

	private boolean testImgGroup(ImageCreation scanning, ImageCreation imageCreation) {

		if (((scanning == null && imageCreation== null) || 
				(
					(scanning != null && imageCreation!= null) && 
					(scanning.getDevicesource().equals(imageCreation.getDevicesource()) &&
					 scanning.getScanningagency().equals(imageCreation.getScanningagency()) &&
					 testImgGroup(scanning.getScanningsystem(), imageCreation.getScanningsystem())
					)
				)
			)
		   ) {
			return true;
		} else {
			return false;
		}
	}

	private boolean testImgGroup(Scanningsystem scanningsystem, Scanningsystem origin) {
		
		if (scanningsystem.getCaptureSoftware().equals(origin.getCaptureSoftware()) &&
				scanningsystem.getScannerManufacturer().equals(origin.getScannerManufacturer()) &&
				scanningsystem.getScannerModel().equals(origin.getScannerModel())) {
			return true;
		} else {
			return false;
		}
	}

	private boolean testImgGroup(Format format, CalcImg calcImg) {
		if (format.getMime().value().equals(getMimeType(calcImg).value()) &&
				format.getCompression().value().equals(getCompressionDesc(calcImg).value()) &&
				format.getName().equals(calcImg.getMimeName())) {
			return true;
		} else {
			return false;
		}
	}

	private boolean testImgGroup(Spatialmetrics imageMetrics, CalcImg calcImg) throws InfoException {
		
		if ((
				(calcImg.getFreqUnit()==null && 
					imageMetrics.getSamplingfrequencyunit() ==null) ||
				(calcImg.getFreqUnit()!=null && 
					imageMetrics.getSamplingfrequencyunit().intValue()==calcImg.getFreqUnit().intValue())
				) &&
			(
				(calcImg.getFreqPlan()==null && 
					imageMetrics.getSamplingfrequencyplane() ==null) ||
				(calcImg.getFreqPlan()!=null && 
					imageMetrics.getSamplingfrequencyplane().intValue()==calcImg.getFreqPlan().intValue())
				) &&
			imageMetrics.getXsamplingfrequency().intValue()==calcImg.getDpi().intValue() &&
			imageMetrics.getYsamplingfrequency().intValue()==calcImg.getDpi().intValue() &&
			imageMetrics.getPhotometricinterpretation().value().equals(getPhotoInterValue(calcImg).value()) &&
			imageMetrics.getBitpersample().equals(calcImg.getBitPerSampleValue())){
			return true;
		} else {
			return false;
		}
			
	}

	private ImgGroup addImgGroup(ImageCreation scanning, CalcImg calcImg, String id) throws InfoException {
		ImgGroup imgGroup = null;
		Spatialmetrics imageMetrics = null;
		Format format = null;

		try {
			imgGroup = new ImgGroup();
			imgGroup.setID(id);

			imageMetrics = new Spatialmetrics();
			imgGroup.setImageMetrics(setImageMetrics(imageMetrics, calcImg));

			imgGroup.setPpi(calcImg.getDpi());

			format = new Format();
			imgGroup.setFormat(setFormat(format, calcImg));
			if (scanning!= null) {
				imgGroup.setScanning(scanning);
			}
		} catch (InfoException e) {
			throw e;
		}
		return imgGroup;
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
	private void readImg(Altimg img, CalcImg calcImg, File fImg, Gen gen) throws DatatypeConfigurationException,
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

			if (gen != null) {				
				img.setImggroupID(getImggroupID(img, calcImg, gen));
				img.setScanning(null);
			} else {

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
			}
			
			
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

	private ImgGroup getImggroupID(Altimg img, CalcImg calcImg, Gen gen) throws InfoException {
		String id = null;
		ImgGroup result = null;
		DecimalFormat df4 = new DecimalFormat("0000");
		if (gen.getImgGroup()==null || gen.getImgGroup().size()==0) {
			id = "IMG-GRP_"+df4.format(1);
			result = addImgGroup(null, calcImg, id);
			gen.getImgGroup().add(result);
		} else {
			for (int x=0; x<gen.getImgGroup().size(); x++) {
				if (testImgGroup(gen.getImgGroup().get(x), calcImg, null)) {
					result = gen.getImgGroup().get(x);
					break;
				}
			}
			if (result == null) {
				id = "IMG-GRP_"+df4.format(gen.getImgGroup().size()+1);
				result = addImgGroup(null, calcImg, id);
				gen.getImgGroup().add(result);
			}
		}
		return result;
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

	public void calcOcr(Ocr ocr, String pathMag) throws XsdException {
		File fOcr= null;
		MD5 md5 = null;
		BasicFileAttributes attrs;
		FileTime time ;
		GregorianCalendar gc = null;
		
		try {
			fOcr = new File(pathMag+File.separator+ocr.getFile().getHref());
			
			md5 = new MD5(fOcr);
			ocr.setMd5(md5.getDigest());
			ocr.setFilesize(BigInteger.valueOf(fOcr.length()));
			
			attrs = Files.readAttributes(fOcr.toPath(), BasicFileAttributes.class);
			time = attrs.creationTime();
			
			gc = new GregorianCalendar();
			gc.setTimeInMillis(time.toMillis());
			
			
			ocr.setDatetimecreated(DatatypeFactory.newInstance().newXMLGregorianCalendar(gc));
		} catch (NoSuchAlgorithmException e) {
			throw new XsdException(e.getMessage(), e);
		} catch (FileNotFoundException e) {
			throw new XsdException(e.getMessage(), e);
		} catch (IOException e) {
			throw new XsdException(e.getMessage(), e);
		} catch (DatatypeConfigurationException e) {
			throw new XsdException(e.getMessage(), e);
		}
	}

	public void calcDoc(Doc doc, String pathMag) throws XsdException {
		File fDoc= null;
		MD5 md5 = null;
		BasicFileAttributes attrs;
		FileTime time ;
		GregorianCalendar gc = null;
		
		try {
			fDoc = new File(pathMag+File.separator+doc.getFile().getHref());
			
			md5 = new MD5(fDoc);
			doc.setMd5(md5.getDigest());
			doc.setFilesize(BigInteger.valueOf(fDoc.length()));
			
			attrs = Files.readAttributes(fDoc.toPath(), BasicFileAttributes.class);
			time = attrs.creationTime();
			
			gc = new GregorianCalendar();
			gc.setTimeInMillis(time.toMillis());
			
			doc.setDatetimecreated(DatatypeFactory.newInstance().newXMLGregorianCalendar(gc));
		} catch (NoSuchAlgorithmException e) {
			throw new XsdException(e.getMessage(), e);
		} catch (FileNotFoundException e) {
			throw new XsdException(e.getMessage(), e);
		} catch (IOException e) {
			throw new XsdException(e.getMessage(), e);
		} catch (DatatypeConfigurationException e) {
			throw new XsdException(e.getMessage(), e);
		}
	}
}
