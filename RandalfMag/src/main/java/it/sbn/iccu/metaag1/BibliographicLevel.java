//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.20 at 09:54:46 PM CEST 
//


package it.sbn.iccu.metaag1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bibliographic_level.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="bibliographic_level">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="a"/>
 *     &lt;enumeration value="m"/>
 *     &lt;enumeration value="s"/>
 *     &lt;enumeration value="c"/>
 *     &lt;enumeration value="f"/>
 *     &lt;enumeration value="d"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "bibliographic_level")
@XmlEnum
public enum BibliographicLevel {


    /**
     * analitico
     * 
     */
    @XmlEnumValue("a")
    A("a"),

    /**
     * monografia
     * 
     */
    @XmlEnumValue("m")
    M("m"),

    /**
     * pubblicazione in serie
     * 
     */
    @XmlEnumValue("s")
    S("s"),

    /**
     * raccolta
     * 
     */
    @XmlEnumValue("c")
    C("c"),

    /**
     * unità archivistica
     * 
     */
    @XmlEnumValue("f")
    F("f"),

    /**
     * unità documentale
     * 
     */
    @XmlEnumValue("d")
    D("d");
    private final String value;

    BibliographicLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BibliographicLevel fromValue(String v) {
        for (BibliographicLevel c: BibliographicLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
