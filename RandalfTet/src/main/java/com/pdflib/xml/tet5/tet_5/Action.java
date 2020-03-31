//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.02.28 alle 02:40:46 PM CET 
//


package com.pdflib.xml.tet5.tet_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="filename" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="javascript" type="{http://www.pdflib.com/XML/TET5/TET-5.0}javaScriptId" />
 *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="trigger" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="activate"/>
 *             &lt;enumeration value="blur"/>
 *             &lt;enumeration value="calculate"/>
 *             &lt;enumeration value="close"/>
 *             &lt;enumeration value="close"/>
 *             &lt;enumeration value="didprint"/>
 *             &lt;enumeration value="didsave"/>
 *             &lt;enumeration value="down"/>
 *             &lt;enumeration value="exit"/>
 *             &lt;enumeration value="focus"/>
 *             &lt;enumeration value="format"/>
 *             &lt;enumeration value="invisible"/>
 *             &lt;enumeration value="keystroke"/>
 *             &lt;enumeration value="open"/>
 *             &lt;enumeration value="open"/>
 *             &lt;enumeration value="up"/>
 *             &lt;enumeration value="validate"/>
 *             &lt;enumeration value="visible"/>
 *             &lt;enumeration value="willclose"/>
 *             &lt;enumeration value="willprint"/>
 *             &lt;enumeration value="willsave"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Action")
public class Action {

    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "filename")
    protected String filename;
    @XmlAttribute(name = "javascript")
    protected String javascript;
    @XmlAttribute(name = "URI")
    protected String uri;
    @XmlAttribute(name = "trigger", required = true)
    protected String trigger;

    /**
     * Recupera il valore della proprietà type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Imposta il valore della proprietà type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà filename.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Imposta il valore della proprietà filename.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Recupera il valore della proprietà javascript.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJavascript() {
        return javascript;
    }

    /**
     * Imposta il valore della proprietà javascript.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJavascript(String value) {
        this.javascript = value;
    }

    /**
     * Recupera il valore della proprietà uri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURI() {
        return uri;
    }

    /**
     * Imposta il valore della proprietà uri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURI(String value) {
        this.uri = value;
    }

    /**
     * Recupera il valore della proprietà trigger.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrigger() {
        return trigger;
    }

    /**
     * Imposta il valore della proprietà trigger.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrigger(String value) {
        this.trigger = value;
    }

}
