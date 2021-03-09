package mx.randalf.standard.dSpace;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "element")
@XmlEnum
public enum Element {

	@XmlEnumValue("title")
    TITLE("title"),

    @XmlEnumValue("publisher")
    PUBLISHER("publisher"),

    @XmlEnumValue("subject")
    SUBJECT("subject"),

    @XmlEnumValue("identifier")
    IDENTIFIER("identifier"),

    @XmlEnumValue("date")
    DATE("date"),

    @XmlEnumValue("format")
    FORMAT("format"),

    @XmlEnumValue("language")
    LANGUAGE("language"),

    @XmlEnumValue("rights")
    RIGHTS("rights"),

    @XmlEnumValue("contributor")
    CONTRIBUTOR("contributor"),

    @XmlEnumValue("type")
    TYPE("type"),

    @XmlEnumValue("relation")
    RELATION("relation"),

    @XmlEnumValue("source")
    SOURCE("source");
    private final String value;

    Element(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Element fromValue(String v) {
        for (Element c: Element.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
