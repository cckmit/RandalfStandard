/**
 * 
 */
package mx.randalf.mets;

import gov.loc.mets.MetsType;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import mx.randalf.digest.MD5;
import mx.randalf.interfacException.exception.PubblicaException;
import mx.randalf.parser.Parser;
import mx.randalf.parser.exception.ParserException;
import mx.randalf.xsd.ReadXsd;
import mx.randalf.xsd.exception.XsdException;

import org.apache.log4j.Logger;
import org.xml.sax.SAXParseException;

/**
 * @author massi
 *
 */
public class MetsXsd extends ReadXsd<MetsType> {

	private Logger log = Logger.getLogger(MetsXsd.class);

	/**
	 * 
	 */
	public MetsXsd() {
	}

	public boolean write(MetsType obj, File fMag, File fileMd5) throws XsdException, PubblicaException  {
		String schemaLocation = null;
		schemaLocation = "http://www.loc.gov/METS/ "
			       + "http://www.loc.gov/standards/mets/mets.xsd "
			       + "http://www.loc.gov/standards/mix/mix20/ "
			       + "http://www.loc.gov/standards/mix/mix20/mix20.xsd "
			       + "http://purl.org/dc/elements/1.1/ "
			       + "http://dublincore.org/schemas/xmls/simpledc20021212.xsd";
		return write(obj, fMag, schemaLocation, fileMd5);
	}

	@SuppressWarnings("unused")
	public boolean write(MetsType obj, File fMag, String schemaLocation, File fileMd5) throws XsdException, PubblicaException  {
		ParserException errors = null;
		Parser parser = null;
		boolean result = false;
		MD5 md5Tools = null;
		String md5 = null;
		File fCert = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			write(obj, fMag, new MetsNamespacePrefix(), null, null,
					schemaLocation);

			errors = new ParserException();
			parser = new Parser(fMag.getAbsolutePath(), errors, true);
			if (errors.getNumErr() == 0) {
				result = true;
				md5Tools = new MD5(fMag, fileMd5);
				md5 = md5Tools.getDigest();

				fCert = new File(fMag.getAbsolutePath() + ".cert");
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
		} catch (XsdException e) {
			log.error(e.getMessage(), e);
			throw e;
		} catch (PubblicaException e) {
			log.error(e.getMessage(), e);
			throw e;
		} catch (IOException e) {
			log.error(e.getMessage(), e);
			throw new XsdException(e.getMessage(), e);
		} catch (InterruptedException e) {
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

	public String write(MetsType obj) throws XsdException  {
		String schemaLocation = null;
		String result = null;
		
		try {
			schemaLocation = "http://www.loc.gov/METS/ "
					       + "http://www.loc.gov/standards/mets/mets.xsd "
					       + "http://www.loc.gov/standards/mix/mix20/ "
					       + "http://www.loc.gov/standards/mix/mix20/mix20.xsd "
					       + "http://purl.org/dc/elements/1.1/ "
					       + "http://dublincore.org/schemas/xmls/simpledc20021212.xsd";
			result  =  write(obj, new MetsNamespacePrefix(), null, null,
					schemaLocation);
		} catch (XsdException e) {
			log.error(e.getMessage(), e);
			throw e;
		}
		return result;
	}
	
}
