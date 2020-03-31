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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Box" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Word" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}A" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Line" maxOccurs="unbounded" minOccurs="0"/>
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
    "boxOrWordOrA"
})
@XmlRootElement(name = "Para")
public class Para {

    @XmlElements({
        @XmlElement(name = "Box", type = Box.class),
        @XmlElement(name = "Word", type = Word.class),
        @XmlElement(name = "A", type = A.class),
        @XmlElement(name = "Line", type = Line.class)
    })
    protected List<Object> boxOrWordOrA;

    /**
     * Gets the value of the boxOrWordOrA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boxOrWordOrA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoxOrWordOrA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Box }
     * {@link Word }
     * {@link A }
     * {@link Line }
     * 
     * 
     */
    public List<Object> getBoxOrWordOrA() {
        if (boxOrWordOrA == null) {
            boxOrWordOrA = new ArrayList<Object>();
        }
        return this.boxOrWordOrA;
    }

}
