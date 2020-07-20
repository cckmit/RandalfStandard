/**
 * 
 */
package mx.randalf.standard.tei.dc;

import org.teic.ns._10.Locus;
import org.teic.ns._10.Title;

/**
 * @author massi
 *
 */
public class RandalfTeiDCStru {

  private Locus locus = null;

  private Title title = null;

  private String n = null;

  /**
   * 
   */
  public RandalfTeiDCStru(Locus locus, Title title, String n) {
    this.locus = locus;
    this.title = title;
    this.n = n;
  }

  public String toString() {
    String result = "";

    if (title != null && title.getContent() != null
        && title.getContent().size() > 0
        && !title.getContent().get(0).trim().equals("")) {
      result = title.getContent().get(0).trim();
    }

    if (n != null && !n.trim().equals("")) {
      result += " (" + n + ")";
    }

    if (locus != null && locus.getContent() != null
        && locus.getContent().size() > 0
        && !locus.getContent().get(0).trim().equals("")) {
      result += " ["+locus.getContent().get(0).trim()+"]";
    }

    return result;
  }

  public Locus getLocus() {
    return locus;
  }

  public void setLocus(Locus locus) {
    this.locus = locus;
  }

  public Title getTitle() {
    return title;
  }

  public void setTitle(Title title) {
    this.title = title;
  }

  public String getN() {
    return n;
  }

  public void setN(String n) {
    this.n = n;
  }
}
