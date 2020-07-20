/**
 * 
 */
package org.teic.ns._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author massi
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="teiHeader", propOrder = {
    "fileDesc"
})
public class TeiHeader {

  @XmlElement(required = true)
  private FileDesc fileDesc;

  /**
   * 
   */
  public TeiHeader() {
  }

  public FileDesc getFileDesc() {
    return fileDesc;
  }

  public void setFileDesc(FileDesc fileDesc) {
    this.fileDesc = fileDesc;
  }

}
