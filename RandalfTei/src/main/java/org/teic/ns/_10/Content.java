/**
 * 
 */
package org.teic.ns._10;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;

/**
 * @author massi
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Content", propOrder = {"content", "all"})
public class Content {

  @XmlElements({@XmlElement(name = "locus", type = Locus.class),
      @XmlElement(name = "note", type = Note.class),
      @XmlElement(name = "author", type = Author.class),
      @XmlElement(name = "title", type = Title.class),
      @XmlElement(name = "num", type = Num.class),
      @XmlElement(name = "explicit", type = Explicit.class),
      @XmlElement(name = "incipit", type = Incipit.class),
      @XmlElement(name = "respStmt", type = RespStmt.class),
      @XmlElement(name = "term", type = Term.class),
      @XmlElement(name = "material", type = Material.class),
      @XmlElement(name = "watermark", type = Watermark.class),
      @XmlElement(name = "measure", type = Measure.class),
      @XmlElement(name = "name", type = Name.class),
      @XmlElement(name = "date", type = Date.class),
      @XmlElement(name = "origDate", type = OrigDate.class),
      @XmlElement(name = "summary", type = Summary.class),
      @XmlElement(name = "decoNote", type = DecoNote.class),})
  private List<Object> all;

  @XmlMixed
  private List<String> content;

  @XmlAttribute(name = "type")
  private String type;

  @XmlAttribute(name = "subtype")
  private String subtype;

  @XmlAttribute(name = "lang")
  private String lang;

  @XmlAttribute(name = "n")
  private String n;

  @XmlAttribute(name = "key")
  private String key;

  @XmlAttribute(name = "unit")
  private String unit;

  @XmlAttribute(name = "class")
  private String clazz;

  @XmlAttribute(name = "role")
  private String role;

  @XmlAttribute(name = "cert")
  private String cert;

  /**
   * 
   */
  public Content() {
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public String getN() {
    return n;
  }

  public void setN(String n) {
    this.n = n;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public List<String> getContent() {
    if (content == null) {
      content = new ArrayList<String>();
    }
    return content;
  }

  public List<Object> getAll() {
    if (all == null) {
      all = new ArrayList<Object>();
    }
    return all;
  }

  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public String getSubtype() {
    return subtype;
  }

  public void setSubtype(String subtype) {
    this.subtype = subtype;
  }

  public String getClazz() {
    return clazz;
  }

  public void setClazz(String clazz) {
    this.clazz = clazz;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getCert() {
    return cert;
  }

  public void setCert(String cert) {
    this.cert = cert;
  }

  private List<Object> get(Class clazz, String n, String value, String type,
      String subType, String cert, String role) {
    List<Object> result = null;
    Content content = null;
    Boolean trovato = true;
    if (all != null) {
      for (Object object : all) {
        if (object.getClass().getName().equals(clazz.getName())) {
          trovato = true;
          content = (Content) object;

          if (n != null) {
            if (!(content.getN() != null
                && content.getN().trim().equals(n.trim()))) {
              trovato = false;
            }
          }
          if (value != null) {
            if (!(content.getContent() != null
                && content.getContent().size() > 0
                && content.getContent().get(0).trim().equals(value.trim()))) {
              trovato = false;
            }
          }
          if (type != null) {
            if (type.equals("")) {
              if (!(content.getType() == null
                  || content.getType().equals(""))) {
                trovato = false;
              }
            } else if (!(content.getType() != null
                && content.getType().trim().equals(type.trim()))) {
              trovato = false;
            }
          }
          if (subType != null) {
            if (subType.equals("")) {
              if (!(content.getSubtype() == null
                  || content.getSubtype().equals(""))) {
                trovato = false;
              }
            } else if (!(content.getSubtype() != null
                && content.getSubtype().trim().equals(subType.trim()))) {
              trovato = false;
            }
          }
          if (cert != null) {
            if (!(content.getCert() != null
                && content.getCert().trim().equals(cert.trim()))) {
              trovato = false;
            }
          }

          if (role != null && !role.equals("")) {
            if (!(content.getRole() != null
                && content.getRole().trim().equals(role.trim()))) {
              trovato = false;
            }
          }
          if (trovato) {
            if (result == null) {
              result = new ArrayList<Object>();
            }
            result.add(object);
          }
        }
      }
    }
    return result;
  }

  public Term getTerm(String n, String value, String type) {
    List<Object> result = null;
    result = getTerms(n, value, type);
    if (result != null && result.size() > 0) {
      return (Term) result.get(0);
    } else {
      return null;
    }
  }

  public List<Object> getTerms(String n, String value, String type) {
    List<Object> result = null;

    result = get(Term.class, n, value, type, null, null, null);
    return result;
  }

  public Material getMaterial(String n) {
    List<Object> result = null;
    result = getMaterials(n);
    if (result != null && result.size() > 0) {
      return (Material) result.get(0);
    } else {
      return null;
    }

  }

  public List<Object> getMaterials(String n) {
    List<Object> result = null;

    result = get(Material.class, n, null, null, null, null, null);
    return result;
  }

  public Num getNum(String n) {
    List<Object> result = null;
    result = getNums(n);
    if (result != null && result.size() > 0) {
      return (Num) result.get(0);
    } else {
      return null;
    }

  }

  public List<Object> getNums(String n) {
    List<Object> result = null;

    result = get(Num.class, n, null, null, null, null, null);
    return result;
  }

  public Note getNote(String type) {
    List<Object> result = null;
    result = getNotes(type);
    if (result != null && result.size() > 0) {
      return (Note) result.get(0);
    } else {
      return null;
    }

  }

  public List<Object> getNotes(String type) {
    List<Object> result = null;

    result = get(Note.class, null, null, type, null, null, null);
    return result;
  }

  public OrigDate getOrigDate(String cert) {
    List<Object> result = null;
    result = getOrigDates(cert);
    if (result != null && result.size() > 0) {
      return (OrigDate) result.get(0);
    } else {
      return null;
    }

  }

  public List<Object> getOrigDates(String cert) {
    List<Object> result = null;

    result = get(OrigDate.class, null, null, null, null, cert, null);
    return result;
  }

  public Title getTitle() {
    List<Object> result = null;
    result = getTitles();
    if (result != null && result.size() > 0) {
      return (Title) result.get(0);
    } else {
      return null;
    }

  }

  public List<Object> getTitles() {
    List<Object> result = null;

    result = get(Title.class, null, null, null, null, null, null);
    return result;
  }

  public DecoNote getDecoNote(String type, String subType) {
    List<Object> result = null;
    result = getDecoNotes(type, subType);
    if (result != null && result.size() > 0) {
      return (DecoNote) result.get(0);
    } else {
      return null;
    }

  }

  public List<Object> getDecoNotes(String type, String subType) {
    List<Object> result = null;

    result = get(DecoNote.class, null, null, type, subType, null, null);
    return result;
  }

  public Locus getLocus() {
    List<Object> result = null;
    result = getLocuss();
    if (result != null && result.size() > 0) {
      return (Locus) result.get(0);
    } else {
      return null;
    }

  }

  public List<Object> getLocuss() {
    List<Object> result = null;

    result = get(Locus.class, null, null, null, null, null, null);
    return result;
  }

  public Summary getSummary() {
    List<Object> result = null;
    result = getSummarys();
    if (result != null && result.size() > 0) {
      return (Summary) result.get(0);
    } else {
      return null;
    }

  }

  public List<Object> getSummarys() {
    List<Object> result = null;

    result = get(Summary.class, null, null, null, null, null, null);
    return result;
  }

  public Name getName(String role) {
    List<Object> result = null;
    result = getNames(role);
    if (result != null && result.size() > 0) {
      return (Name) result.get(0);
    } else {
      return null;
    }

  }

  public List<Object> getNames(String role) {
    List<Object> result = null;

    result = get(Name.class, null, null, null, null, null, role);
    return result;
  }

  public Incipit getIncipit(String type) {
    List<Object> result = null;
    result = getIncipits(type);
    if (result != null && result.size() > 0) {
      return (Incipit) result.get(0);
    } else {
      return null;
    }

  }

  public List<Object> getIncipits(String type) {
    List<Object> result = null;

    result = get(Incipit.class, null, null, type, null, null, null);
    return result;
  }

  public RespStmt getRespStmt() {
    List<Object> result = null;
    result = getRespStmts();
    if (result != null && result.size() > 0) {
      return (RespStmt) result.get(0);
    } else {
      return null;
    }

  }

  public List<Object> getRespStmts() {
    List<Object> result = null;

    result = get(RespStmt.class, null, null, null, null, null, null);
    return result;
  }

  public Measure getMeasure(String type) {
    List<Object> result = null;
    result = getMeasures(type);
    if (result != null && result.size() > 0) {
      return (Measure) result.get(0);
    } else {
      return null;
    }

  }

  public List<Object> getMeasures(String type) {
    List<Object> result = null;

    result = get(Measure.class, null, null, type, null, null, null);
    return result;
  }
}