package mx.randalf.standard.tei.carteggio;

import java.util.List;

import org.teic.ns._10.Name;
import org.teic.ns._10.RespStmt;

import mx.randalf.standard.tei.dc.RandalfTeiDC;

public abstract class RandalfTeiDCCarteggioAll
    extends
      RandalfTeiDC<RandalfTeiDCCarteggioAll> {

  public RandalfTeiDCCarteggioAll() {
    super();
  }

  protected void init(List<Object> all) {
    if (all != null) {
      for (Object object : all) {
        if (object instanceof RespStmt) {
          init((RespStmt) object);
        }
      }
    }
  }

  private void init(RespStmt respStmt) {
    Name mittente = null;
    Name destinatario = null;
    if (respStmt.getResp().equals("mittente")) {
      mittente = respStmt.getName("mittente");
      if (!mittente.getType().equals("variantems")) {
        for (String creator : mittente.getContent()) {
          addCreator(cleanString(creator));
        }
      }
    } else if (respStmt.getResp().equals("destinatario")) {
      destinatario = respStmt.getName("destinatario");
      if (!destinatario.getType().equals("variantems")) {
        for (String contributor : destinatario.getContent()) {
          addContributor(cleanString(contributor));
        }
      }
    }
  }
}
