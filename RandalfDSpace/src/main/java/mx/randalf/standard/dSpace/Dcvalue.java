package mx.randalf.standard.dSpace;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dcvalue", propOrder = {
	    "content"
})
public class Dcvalue {

    @XmlAttribute(name = "element", required = true)
    protected Element element;

    @XmlAttribute(name = "qualifier", required = true)
    protected Qualifier qualifier;

    @XmlMixed
    protected List<String> content;

    public Dcvalue() {
	}

	public List<String> getContent() {
        if (content == null) {
            content = new ArrayList<String>();
        }
		return content;
	}

	public Element getElement() {
		return element;
	}

	public void setElement(Element element) {
		this.element = element;
	}

	public Qualifier getQualifier() {
		return qualifier;
	}

	public void setQualifier(Qualifier qualifier) {
		this.qualifier = qualifier;
	}

}
