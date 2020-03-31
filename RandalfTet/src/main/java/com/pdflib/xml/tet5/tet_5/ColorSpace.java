//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.02.28 alle 02:40:46 PM CET 
//


package com.pdflib.xml.tet5.tet_5;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="Colorant" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="colorspace" type="{http://www.pdflib.com/XML/TET5/TET-5.0}colorSpaceId" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
 *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Function" minOccurs="0"/>
 *         &lt;element name="WhitePoint" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="x">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
 *                       &lt;minExclusive value="0"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="y">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
 *                       &lt;minExclusive value="0"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="z">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
 *                       &lt;minExclusive value="0"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BlackPoint" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="x">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
 *                       &lt;minInclusive value="0"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="y">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
 *                       &lt;minInclusive value="0"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="z">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
 *                       &lt;minInclusive value="0"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Gamma" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Matrix" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="9" minOccurs="9"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Range" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="8" minOccurs="2"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Process" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Component" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="colorspace" type="{http://www.pdflib.com/XML/TET5/TET-5.0}colorSpaceId" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Lookup" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="alternate" type="{http://www.pdflib.com/XML/TET5/TET-5.0}colorSpaceId" />
 *       &lt;attribute name="base" type="{http://www.pdflib.com/XML/TET5/TET-5.0}colorSpaceId" />
 *       &lt;attribute name="components" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="hival">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;maxInclusive value="255"/>
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="iccprofile" type="{http://www.pdflib.com/XML/TET5/TET-5.0}ICCId" />
 *       &lt;attribute name="id" use="required" type="{http://www.pdflib.com/XML/TET5/TET-5.0}colorSpaceId" />
 *       &lt;attribute name="name" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="CalGray"/>
 *             &lt;enumeration value="CalRGB"/>
 *             &lt;enumeration value="DeviceCMYK"/>
 *             &lt;enumeration value="DeviceGray"/>
 *             &lt;enumeration value="DeviceN"/>
 *             &lt;enumeration value="DeviceRGB"/>
 *             &lt;enumeration value="ICCBased"/>
 *             &lt;enumeration value="Indexed"/>
 *             &lt;enumeration value="Lab"/>
 *             &lt;enumeration value="Separation"/>
 *             &lt;enumeration value="Pattern"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="pattern" type="{http://www.pdflib.com/XML/TET5/TET-5.0}patternId" />
 *       &lt;attribute name="subtype">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="DeviceN"/>
 *             &lt;enumeration value="NChannel"/>
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
@XmlType(name = "", propOrder = {
    "colorantAndExceptionAndFunction"
})
@XmlRootElement(name = "ColorSpace")
public class ColorSpace {

    @XmlElementRefs({
        @XmlElementRef(name = "WhitePoint", namespace = "http://www.pdflib.com/XML/TET5/TET-5.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Range", namespace = "http://www.pdflib.com/XML/TET5/TET-5.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Exception", namespace = "http://www.pdflib.com/XML/TET5/TET-5.0", type = Exception.class, required = false),
        @XmlElementRef(name = "Lookup", namespace = "http://www.pdflib.com/XML/TET5/TET-5.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Process", namespace = "http://www.pdflib.com/XML/TET5/TET-5.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Colorant", namespace = "http://www.pdflib.com/XML/TET5/TET-5.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Gamma", namespace = "http://www.pdflib.com/XML/TET5/TET-5.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Function", namespace = "http://www.pdflib.com/XML/TET5/TET-5.0", type = Function.class, required = false),
        @XmlElementRef(name = "Matrix", namespace = "http://www.pdflib.com/XML/TET5/TET-5.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BlackPoint", namespace = "http://www.pdflib.com/XML/TET5/TET-5.0", type = JAXBElement.class, required = false)
    })
    protected List<Object> colorantAndExceptionAndFunction;
    @XmlAttribute(name = "alternate")
    protected String alternate;
    @XmlAttribute(name = "base")
    protected String base;
    @XmlAttribute(name = "components")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger components;
    @XmlAttribute(name = "hival")
    protected Integer hival;
    @XmlAttribute(name = "iccprofile")
    protected String iccprofile;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "pattern")
    protected String pattern;
    @XmlAttribute(name = "subtype")
    protected String subtype;

    /**
     * Gets the value of the colorantAndExceptionAndFunction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colorantAndExceptionAndFunction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColorantAndExceptionAndFunction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ColorSpace.WhitePoint }{@code >}
     * {@link JAXBElement }{@code <}{@link ColorSpace.Range }{@code >}
     * {@link Exception }
     * {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * {@link JAXBElement }{@code <}{@link ColorSpace.Process }{@code >}
     * {@link JAXBElement }{@code <}{@link ColorSpace.Colorant }{@code >}
     * {@link JAXBElement }{@code <}{@link ColorSpace.Gamma }{@code >}
     * {@link Function }
     * {@link JAXBElement }{@code <}{@link ColorSpace.Matrix }{@code >}
     * {@link JAXBElement }{@code <}{@link ColorSpace.BlackPoint }{@code >}
     * 
     * 
     */
    public List<Object> getColorantAndExceptionAndFunction() {
        if (colorantAndExceptionAndFunction == null) {
            colorantAndExceptionAndFunction = new ArrayList<Object>();
        }
        return this.colorantAndExceptionAndFunction;
    }

    /**
     * Recupera il valore della proprietà alternate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternate() {
        return alternate;
    }

    /**
     * Imposta il valore della proprietà alternate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternate(String value) {
        this.alternate = value;
    }

    /**
     * Recupera il valore della proprietà base.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Imposta il valore della proprietà base.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * Recupera il valore della proprietà components.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getComponents() {
        return components;
    }

    /**
     * Imposta il valore della proprietà components.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setComponents(BigInteger value) {
        this.components = value;
    }

    /**
     * Recupera il valore della proprietà hival.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHival() {
        return hival;
    }

    /**
     * Imposta il valore della proprietà hival.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHival(Integer value) {
        this.hival = value;
    }

    /**
     * Recupera il valore della proprietà iccprofile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIccprofile() {
        return iccprofile;
    }

    /**
     * Imposta il valore della proprietà iccprofile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIccprofile(String value) {
        this.iccprofile = value;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     * Recupera il valore della proprietà pattern.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Imposta il valore della proprietà pattern.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    /**
     * Recupera il valore della proprietà subtype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtype() {
        return subtype;
    }

    /**
     * Imposta il valore della proprietà subtype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtype(String value) {
        this.subtype = value;
    }


    /**
     * TET 5.0
     * 
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="x">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
     *             &lt;minInclusive value="0"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="y">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
     *             &lt;minInclusive value="0"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="z">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
     *             &lt;minInclusive value="0"/>
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
    public static class BlackPoint {

        @XmlAttribute(name = "x")
        protected Float x;
        @XmlAttribute(name = "y")
        protected Float y;
        @XmlAttribute(name = "z")
        protected Float z;

        /**
         * Recupera il valore della proprietà x.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getX() {
            return x;
        }

        /**
         * Imposta il valore della proprietà x.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setX(Float value) {
            this.x = value;
        }

        /**
         * Recupera il valore della proprietà y.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getY() {
            return y;
        }

        /**
         * Imposta il valore della proprietà y.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setY(Float value) {
            this.y = value;
        }

        /**
         * Recupera il valore della proprietà z.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getZ() {
            return z;
        }

        /**
         * Imposta il valore della proprietà z.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setZ(Float value) {
            this.z = value;
        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="colorspace" type="{http://www.pdflib.com/XML/TET5/TET-5.0}colorSpaceId" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Colorant {

        @XmlAttribute(name = "name", required = true)
        protected String name;
        @XmlAttribute(name = "colorspace")
        protected String colorspace;

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
         * Recupera il valore della proprietà colorspace.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getColorspace() {
            return colorspace;
        }

        /**
         * Imposta il valore della proprietà colorspace.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setColorspace(String value) {
            this.colorspace = value;
        }

    }


    /**
     * TET 5.0
     * 
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded"/>
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
        "value"
    })
    public static class Gamma {

        @XmlElement(name = "Value", type = Float.class)
        protected List<Float> value;

        /**
         * Gets the value of the value property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the value property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Float }
         * 
         * 
         */
        public List<Float> getValue() {
            if (value == null) {
                value = new ArrayList<Float>();
            }
            return this.value;
        }

    }


    /**
     * TET 5.0
     * 
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="9" minOccurs="9"/>
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
        "value"
    })
    public static class Matrix {

        @XmlElement(name = "Value", type = Float.class)
        protected List<Float> value;

        /**
         * Gets the value of the value property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the value property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Float }
         * 
         * 
         */
        public List<Float> getValue() {
            if (value == null) {
                value = new ArrayList<Float>();
            }
            return this.value;
        }

    }


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
     *         &lt;element name="Component" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="colorspace" type="{http://www.pdflib.com/XML/TET5/TET-5.0}colorSpaceId" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "component"
    })
    public static class Process {

        @XmlElement(name = "Component", required = true)
        protected List<ColorSpace.Process.Component> component;
        @XmlAttribute(name = "colorspace")
        protected String colorspace;

        /**
         * Gets the value of the component property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the component property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComponent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ColorSpace.Process.Component }
         * 
         * 
         */
        public List<ColorSpace.Process.Component> getComponent() {
            if (component == null) {
                component = new ArrayList<ColorSpace.Process.Component>();
            }
            return this.component;
        }

        /**
         * Recupera il valore della proprietà colorspace.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getColorspace() {
            return colorspace;
        }

        /**
         * Imposta il valore della proprietà colorspace.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setColorspace(String value) {
            this.colorspace = value;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Component {

            @XmlAttribute(name = "name")
            protected String name;

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

        }

    }


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
     *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="8" minOccurs="2"/>
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
        "value"
    })
    public static class Range {

        @XmlElement(name = "Value", type = Float.class)
        protected List<Float> value;

        /**
         * Gets the value of the value property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the value property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Float }
         * 
         * 
         */
        public List<Float> getValue() {
            if (value == null) {
                value = new ArrayList<Float>();
            }
            return this.value;
        }

    }


    /**
     * TET 5.0
     * 
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="x">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
     *             &lt;minExclusive value="0"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="y">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
     *             &lt;minExclusive value="0"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="z">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
     *             &lt;minExclusive value="0"/>
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
    public static class WhitePoint {

        @XmlAttribute(name = "x")
        protected Float x;
        @XmlAttribute(name = "y")
        protected Float y;
        @XmlAttribute(name = "z")
        protected Float z;

        /**
         * Recupera il valore della proprietà x.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getX() {
            return x;
        }

        /**
         * Imposta il valore della proprietà x.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setX(Float value) {
            this.x = value;
        }

        /**
         * Recupera il valore della proprietà y.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getY() {
            return y;
        }

        /**
         * Imposta il valore della proprietà y.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setY(Float value) {
            this.y = value;
        }

        /**
         * Recupera il valore della proprietà z.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getZ() {
            return z;
        }

        /**
         * Imposta il valore della proprietà z.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setZ(Float value) {
            this.z = value;
        }

    }

}
