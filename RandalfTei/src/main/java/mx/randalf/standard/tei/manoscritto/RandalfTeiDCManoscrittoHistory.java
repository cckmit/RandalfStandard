package mx.randalf.standard.tei.manoscritto;

import org.teic.ns._10.History;
import org.teic.ns._10.OrigDate;
import org.teic.ns._10.Origin;
import org.teic.ns._10.P;

public abstract class RandalfTeiDCManoscrittoHistory
    extends
    RandalfTeiDCManoscrittoMsIdentifier {

  public RandalfTeiDCManoscrittoHistory() {
    super();
  }
  
  protected void init(History history) {
    String carteggio = "";

    if (history != null) {
      if (history.getSummary() != null) {
        carteggio = carteggio(history.getSummary().getAll());
        if (carteggio != null &&
            !carteggio.trim().equals("")) {
          addPublisher(carteggio);
        }
      }
      if (history.getOrigin() != null) {
        init(history.getOrigin());
      }
    }
  }

  private void init(Origin origin) {
    P p = null;
    OrigDate origDate = null;

    p = origin.getP();
    
    origDate = p.getOrigDate(null);
    
    if (origDate.getContent()!= null &&
        origDate.getContent().size()>0 && !
        origDate.getContent().get(0).trim().equals(""))
    addDate(origDate.getContent().get(0).trim());
  }
  
}
