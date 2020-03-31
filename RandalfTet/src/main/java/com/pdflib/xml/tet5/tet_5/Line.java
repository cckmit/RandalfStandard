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
 *       &lt;choice>
 *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Box" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.pdflib.com/XML/TET5/TET-5.0}text"/>
 *         &lt;element name="Word" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Text" type="{http://www.pdflib.com/XML/TET5/TET-5.0}text"/>
 *                   &lt;element name="Box" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Glyph" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.pdflib.com/XML/TET5/TET-5.0}BoxAttr"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
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
    "box",
    "text",
    "word"
})
@XmlRootElement(name = "Line")
public class Line {

    @XmlElement(name = "Box")
    protected List<com.pdflib.xml.tet5.tet_5.Box> box;
    @XmlElement(name = "Text")
    protected Text text;
    @XmlElement(name = "Word")
    protected List<Line.Word> word;
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
     * Gets the value of the box property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the box property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBox().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.pdflib.xml.tet5.tet_5.Box }
     * 
     * 
     */
    public List<com.pdflib.xml.tet5.tet_5.Box> getBox() {
        if (box == null) {
            box = new ArrayList<com.pdflib.xml.tet5.tet_5.Box>();
        }
        return this.box;
    }

    /**
     * Recupera il valore della proprietà text.
     * 
     * @return
     *     possible object is
     *     {@link Text }
     *     
     */
    public Text getText() {
        return text;
    }

    /**
     * Imposta il valore della proprietà text.
     * 
     * @param value
     *     allowed object is
     *     {@link Text }
     *     
     */
    public void setText(Text value) {
        this.text = value;
    }

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
     * {@link Line.Word }
     * 
     * 
     */
    public List<Line.Word> getWord() {
        if (word == null) {
            word = new ArrayList<Line.Word>();
        }
        return this.word;
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
     *         &lt;element name="Text" type="{http://www.pdflib.com/XML/TET5/TET-5.0}text"/>
     *         &lt;element name="Box" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Glyph" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.pdflib.com/XML/TET5/TET-5.0}BoxAttr"/>
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
        "text",
        "box"
    })
    public static class Word {

        @XmlElement(name = "Text", required = true)
        protected Text text;
        @XmlElement(name = "Box", required = true)
        protected List<Line.Word.Box> box;

        /**
         * Recupera il valore della proprietà text.
         * 
         * @return
         *     possible object is
         *     {@link Text }
         *     
         */
        public Text getText() {
            return text;
        }

        /**
         * Imposta il valore della proprietà text.
         * 
         * @param value
         *     allowed object is
         *     {@link Text }
         *     
         */
        public void setText(Text value) {
            this.text = value;
        }

        /**
         * Gets the value of the box property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the box property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBox().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Line.Word.Box }
         * 
         * 
         */
        public List<Line.Word.Box> getBox() {
            if (box == null) {
                box = new ArrayList<Line.Word.Box>();
            }
            return this.box;
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
         *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Glyph" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
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
            "glyph"
        })
        public static class Box {

            @XmlElement(name = "Glyph")
            protected List<Glyph> glyph;
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
             * Gets the value of the glyph property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the glyph property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGlyph().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Glyph }
             * 
             * 
             */
            public List<Glyph> getGlyph() {
                if (glyph == null) {
                    glyph = new ArrayList<Glyph>();
                }
                return this.glyph;
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

    }

}
