/**
 * 
 */
package org.teic.ns._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * @author massi
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="origin", propOrder = {
    "p"
})
public class Origin {

  private P p;

  /**
   * 
   */
  public Origin() {
  }

  public P getP() {
    return p;
  }

  public void setP(P p) {
    this.p = p;
  }

}
