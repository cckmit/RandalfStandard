/**
 * 
 */
package mx.randalf.dc;

import org.openarchives.oai._2_0.oai_dc.OaiDcType;

import mx.randalf.xsd.ReadXsd;
import mx.randalf.xsd.exception.XsdException;

/**
 * @author massi
 *
 */
public class DCXsd extends ReadXsd<OaiDcType> {

	public DCXsd(){
	}

	public String write(OaiDcType obj) throws XsdException {
		String schemaLocation = null;

		schemaLocation = "http://www.openarchives.org/OAI/2.0/oai_dc/ http://www.openarchives.org/OAI/2.0/oai_dc.xsd";
		return write(obj, new DcNamespacePrefix(), null, null, schemaLocation);
	}
}
