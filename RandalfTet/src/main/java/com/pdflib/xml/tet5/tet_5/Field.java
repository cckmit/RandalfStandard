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
 *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Box" minOccurs="0"/>
 *         &lt;element name="Contents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tooltip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OptionalValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Action" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Field" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="alignment">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="center"/>
 *             &lt;enumeration value="left"/>
 *             &lt;enumeration value="right"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="anchor" type="{http://www.pdflib.com/XML/TET5/TET-5.0}anchorId" />
 *       &lt;attribute name="backgroundcolor" type="{http://www.pdflib.com/XML/TET5/TET-5.0}colorId" />
 *       &lt;attribute name="bordercolor" type="{http://www.pdflib.com/XML/TET5/TET-5.0}colorId" />
 *       &lt;attribute name="caption" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="captiondown" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="captionrollover" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="destination" type="{http://www.pdflib.com/XML/TET5/TET-5.0}destinationId" />
 *       &lt;attribute name="export" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="exportvalue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="id" type="{http://www.pdflib.com/XML/TET5/TET-5.0}fieldId" />
 *       &lt;attribute name="justification" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mappingname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="onscreen" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="print" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="readonly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="rotate">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="sort" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="barcode"/>
 *             &lt;enumeration value="checkbox"/>
 *             &lt;enumeration value="combobox"/>
 *             &lt;enumeration value="container"/>
 *             &lt;enumeration value="listbox"/>
 *             &lt;enumeration value="pushbutton"/>
 *             &lt;enumeration value="radiobutton"/>
 *             &lt;enumeration value="radiogroup"/>
 *             &lt;enumeration value="signature"/>
 *             &lt;enumeration value="textfield"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="visible" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
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
    "contents",
    "tooltip",
    "defaultValue",
    "value",
    "optionalValue",
    "action",
    "field",
    "exception"
})
@XmlRootElement(name = "Field")
public class Field {

    @XmlElement(name = "Box")
    protected Box box;
    @XmlElement(name = "Contents")
    protected String contents;
    @XmlElement(name = "Tooltip")
    protected String tooltip;
    @XmlElement(name = "DefaultValue")
    protected String defaultValue;
    @XmlElement(name = "Value")
    protected List<String> value;
    @XmlElement(name = "OptionalValue")
    protected List<String> optionalValue;
    @XmlElement(name = "Action")
    protected List<Action> action;
    @XmlElement(name = "Field")
    protected List<Field> field;
    @XmlElement(name = "Exception")
    protected Exception exception;
    @XmlAttribute(name = "alignment")
    protected String alignment;
    @XmlAttribute(name = "anchor")
    protected String anchor;
    @XmlAttribute(name = "backgroundcolor")
    protected String backgroundcolor;
    @XmlAttribute(name = "bordercolor")
    protected String bordercolor;
    @XmlAttribute(name = "caption")
    protected String caption;
    @XmlAttribute(name = "captiondown")
    protected String captiondown;
    @XmlAttribute(name = "captionrollover")
    protected String captionrollover;
    @XmlAttribute(name = "destination")
    protected String destination;
    @XmlAttribute(name = "export")
    protected Boolean export;
    @XmlAttribute(name = "exportvalue")
    protected String exportvalue;
    @XmlAttribute(name = "hidden")
    protected Boolean hidden;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "justification")
    protected String justification;
    @XmlAttribute(name = "mappingname")
    protected String mappingname;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "onscreen")
    protected Boolean onscreen;
    @XmlAttribute(name = "print")
    protected Boolean print;
    @XmlAttribute(name = "readonly")
    protected Boolean readonly;
    @XmlAttribute(name = "required")
    protected Boolean required;
    @XmlAttribute(name = "rotate")
    protected Integer rotate;
    @XmlAttribute(name = "sort")
    protected Boolean sort;
    @XmlAttribute(name = "state")
    protected String state;
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
     * Recupera il valore della proprietà tooltip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTooltip() {
        return tooltip;
    }

    /**
     * Imposta il valore della proprietà tooltip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTooltip(String value) {
        this.tooltip = value;
    }

    /**
     * Recupera il valore della proprietà defaultValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Imposta il valore della proprietà defaultValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

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
     * Gets the value of the optionalValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionalValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionalValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOptionalValue() {
        if (optionalValue == null) {
            optionalValue = new ArrayList<String>();
        }
        return this.optionalValue;
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
     * Gets the value of the field property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the field property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Field }
     * 
     * 
     */
    public List<Field> getField() {
        if (field == null) {
            field = new ArrayList<Field>();
        }
        return this.field;
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
     * Recupera il valore della proprietà backgroundcolor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundcolor() {
        return backgroundcolor;
    }

    /**
     * Imposta il valore della proprietà backgroundcolor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundcolor(String value) {
        this.backgroundcolor = value;
    }

    /**
     * Recupera il valore della proprietà bordercolor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBordercolor() {
        return bordercolor;
    }

    /**
     * Imposta il valore della proprietà bordercolor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBordercolor(String value) {
        this.bordercolor = value;
    }

    /**
     * Recupera il valore della proprietà caption.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Imposta il valore della proprietà caption.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaption(String value) {
        this.caption = value;
    }

    /**
     * Recupera il valore della proprietà captiondown.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptiondown() {
        return captiondown;
    }

    /**
     * Imposta il valore della proprietà captiondown.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptiondown(String value) {
        this.captiondown = value;
    }

    /**
     * Recupera il valore della proprietà captionrollover.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptionrollover() {
        return captionrollover;
    }

    /**
     * Imposta il valore della proprietà captionrollover.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptionrollover(String value) {
        this.captionrollover = value;
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
     * Recupera il valore della proprietà export.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExport() {
        return export;
    }

    /**
     * Imposta il valore della proprietà export.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExport(Boolean value) {
        this.export = value;
    }

    /**
     * Recupera il valore della proprietà exportvalue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportvalue() {
        return exportvalue;
    }

    /**
     * Imposta il valore della proprietà exportvalue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportvalue(String value) {
        this.exportvalue = value;
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
     * Recupera il valore della proprietà justification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustification() {
        return justification;
    }

    /**
     * Imposta il valore della proprietà justification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustification(String value) {
        this.justification = value;
    }

    /**
     * Recupera il valore della proprietà mappingname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappingname() {
        return mappingname;
    }

    /**
     * Imposta il valore della proprietà mappingname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappingname(String value) {
        this.mappingname = value;
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
     * Recupera il valore della proprietà required.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * Imposta il valore della proprietà required.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequired(Boolean value) {
        this.required = value;
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
     * Recupera il valore della proprietà sort.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSort() {
        return sort;
    }

    /**
     * Imposta il valore della proprietà sort.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSort(Boolean value) {
        this.sort = value;
    }

    /**
     * Recupera il valore della proprietà state.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Imposta il valore della proprietà state.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
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
    public boolean isVisible() {
        if (visible == null) {
            return true;
        } else {
            return visible;
        }
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
