/**
 * 
 */
package mx.randalf.mag.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.im4java.process.ProcessStarter;

import it.sbn.iccu.metaag1.Metadigit;
import mx.randalf.digest.MD5;
import mx.randalf.interfacException.exception.PubblicaException;
import mx.randalf.mag.MagXsd;
import mx.randalf.xsd.exception.XsdException;

/**
 * @author massi
 *
 */
public class MagXsdTest {

	/**
	 * 
	 */
	public MagXsdTest() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MagXsdTest magXsdTest = null;
		
		if (args.length==2) {
			ProcessStarter.setGlobalSearchPath(args[0]);
			magXsdTest = new MagXsdTest();
			magXsdTest.esegui(new File(args[1]), new File(args[2]));
		} else {
			System.out.println("E' necessario indicare i seguenti parametri:");
			System.out.println("1) path di installazione dell'ImageMagick");
			System.out.println("2) file da analizzare");
		}
	}

	public void esegui(File fMag, File fileMd5) {
		MagXsd magXsd = null;
		Metadigit mag = null;
		long sequenza = 0;
		File fOcr = null;
		MD5 md5 = null;
 		
		try {
			magXsd = new MagXsd(null);
			
			mag = magXsd.read(fMag);
			
			if (mag.getImg()!= null && mag.getImg().size()>0) {
				sequenza = 0;
				for (int x=0; x<mag.getImg().size(); x++) {
					sequenza++;
					mag.getImg().get(x).setSequenceNumber(BigInteger.valueOf(sequenza));
					magXsd.calcImg(mag.getImg().get(x), fMag.getParentFile().getAbsolutePath(),mag.getGen(), fileMd5);
				}
			}
			if (mag.getOcr()!= null && mag.getOcr().size()>0) {
				sequenza = 0;
				for (int x=0; x<mag.getOcr().size(); x++) {
					try {
						sequenza++;
						mag.getOcr().get(x).setSequenceNumber(BigInteger.valueOf(sequenza));
						fOcr = new File(fMag.getParentFile().getAbsolutePath()+
								File.separator+mag.getOcr().get(x).getFile().getHref());
						md5 = new MD5(fOcr, fileMd5);
						mag.getOcr().get(x).setMd5(md5.getDigest());
						mag.getOcr().get(x).setFilesize(BigInteger.valueOf(fOcr.length()));
						mag.getOcr().get(x).setDatetimecreated(getDateTimeCreate(fOcr.lastModified()));
					} catch (NoSuchAlgorithmException e) {
						e.printStackTrace();
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					} catch (DatatypeConfigurationException e) {
						e.printStackTrace();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
			
			magXsd.write(mag, fMag, true, fileMd5);
		} catch (XsdException e) {
			e.printStackTrace();
		} catch (PubblicaException e) {
			e.printStackTrace();
		}
	}

	public XMLGregorianCalendar getDateTimeCreate(long lastModified) throws DatatypeConfigurationException {
		XMLGregorianCalendar ris = null;
		GregorianCalendar gc = null;

		gc = new GregorianCalendar();
		gc.setTimeInMillis(lastModified);
		ris = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
		return ris;
	}

}
