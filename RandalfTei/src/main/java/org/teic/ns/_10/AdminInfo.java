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
@XmlType(name="adminInfo", propOrder = {
    "recordHist"
})
public class AdminInfo {

  private RecordHist recordHist;

  /**
   * 
   */
  public AdminInfo() {
  }

  public RecordHist getRecordHist() {
    return recordHist;
  }

  public void setRecordHist(RecordHist recordHist) {
    this.recordHist = recordHist;
  }

}
