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

	private String schemaXsd = "http://www.bncf.firenze.sbn.it/SchemaXML/Mag/2.0.1/metadigit.xsd";
	
	/**
	 * 
	 */
	public CalcImgMagCmd(String calcImgPath, String schemaXsd) {
		if (calcImgPath != null){
			ProcessStarter.setGlobalSearchPath(calcImgPath);
		}
		setSchemaXsd(schemaXsd);
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
				cimc = new CalcImgMagCmd((args.length>1?args[1]:null),
						(args.length>2?args[2]:null));
				cimc.scanFolder(f);
			} else {
				System.out.println("La cartella ["+f.getAbsolutePath()+"] non esiste");
			}
		} else {
			System.out.println("E' necessario indicare i seguenti paramenti: ");
			System.out.println("1) path da analizzare");
			System.out.println("2) Utilizzato per indircare lo Schema Xsd da utilizzare per la validazione (Opzionale, Default http://www.bncf.firenze.sbn.it/SchemaXML/Mag/2.0.1/metadigit.xsd)");
			System.out.println("3) path in cui è installato il pacchetto ImageMagic (optionale)");
		}
	}

	public void scanFolder(File f){
		File[] fl = null;
		File fCert = null;
		
		if (f.isFile() && f.getName().endsWith(".xml") &&
				!f.getName().startsWith(".")) {
			fCert = new File(f.getAbsolutePath()+".cert");
			if (!fCert.exists()){
				calcImg(f);
			} else {
				System.out.println("Il file ["+f.getAbsolutePath()+"] risulta già elaborato");
			}

		} else {
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
	}

	private void calcImg(File f){
		MagXsd magXsd = null;
		Metadigit mag = null;
		
		try {
			log.debug("\nAnalizzo il file ["+f.getAbsolutePath()+"]");
			magXsd = new MagXsd(schemaXsd);
			mag = magXsd.read(f);
			if (mag.getImg()!= null && mag.getImg().size()>0){
				for (int x=0; x<mag.getImg().size(); x++){
					try {
						if (((x+1)%100)==0){
							log.debug("\nImg. "+(x+1)+"/"+mag.getImg().size());
						}
						magXsd.calcImg(mag.getImg().get(x), f.getParentFile().getAbsolutePath());
					} catch (XsdException e) {
						log.error("["+f.getAbsolutePath()+" img "+(x+1)+"] "+e.getMessage(), e);
					}
				}
			}
			if (mag.getOcr()!= null && mag.getOcr().size()>0){
				for (int x=0; x<mag.getOcr().size(); x++){
					try {
						if (((x+1)%100)==0){
							log.debug("\nOcr. "+(x+1)+"/"+mag.getOcr().size());
						}
						magXsd.calcOcr(mag.getOcr().get(x), f.getParentFile().getAbsolutePath());
					} catch (XsdException e) {
						log.error("["+f.getAbsolutePath()+" ocr "+(x+1)+"] "+e.getMessage(), e);
					}
				}
			}
			if (mag.getDoc()!= null && mag.getDoc().size()>0){
				for (int x=0; x<mag.getDoc().size(); x++){
					try {
						if (((x+1)%100)==0){
							log.debug("\nDoc. "+(x+1)+"/"+mag.getDoc().size());
						}
						magXsd.calcDoc(mag.getDoc().get(x), f.getParentFile().getAbsolutePath());
					} catch (XsdException e) {
						log.error("["+f.getAbsolutePath()+" doc "+(x+1)+"] "+e.getMessage(), e);
					}
				}
			}
			log.debug("\nImg. "+mag.getImg().size());
			magXsd.write(mag, f, true);
		} catch (XsdException e) {
			log.error("["+f.getAbsolutePath()+"] "+e.getMessage(), e);
		} catch (PubblicaException e) {
			log.error("["+f.getAbsolutePath()+"] "+e.getMessage(), e);
		}
	}

	public String getSchemaXsd() {
		return schemaXsd;
	}

	public void setSchemaXsd(String schemaXsd) {
		this.schemaXsd = schemaXsd;
	}
}
