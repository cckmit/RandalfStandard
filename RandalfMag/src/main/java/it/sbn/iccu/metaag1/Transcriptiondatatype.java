//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.20 at 09:54:46 PM CEST 
//


package it.sbn.iccu.metaag1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for transcriptiondatatype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transcriptiondatatype">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="grouping" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="transcriptiondata" type="{http://www.iccu.sbn.it/metaAG1.pdf}transcriptiondatatype" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="data_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="data_unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="interval" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}time" />
 *                   &lt;attribute name="stop" use="required" type="{http://www.w3.org/2001/XMLSchema}time" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="data_value" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded"/>
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
@XmlType(name = "transcriptiondatatype", propOrder = {
    "grouping",
    "transcriptiondata",
    "dataDescription",
    "dataUnit",
    "interval",
    "dataValue"
})
public class Transcriptiondatatype {

    protected String grouping;
    protected List<Transcriptiondatatype> transcriptiondata;
    @XmlElement(name = "data_description")
    protected String dataDescription;
    @XmlElement(name = "data_unit")
    protected String dataUnit;
    protected Transcriptiondatatype.Interval interval;
    @XmlElement(name = "data_value", type = Float.class)
    protected List<Float> dataValue;

    /**
     * Gets the value of the grouping property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrouping() {
        return grouping;
    }

    /**
     * Sets the value of the grouping property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrouping(String value) {
        this.grouping = value;
    }

    /**
     * Gets the value of the transcriptiondata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transcriptiondata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranscriptiondata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transcriptiondatatype }
     * 
     * 
     */
    public List<Transcriptiondatatype> getTranscriptiondata() {
        if (transcriptiondata == null) {
            transcriptiondata = new ArrayList<Transcriptiondatatype>();
        }
        return this.transcriptiondata;
    }

    /**
     * Gets the value of the dataDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDescription() {
        return dataDescription;
    }

    /**
     * Sets the value of the dataDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDescription(String value) {
        this.dataDescription = value;
    }

    /**
     * Gets the value of the dataUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataUnit() {
        return dataUnit;
    }

    /**
     * Sets the value of the dataUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataUnit(String value) {
        this.dataUnit = value;
    }

    /**
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link Transcriptiondatatype.Interval }
     *     
     */
    public Transcriptiondatatype.Interval getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transcriptiondatatype.Interval }
     *     
     */
    public void setInterval(Transcriptiondatatype.Interval value) {
        this.interval = value;
    }

    /**
     * Gets the value of the dataValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Float }
     * 
     * 
     */
    public List<Float> getDataValue() {
        if (dataValue == null) {
            dataValue = new ArrayList<Float>();
        }
        return this.dataValue;
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
     *       &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}time" />
     *       &lt;attribute name="stop" use="required" type="{http://www.w3.org/2001/XMLSchema}time" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Interval {

        @XmlAttribute(name = "start", required = true)
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar start;
        @XmlAttribute(name = "stop", required = true)
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar stop;

        /**
         * Gets the value of the start property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStart() {
            return start;
        }

        /**
         * Sets the value of the start property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStart(XMLGregorianCalendar value) {
            this.start = value;
        }

        /**
         * Gets the value of the stop property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStop() {
            return stop;
        }

        /**
         * Sets the value of the stop property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStop(XMLGregorianCalendar value) {
            this.stop = value;
        }

    }

}