//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.02.28 alle 02:40:46 PM CET 
//


package com.pdflib.xml.tet5.tet_5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="Colors" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Color" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="colorspace" type="{http://www.pdflib.com/XML/TET5/TET-5.0}colorSpaceId" />
 *                           &lt;attribute name="id" use="required" type="{http://www.pdflib.com/XML/TET5/TET-5.0}colorId" />
 *                           &lt;attribute name="svgname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="pattern" type="{http://www.pdflib.com/XML/TET5/TET-5.0}patternId" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Layers" minOccurs="0"/>
 *         &lt;element name="ICCProfiles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ICCProfile" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Metadata" minOccurs="0"/>
 *                             &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
 *                           &lt;/choice>
 *                           &lt;attribute name="checksum" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
 *                           &lt;attribute name="components">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                 &lt;minInclusive value="1"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="iccversion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="id" type="{http://www.pdflib.com/XML/TET5/TET-5.0}ICCId" />
 *                           &lt;attribute name="deviceclass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="embedded" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="fromCIE" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="profilecs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="profilename" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="toCIE" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
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
    "colors",
    "layers",
    "iccProfiles"
})
@XmlRootElement(name = "Graphics")
public class Graphics {

    @XmlElement(name = "Colors")
    protected Graphics.Colors colors;
    @XmlElement(name = "Layers")
    protected Layers layers;
    @XmlElement(name = "ICCProfiles")
    protected Graphics.ICCProfiles iccProfiles;

    /**
     * Recupera il valore della proprietà colors.
     * 
     * @return
     *     possible object is
     *     {@link Graphics.Colors }
     *     
     */
    public Graphics.Colors getColors() {
        return colors;
    }

    /**
     * Imposta il valore della proprietà colors.
     * 
     * @param value
     *     allowed object is
     *     {@link Graphics.Colors }
     *     
     */
    public void setColors(Graphics.Colors value) {
        this.colors = value;
    }

    /**
     * Recupera il valore della proprietà layers.
     * 
     * @return
     *     possible object is
     *     {@link Layers }
     *     
     */
    public Layers getLayers() {
        return layers;
    }

    /**
     * Imposta il valore della proprietà layers.
     * 
     * @param value
     *     allowed object is
     *     {@link Layers }
     *     
     */
    public void setLayers(Layers value) {
        this.layers = value;
    }

    /**
     * Recupera il valore della proprietà iccProfiles.
     * 
     * @return
     *     possible object is
     *     {@link Graphics.ICCProfiles }
     *     
     */
    public Graphics.ICCProfiles getICCProfiles() {
        return iccProfiles;
    }

    /**
     * Imposta il valore della proprietà iccProfiles.
     * 
     * @param value
     *     allowed object is
     *     {@link Graphics.ICCProfiles }
     *     
     */
    public void setICCProfiles(Graphics.ICCProfiles value) {
        this.iccProfiles = value;
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
     *         &lt;element name="Color" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="colorspace" type="{http://www.pdflib.com/XML/TET5/TET-5.0}colorSpaceId" />
     *                 &lt;attribute name="id" use="required" type="{http://www.pdflib.com/XML/TET5/TET-5.0}colorId" />
     *                 &lt;attribute name="svgname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="pattern" type="{http://www.pdflib.com/XML/TET5/TET-5.0}patternId" />
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
        "color"
    })
    public static class Colors {

        @XmlElement(name = "Color", required = true)
        protected List<Graphics.Colors.Color> color;

        /**
         * Gets the value of the color property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the color property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getColor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Graphics.Colors.Color }
         * 
         * 
         */
        public List<Graphics.Colors.Color> getColor() {
            if (color == null) {
                color = new ArrayList<Graphics.Colors.Color>();
            }
            return this.color;
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
         *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="colorspace" type="{http://www.pdflib.com/XML/TET5/TET-5.0}colorSpaceId" />
         *       &lt;attribute name="id" use="required" type="{http://www.pdflib.com/XML/TET5/TET-5.0}colorId" />
         *       &lt;attribute name="svgname" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="pattern" type="{http://www.pdflib.com/XML/TET5/TET-5.0}patternId" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value",
            "exception"
        })
        public static class Color {

            @XmlElement(name = "Value")
            protected List<String> value;
            @XmlElement(name = "Exception")
            protected Exception exception;
            @XmlAttribute(name = "colorspace")
            protected String colorspace;
            @XmlAttribute(name = "id", required = true)
            protected String id;
            @XmlAttribute(name = "svgname")
            protected String svgname;
            @XmlAttribute(name = "pattern")
            protected String pattern;

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
             * {@link String }
             * 
             * 
             */
            public List<String> getValue() {
                if (value == null) {
                    value = new ArrayList<String>();
                }
                return this.value;
            }

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
             * Recupera il valore della proprietà svgname.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSvgname() {
                return svgname;
            }

            /**
             * Imposta il valore della proprietà svgname.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSvgname(String value) {
                this.svgname = value;
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
     *         &lt;element name="ICCProfile" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Metadata" minOccurs="0"/>
     *                   &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
     *                 &lt;/choice>
     *                 &lt;attribute name="checksum" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
     *                 &lt;attribute name="components">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                       &lt;minInclusive value="1"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="iccversion" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="id" type="{http://www.pdflib.com/XML/TET5/TET-5.0}ICCId" />
     *                 &lt;attribute name="deviceclass" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="embedded" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="fromCIE" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="profilecs" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="profilename" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="toCIE" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
        "iccProfile"
    })
    public static class ICCProfiles {

        @XmlElement(name = "ICCProfile", required = true)
        protected List<Graphics.ICCProfiles.ICCProfile> iccProfile;

        /**
         * Gets the value of the iccProfile property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the iccProfile property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getICCProfile().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Graphics.ICCProfiles.ICCProfile }
         * 
         * 
         */
        public List<Graphics.ICCProfiles.ICCProfile> getICCProfile() {
            if (iccProfile == null) {
                iccProfile = new ArrayList<Graphics.ICCProfiles.ICCProfile>();
            }
            return this.iccProfile;
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
         *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Metadata" minOccurs="0"/>
         *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
         *       &lt;/choice>
         *       &lt;attribute name="checksum" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
         *       &lt;attribute name="components">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *             &lt;minInclusive value="1"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="iccversion" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="id" type="{http://www.pdflib.com/XML/TET5/TET-5.0}ICCId" />
         *       &lt;attribute name="deviceclass" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="embedded" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="fromCIE" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="profilecs" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="profilename" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="toCIE" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "metadata",
            "exception"
        })
        public static class ICCProfile {

            @XmlElement(name = "Metadata")
            protected Metadata metadata;
            @XmlElement(name = "Exception")
            protected Exception exception;
            @XmlAttribute(name = "checksum")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            @XmlSchemaType(name = "hexBinary")
            protected byte[] checksum;
            @XmlAttribute(name = "components")
            protected Integer components;
            @XmlAttribute(name = "iccversion")
            protected String iccversion;
            @XmlAttribute(name = "id")
            protected String id;
            @XmlAttribute(name = "deviceclass")
            protected String deviceclass;
            @XmlAttribute(name = "embedded")
            protected Boolean embedded;
            @XmlAttribute(name = "fromCIE")
            protected Boolean fromCIE;
            @XmlAttribute(name = "profilecs")
            protected String profilecs;
            @XmlAttribute(name = "profilename")
            protected String profilename;
            @XmlAttribute(name = "toCIE")
            protected Boolean toCIE;

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
             * Recupera il valore della proprietà checksum.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getChecksum() {
                return checksum;
            }

            /**
             * Imposta il valore della proprietà checksum.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChecksum(byte[] value) {
                this.checksum = value;
            }

            /**
             * Recupera il valore della proprietà components.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getComponents() {
                return components;
            }

            /**
             * Imposta il valore della proprietà components.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setComponents(Integer value) {
                this.components = value;
            }

            /**
             * Recupera il valore della proprietà iccversion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIccversion() {
                return iccversion;
            }

            /**
             * Imposta il valore della proprietà iccversion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIccversion(String value) {
                this.iccversion = value;
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
             * Recupera il valore della proprietà deviceclass.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeviceclass() {
                return deviceclass;
            }

            /**
             * Imposta il valore della proprietà deviceclass.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDeviceclass(String value) {
                this.deviceclass = value;
            }

            /**
             * Recupera il valore della proprietà embedded.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isEmbedded() {
                return embedded;
            }

            /**
             * Imposta il valore della proprietà embedded.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setEmbedded(Boolean value) {
                this.embedded = value;
            }

            /**
             * Recupera il valore della proprietà fromCIE.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isFromCIE() {
                return fromCIE;
            }

            /**
             * Imposta il valore della proprietà fromCIE.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setFromCIE(Boolean value) {
                this.fromCIE = value;
            }

            /**
             * Recupera il valore della proprietà profilecs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProfilecs() {
                return profilecs;
            }

            /**
             * Imposta il valore della proprietà profilecs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProfilecs(String value) {
                this.profilecs = value;
            }

            /**
             * Recupera il valore della proprietà profilename.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProfilename() {
                return profilename;
            }

            /**
             * Imposta il valore della proprietà profilename.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProfilename(String value) {
                this.profilename = value;
            }

            /**
             * Recupera il valore della proprietà toCIE.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isToCIE() {
                return toCIE;
            }

            /**
             * Imposta il valore della proprietà toCIE.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setToCIE(Boolean value) {
                this.toCIE = value;
            }

        }

    }

}
