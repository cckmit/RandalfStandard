package org.teic.ns._10;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="titleStmt", propOrder = {
    "title",
    "author"
})
public class TitleStmt {

  @XmlElement(required = true)
  private List<String> title;

  private List<String> author;

  public TitleStmt() {
  }

  public List<String> getAuthor() {
    if (author == null) {
      author = new ArrayList<String>();
    }
    return author;
  }

  public List<String> getTitle() {
    if (title == null) {
      title = new ArrayList<String>();
    }

    return title;
  }

}
