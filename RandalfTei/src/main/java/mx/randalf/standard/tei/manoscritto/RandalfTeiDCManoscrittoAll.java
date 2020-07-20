package mx.randalf.standard.tei.manoscritto;

import java.util.List;

import org.teic.ns._10.Author;
import org.teic.ns._10.RespStmt;

public abstract class RandalfTeiDCManoscrittoAll
    extends
    RandalfTeiDCManoscrittoAuthor {

  public RandalfTeiDCManoscrittoAll() {
    super();
  }

  protected void init(List<Object> all) {
    if (all != null) {
      for (Object object : all) {
        if (object instanceof Author) {
          if (!(object instanceof RespStmt)) {
            init((Author) object);
          } 
        }
      }
    }
  }
}
