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
 *         &lt;element name="OutputIntent" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OutputCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OutputConditionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RegistryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="iccprofile" type="{http://www.pdflib.com/XML/TET5/TET-5.0}ICCId" />
 *                 &lt;attribute name="subtype" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "outputIntent"
})
@XmlRootElement(name = "OutputIntents")
public class OutputIntents {

    @XmlElement(name = "OutputIntent", required = true)
    protected List<OutputIntents.OutputIntent> outputIntent;

    /**
     * Gets the value of the outputIntent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputIntent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputIntent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutputIntents.OutputIntent }
     * 
     * 
     */
    public List<OutputIntents.OutputIntent> getOutputIntent() {
        if (outputIntent == null) {
            outputIntent = new ArrayList<OutputIntents.OutputIntent>();
        }
        return this.outputIntent;
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
     *         &lt;element name="OutputCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OutputConditionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RegistryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="iccprofile" type="{http://www.pdflib.com/XML/TET5/TET-5.0}ICCId" />
     *       &lt;attribute name="subtype" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "outputCondition",
        "outputConditionIdentifier",
        "registryName",
        "info"
    })
    public static class OutputIntent {

        @XmlElement(name = "OutputCondition")
        protected String outputCondition;
        @XmlElement(name = "OutputConditionIdentifier")
        protected String outputConditionIdentifier;
        @XmlElement(name = "RegistryName")
        protected String registryName;
        @XmlElement(name = "Info")
        protected String info;
        @XmlAttribute(name = "iccprofile")
        protected String iccprofile;
        @XmlAttribute(name = "subtype")
        protected String subtype;

        /**
         * Recupera il valore della proprietà outputCondition.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOutputCondition() {
            return outputCondition;
        }

        /**
         * Imposta il valore della proprietà outputCondition.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOutputCondition(String value) {
            this.outputCondition = value;
        }

        /**
         * Recupera il valore della proprietà outputConditionIdentifier.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOutputConditionIdentifier() {
            return outputConditionIdentifier;
        }

        /**
         * Imposta il valore della proprietà outputConditionIdentifier.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOutputConditionIdentifier(String value) {
            this.outputConditionIdentifier = value;
        }

        /**
         * Recupera il valore della proprietà registryName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegistryName() {
            return registryName;
        }

        /**
         * Imposta il valore della proprietà registryName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegistryName(String value) {
            this.registryName = value;
        }

        /**
         * Recupera il valore della proprietà info.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfo() {
            return info;
        }

        /**
         * Imposta il valore della proprietà info.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfo(String value) {
            this.info = value;
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

    }

}
