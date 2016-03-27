/**
 * 
 */
package mx.randalf.mag.batch;

import it.sbn.iccu.metaag1.Metadigit;

import java.io.File;
import java.io.FileFilter;

import org.apache.log4j.Logger;
import org.im4java.process.ProcessStarter;

import mx.randalf.interfacException.exception.PubblicaException;
import mx.randalf.mag.MagXsd;
import mx.randalf.xsd.exception.XsdException;

/**
 * @author massi
 *
 */
public class CalcImgMagCmd {

	private Logger log = Logger.getLogger(CalcImgMagCmd.class);

	/**
	 * 
	 */
	public CalcImgMagCmd(String calcImgPath) {
		if (calcImgPath != null){
			ProcessStarter.setGlobalSearchPath(calcImgPath);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CalcImgMagCmd cimc = null;
		File f = null;
		if (args.length>0){
			f = new File(args[0]);
			if (f.exists()){
				cimc = new CalcImgMagCmd((args.length>1?args[1]:null));
				cimc.scanFolder(f);
			} else {
				System.out.println("La cartella ["+f.getAbsolutePath()+"] non esiste");
			}
		} else {
			System.out.println("E' necessario indicare i seguenti paramenti: ");
			System.out.println("1) path da analizzare");
			System.out.println("2) path in cui è installato il pacchetto ImageMagic (optionale)");
		}
	}

	public void scanFolder(File f){
		File[] fl = null;
		
		fl = f.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				boolean result = false;
				File fCert = null;
				
				if (pathname.isDirectory()){
					result = true;
				} else if (pathname.getName().endsWith(".xml") &&
						!pathname.getName().startsWith(".")){
					fCert = new File(pathname.getAbsolutePath()+".cert");
					if (!fCert.exists()){
						result = true;
					}
				}
				return result;
			}
		});
		
		for ( int x=0; x<fl.length; x++){
			if (fl[x].isDirectory()){
				scanFolder(fl[x]);
			} else {
				calcImg(fl[x]);
			}
		}
	}

	private void calcImg(File f){
		MagXsd magXsd = null;
		Metadigit mag = null;
		
		try {
			System.out.println("Analizzo il file ["+f.getAbsolutePath()+"]");
			magXsd = new MagXsd();
			mag = magXsd.read(f);
			if (mag.getImg()!= null && mag.getImg().size()>0){
				for (int x=0; x<mag.getImg().size(); x++){
					try {
						if (((x+1)%100)==0){
							System.out.println("Img. "+(x+1)+"/"+mag.getImg().size());
						}
						magXsd.calcImg(mag.getImg().get(x), f.getParentFile().getAbsolutePath());
					} catch (XsdException e) {
						log.error("["+f.getAbsolutePath()+" img "+(x+1)+"] "+e.getMessage(), e);
					}
				}
			}
			System.out.println("Img. "+mag.getImg().size());
			magXsd.write(mag, f);
		} catch (XsdException e) {
			log.error("["+f.getAbsolutePath()+"] "+e.getMessage(), e);
		} catch (PubblicaException e) {
			log.error("["+f.getAbsolutePath()+"] "+e.getMessage(), e);
		}
	}
}
