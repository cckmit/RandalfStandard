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
@XmlType(name="history", propOrder = {
    "summary",
    "origin",
    "acquisition"
})
public class History {

  private Summary summary;

  private Origin origin;
  
  private Acquisition acquisition;

  /**
   * 
   */
  public History() {
    // TODO Auto-generated constructor stub
  }

  public Summary getSummary() {
    return summary;
  }

  public void setSummary(Summary summary) {
    this.summary = summary;
  }

  public Origin getOrigin() {
    return origin;
  }

  public void setOrigin(Origin origin) {
    this.origin = origin;
  }

  public Acquisition getAcquisition() {
    return acquisition;
  }

  public void setAcquisition(Acquisition acquisition) {
    this.acquisition = acquisition;
  }

}
