/**
 * 
 */
package mx.randalf.standard.dSpace;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author massi
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dcvalue"})
@XmlRootElement(name = "dublin_core")
public class Dublin_core {

	protected List<Dcvalue> dcvalue;

	/**
	 * 
	 */
	public Dublin_core() {
	}

	public List<Dcvalue> getDcvalue() {
        if (dcvalue == null) {
        	dcvalue = new ArrayList<Dcvalue>();
        }
		return dcvalue;
	}

}
