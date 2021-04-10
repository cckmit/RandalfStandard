/**
 * 
 */
package mx.randalf.standard.tei;

import org.teic.ns._10.Tei;

import mx.randalf.xsd.ReadXsd;
import mx.randalf.xsd.exception.XsdException;

/**
 * @author massi
 *
 */
public class RandalfTeiXsd extends ReadXsd<Tei> {

	private String schemaLocation = null;

	/**
	 * 
	 */
	public RandalfTeiXsd() {
		schemaLocation = "http://www.tei-c.org/ns/1.0  http://www.tei-c.org/release/xml/tei/custom/schema/xsd/tei_all.xsd";
	}

	public String write(Tei obj, Boolean jaxbFormattedOutput) throws XsdException {
		String result = "";

		try {
			result = write(obj, new TeiNamespacePrefix(), null, null, schemaLocation, jaxbFormattedOutput);
		} catch (XsdException e) {
			throw e;
		}
		return result;
	}

}
