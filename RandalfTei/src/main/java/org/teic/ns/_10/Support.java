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
@XmlType(name="support", propOrder = {
    "p"
})
public class Support {

  private P p;

  /**
   * 
   */
  public Support() {
  }

  public P getP() {
    return p;
  }

  public void setP(P p) {
    this.p = p;
  }

}
