//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.02.28 alle 02:40:46 PM CET 
//


package com.pdflib.xml.tet5.tet_5;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *       &lt;sequence>
 *         &lt;group ref="{http://www.pdflib.com/XML/TET5/TET-5.0}ContentGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="granularity" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="glyph"/>
 *             &lt;enumeration value="line"/>
 *             &lt;enumeration value="page"/>
 *             &lt;enumeration value="word"/>
 *             &lt;enumeration value="wordplus"/>
 *             &lt;enumeration value="zone"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="dehyphenation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="dropcap" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="font" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="geometry" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="shadow" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="sub" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="sup" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contentGroup"
})
@XmlRootElement(name = "Content")
public class Content {

    @XmlElements({
        @XmlElement(name = "Word", type = Word.class),
        @XmlElement(name = "Line", type = Line.class),
        @XmlElement(name = "Para", type = Para.class),
        @XmlElement(name = "Table", type = Table.class),
        @XmlElement(name = "PlacedImage", type = PlacedImage.class),
        @XmlElement(name = "Glyph", type = Glyph.class),
        @XmlElement(name = "A", type = A.class),
        @XmlElement(name = "Text", type = Text.class),
        @XmlElement(name = "List", type = com.pdflib.xml.tet5.tet_5.List.class)
    })
    protected java.util.List<Object> contentGroup;
    @XmlAttribute(name = "granularity", required = true)
    protected String granularity;
    @XmlAttribute(name = "dehyphenation")
    protected Boolean dehyphenation;
    @XmlAttribute(name = "dropcap")
    protected Boolean dropcap;
    @XmlAttribute(name = "font", required = true)
    protected boolean font;
    @XmlAttribute(name = "geometry", required = true)
    protected boolean geometry;
    @XmlAttribute(name = "shadow")
    protected Boolean shadow;
    @XmlAttribute(name = "sub")
    protected Boolean sub;
    @XmlAttribute(name = "sup")
    protected Boolean sup;

    /**
     * Gets the value of the contentGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Word }
     * {@link Line }
     * {@link Para }
     * {@link Table }
     * {@link PlacedImage }
     * {@link Glyph }
     * {@link A }
     * {@link Text }
     * {@link com.pdflib.xml.tet5.tet_5.List }
     * 
     * 
     */
    public java.util.List<Object> getContentGroup() {
        if (contentGroup == null) {
            contentGroup = new ArrayList<Object>();
        }
        return this.contentGroup;
    }

    /**
     * Recupera il valore della proprietà granularity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGranularity() {
        return granularity;
    }

    /**
     * Imposta il valore della proprietà granularity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGranularity(String value) {
        this.granularity = value;
    }

    /**
     * Recupera il valore della proprietà dehyphenation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDehyphenation() {
        return dehyphenation;
    }

    /**
     * Imposta il valore della proprietà dehyphenation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDehyphenation(Boolean value) {
        this.dehyphenation = value;
    }

    /**
     * Recupera il valore della proprietà dropcap.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDropcap() {
        return dropcap;
    }

    /**
     * Imposta il valore della proprietà dropcap.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDropcap(Boolean value) {
        this.dropcap = value;
    }

    /**
     * Recupera il valore della proprietà font.
     * 
     */
    public boolean isFont() {
        return font;
    }

    /**
     * Imposta il valore della proprietà font.
     * 
     */
    public void setFont(boolean value) {
        this.font = value;
    }

    /**
     * Recupera il valore della proprietà geometry.
     * 
     */
    public boolean isGeometry() {
        return geometry;
    }

    /**
     * Imposta il valore della proprietà geometry.
     * 
     */
    public void setGeometry(boolean value) {
        this.geometry = value;
    }

    /**
     * Recupera il valore della proprietà shadow.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShadow() {
        return shadow;
    }

    /**
     * Imposta il valore della proprietà shadow.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShadow(Boolean value) {
        this.shadow = value;
    }

    /**
     * Recupera il valore della proprietà sub.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSub() {
        return sub;
    }

    /**
     * Imposta il valore della proprietà sub.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSub(Boolean value) {
        this.sub = value;
    }

    /**
     * Recupera il valore della proprietà sup.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSup() {
        return sup;
    }

    /**
     * Imposta il valore della proprietà sup.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSup(Boolean value) {
        this.sup = value;
    }

}
