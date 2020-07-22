package mx.randalf.standard.tei.carteggio;

import java.util.List;

import org.teic.ns._10.Author;
import org.teic.ns._10.MsContents;
import org.teic.ns._10.MsDesc;
import org.teic.ns._10.MsItem;
import org.teic.ns._10.MsPart;
import org.teic.ns._10.Name;
import org.teic.ns._10.RespStmt;

import mx.randalf.standard.tei.dc.RandalfTeiDC;
import mx.randalf.xsd.exception.XsdException;

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
        } else {
//          System.out.println(object.getClass().getName());
        }
        // if (object instanceof Author) {
        // if (!(object instanceof RespStmt)) {
        // init((Author) object);
        // }
        // }
      }
    }
  }

  private void init(RespStmt respStmt) {
    Name mittente = null;
    if (respStmt.getResp().equals("mittente")) {
      mittente = respStmt.getName("mittente");
      if (!mittente.getType().equals("variantems")) {
        for (String creator : mittente.getContent()) {
          addCreator(cleanString(creator));
        }
      }
    } else if (!respStmt.getResp().equals("destinatario")) {
      if (!mittente.getType().equals("variantems")) {
        System.out.println("description......");
      }
    }
  }
}
