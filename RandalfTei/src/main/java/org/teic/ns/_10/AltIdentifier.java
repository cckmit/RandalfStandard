/**
 * 
 */
package org.teic.ns._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author massi
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="altIdentifier", propOrder = {
    "idno",
    "note"
})
public class AltIdentifier {

  @XmlElement(required = true)
  private String idno;
  
  private Note note;
  
  @XmlAttribute
  private String type;

  /**
   * 
   */
  public AltIdentifier() {
  }

  public String getIdno() {
    return idno;
  }

  public void setIdno(String idno) {
    this.idno = idno;
  }

  public Note getNote() {
    return note;
  }

  public void setNote(Note note) {
    this.note = note;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

}
