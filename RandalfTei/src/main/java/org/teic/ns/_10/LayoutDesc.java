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
@XmlType(name="layoutDesc", propOrder = {
    "p"
})
public class LayoutDesc {

  private P p;

  /**
   * 
   */
  public LayoutDesc() {
  }

  public P getP() {
    return p;
  }

  public void setP(P p) {
    this.p = p;
  }

}
