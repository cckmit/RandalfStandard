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
 *       &lt;attribute name="alpha" default="0">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *             &lt;minExclusive value="-180"/>
 *             &lt;maxInclusive value="180"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="artifact" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="beta" default="0">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *             &lt;minExclusive value="-180"/>
 *             &lt;maxInclusive value="180"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="height" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="image" use="required" type="{http://www.pdflib.com/XML/TET5/TET-5.0}imageId" />
 *       &lt;attribute name="source" default="page">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="annotation"/>
 *             &lt;enumeration value="page"/>
 *             &lt;enumeration value="pattern"/>
 *             &lt;enumeration value="softmask"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="width" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PlacedImage")
public class PlacedImage {

    @XmlAttribute(name = "alpha")
    protected Double alpha;
    @XmlAttribute(name = "artifact")
    protected Boolean artifact;
    @XmlAttribute(name = "beta")
    protected Double beta;
    @XmlAttribute(name = "height", required = true)
    protected double height;
    @XmlAttribute(name = "image", required = true)
    protected String image;
    @XmlAttribute(name = "source")
    protected String source;
    @XmlAttribute(name = "width", required = true)
    protected double width;
    @XmlAttribute(name = "x", required = true)
    protected double x;
    @XmlAttribute(name = "y", required = true)
    protected double y;

    /**
     * Recupera il valore della proprietà alpha.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getAlpha() {
        if (alpha == null) {
            return  0.0D;
        } else {
            return alpha;
        }
    }

    /**
     * Imposta il valore della proprietà alpha.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAlpha(Double value) {
        this.alpha = value;
    }

    /**
     * Recupera il valore della proprietà artifact.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isArtifact() {
        if (artifact == null) {
            return false;
        } else {
            return artifact;
        }
    }

    /**
     * Imposta il valore della proprietà artifact.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArtifact(Boolean value) {
        this.artifact = value;
    }

    /**
     * Recupera il valore della proprietà beta.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getBeta() {
        if (beta == null) {
            return  0.0D;
        } else {
            return beta;
        }
    }

    /**
     * Imposta il valore della proprietà beta.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBeta(Double value) {
        this.beta = value;
    }

    /**
     * Recupera il valore della proprietà height.
     * 
     */
    public double getHeight() {
        return height;
    }

    /**
     * Imposta il valore della proprietà height.
     * 
     */
    public void setHeight(double value) {
        this.height = value;
    }

    /**
     * Recupera il valore della proprietà image.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImage() {
        return image;
    }

    /**
     * Imposta il valore della proprietà image.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImage(String value) {
        this.image = value;
    }

    /**
     * Recupera il valore della proprietà source.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        if (source == null) {
            return "page";
        } else {
            return source;
        }
    }

    /**
     * Imposta il valore della proprietà source.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Recupera il valore della proprietà width.
     * 
     */
    public double getWidth() {
        return width;
    }

    /**
     * Imposta il valore della proprietà width.
     * 
     */
    public void setWidth(double value) {
        this.width = value;
    }

    /**
     * Recupera il valore della proprietà x.
     * 
     */
    public double getX() {
        return x;
    }

    /**
     * Imposta il valore della proprietà x.
     * 
     */
    public void setX(double value) {
        this.x = value;
    }

    /**
     * Recupera il valore della proprietà y.
     * 
     */
    public double getY() {
        return y;
    }

    /**
     * Imposta il valore della proprietà y.
     * 
     */
    public void setY(double value) {
        this.y = value;
    }

}
