package mx.randalf.standard.tei.manoscritto;

import java.util.Enumeration;
import java.util.Hashtable;

import org.teic.ns._10.Author;
import org.teic.ns._10.Date;
import org.teic.ns._10.Name;
import org.teic.ns._10.Term;

import mx.randalf.standard.tei.dc.RandalfDCDescritionUnitaCodicologiche;

public abstract class RandalfTeiDCManoscrittoAuthor
    extends
      RandalfDCDescritionUnitaCodicologiche<RandalfTeiDCManoscrittoAuthor> {

  public RandalfTeiDCManoscrittoAuthor() {
    super();
  }

  protected void init(Author author) {
    Hashtable<String, CompAuthor> compAuthors = null;
    Enumeration<String> keys = null;
    String key = null;
    String value = null;

    compAuthors = new Hashtable<String, CompAuthor>();
    for (Object object : author.getAll()) {
      if (object instanceof Name) {
        if (((Name) object).getType() != null
            && !((Name) object).getType().equals("variantems")
            && !((Name) object).getType().equals("locus")) {
          if (compAuthors.get(((Name) object).getN()) == null) {
            compAuthors.put(((Name) object).getN(), new CompAuthor());
          }
          compAuthors.get(((Name) object).getN()).setName((Name) object);
        }
      } else if (object instanceof Term) {
        if (((Term) object).getType() != null
            && !((Term) object).getType().equals("qualificadatazione")
            && !((Term) object).getType().equals("qualifica")) {
          if (compAuthors.get(((Term) object).getN()) == null) {
            compAuthors.put(((Term) object).getN(), new CompAuthor());
          }
          compAuthors.get(((Term) object).getN()).setTerm((Term) object);
        }
      } else if (object instanceof Date) {
        if (compAuthors.get(((Date) object).getN()) == null) {
          compAuthors.put(((Date) object).getN(), new CompAuthor());
        }
        compAuthors.get(((Date) object).getN()).setDate((Date) object);
      }
    }

    if (compAuthors.size() > 0) {
      keys = compAuthors.keys();
      while (keys.hasMoreElements()) {
        key = keys.nextElement();
        if (compAuthors.get(key).isValid()) {
          value = compAuthors.get(key).toString();
          if (value != null) {
            addCreator(value);
          }
        }
      }
    }
  }
  class CompAuthor {
    private Name name = null;

    private Term term = null;

    private Date date = null;

    public void setName(Name name) {
      this.name = name;
    }

    public void setTerm(Term term) {
      this.term = term;
    }

    public void setDate(Date date) {
      this.date = date;
    }

    public boolean isValid() {
      return name != null;
    }

    public String toString() {
      String name = null;
      String term = null;
      String date = null;

      name = cleanString(this.name.getContent().get(0));
      if (this.term != null) {
        term = this.term.getContent().get(0).trim();
      }
      if (this.date != null) {
        date = this.date.getContent().get(0).trim();
      }

      if (name != null && !name.trim().equals("")) {
        name = name.trim();
        if (term != null && !term.trim().equals("")) {
          if (term.trim().indexOf("<")>-1) {
            name += " " + term.trim().replace("<", "&lt;").replace(">", "&gt;");
          } else {
            name += " &lt;" + term.trim() + "&gt;";
          }
        }
        if (date != null && !date.trim().equals("")) {
          if (date.trim().indexOf("<")>-1) {
            name += " " + date.trim().replace("<", "&lt;").replace(">", "&gt;");
          } else {
            name += " &lt;" + date.trim() + "&gt;";
          }
        }
      }
      return name;
    }
  }
}
