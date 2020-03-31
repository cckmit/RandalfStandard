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
 * TET 5.1
 * 
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;choice>
 *           &lt;element name="Item" maxOccurs="unbounded">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence maxOccurs="unbounded">
 *                     &lt;element name="Label">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Word" maxOccurs="unbounded"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                       &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}A" maxOccurs="unbounded" minOccurs="0"/>
 *                       &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}PlacedImage" maxOccurs="unbounded" minOccurs="0"/>
 *                     &lt;/choice>
 *                     &lt;element name="Body">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence maxOccurs="unbounded">
 *                               &lt;choice>
 *                                 &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Para" maxOccurs="unbounded" minOccurs="0"/>
 *                                 &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}List" maxOccurs="unbounded" minOccurs="0"/>
 *                                 &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Table" maxOccurs="unbounded" minOccurs="0"/>
 *                                 &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}PlacedImage" minOccurs="0"/>
 *                                 &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}A" minOccurs="0"/>
 *                               &lt;/choice>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                       &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}A" maxOccurs="unbounded" minOccurs="0"/>
 *                       &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}PlacedImage" maxOccurs="unbounded" minOccurs="0"/>
 *                     &lt;/choice>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}A" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}PlacedImage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.pdflib.com/XML/TET5/TET-5.0}listId" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "itemOrAOrPlacedImage"
})
@XmlRootElement(name = "List")
public class List {

    @XmlElements({
        @XmlElement(name = "Item", type = List.Item.class),
        @XmlElement(name = "A", type = A.class),
        @XmlElement(name = "PlacedImage", type = PlacedImage.class)
    })
    protected java.util.List<Object> itemOrAOrPlacedImage;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the itemOrAOrPlacedImage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemOrAOrPlacedImage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemOrAOrPlacedImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link List.Item }
     * {@link A }
     * {@link PlacedImage }
     * 
     * 
     */
    public java.util.List<Object> getItemOrAOrPlacedImage() {
        if (itemOrAOrPlacedImage == null) {
            itemOrAOrPlacedImage = new ArrayList<Object>();
        }
        return this.itemOrAOrPlacedImage;
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
     * TET 5.1
     *         						
     * 
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="Label">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Word" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}A" maxOccurs="unbounded" minOccurs="0"/>
     *           &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}PlacedImage" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;/choice>
     *         &lt;element name="Body">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded">
     *                   &lt;choice>
     *                     &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Para" maxOccurs="unbounded" minOccurs="0"/>
     *                     &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}List" maxOccurs="unbounded" minOccurs="0"/>
     *                     &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Table" maxOccurs="unbounded" minOccurs="0"/>
     *                     &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}PlacedImage" minOccurs="0"/>
     *                     &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}A" minOccurs="0"/>
     *                   &lt;/choice>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}A" maxOccurs="unbounded" minOccurs="0"/>
     *           &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}PlacedImage" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;/choice>
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
        "labelAndAOrPlacedImage"
    })
    public static class Item {

        @XmlElements({
            @XmlElement(name = "Label", required = true, type = List.Item.Label.class),
            @XmlElement(name = "A", required = true, type = A.class),
            @XmlElement(name = "PlacedImage", required = true, type = PlacedImage.class),
            @XmlElement(name = "Body", required = true, type = List.Item.Body.class)
        })
        protected java.util.List<Object> labelAndAOrPlacedImage;

        /**
         * Gets the value of the labelAndAOrPlacedImage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the labelAndAOrPlacedImage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLabelAndAOrPlacedImage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link List.Item.Label }
         * {@link A }
         * {@link PlacedImage }
         * {@link List.Item.Body }
         * 
         * 
         */
        public java.util.List<Object> getLabelAndAOrPlacedImage() {
            if (labelAndAOrPlacedImage == null) {
                labelAndAOrPlacedImage = new ArrayList<Object>();
            }
            return this.labelAndAOrPlacedImage;
        }


        /**
         * TET 5.1
         *         									
         * 
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence maxOccurs="unbounded">
         *         &lt;choice>
         *           &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Para" maxOccurs="unbounded" minOccurs="0"/>
         *           &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}List" maxOccurs="unbounded" minOccurs="0"/>
         *           &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Table" maxOccurs="unbounded" minOccurs="0"/>
         *           &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}PlacedImage" minOccurs="0"/>
         *           &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}A" minOccurs="0"/>
         *         &lt;/choice>
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
            "paraOrListOrTable"
        })
        public static class Body {

            @XmlElements({
                @XmlElement(name = "Para", type = Para.class),
                @XmlElement(name = "List", type = List.class),
                @XmlElement(name = "Table", type = Table.class),
                @XmlElement(name = "PlacedImage", type = PlacedImage.class),
                @XmlElement(name = "A", type = A.class)
            })
            protected java.util.List<Object> paraOrListOrTable;

            /**
             * Gets the value of the paraOrListOrTable property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the paraOrListOrTable property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getParaOrListOrTable().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Para }
             * {@link List }
             * {@link Table }
             * {@link PlacedImage }
             * {@link A }
             * 
             * 
             */
            public java.util.List<Object> getParaOrListOrTable() {
                if (paraOrListOrTable == null) {
                    paraOrListOrTable = new ArrayList<Object>();
                }
                return this.paraOrListOrTable;
            }

        }


        /**
         * TET 5.1
         *         									
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
         *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Word" maxOccurs="unbounded"/>
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
            "word"
        })
        public static class Label {

            @XmlElement(name = "Word", required = true)
            protected java.util.List<Word> word;

            /**
             * Gets the value of the word property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the word property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWord().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Word }
             * 
             * 
             */
            public java.util.List<Word> getWord() {
                if (word == null) {
                    word = new ArrayList<Word>();
                }
                return this.word;
            }

        }

    }

}
