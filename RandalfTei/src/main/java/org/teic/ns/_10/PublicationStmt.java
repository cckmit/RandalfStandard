/**
 * 
 */
package org.teic.ns._10;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author massi
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="publicationStmt", propOrder = {
    "distributor",
    "date"
})
public class PublicationStmt {

  @XmlElement(required = true)
  private List<String> distributor;
  
  private List<Date> date;
  
  /**
   * 
   */
  public PublicationStmt() {
  }

  public List<String> getDistributor() {
    if (distributor == null) {
      distributor = new ArrayList<String>();
    }
    return distributor;
  }

  public List<Date> getDate() {
    if (date == null) {
      date = new ArrayList<Date>();
    }
    return date;
  }

}
