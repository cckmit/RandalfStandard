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
@XmlType(name="msIdentifier", propOrder = {
    "country",
    "region",
    "settlement",
    "repository",
    "collection",
    "idno",
    "altIdentifier"
})
public class MsIdentifier {

  private StringExt country;

  private String region;

  private String settlement;

  private StringExt repository;

  private String collection;

  private String idno;

  private List<AltIdentifier> altIdentifier;

  /**
   * 
   */
  public MsIdentifier() {
  }

  public StringExt getCountry() {
    return country;
  }

  public void setCountry(StringExt country) {
    this.country = country;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public String getSettlement() {
    return settlement;
  }

  public void setSettlement(String settlement) {
    this.settlement = settlement;
  }

  public StringExt getRepository() {
    return repository;
  }

  public void setRepository(StringExt repository) {
    this.repository = repository;
  }

  public String getCollection() {
    return collection;
  }

  public void setCollection(String collection) {
    this.collection = collection;
  }

  public String getIdno() {
    return idno;
  }

  public void setIdno(String idno) {
    this.idno = idno;
  }

  public List<AltIdentifier> getAltIdentifier() {
    if (altIdentifier==null) {
      altIdentifier = new ArrayList<AltIdentifier>();
    }
    return altIdentifier;
  }

}
