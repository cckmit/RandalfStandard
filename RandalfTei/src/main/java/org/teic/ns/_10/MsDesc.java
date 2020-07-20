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
import javax.xml.bind.annotation.XmlType;

/**
 * @author massi
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="msDesc")
public class MsDesc extends Content {

  @XmlElement(required = true)
  private MsIdentifier msIdentifier;
  
  @XmlElement(required = true)
  private MsContents msContents;
  
  @XmlElement(required = true)
  private PhysDesc physDesc;
  
  @XmlElement(required = true)
  private History history;
  
  @XmlElement(required = true)
  private Additional additional;

  private Osservazioni osservazioni;

  private List<MsPart> msPart;
  
  @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace")
  protected String xmlId;

  @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
  protected String xmlLang;

  /**
   * 
   */
  public MsDesc() {
  }

  public MsIdentifier getMsIdentifier() {
    return msIdentifier;
  }

  public void setMsIdentifier(MsIdentifier msIdentifier) {
    this.msIdentifier = msIdentifier;
  }

  public String getXmlId() {
    return xmlId;
  }

  public void setXmlId(String xmlId) {
    this.xmlId = xmlId;
  }

  public String getXmlLang() {
    return xmlLang;
  }

  public void setXmlLang(String xmlLang) {
    this.xmlLang = xmlLang;
  }

  public MsContents getMsContents() {
    return msContents;
  }

  public void setMsContents(MsContents msContents) {
    this.msContents = msContents;
  }

  public PhysDesc getPhysDesc() {
    return physDesc;
  }

  public void setPhysDesc(PhysDesc physDesc) {
    this.physDesc = physDesc;
  }

  public List<MsPart> getMsPart() {
    if (msPart == null) {
      msPart = new ArrayList<MsPart>();
    }
    return msPart;
  }

  public History getHistory() {
    return history;
  }

  public void setHistory(History history) {
    this.history = history;
  }

  public Additional getAdditional() {
    return additional;
  }

  public void setAdditional(Additional additional) {
    this.additional = additional;
  }

  public Osservazioni getOsservazioni() {
    return osservazioni;
  }

  public void setOsservazioni(Osservazioni osservazioni) {
    this.osservazioni = osservazioni;
  }

}
