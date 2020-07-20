/**
 * 
 */
package org.teic.ns._10;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * @author massi
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="listBibl")
public class ListBibl extends Content {

  private List<MsDesc> msDesc;

  /**
   * 
   */
  public ListBibl() {
  }

  public List<MsDesc> getMsDesc() {
    if (msDesc == null) {
      msDesc = new ArrayList<MsDesc>();
    }
    return msDesc;
  }

}
