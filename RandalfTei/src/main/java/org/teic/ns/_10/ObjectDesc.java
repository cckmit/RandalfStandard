/**
 * 
 */
package org.teic.ns._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * @author massi
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="objectDesc", propOrder = {
    "supportDesc",
    "layoutDesc"
})
public class ObjectDesc {

  private SupportDesc supportDesc;

  private LayoutDesc layoutDesc;

  @XmlAttribute(name = "form")
  private String form;
  /**
   * 
   */
  public ObjectDesc() {
  }
  public SupportDesc getSupportDesc() {
    return supportDesc;
  }
  public void setSupportDesc(SupportDesc supportDesc) {
    this.supportDesc = supportDesc;
  }
  public LayoutDesc getLayoutDesc() {
    return layoutDesc;
  }
  public void setLayoutDesc(LayoutDesc layoutDesc) {
    this.layoutDesc = layoutDesc;
  }
  public String getForm() {
    return form;
  }
  public void setForm(String form) {
    this.form = form;
  }

}
