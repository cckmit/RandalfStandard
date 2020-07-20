package mx.randalf.standard.tei.manoscritto;

import java.util.List;

import org.teic.ns._10.MsContents;
import org.teic.ns._10.MsItem;
import org.teic.ns._10.Name;

import mx.randalf.xsd.exception.XsdException;

public abstract class RandalfTeiDCManoscrittoMsContents
    extends
    RandalfTeiDCManoscrittoMsItem {

  public RandalfTeiDCManoscrittoMsContents() {
    super();
  }


  protected void init(MsContents msContents) throws XsdException {
    String value = null;
    String carteggio = null;

    if (msContents != null) {
      if (msContents.getMsItem() != null && msContents.getMsItem().size() > 0) {
        for (MsItem msItem : msContents.getMsItem()) {
          if (msItem.getClazz() != null
              && msItem.getClazz().equals("autografo")) {
            if (msItem.getHistory() != null
                && msItem.getHistory().getSummary() != null) {
              for (Object object : msItem.getHistory().getSummary().getAll()) {
                if (object instanceof Name) {
                  if (((Name) object).getRole() != null
                      && ((Name) object).getRole().equals("luogo_di_copia")) {
                    if (((Name) object).getContent() != null
                        && ((Name) object).getContent().size() > 0) {
                      value = cleanString(((Name) object).getContent().get(0))
                          + " : autografo";
                      addPublisher(value);
                    }
                  } else {
                    if (((Name) object).getContent() != null
                        && ((Name) object).getContent().size() > 0) {
                      value = cleanString(((Name) object).getContent().get(0));
                      addPublisher(value);
                    }
                  }
                }
              }
            }
          } else if (msItem.getClazz() != null
            && msItem.getClazz().equals("carteggio")) {
            carteggio = carteggio(msItem.getAll());
            if (carteggio != null &&
                !carteggio.trim().equals("")) {
              addPublisher(carteggio);
            }
          } else {
            initMsItem(msItem);
          }
        }
      }

      if (msContents != null
          && msContents.getAll() != null) {
        init(msContents.getAll());
      }

    }
  }

  protected String carteggio(List<Object> all) {
    Name name = null;
    String carteggio = "";
    for(Object object : all) {
      if (object instanceof Name) {
        name = (Name) object;
        if (name.getRole() != null
            && name.getRole().equals("luogo_di_copia")) {
          carteggio = cleanString(((Name) object).getContent().get(0));

        } else if (name.getRole() != null
            && name.getRole().equals("copista")) {
          carteggio += (carteggio.equals("") ? "" : " : ") + "copia "
              + cleanString(((Name) object).getContent().get(0));
        }
      }
    }
    return carteggio;
  }
}
