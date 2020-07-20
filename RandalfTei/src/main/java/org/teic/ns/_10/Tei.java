/**
 * 
 */
package org.teic.ns._10;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author massi
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "teiHeader",
    "text"
})
@XmlRootElement(name = "TEI")
public class Tei {

  @XmlElement(required = true)
  private TeiHeader teiHeader;

  private List<Text> text;

  @XmlAttribute(name = "version")
  private String version;
  
  /**
   * 
   */
  public Tei() {
  }

  public TeiHeader getTeiHeader() {
    return teiHeader;
  }

  public void setTeiHeader(TeiHeader teiHeader) {
    this.teiHeader = teiHeader;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public List<Text> getText() {
    if (text == null) {
      text = new ArrayList<Text>();
    }
    return text;
  }

}
