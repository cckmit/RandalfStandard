//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.21 at 04:07:06 PM CEST 
//


package gov.loc.mix.v20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasicDigitalObjectInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicDigitalObjectInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObjectIdentifier" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="objectIdentifierType" type="{http://www.loc.gov/mix/v20}stringType" minOccurs="0"/>
 *                   &lt;element name="objectIdentifierValue" type="{http://www.loc.gov/mix/v20}stringType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="fileSize" type="{http://www.loc.gov/mix/v20}nonNegativeIntegerType" minOccurs="0"/>
 *         &lt;element name="FormatDesignation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="formatName" type="{http://www.loc.gov/mix/v20}stringType" minOccurs="0"/>
 *                   &lt;element name="formatVersion" type="{http://www.loc.gov/mix/v20}stringType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FormatRegistry" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="formatRegistryName" type="{http://www.loc.gov/mix/v20}stringType" minOccurs="0"/>
 *                   &lt;element name="formatRegistryKey" type="{http://www.loc.gov/mix/v20}stringType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="byteOrder" type="{http://www.loc.gov/mix/v20}typeOfByteOrderType" minOccurs="0"/>
 *         &lt;element name="Compression" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="compressionScheme" type="{http://www.loc.gov/mix/v20}stringType" minOccurs="0"/>
 *                   &lt;element name="compressionSchemeLocalList" type="{http://www.loc.gov/mix/v20}URIType" minOccurs="0"/>
 *                   &lt;element name="compressionSchemeLocalValue" type="{http://www.loc.gov/mix/v20}stringType" minOccurs="0"/>
 *                   &lt;element name="compressionRatio" type="{http://www.loc.gov/mix/v20}rationalType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Fixity" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="messageDigestAlgorithm" type="{http://www.loc.gov/mix/v20}typeOfMessageDigestAlgorithmType" minOccurs="0"/>
 *                   &lt;element name="messageDigest" type="{http://www.loc.gov/mix/v20}stringType" minOccurs="0"/>
 *                   &lt;element name="messageDigestOriginator" type="{http://www.loc.gov/mix/v20}stringType" minOccurs="0"/>
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
@XmlType(name = "BasicDigitalObjectInformationType", propOrder = {
    "objectIdentifier",
    "fileSize",
    "formatDesignation",
    "formatRegistry",
    "byteOrder",
    "compression",
    "fixity"
})
public class BasicDigitalObjectInformationType {

    @XmlElement(name = "ObjectIdentifier")
    protected List<BasicDigitalObjectInformationType.ObjectIdentifier> objectIdentifier;
    protected NonNegativeIntegerType fileSize;
    @XmlElement(name = "FormatDesignation")
    protected BasicDigitalObjectInformationType.FormatDesignation formatDesignation;
    @XmlElement(name = "FormatRegistry")
    protected BasicDigitalObjectInformationType.FormatRegistry formatRegistry;
    protected TypeOfByteOrderType byteOrder;
    @XmlElement(name = "Compression")
    protected List<BasicDigitalObjectInformationType.Compression> compression;
    @XmlElement(name = "Fixity")
    protected List<BasicDigitalObjectInformationType.Fixity> fixity;

    /**
     * Gets the value of the objectIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicDigitalObjectInformationType.ObjectIdentifier }
     * 
     * 
     */
    public List<BasicDigitalObjectInformationType.ObjectIdentifier> getObjectIdentifier() {
        if (objectIdentifier == null) {
            objectIdentifier = new ArrayList<BasicDigitalObjectInformationType.ObjectIdentifier>();
        }
        return this.objectIdentifier;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeIntegerType }
     *     
     */
    public NonNegativeIntegerType getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeIntegerType }
     *     
     */
    public void setFileSize(NonNegativeIntegerType value) {
        this.fileSize = value;
    }

    /**
     * Gets the value of the formatDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link BasicDigitalObjectInformationType.FormatDesignation }
     *     
     */
    public BasicDigitalObjectInformationType.FormatDesignation getFormatDesignation() {
        return formatDesignation;
    }

    /**
     * Sets the value of the formatDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicDigitalObjectInformationType.FormatDesignation }
     *     
     */
    public void setFormatDesignation(BasicDigitalObjectInformationType.FormatDesignation value) {
        this.formatDesignation = value;
    }

    /**
     * Gets the value of the formatRegistry property.
     * 
     * @return
     *     possible object is
     *     {@link BasicDigitalObjectInformationType.FormatRegistry }
     *     
     */
    public BasicDigitalObjectInformationType.FormatRegistry getFormatRegistry() {
        return formatRegistry;
    }

    /**
     * Sets the value of the formatRegistry property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicDigitalObjectInformationType.FormatRegistry }
     *     
     */
    public void setFormatRegistry(BasicDigitalObjectInformationType.FormatRegistry value) {
        this.formatRegistry = value;
    }

    /**
     * Gets the value of the byteOrder property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfByteOrderType }
     *     
     */
    public TypeOfByteOrderType getByteOrder() {
        return byteOrder;
    }

    /**
     * Sets the value of the byteOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfByteOrderType }
     *     
     */
    public void setByteOrder(TypeOfByteOrderType value) {
        this.byteOrder = value;
    }

    /**
     * Gets the value of the compression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicDigitalObjectInformationType.Compression }
     * 
     * 
     */
    public List<BasicDigitalObjectInformationType.Compression> getCompression() {
        if (compression == null) {
            compression = new ArrayList<BasicDigitalObjectInformationType.Compression>();
        }
        return this.compression;
    }

    /**
     * Gets the value of the fixity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fixity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFixity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicDigitalObjectInformationType.Fixity }
     * 
     * 
     */
    public List<BasicDigitalObjectInformationType.Fixity> getFixity() {
        if (fixity == null) {
            fixity = new ArrayList<BasicDigitalObjectInformationType.Fixity>();
        }
        return this.fixity;
    }


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
     *         &lt;element name="compressionScheme" type="{http://www.loc.gov/mix/v20}stringType" minOccurs="0"/>
     *         &lt;element name="compressionSchemeLocalList" type="{http://www.loc.gov/mix/v20}URIType" minOccurs="0"/>
     *         &lt;element name="compressionSchemeLocalValue" type="{http://www.loc.gov/mix/v20}stringType" minOccurs="0"/>
     *         &lt;element name="compressionRatio" type="{http://www.loc.gov/mix/v20}rationalType" minOccurs="0"/>
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
        "compressionScheme",
        "compressionSchemeLocalList",
        "compressionSchemeLocalValue",
        "compressionRatio"
    })
    public static class Compression {

        protected StringType compressionScheme;
        protected URIType compressionSchemeLocalList;
        protected StringType compressionSchemeLocalValue;
        protected RationalType compressionRatio;

        /**
         * Gets the value of the compressionScheme property.
         * 
         * @return
         *     possible object is
         *     {@link StringType }
         *     
         */
        public StringType getCompressionScheme() {
            return compressionScheme;
        }

        /**
         * Sets the value of the compressionScheme property.
         * 
         * @param value
         *     allowed object is
         *     {@link StringType }
         *     
         */
        public void setCompressionScheme(StringType value) {
            this.compressionScheme = value;
        }

        /**
         * Gets the value of the compressionSchemeLocalList property.
         * 
         * @return
         *     possible object is
         *     {@link URIType }
         *     
         */
        public URIType getCompressionSchemeLocalList() {
            return compressionSchemeLocalList;
        }

        /**
         * Sets the value of the compressionSchemeLocalList property.
         * 
         * @param value
         *     allowed object is
         *     {@link URIType }
         *     
         */
        public void setCompressionSchemeLocalList(URIType value) {
            this.compressionSchemeLocalList = value;
        }

        /**
         * Gets the value of the compressionSchemeLocalValue property.
         * 
         * @return
         *     possible object is
         *     {@link StringType }
         *     
         */
        public StringType getCompressionSchemeLocalValue() {
            return compressionSchemeLocalValue;
        }

        /**
         * Sets the value of the compressionSchemeLocalValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link StringType }
         *     
         */
        public void setCompressionSchemeLocalValue(StringType value) {
            this.compressionSchemeLocalValue = value;
        }

        /**
         * Gets the value of the compressionRatio property.
         * 
         * @return
         *     possible object is
         *     {@link RationalType }
         *     
         */
        public RationalType getCompressionRatio() {
            return compressionRatio;
        }

        /**
         * Sets the value of the compressionRatio property.
         * 
         * @param value
         *     allowed object is
         *     {@link RationalType }
         *     
         */
        public void setCompressionRatio(RationalType value) {
            this.compressionRatio = value;
        }

    }


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
     *         &lt;element name="messageDigestAlgorithm" type="{http://www.loc.gov/mix/v20}typeOfMessageDigestAlgorithmType" minOccurs="0"/>
     *         &lt;element name="messageDigest" type="{http://www.loc.gov/mix/v20}stringType" minOccurs="0"/>
     *         &lt;element name="messageDigestOriginator" type="{http://www.loc.gov/mix/v20}stringType" minOccurs="0"/>
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
        "messageDigestAlgorithm",
        "messageDigest",
        "messageDigestOriginator"
    })
    public static class Fixity {

        protected TypeOfMessageDigestAlgorithmType messageDigestAlgorithm;
        protected StringType messageDigest;
        protected StringType messageDigestOriginator;

        /**
         * Gets the value of the messageDigestAlgorithm property.
         * 
         * @return
         *     possible object is
         *     {@link TypeOfMessageDigestAlgorithmType }
         *     
         */
        public TypeOfMessageDigestAlgorithmType getMessageDigestAlgorithm() {
            return messageDigestAlgorithm;
        }

        /**
         * Sets the value of the messageDigestAlgorithm property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeOfMessageDigestAlgorithmType }
         *     
         */
        public void setMessageDigestAlgorithm(TypeOfMessageDigestAlgorithmType value) {
            this.messageDigestAlgorithm = value;
        }

        /**
         * Gets the value of the messageDigest property.
         * 
         * @return
         *     possible object is
         *     {@link StringType }
         *     
         */
        public StringType getMessageDigest() {
            return messageDigest;
        }

        /**
         * Sets the value of the messageDigest property.
         * 
         * @param value
         *     allowed object is
         *     {@link StringType }
         *     
         */
        public void setMessageDigest(StringType value) {
            this.messageDigest = value;
        }

        /**
         * Gets the value of the messageDigestOriginator property.
         * 
         * @return
         *     possible object is
         *     {@link StringType }
         *     
         */
        public StringType getMessageDigestOriginator() {
            return messageDigestOriginator;
        }

        /**
         * Sets the value of the messageDigestOriginator property.
         * 
         * @param value
         *     allowed object is
         *     {@link StringType }
         *     
         */
        public void setMessageDigestOriginator(StringType value) {
            this.messageDigestOriginator = value;
        }

    }


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
     *         &lt;element name="formatName" type="{http://www.loc.gov/mix/v20}stringType" minOccurs="0"/>
     *         &lt;element name="formatVersion" type="{http://www.loc.gov/mix/v20}stringType" minOccurs="0"/>
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
        "formatName",
        "formatVersion"
    })
    public static class FormatDesignation {

        protected StringType formatName;
        protected StringType formatVersion;

        /**
         * Gets the value of the formatName property.
         * 
         * @return
         *     possible object is
         *     {@link StringType }
         *     
         */
        public StringType getFormatName() {
            return formatName;
        }

        /**
         * Sets the value of the formatName property.
         * 
         * @param value
         *     allowed object is
         *     {@link StringType }
         *     
         */
        public void setFormatName(StringType value) {
            this.formatName = value;
        }

        /**
         * Gets the value of the formatVersion property.
         * 
         * @return
         *     possible object is
         *     {@link StringType }
         *     
         */
        public StringType getFormatVersion() {
            return formatVersion;
        }

        /**
         * Sets the value of the formatVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link StringType }
         *     
         */
        public void setFormatVersion(StringType value) {
            this.formatVersion = value;
        }

    }


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
     *         &lt;element name="formatRegistryName" type="{http://www.loc.gov/mix/v20}stringType" minOccurs="0"/>
     *         &lt;element name="formatRegistryKey" type="{http://www.loc.gov/mix/v20}stringType" minOccurs="0"/>
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
        "formatRegistryName",
        "formatRegistryKey"
    })
    public static class FormatRegistry {

        protected StringType formatRegistryName;
        protected StringType formatRegistryKey;

        /**
         * Gets the value of the formatRegistryName property.
         * 
         * @return
         *     possible object is
         *     {@link StringType }
         *     
         */
        public StringType getFormatRegistryName() {
            return formatRegistryName;
        }

        /**
         * Sets the value of the formatRegistryName property.
         * 
         * @param value
         *     allowed object is
         *     {@link StringType }
         *     
         */
        public void setFormatRegistryName(StringType value) {
            this.formatRegistryName = value;
        }

        /**
         * Gets the value of the formatRegistryKey property.
         * 
         * @return
         *     possible object is
         *     {@link StringType }
         *     
         */
        public StringType getFormatRegistryKey() {
            return formatRegistryKey;
        }

        /**
         * Sets the value of the formatRegistryKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link StringType }
         *     
         */
        public void setFormatRegistryKey(StringType value) {
            this.formatRegistryKey = value;
        }

    }


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
     *         &lt;element name="objectIdentifierType" type="{http://www.loc.gov/mix/v20}stringType" minOccurs="0"/>
     *         &lt;element name="objectIdentifierValue" type="{http://www.loc.gov/mix/v20}stringType" minOccurs="0"/>
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
        "objectIdentifierType",
        "objectIdentifierValue"
    })
    public static class ObjectIdentifier {

        protected StringType objectIdentifierType;
        protected StringType objectIdentifierValue;

        /**
         * Gets the value of the objectIdentifierType property.
         * 
         * @return
         *     possible object is
         *     {@link StringType }
         *     
         */
        public StringType getObjectIdentifierType() {
            return objectIdentifierType;
        }

        /**
         * Sets the value of the objectIdentifierType property.
         * 
         * @param value
         *     allowed object is
         *     {@link StringType }
         *     
         */
        public void setObjectIdentifierType(StringType value) {
            this.objectIdentifierType = value;
        }

        /**
         * Gets the value of the objectIdentifierValue property.
         * 
         * @return
         *     possible object is
         *     {@link StringType }
         *     
         */
        public StringType getObjectIdentifierValue() {
            return objectIdentifierValue;
        }

        /**
         * Sets the value of the objectIdentifierValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link StringType }
         *     
         */
        public void setObjectIdentifierValue(StringType value) {
            this.objectIdentifierValue = value;
        }

    }

}