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
 * <p>Java class for meteringModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="meteringModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Average"/>
 *     &lt;enumeration value="Center weighted average"/>
 *     &lt;enumeration value="Spot"/>
 *     &lt;enumeration value="Multispot"/>
 *     &lt;enumeration value="Pattern"/>
 *     &lt;enumeration value="Partial"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "meteringModeType")
@XmlEnum
public enum MeteringModeType {

    @XmlEnumValue("Average")
    AVERAGE("Average"),
    @XmlEnumValue("Center weighted average")
    CENTER_WEIGHTED_AVERAGE("Center weighted average"),
    @XmlEnumValue("Spot")
    SPOT("Spot"),
    @XmlEnumValue("Multispot")
    MULTISPOT("Multispot"),
    @XmlEnumValue("Pattern")
    PATTERN("Pattern"),
    @XmlEnumValue("Partial")
    PARTIAL("Partial");
    private final String value;

    MeteringModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeteringModeType fromValue(String v) {
        for (MeteringModeType c: MeteringModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
