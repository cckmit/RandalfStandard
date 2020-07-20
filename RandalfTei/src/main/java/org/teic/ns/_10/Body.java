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
@XmlType(name="body", propOrder = {
    "listBibl"
})
public class Body {

  private ListBibl listBibl;

  /**
   * 
   */
  public Body() {
  }

  public ListBibl getListBibl() {
    return listBibl;
  }

  public void setListBibl(ListBibl listBibl) {
    this.listBibl = listBibl;
  }

}
