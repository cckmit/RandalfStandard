package mx.randalf.standard.tei.carteggio;

import java.util.List;

import org.teic.ns._10.MsContents;
import org.teic.ns._10.MsDesc;
import org.teic.ns._10.MsItem;
import org.teic.ns._10.MsPart;
import org.teic.ns._10.Name;

import mx.randalf.standard.tei.dc.RandalfTeiDC;
import mx.randalf.xsd.exception.XsdException;

public abstract class RandalfTeiDCCarteggioMsContents  extends RandalfTeiDCCarteggioAll{

  public RandalfTeiDCCarteggioMsContents() {
    super();
  }


  protected void init(MsContents msContents) throws XsdException {
    String value = null;
    String carteggio = null;

    if (msContents != null) {
      if (msContents.getMsItem() != null && msContents.getMsItem().size() > 0) {
        for (MsItem msItem : msContents.getMsItem()) {
          init(msItem.getAll());
//          if (msItem.getClazz() != null
//              && msItem.getClazz().equals("autografo")) {
//            if (msItem.getHistory() != null
//                && msItem.getHistory().getSummary() != null) {
//              for (Object object : msItem.getHistory().getSummary().getAll()) {
//                if (object instanceof Name) {
//                  if (((Name) object).getRole() != null
//                      && ((Name) object).getRole().equals("luogo_di_copia")) {
//                    if (((Name) object).getContent() != null
//                        && ((Name) object).getContent().size() > 0) {
//                      value = cleanString(((Name) object).getContent().get(0))
//                          + " : autografo";
//                      addPublisher(value);
//                    }
//                  } else {
//                    if (((Name) object).getContent() != null
//                        && ((Name) object).getContent().size() > 0) {
//                      value = cleanString(((Name) object).getContent().get(0));
//                      addPublisher(value);
//                    }
//                  }
//                }
//              }
//            }
//          } else if (msItem.getClazz() != null
//            && msItem.getClazz().equals("carteggio")) {
//            carteggio = carteggio(msItem.getAll());
//            if (carteggio != null &&
//                !carteggio.trim().equals("")) {
//              addPublisher(carteggio);
//            }
//          } else {
//            initMsItem(msItem);
//          }
        }
      }

      if (msContents != null
          && msContents.getAll() != null) {
        init(msContents.getAll());
      }

    }
  }

}
