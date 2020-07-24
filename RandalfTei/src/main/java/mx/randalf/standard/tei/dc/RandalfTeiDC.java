/**
 * 
 */
package mx.randalf.standard.tei.dc;

import java.util.ArrayList;
import java.util.List;

import org.teic.ns._10.MsDesc;

import mx.randalf.xsd.exception.XsdException;

/**
 * @author massi
 *
 */
public abstract class RandalfTeiDC<T> {

  private String level = null;

  private String identifier = null;

  private String locus = null;

  private List<String> title = null;

  private List<String> creator = null;

  private List<String> subject = null;

  private List<String> publisher = null;

  private List<String> description = null;

  private List<String> contributor = null;

  private List<String> type = null;

  private List<String> date = null;

  private List<String> format = null;

  private List<String> library = null;

  private List<String> language= null;

  private List<String> relation= null;

  private List<T> msParts = null;

  private List<T> msItems = null;

  private String tipItem = null;

  private List<RandalfTeiDCStru> randalfTeiDCStrus = null;

  private String n = null;
  
  public RandalfTeiDC() {
    
  }
  
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public String getLocus() {
    return locus;
  }

  public void setLocus(String locus) {
    this.locus = locus;
  }

  public List<String> getTitle() {
    return title;
  }

  public void addTitle(String title) {
    if (this.title == null) {
      this.title = new ArrayList<String>();
    }
    if (!this.title.contains(title)) {
      this.title.add(title);
    }
  }

  public List<String> getCreator() {
    return creator;
  }

  public void addCreator(String creator) {
    if (this.creator == null) {
      this.creator = new ArrayList<String>();
    }
    if (!this.creator.contains(creator)) {
      this.creator.add(creator);
    }
  }

  public List<String> getSubject() {
    return subject;
  }

  public void addSubject(String subject) {
    if (this.subject == null) {
      this.subject = new ArrayList<String>();
    }
    if (!this.subject.contains(subject)) {
      this.subject.add(subject);
    }
  }

  public List<String> getPublisher() {
    return publisher;
  }

  public void addPublisher(String publisher) {
    if (this.publisher == null) {
      this.publisher = new ArrayList<String>();
    }
    if (!this.publisher.contains(publisher)) {
      this.publisher.add(publisher);
    }
  }

  public List<T> getMsParts() {
    return msParts;
  }

  public void addMsParts(T msParts) {
    if (this.msParts == null) {
      this.msParts = new ArrayList<T>();
    }
    this.msParts.add(msParts);
  }

  public List<T> getMsItems() {
    return msItems;
  }

  public void addMsItems(T msItems) {
    if (this.msItems == null) {
      this.msItems = new ArrayList<T>();
    }
    this.msItems.add(msItems);
  }

  public String getTipItem() {
    return tipItem;
  }

  public void setTipItem(String tipItem) {
    this.tipItem = tipItem;
  }

  public void init(MsDesc msDesc) throws XsdException{
    init(identifier, msDesc);
  }

  public abstract void init(String identifier, MsDesc msDesc) throws XsdException;

  protected String cleanString(String value) {
    value = value.replace("*", " ");
    value = value.replace("#", " ");
    value = value.replace("_", " ");
    if (value.indexOf("$") > -1) {
      value = value.substring(0, value.indexOf("$")).trim();
    }
    return value.trim();
  }

  public List<String> getDescription() {
    return description;
  }

  public void addDescription(String description) {
    if (this.description == null) {
      this.description = new ArrayList<String>();
    }
    if (!this.description.contains(description)) {
      this.description.add(description);
    }
  }

  public List<String> getContributor() {
    return contributor;
  }

  public void addContributor(String contributor) {
    if (this.contributor == null) {
      this.contributor = new ArrayList<String>();
    }
    if (!this.contributor.contains(contributor)) {
      this.contributor.add(contributor);
    }
  }

  public List<String> getDate() {
    return date;
  }

  public void addDate(String date) {
    if (this.date == null) {
      this.date = new ArrayList<String>();
    }
    if (!this.date.contains(date)) {
      this.date.add(date);
    }
  }

  public List<String> getType() {
    return type;
  }

  public void addType(String type) {
    if (this.type == null) {
      this.type = new ArrayList<String>();
    }
    if (!this.type.contains(type)) {
      this.type.add(type);
    }
  }

  public List<String> getFormat() {
    return format;
  }

  public void addFormat(String format) {
    if (this.format == null) {
      this.format = new ArrayList<String>();
    }
    if (!this.format.contains(format)) {
      this.format.add(format);
    }
  }

  public List<String> getLibrary() {
    return library;
  }

  public void addLibrary(String library) {
    if (this.library == null) {
      this.library = new ArrayList<String>();
    }
    if (!this.library.contains(library)) {
      this.library.add(library);
    }
  }

  public List<RandalfTeiDCStru> getStru() {
    return randalfTeiDCStrus;
  }

  public void addStru(RandalfTeiDCStru stru) {
    if (this.randalfTeiDCStrus == null) {
      this.randalfTeiDCStrus = new ArrayList<RandalfTeiDCStru>();
    }
    this.randalfTeiDCStrus.add(stru);
  }

  public String getN() {
    return n;
  }

  public void setN(String n) {
    this.n = n;
  }

  public List<String> getLanguage() {
    return language;
  }

  public void addLanguage(String language) {
    if (this.language == null) {
      this.language = new ArrayList<String>();
    }
    this.language.add(language);
  }

  public List<String> getRelation() {
    return relation;
  }

  public void addRelation(String relation) {
    if (this.relation == null) {
      this.relation = new ArrayList<String>();
    }
    this.relation.add(relation);
  }
}
