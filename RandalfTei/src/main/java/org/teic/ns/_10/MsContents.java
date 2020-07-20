package org.teic.ns._10;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="msContents")
public class MsContents extends Content{

  private List<MsItem> msItem;

  private Summary summary;

  public MsContents() {
  }

  public List<MsItem> getMsItem() {
    if (msItem == null) {
      msItem = new ArrayList<MsItem>();
    }
    return msItem;
  }

  public Summary getSummary() {
    return summary;
  }

  public void setSummary(Summary summary) {
    this.summary = summary;
  }

}
