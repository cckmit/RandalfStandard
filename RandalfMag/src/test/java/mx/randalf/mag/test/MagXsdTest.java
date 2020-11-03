/**
 * 
 */
package mx.randalf.mag.test;

import java.io.File;
import java.math.BigInteger;

import org.im4java.process.ProcessStarter;

import it.sbn.iccu.metaag1.Metadigit;
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
			magXsdTest.esegui(new File(args[1]));
		} else {
			System.out.println("E' necessario indicare i seguenti parametri:");
			System.out.println("1) path di installazione dell'ImageMagick");
			System.out.println("2) file da analizzare");
		}
	}

	public void esegui(File fMag) {
		MagXsd magXsd = null;
		Metadigit mag = null;
		long sequenza = 0;
 		
		try {
			magXsd = new MagXsd(null);
			
			mag = magXsd.read(fMag);
			
			if (mag.getImg()!= null && mag.getImg().size()>0) {
				for (int x=0; x<mag.getImg().size(); x++) {
					sequenza++;
					mag.getImg().get(x).setSequenceNumber(BigInteger.valueOf(sequenza));
					magXsd.calcImg(mag.getImg().get(x), fMag.getParentFile().getAbsolutePath(),mag.getGen());
				}
			}
			
			magXsd.write(mag, fMag, true);
		} catch (XsdException e) {
			e.printStackTrace();
		} catch (PubblicaException e) {
			e.printStackTrace();
		}
	}

}
