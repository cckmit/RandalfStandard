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
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attGroup ref="{http://www.pdflib.com/XML/TET5/TET-5.0}TextAttr"/>
 *       &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="artifact" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "Glyph")
public class Glyph {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "x", required = true)
    protected double x;
    @XmlAttribute(name = "y", required = true)
    protected double y;
    @XmlAttribute(name = "width", required = true)
    protected double width;
    @XmlAttribute(name = "height")
    protected Double height;
    @XmlAttribute(name = "artifact")
    protected Boolean artifact;
    @XmlAttribute(name = "alpha")
    protected Double alpha;
    @XmlAttribute(name = "beta")
    protected Double beta;
    @XmlAttribute(name = "shadow")
    protected Boolean shadow;
    @XmlAttribute(name = "dropcap")
    protected Boolean dropcap;
    @XmlAttribute(name = "font", required = true)
    protected String font;
    @XmlAttribute(name = "size", required = true)
    protected double size;
    @XmlAttribute(name = "sub")
    protected Boolean sub;
    @XmlAttribute(name = "sup")
    protected Boolean sup;
    @XmlAttribute(name = "textrendering")
    protected String textrendering;
    @XmlAttribute(name = "unknown")
    protected Boolean unknown;
    @XmlAttribute(name = "dehyphenation")
    protected String dehyphenation;
    @XmlAttribute(name = "fill")
    protected String fill;
    @XmlAttribute(name = "stroke")
    protected String stroke;

    /**
     * Recupera il valore della proprietà value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
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
     * Recupera il valore della proprietà height.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHeight() {
        return height;
    }

    /**
     * Imposta il valore della proprietà height.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHeight(Double value) {
        this.height = value;
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
     * Recupera il valore della proprietà shadow.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShadow() {
        if (shadow == null) {
            return false;
        } else {
            return shadow;
        }
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
     * Recupera il valore della proprietà dropcap.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDropcap() {
        if (dropcap == null) {
            return false;
        } else {
            return dropcap;
        }
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFont() {
        return font;
    }

    /**
     * Imposta il valore della proprietà font.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFont(String value) {
        this.font = value;
    }

    /**
     * Recupera il valore della proprietà size.
     * 
     */
    public double getSize() {
        return size;
    }

    /**
     * Imposta il valore della proprietà size.
     * 
     */
    public void setSize(double value) {
        this.size = value;
    }

    /**
     * Recupera il valore della proprietà sub.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSub() {
        if (sub == null) {
            return false;
        } else {
            return sub;
        }
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
    public boolean isSup() {
        if (sup == null) {
            return false;
        } else {
            return sup;
        }
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

    /**
     * Recupera il valore della proprietà textrendering.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextrendering() {
        if (textrendering == null) {
            return "fill";
        } else {
            return textrendering;
        }
    }

    /**
     * Imposta il valore della proprietà textrendering.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextrendering(String value) {
        this.textrendering = value;
    }

    /**
     * Recupera il valore della proprietà unknown.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUnknown() {
        if (unknown == null) {
            return false;
        } else {
            return unknown;
        }
    }

    /**
     * Imposta il valore della proprietà unknown.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnknown(Boolean value) {
        this.unknown = value;
    }

    /**
     * Recupera il valore della proprietà dehyphenation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDehyphenation() {
        if (dehyphenation == null) {
            return "none";
        } else {
            return dehyphenation;
        }
    }

    /**
     * Imposta il valore della proprietà dehyphenation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDehyphenation(String value) {
        this.dehyphenation = value;
    }

    /**
     * Recupera il valore della proprietà fill.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFill() {
        return fill;
    }

    /**
     * Imposta il valore della proprietà fill.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFill(String value) {
        this.fill = value;
    }

    /**
     * Recupera il valore della proprietà stroke.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStroke() {
        return stroke;
    }

    /**
     * Imposta il valore della proprietà stroke.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStroke(String value) {
        this.stroke = value;
    }

}
