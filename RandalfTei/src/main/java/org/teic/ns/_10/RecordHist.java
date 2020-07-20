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
@XmlType(name="recordHist", propOrder = {
    "source",
    "change"
})
public class RecordHist {

  private Source source;

  private Change change;

  /**
   * 
   */
  public RecordHist() {
  }

  public Source getSource() {
    return source;
  }

  public void setSource(Source source) {
    this.source = source;
  }

  public Change getChange() {
    return change;
  }

  public void setChange(Change change) {
    this.change = change;
  }

}
