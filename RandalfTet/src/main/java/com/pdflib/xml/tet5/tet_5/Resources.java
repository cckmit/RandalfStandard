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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element name="Fonts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element name="Font" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
 *                               &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Metadata" minOccurs="0"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="embedded" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                             &lt;attribute name="fullname">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="id" use="required" type="{http://www.pdflib.com/XML/TET5/TET-5.0}fontId" />
 *                             &lt;attribute name="type" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="(unknown)"/>
 *                                   &lt;enumeration value="Composite"/>
 *                                   &lt;enumeration value="Multiple Master"/>
 *                                   &lt;enumeration value="OpenType"/>
 *                                   &lt;enumeration value="TrueType"/>
 *                                   &lt;enumeration value="TrueType (CID)"/>
 *                                   &lt;enumeration value="Type 1"/>
 *                                   &lt;enumeration value="Type 1 (CID)"/>
 *                                   &lt;enumeration value="Type 1 CFF"/>
 *                                   &lt;enumeration value="Type 1 CFF (CID)"/>
 *                                   &lt;enumeration value="Type 3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="name" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="vertical" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                             &lt;attribute name="ascender" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                             &lt;attribute name="capheight" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                             &lt;attribute name="italicangle" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                             &lt;attribute name="descender" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                             &lt;attribute name="weight">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
 *                                   &lt;minInclusive value="0"/>
 *                                   &lt;maxInclusive value="900"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="xheight" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Images" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element name="Image" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
 *                               &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Metadata" minOccurs="0"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="bitsPerComponent" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                   &lt;minInclusive value="1"/>
 *                                   &lt;maxInclusive value="38"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="colorspace" type="{http://www.pdflib.com/XML/TET5/TET-5.0}colorSpaceId" />
 *                             &lt;attribute name="extractedAs" default="unknown">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value=".jbig2"/>
 *                                   &lt;enumeration value=".jp2"/>
 *                                   &lt;enumeration value=".jpf"/>
 *                                   &lt;enumeration value=".j2k"/>
 *                                   &lt;enumeration value=".jpg"/>
 *                                   &lt;enumeration value=".tif"/>
 *                                   &lt;enumeration value="unknown"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="filename" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value=".+_I\d+\..+"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                             &lt;attribute name="id" use="required" type="{http://www.pdflib.com/XML/TET5/TET-5.0}imageId" />
 *                             &lt;attribute name="maskid" type="{http://www.pdflib.com/XML/TET5/TET-5.0}imageId" />
 *                             &lt;attribute name="mergetype" default="normal">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="normal"/>
 *                                   &lt;enumeration value="artificial"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="stencilmask" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                             &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ColorSpaces" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}ColorSpace" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Patterns" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element name="Pattern" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="id" use="required" type="{http://www.pdflib.com/XML/TET5/TET-5.0}patternId" />
 *                             &lt;attribute name="patterntype" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tiling"/>
 *                                   &lt;enumeration value="shading"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="painttype">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="colored"/>
 *                                   &lt;enumeration value="uncolored"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="tilingtype">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="constantspacing"/>
 *                                   &lt;enumeration value="nodistortion"/>
 *                                   &lt;enumeration value="fastertiling"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "fonts",
    "images",
    "colorSpaces",
    "patterns"
})
@XmlRootElement(name = "Resources")
public class Resources {

    @XmlElement(name = "Fonts")
    protected Resources.Fonts fonts;
    @XmlElement(name = "Images")
    protected Resources.Images images;
    @XmlElement(name = "ColorSpaces")
    protected Resources.ColorSpaces colorSpaces;
    @XmlElement(name = "Patterns")
    protected Resources.Patterns patterns;

    /**
     * Recupera il valore della proprietà fonts.
     * 
     * @return
     *     possible object is
     *     {@link Resources.Fonts }
     *     
     */
    public Resources.Fonts getFonts() {
        return fonts;
    }

    /**
     * Imposta il valore della proprietà fonts.
     * 
     * @param value
     *     allowed object is
     *     {@link Resources.Fonts }
     *     
     */
    public void setFonts(Resources.Fonts value) {
        this.fonts = value;
    }

    /**
     * Recupera il valore della proprietà images.
     * 
     * @return
     *     possible object is
     *     {@link Resources.Images }
     *     
     */
    public Resources.Images getImages() {
        return images;
    }

    /**
     * Imposta il valore della proprietà images.
     * 
     * @param value
     *     allowed object is
     *     {@link Resources.Images }
     *     
     */
    public void setImages(Resources.Images value) {
        this.images = value;
    }

    /**
     * Recupera il valore della proprietà colorSpaces.
     * 
     * @return
     *     possible object is
     *     {@link Resources.ColorSpaces }
     *     
     */
    public Resources.ColorSpaces getColorSpaces() {
        return colorSpaces;
    }

    /**
     * Imposta il valore della proprietà colorSpaces.
     * 
     * @param value
     *     allowed object is
     *     {@link Resources.ColorSpaces }
     *     
     */
    public void setColorSpaces(Resources.ColorSpaces value) {
        this.colorSpaces = value;
    }

    /**
     * Recupera il valore della proprietà patterns.
     * 
     * @return
     *     possible object is
     *     {@link Resources.Patterns }
     *     
     */
    public Resources.Patterns getPatterns() {
        return patterns;
    }

    /**
     * Imposta il valore della proprietà patterns.
     * 
     * @param value
     *     allowed object is
     *     {@link Resources.Patterns }
     *     
     */
    public void setPatterns(Resources.Patterns value) {
        this.patterns = value;
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
     *       &lt;choice>
     *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
     *         &lt;sequence minOccurs="0">
     *           &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}ColorSpace" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;/sequence>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "exception",
        "colorSpace"
    })
    public static class ColorSpaces {

        @XmlElement(name = "Exception")
        protected Exception exception;
        @XmlElement(name = "ColorSpace")
        protected List<ColorSpace> colorSpace;

        /**
         * Recupera il valore della proprietà exception.
         * 
         * @return
         *     possible object is
         *     {@link Exception }
         *     
         */
        public Exception getException() {
            return exception;
        }

        /**
         * Imposta il valore della proprietà exception.
         * 
         * @param value
         *     allowed object is
         *     {@link Exception }
         *     
         */
        public void setException(Exception value) {
            this.exception = value;
        }

        /**
         * Gets the value of the colorSpace property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the colorSpace property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getColorSpace().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ColorSpace }
         * 
         * 
         */
        public List<ColorSpace> getColorSpace() {
            if (colorSpace == null) {
                colorSpace = new ArrayList<ColorSpace>();
            }
            return this.colorSpace;
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
     *       &lt;choice>
     *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
     *         &lt;sequence minOccurs="0">
     *           &lt;element name="Font" maxOccurs="unbounded" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
     *                     &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Metadata" minOccurs="0"/>
     *                   &lt;/sequence>
     *                   &lt;attribute name="embedded" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                   &lt;attribute name="fullname">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                   &lt;attribute name="id" use="required" type="{http://www.pdflib.com/XML/TET5/TET-5.0}fontId" />
     *                   &lt;attribute name="type" use="required">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="(unknown)"/>
     *                         &lt;enumeration value="Composite"/>
     *                         &lt;enumeration value="Multiple Master"/>
     *                         &lt;enumeration value="OpenType"/>
     *                         &lt;enumeration value="TrueType"/>
     *                         &lt;enumeration value="TrueType (CID)"/>
     *                         &lt;enumeration value="Type 1"/>
     *                         &lt;enumeration value="Type 1 (CID)"/>
     *                         &lt;enumeration value="Type 1 CFF"/>
     *                         &lt;enumeration value="Type 1 CFF (CID)"/>
     *                         &lt;enumeration value="Type 3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                   &lt;attribute name="name" use="required">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                   &lt;attribute name="vertical" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *                   &lt;attribute name="ascender" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                   &lt;attribute name="capheight" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                   &lt;attribute name="italicangle" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                   &lt;attribute name="descender" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                   &lt;attribute name="weight">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
     *                         &lt;minInclusive value="0"/>
     *                         &lt;maxInclusive value="900"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                   &lt;attribute name="xheight" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/sequence>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "exception",
        "font"
    })
    public static class Fonts {

        @XmlElement(name = "Exception")
        protected Exception exception;
        @XmlElement(name = "Font")
        protected List<Resources.Fonts.Font> font;

        /**
         * Recupera il valore della proprietà exception.
         * 
         * @return
         *     possible object is
         *     {@link Exception }
         *     
         */
        public Exception getException() {
            return exception;
        }

        /**
         * Imposta il valore della proprietà exception.
         * 
         * @param value
         *     allowed object is
         *     {@link Exception }
         *     
         */
        public void setException(Exception value) {
            this.exception = value;
        }

        /**
         * Gets the value of the font property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the font property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFont().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Resources.Fonts.Font }
         * 
         * 
         */
        public List<Resources.Fonts.Font> getFont() {
            if (font == null) {
                font = new ArrayList<Resources.Fonts.Font>();
            }
            return this.font;
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
         *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
         *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Metadata" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="embedded" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="fullname">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="id" use="required" type="{http://www.pdflib.com/XML/TET5/TET-5.0}fontId" />
         *       &lt;attribute name="type" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="(unknown)"/>
         *             &lt;enumeration value="Composite"/>
         *             &lt;enumeration value="Multiple Master"/>
         *             &lt;enumeration value="OpenType"/>
         *             &lt;enumeration value="TrueType"/>
         *             &lt;enumeration value="TrueType (CID)"/>
         *             &lt;enumeration value="Type 1"/>
         *             &lt;enumeration value="Type 1 (CID)"/>
         *             &lt;enumeration value="Type 1 CFF"/>
         *             &lt;enumeration value="Type 1 CFF (CID)"/>
         *             &lt;enumeration value="Type 3"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="name" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="vertical" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *       &lt;attribute name="ascender" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="capheight" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="italicangle" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="descender" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="weight">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
         *             &lt;minInclusive value="0"/>
         *             &lt;maxInclusive value="900"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="xheight" type="{http://www.w3.org/2001/XMLSchema}float" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "exception",
            "metadata"
        })
        public static class Font {

            @XmlElement(name = "Exception")
            protected Exception exception;
            @XmlElement(name = "Metadata")
            protected Metadata metadata;
            @XmlAttribute(name = "embedded", required = true)
            protected boolean embedded;
            @XmlAttribute(name = "fullname")
            protected String fullname;
            @XmlAttribute(name = "id", required = true)
            protected String id;
            @XmlAttribute(name = "type", required = true)
            protected String type;
            @XmlAttribute(name = "name", required = true)
            protected String name;
            @XmlAttribute(name = "vertical")
            protected Boolean vertical;
            @XmlAttribute(name = "ascender")
            protected Float ascender;
            @XmlAttribute(name = "capheight")
            protected Float capheight;
            @XmlAttribute(name = "italicangle")
            protected Float italicangle;
            @XmlAttribute(name = "descender")
            protected Float descender;
            @XmlAttribute(name = "weight")
            protected Float weight;
            @XmlAttribute(name = "xheight")
            protected Float xheight;

            /**
             * Recupera il valore della proprietà exception.
             * 
             * @return
             *     possible object is
             *     {@link Exception }
             *     
             */
            public Exception getException() {
                return exception;
            }

            /**
             * Imposta il valore della proprietà exception.
             * 
             * @param value
             *     allowed object is
             *     {@link Exception }
             *     
             */
            public void setException(Exception value) {
                this.exception = value;
            }

            /**
             * Recupera il valore della proprietà metadata.
             * 
             * @return
             *     possible object is
             *     {@link Metadata }
             *     
             */
            public Metadata getMetadata() {
                return metadata;
            }

            /**
             * Imposta il valore della proprietà metadata.
             * 
             * @param value
             *     allowed object is
             *     {@link Metadata }
             *     
             */
            public void setMetadata(Metadata value) {
                this.metadata = value;
            }

            /**
             * Recupera il valore della proprietà embedded.
             * 
             */
            public boolean isEmbedded() {
                return embedded;
            }

            /**
             * Imposta il valore della proprietà embedded.
             * 
             */
            public void setEmbedded(boolean value) {
                this.embedded = value;
            }

            /**
             * Recupera il valore della proprietà fullname.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFullname() {
                return fullname;
            }

            /**
             * Imposta il valore della proprietà fullname.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFullname(String value) {
                this.fullname = value;
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
             * Recupera il valore della proprietà vertical.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isVertical() {
                if (vertical == null) {
                    return false;
                } else {
                    return vertical;
                }
            }

            /**
             * Imposta il valore della proprietà vertical.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setVertical(Boolean value) {
                this.vertical = value;
            }

            /**
             * Recupera il valore della proprietà ascender.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getAscender() {
                return ascender;
            }

            /**
             * Imposta il valore della proprietà ascender.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setAscender(Float value) {
                this.ascender = value;
            }

            /**
             * Recupera il valore della proprietà capheight.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getCapheight() {
                return capheight;
            }

            /**
             * Imposta il valore della proprietà capheight.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setCapheight(Float value) {
                this.capheight = value;
            }

            /**
             * Recupera il valore della proprietà italicangle.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getItalicangle() {
                return italicangle;
            }

            /**
             * Imposta il valore della proprietà italicangle.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setItalicangle(Float value) {
                this.italicangle = value;
            }

            /**
             * Recupera il valore della proprietà descender.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getDescender() {
                return descender;
            }

            /**
             * Imposta il valore della proprietà descender.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setDescender(Float value) {
                this.descender = value;
            }

            /**
             * Recupera il valore della proprietà weight.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getWeight() {
                return weight;
            }

            /**
             * Imposta il valore della proprietà weight.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setWeight(Float value) {
                this.weight = value;
            }

            /**
             * Recupera il valore della proprietà xheight.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getXheight() {
                return xheight;
            }

            /**
             * Imposta il valore della proprietà xheight.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setXheight(Float value) {
                this.xheight = value;
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
     *       &lt;choice>
     *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
     *         &lt;sequence minOccurs="0">
     *           &lt;element name="Image" maxOccurs="unbounded" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
     *                     &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Metadata" minOccurs="0"/>
     *                   &lt;/sequence>
     *                   &lt;attribute name="bitsPerComponent" use="required">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                         &lt;minInclusive value="1"/>
     *                         &lt;maxInclusive value="38"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                   &lt;attribute name="colorspace" type="{http://www.pdflib.com/XML/TET5/TET-5.0}colorSpaceId" />
     *                   &lt;attribute name="extractedAs" default="unknown">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value=".jbig2"/>
     *                         &lt;enumeration value=".jp2"/>
     *                         &lt;enumeration value=".jpf"/>
     *                         &lt;enumeration value=".j2k"/>
     *                         &lt;enumeration value=".jpg"/>
     *                         &lt;enumeration value=".tif"/>
     *                         &lt;enumeration value="unknown"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                   &lt;attribute name="filename" use="required">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value=".+_I\d+\..+"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                   &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                   &lt;attribute name="id" use="required" type="{http://www.pdflib.com/XML/TET5/TET-5.0}imageId" />
     *                   &lt;attribute name="maskid" type="{http://www.pdflib.com/XML/TET5/TET-5.0}imageId" />
     *                   &lt;attribute name="mergetype" default="normal">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="normal"/>
     *                         &lt;enumeration value="artificial"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                   &lt;attribute name="stencilmask" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *                   &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/sequence>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "exception",
        "image"
    })
    public static class Images {

        @XmlElement(name = "Exception")
        protected Exception exception;
        @XmlElement(name = "Image")
        protected List<Resources.Images.Image> image;

        /**
         * Recupera il valore della proprietà exception.
         * 
         * @return
         *     possible object is
         *     {@link Exception }
         *     
         */
        public Exception getException() {
            return exception;
        }

        /**
         * Imposta il valore della proprietà exception.
         * 
         * @param value
         *     allowed object is
         *     {@link Exception }
         *     
         */
        public void setException(Exception value) {
            this.exception = value;
        }

        /**
         * Gets the value of the image property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the image property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getImage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Resources.Images.Image }
         * 
         * 
         */
        public List<Resources.Images.Image> getImage() {
            if (image == null) {
                image = new ArrayList<Resources.Images.Image>();
            }
            return this.image;
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
         *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
         *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Metadata" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="bitsPerComponent" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *             &lt;minInclusive value="1"/>
         *             &lt;maxInclusive value="38"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="colorspace" type="{http://www.pdflib.com/XML/TET5/TET-5.0}colorSpaceId" />
         *       &lt;attribute name="extractedAs" default="unknown">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value=".jbig2"/>
         *             &lt;enumeration value=".jp2"/>
         *             &lt;enumeration value=".jpf"/>
         *             &lt;enumeration value=".j2k"/>
         *             &lt;enumeration value=".jpg"/>
         *             &lt;enumeration value=".tif"/>
         *             &lt;enumeration value="unknown"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="filename" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;pattern value=".+_I\d+\..+"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *       &lt;attribute name="id" use="required" type="{http://www.pdflib.com/XML/TET5/TET-5.0}imageId" />
         *       &lt;attribute name="maskid" type="{http://www.pdflib.com/XML/TET5/TET-5.0}imageId" />
         *       &lt;attribute name="mergetype" default="normal">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="normal"/>
         *             &lt;enumeration value="artificial"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="stencilmask" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *       &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "exception",
            "metadata"
        })
        public static class Image {

            @XmlElement(name = "Exception")
            protected Exception exception;
            @XmlElement(name = "Metadata")
            protected Metadata metadata;
            @XmlAttribute(name = "bitsPerComponent", required = true)
            protected int bitsPerComponent;
            @XmlAttribute(name = "colorspace")
            protected String colorspace;
            @XmlAttribute(name = "extractedAs")
            protected String extractedAs;
            @XmlAttribute(name = "filename", required = true)
            protected String filename;
            @XmlAttribute(name = "height", required = true)
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger height;
            @XmlAttribute(name = "id", required = true)
            protected String id;
            @XmlAttribute(name = "maskid")
            protected String maskid;
            @XmlAttribute(name = "mergetype")
            protected String mergetype;
            @XmlAttribute(name = "stencilmask")
            protected Boolean stencilmask;
            @XmlAttribute(name = "width", required = true)
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger width;

            /**
             * Recupera il valore della proprietà exception.
             * 
             * @return
             *     possible object is
             *     {@link Exception }
             *     
             */
            public Exception getException() {
                return exception;
            }

            /**
             * Imposta il valore della proprietà exception.
             * 
             * @param value
             *     allowed object is
             *     {@link Exception }
             *     
             */
            public void setException(Exception value) {
                this.exception = value;
            }

            /**
             * Recupera il valore della proprietà metadata.
             * 
             * @return
             *     possible object is
             *     {@link Metadata }
             *     
             */
            public Metadata getMetadata() {
                return metadata;
            }

            /**
             * Imposta il valore della proprietà metadata.
             * 
             * @param value
             *     allowed object is
             *     {@link Metadata }
             *     
             */
            public void setMetadata(Metadata value) {
                this.metadata = value;
            }

            /**
             * Recupera il valore della proprietà bitsPerComponent.
             * 
             */
            public int getBitsPerComponent() {
                return bitsPerComponent;
            }

            /**
             * Imposta il valore della proprietà bitsPerComponent.
             * 
             */
            public void setBitsPerComponent(int value) {
                this.bitsPerComponent = value;
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
             * Recupera il valore della proprietà extractedAs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExtractedAs() {
                if (extractedAs == null) {
                    return "unknown";
                } else {
                    return extractedAs;
                }
            }

            /**
             * Imposta il valore della proprietà extractedAs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExtractedAs(String value) {
                this.extractedAs = value;
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
             * Recupera il valore della proprietà height.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getHeight() {
                return height;
            }

            /**
             * Imposta il valore della proprietà height.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setHeight(BigInteger value) {
                this.height = value;
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
             * Recupera il valore della proprietà maskid.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMaskid() {
                return maskid;
            }

            /**
             * Imposta il valore della proprietà maskid.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMaskid(String value) {
                this.maskid = value;
            }

            /**
             * Recupera il valore della proprietà mergetype.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMergetype() {
                if (mergetype == null) {
                    return "normal";
                } else {
                    return mergetype;
                }
            }

            /**
             * Imposta il valore della proprietà mergetype.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMergetype(String value) {
                this.mergetype = value;
            }

            /**
             * Recupera il valore della proprietà stencilmask.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isStencilmask() {
                if (stencilmask == null) {
                    return false;
                } else {
                    return stencilmask;
                }
            }

            /**
             * Imposta il valore della proprietà stencilmask.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setStencilmask(Boolean value) {
                this.stencilmask = value;
            }

            /**
             * Recupera il valore della proprietà width.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getWidth() {
                return width;
            }

            /**
             * Imposta il valore della proprietà width.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setWidth(BigInteger value) {
                this.width = value;
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
     *       &lt;choice>
     *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
     *         &lt;sequence minOccurs="0">
     *           &lt;element name="Pattern" maxOccurs="unbounded" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;attribute name="id" use="required" type="{http://www.pdflib.com/XML/TET5/TET-5.0}patternId" />
     *                   &lt;attribute name="patterntype" use="required">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tiling"/>
     *                         &lt;enumeration value="shading"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                   &lt;attribute name="painttype">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="colored"/>
     *                         &lt;enumeration value="uncolored"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                   &lt;attribute name="tilingtype">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="constantspacing"/>
     *                         &lt;enumeration value="nodistortion"/>
     *                         &lt;enumeration value="fastertiling"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/sequence>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "exception",
        "pattern"
    })
    public static class Patterns {

        @XmlElement(name = "Exception")
        protected Exception exception;
        @XmlElement(name = "Pattern")
        protected List<Resources.Patterns.Pattern> pattern;

        /**
         * Recupera il valore della proprietà exception.
         * 
         * @return
         *     possible object is
         *     {@link Exception }
         *     
         */
        public Exception getException() {
            return exception;
        }

        /**
         * Imposta il valore della proprietà exception.
         * 
         * @param value
         *     allowed object is
         *     {@link Exception }
         *     
         */
        public void setException(Exception value) {
            this.exception = value;
        }

        /**
         * Gets the value of the pattern property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pattern property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPattern().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Resources.Patterns.Pattern }
         * 
         * 
         */
        public List<Resources.Patterns.Pattern> getPattern() {
            if (pattern == null) {
                pattern = new ArrayList<Resources.Patterns.Pattern>();
            }
            return this.pattern;
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
         *       &lt;attribute name="id" use="required" type="{http://www.pdflib.com/XML/TET5/TET-5.0}patternId" />
         *       &lt;attribute name="patterntype" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="tiling"/>
         *             &lt;enumeration value="shading"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="painttype">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="colored"/>
         *             &lt;enumeration value="uncolored"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="tilingtype">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="constantspacing"/>
         *             &lt;enumeration value="nodistortion"/>
         *             &lt;enumeration value="fastertiling"/>
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
        public static class Pattern {

            @XmlAttribute(name = "id", required = true)
            protected String id;
            @XmlAttribute(name = "patterntype", required = true)
            protected String patterntype;
            @XmlAttribute(name = "painttype")
            protected String painttype;
            @XmlAttribute(name = "tilingtype")
            protected String tilingtype;

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
             * Recupera il valore della proprietà patterntype.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPatterntype() {
                return patterntype;
            }

            /**
             * Imposta il valore della proprietà patterntype.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPatterntype(String value) {
                this.patterntype = value;
            }

            /**
             * Recupera il valore della proprietà painttype.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPainttype() {
                return painttype;
            }

            /**
             * Imposta il valore della proprietà painttype.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPainttype(String value) {
                this.painttype = value;
            }

            /**
             * Recupera il valore della proprietà tilingtype.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTilingtype() {
                return tilingtype;
            }

            /**
             * Imposta il valore della proprietà tilingtype.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTilingtype(String value) {
                this.tilingtype = value;
            }

        }

    }

}
