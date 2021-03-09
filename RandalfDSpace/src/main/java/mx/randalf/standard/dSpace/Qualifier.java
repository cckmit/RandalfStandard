package mx.randalf.standard.dSpace;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "qualifier")
@XmlEnum
public enum Qualifier {

	@XmlEnumValue("none")
    NONE("none"),

	@XmlEnumValue("shelfmark")
    SHELFMARK("shelfmark"),

	@XmlEnumValue("inventorynumber")
    INVENTORYNUMBER("inventorynumber"),

	@XmlEnumValue("other")
    OTHER("other"),

	@XmlEnumValue("issued")
    ISSUED("issued"),

	@XmlEnumValue("iso")
    ISO("iso"),

	@XmlEnumValue("license")
    LICENSE("license"),

	@XmlEnumValue("author")
    AUTHOR("author"),

	@XmlEnumValue("author")
    OTHERLINKS("otherlinks"),

	@XmlEnumValue("content")
    CONTENT("content");
    private final String value;

    Qualifier(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Qualifier fromValue(String v) {
        for (Qualifier c: Qualifier.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
