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
@XmlType(name="supportDesc", propOrder = {
    "support",
    "extent",
    "collation",
    "condition"
})
public class SupportDesc {

  private Support support;

  private Extent extent;

  private Collation collation;

  private Condition condition;

  @XmlAttribute(name = "material")
  private String material;

  /**
   * 
   */
  public SupportDesc() {
  }

  public Support getSupport() {
    return support;
  }

  public void setSupport(Support support) {
    this.support = support;
  }

  public Extent getExtent() {
    return extent;
  }

  public void setExtent(Extent extent) {
    this.extent = extent;
  }

  public Collation getCollation() {
    return collation;
  }

  public void setCollation(Collation collation) {
    this.collation = collation;
  }

  public Condition getCondition() {
    return condition;
  }

  public void setCondition(Condition condition) {
    this.condition = condition;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

}
