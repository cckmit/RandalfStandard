/**
 * 
 */
package org.teic.ns._10;

import java.util.ArrayList;
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
@XmlType(name="fileDesc", propOrder = {
    "titleStmt",
    "publicationStmt",
    "sourceDesc"
})
public class FileDesc {

  @XmlElement(required = true)
  private TitleStmt titleStmt;
  
  @XmlElement(required = true)
  private PublicationStmt publicationStmt;
  
  @XmlElement(required = true)
  private List<SourceDesc> sourceDesc;

  /**
   * 
   */
  public FileDesc() {
  }

  public TitleStmt getTitleStmt() {
    return titleStmt;
  }

  public void setTitleStmt(TitleStmt titleStmt) {
    this.titleStmt = titleStmt;
  }

  public PublicationStmt getPublicationStmt() {
    return publicationStmt;
  }

  public void setPublicationStmt(PublicationStmt publicationStmt) {
    this.publicationStmt = publicationStmt;
  }

  public List<SourceDesc> getSourceDesc() {
    if (sourceDesc == null) {
      sourceDesc = new ArrayList<SourceDesc>();
    }
    return sourceDesc;
  }

}
