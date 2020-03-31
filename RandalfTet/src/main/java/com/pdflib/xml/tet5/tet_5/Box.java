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
 *       &lt;group ref="{http://www.pdflib.com/XML/TET5/TET-5.0}ContentGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;attGroup ref="{http://www.pdflib.com/XML/TET5/TET-5.0}BoxAttr"/>
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
@XmlRootElement(name = "Box")
public class Box {

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
    @XmlAttribute(name = "llx", required = true)
    protected double llx;
    @XmlAttribute(name = "lly", required = true)
    protected double lly;
    @XmlAttribute(name = "urx", required = true)
    protected double urx;
    @XmlAttribute(name = "ury", required = true)
    protected double ury;
    @XmlAttribute(name = "ulx")
    protected Double ulx;
    @XmlAttribute(name = "uly")
    protected Double uly;
    @XmlAttribute(name = "lrx")
    protected Double lrx;
    @XmlAttribute(name = "lry")
    protected Double lry;

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
     * Recupera il valore della proprietà llx.
     * 
     */
    public double getLlx() {
        return llx;
    }

    /**
     * Imposta il valore della proprietà llx.
     * 
     */
    public void setLlx(double value) {
        this.llx = value;
    }

    /**
     * Recupera il valore della proprietà lly.
     * 
     */
    public double getLly() {
        return lly;
    }

    /**
     * Imposta il valore della proprietà lly.
     * 
     */
    public void setLly(double value) {
        this.lly = value;
    }

    /**
     * Recupera il valore della proprietà urx.
     * 
     */
    public double getUrx() {
        return urx;
    }

    /**
     * Imposta il valore della proprietà urx.
     * 
     */
    public void setUrx(double value) {
        this.urx = value;
    }

    /**
     * Recupera il valore della proprietà ury.
     * 
     */
    public double getUry() {
        return ury;
    }

    /**
     * Imposta il valore della proprietà ury.
     * 
     */
    public void setUry(double value) {
        this.ury = value;
    }

    /**
     * Recupera il valore della proprietà ulx.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUlx() {
        return ulx;
    }

    /**
     * Imposta il valore della proprietà ulx.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUlx(Double value) {
        this.ulx = value;
    }

    /**
     * Recupera il valore della proprietà uly.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUly() {
        return uly;
    }

    /**
     * Imposta il valore della proprietà uly.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUly(Double value) {
        this.uly = value;
    }

    /**
     * Recupera il valore della proprietà lrx.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLrx() {
        return lrx;
    }

    /**
     * Imposta il valore della proprietà lrx.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLrx(Double value) {
        this.lrx = value;
    }

    /**
     * Recupera il valore della proprietà lry.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLry() {
        return lry;
    }

    /**
     * Imposta il valore della proprietà lry.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLry(Double value) {
        this.lry = value;
    }

}
