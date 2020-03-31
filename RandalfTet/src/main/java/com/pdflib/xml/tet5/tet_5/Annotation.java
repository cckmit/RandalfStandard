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
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Box"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Action" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Annotation" minOccurs="0"/>
 *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="alignment">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="left"/>
 *             &lt;enumeration value="center"/>
 *             &lt;enumeration value="right"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="anchor" type="{http://www.pdflib.com/XML/TET5/TET-5.0}anchorId" />
 *       &lt;attribute name="creationdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="color" type="{http://www.pdflib.com/XML/TET5/TET-5.0}colorId" />
 *       &lt;attribute name="destination" type="{http://www.pdflib.com/XML/TET5/TET-5.0}destinationId" />
 *       &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="icon" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.pdflib.com/XML/TET5/TET-5.0}annotationId" />
 *       &lt;attribute name="intent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="interiorcolor" type="{http://www.pdflib.com/XML/TET5/TET-5.0}colorId" />
 *       &lt;attribute name="moddate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="onscreen" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="opacity">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *             &lt;maxInclusive value="1"/>
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="open" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="print" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="readonly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="rotate">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="subject" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="symbol" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="visible" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    "title",
    "contents",
    "action",
    "annotation",
    "exception"
})
@XmlRootElement(name = "Annotation")
public class Annotation {

    @XmlElement(name = "Box", required = true)
    protected Box box;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Contents")
    protected String contents;
    @XmlElement(name = "Action")
    protected List<Action> action;
    @XmlElement(name = "Annotation")
    protected Annotation annotation;
    @XmlElement(name = "Exception")
    protected Exception exception;
    @XmlAttribute(name = "alignment")
    protected String alignment;
    @XmlAttribute(name = "anchor")
    protected String anchor;
    @XmlAttribute(name = "creationdate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationdate;
    @XmlAttribute(name = "color")
    protected String color;
    @XmlAttribute(name = "destination")
    protected String destination;
    @XmlAttribute(name = "hidden")
    protected Boolean hidden;
    @XmlAttribute(name = "icon")
    protected String icon;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "intent")
    protected String intent;
    @XmlAttribute(name = "interiorcolor")
    protected String interiorcolor;
    @XmlAttribute(name = "moddate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar moddate;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "onscreen")
    protected Boolean onscreen;
    @XmlAttribute(name = "opacity")
    protected Double opacity;
    @XmlAttribute(name = "open")
    protected Boolean open;
    @XmlAttribute(name = "print")
    protected Boolean print;
    @XmlAttribute(name = "readonly")
    protected Boolean readonly;
    @XmlAttribute(name = "rotate")
    protected Integer rotate;
    @XmlAttribute(name = "subject")
    protected String subject;
    @XmlAttribute(name = "symbol")
    protected String symbol;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "visible")
    protected Boolean visible;

    /**
     * Recupera il valore della proprietà box.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getBox() {
        return box;
    }

    /**
     * Imposta il valore della proprietà box.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setBox(Box value) {
        this.box = value;
    }

    /**
     * Recupera il valore della proprietà title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Imposta il valore della proprietà title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Recupera il valore della proprietà contents.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContents() {
        return contents;
    }

    /**
     * Imposta il valore della proprietà contents.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContents(String value) {
        this.contents = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the action property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Action }
     * 
     * 
     */
    public List<Action> getAction() {
        if (action == null) {
            action = new ArrayList<Action>();
        }
        return this.action;
    }

    /**
     * Recupera il valore della proprietà annotation.
     * 
     * @return
     *     possible object is
     *     {@link Annotation }
     *     
     */
    public Annotation getAnnotation() {
        return annotation;
    }

    /**
     * Imposta il valore della proprietà annotation.
     * 
     * @param value
     *     allowed object is
     *     {@link Annotation }
     *     
     */
    public void setAnnotation(Annotation value) {
        this.annotation = value;
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
     * Recupera il valore della proprietà alignment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlignment() {
        return alignment;
    }

    /**
     * Imposta il valore della proprietà alignment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlignment(String value) {
        this.alignment = value;
    }

    /**
     * Recupera il valore della proprietà anchor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnchor() {
        return anchor;
    }

    /**
     * Imposta il valore della proprietà anchor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnchor(String value) {
        this.anchor = value;
    }

    /**
     * Recupera il valore della proprietà creationdate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationdate() {
        return creationdate;
    }

    /**
     * Imposta il valore della proprietà creationdate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationdate(XMLGregorianCalendar value) {
        this.creationdate = value;
    }

    /**
     * Recupera il valore della proprietà color.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Imposta il valore della proprietà color.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Recupera il valore della proprietà destination.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Imposta il valore della proprietà destination.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Recupera il valore della proprietà hidden.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHidden() {
        if (hidden == null) {
            return false;
        } else {
            return hidden;
        }
    }

    /**
     * Imposta il valore della proprietà hidden.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHidden(Boolean value) {
        this.hidden = value;
    }

    /**
     * Recupera il valore della proprietà icon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Imposta il valore della proprietà icon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcon(String value) {
        this.icon = value;
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
     * Recupera il valore della proprietà intent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntent() {
        return intent;
    }

    /**
     * Imposta il valore della proprietà intent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntent(String value) {
        this.intent = value;
    }

    /**
     * Recupera il valore della proprietà interiorcolor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteriorcolor() {
        return interiorcolor;
    }

    /**
     * Imposta il valore della proprietà interiorcolor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteriorcolor(String value) {
        this.interiorcolor = value;
    }

    /**
     * Recupera il valore della proprietà moddate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModdate() {
        return moddate;
    }

    /**
     * Imposta il valore della proprietà moddate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModdate(XMLGregorianCalendar value) {
        this.moddate = value;
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
     * Recupera il valore della proprietà onscreen.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOnscreen() {
        if (onscreen == null) {
            return true;
        } else {
            return onscreen;
        }
    }

    /**
     * Imposta il valore della proprietà onscreen.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnscreen(Boolean value) {
        this.onscreen = value;
    }

    /**
     * Recupera il valore della proprietà opacity.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpacity() {
        return opacity;
    }

    /**
     * Imposta il valore della proprietà opacity.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpacity(Double value) {
        this.opacity = value;
    }

    /**
     * Recupera il valore della proprietà open.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpen() {
        return open;
    }

    /**
     * Imposta il valore della proprietà open.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpen(Boolean value) {
        this.open = value;
    }

    /**
     * Recupera il valore della proprietà print.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPrint() {
        if (print == null) {
            return false;
        } else {
            return print;
        }
    }

    /**
     * Imposta il valore della proprietà print.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrint(Boolean value) {
        this.print = value;
    }

    /**
     * Recupera il valore della proprietà readonly.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReadonly() {
        if (readonly == null) {
            return false;
        } else {
            return readonly;
        }
    }

    /**
     * Imposta il valore della proprietà readonly.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReadonly(Boolean value) {
        this.readonly = value;
    }

    /**
     * Recupera il valore della proprietà rotate.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRotate() {
        return rotate;
    }

    /**
     * Imposta il valore della proprietà rotate.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRotate(Integer value) {
        this.rotate = value;
    }

    /**
     * Recupera il valore della proprietà subject.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Imposta il valore della proprietà subject.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Recupera il valore della proprietà symbol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Imposta il valore della proprietà symbol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbol(String value) {
        this.symbol = value;
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
     * Recupera il valore della proprietà visible.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisible() {
        return visible;
    }

    /**
     * Imposta il valore della proprietà visible.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisible(Boolean value) {
        this.visible = value;
    }

}
