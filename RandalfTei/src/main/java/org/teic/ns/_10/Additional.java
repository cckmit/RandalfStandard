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
@XmlType(name="additional", propOrder = {
    "adminInfo",
    "surrogates",
    "listBibl"
})
public class Additional {

  private AdminInfo adminInfo;

  private Surrogates surrogates;

  private ListBibl listBibl;
  /**
   * 
   */
  public Additional() {
  }

  public AdminInfo getAdminInfo() {
    return adminInfo;
  }

  public void setAdminInfo(AdminInfo adminInfo) {
    this.adminInfo = adminInfo;
  }

  public Surrogates getSurrogates() {
    return surrogates;
  }

  public void setSurrogates(Surrogates surrogates) {
    this.surrogates = surrogates;
  }

  public ListBibl getListBibl() {
    return listBibl;
  }

  public void setListBibl(ListBibl listBibl) {
    this.listBibl = listBibl;
  }

}
