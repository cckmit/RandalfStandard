//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.23 at 05:30:10 PM CEST 
//


package mx.randalf.schedaF;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}csm_info"/>
 *         &lt;element ref="{}schede"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "csmInfo",
    "schede"
})
@XmlRootElement(name = "csm_root")
public class CsmRoot {

    @XmlElement(name = "csm_info", required = true)
    protected CsmInfo csmInfo;
    @XmlElement(required = true)
    protected Schede schede;

    /**
     * Gets the value of the csmInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CsmInfo }
     *     
     */
    public CsmInfo getCsmInfo() {
        return csmInfo;
    }

    /**
     * Sets the value of the csmInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsmInfo }
     *     
     */
    public void setCsmInfo(CsmInfo value) {
        this.csmInfo = value;
    }

    /**
     * Gets the value of the schede property.
     * 
     * @return
     *     possible object is
     *     {@link Schede }
     *     
     */
    public Schede getSchede() {
        return schede;
    }

    /**
     * Sets the value of the schede property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schede }
     *     
     */
    public void setSchede(Schede value) {
        this.schede = value;
    }

}
