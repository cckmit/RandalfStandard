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
@XmlType(name="IncipitExplicit")
public class IncipitExplicit extends Content {

  private Locus locus;

  @XmlAttribute(name = "defective")
  private String defective;

  /**
   * 
   */
  public IncipitExplicit() {
  }

  public Locus getLocus() {
    return locus;
  }

  public void setLocus(Locus locus) {
    this.locus = locus;
  }

  public String getDefective() {
    return defective;
  }

  public void setDefective(String defective) {
    this.defective = defective;
  }

}
