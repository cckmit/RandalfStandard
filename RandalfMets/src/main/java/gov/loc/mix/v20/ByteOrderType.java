//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.21 at 04:07:06 PM CEST 
//


package gov.loc.mix.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for byteOrderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="byteOrderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="big endian"/>
 *     &lt;enumeration value="little endian"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "byteOrderType")
@XmlEnum
public enum ByteOrderType {

    @XmlEnumValue("big endian")
    BIG_ENDIAN("big endian"),
    @XmlEnumValue("little endian")
    LITTLE_ENDIAN("little endian");
    private final String value;

    ByteOrderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ByteOrderType fromValue(String v) {
        for (ByteOrderType c: ByteOrderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}