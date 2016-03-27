/**
 * 
 */
package mx.randalf.mag;

import it.sbn.iccu.metaag1.Bib;
import it.sbn.iccu.metaag1.Metadigit;

/**
 * @author massi
 *
 */
public class MagReader {

	private Metadigit dc;

	/**
	 * 
	 */
	public MagReader(Metadigit dc) {
		this.dc = dc;
	}

	public String getBid(){
		String value = null;
		if (dc.getBib() != null && 
				dc.getBib().getIdentifier() != null && 
				dc.getBib().getIdentifier().size()>0){
			for (int x=0;x <dc.getBib().getIdentifier().size(); x++){
				if (!dc.getBib().getIdentifier().get(x).
						getContent().get(0).startsWith("info") ||
						dc.getBib().getIdentifier().get(x).
							getContent().get(0).startsWith("info:sbn/")){
					value = dc.getBib().getIdentifier().get(x).
							getContent().get(0).replace("info:sbn/", "");
					break;
				}
			}
		}
		return value;
	}

	public String getBni(){
		String value = null;
		if (dc.getBib() != null && 
				dc.getBib().getIdentifier() != null && 
				dc.getBib().getIdentifier().size()>0){
			for (int x=0;x <dc.getBib().getIdentifier().size(); x++){
				if (dc.getBib().getIdentifier().get(x).
						getContent().get(0).startsWith("info:bni/")){
					value = dc.getBib().getIdentifier().get(x).
							getContent().get(0).replace("info:bni/", "");
					break;
				}
			}
		}
		return value;
	}

	/**
	 * @return the dc
	 */
	public Bib getBib() {
		return dc.getBib();
	}

}
