package mx.randalf.standard.tei.carteggio;

import org.teic.ns._10.MsContents;
import org.teic.ns._10.MsItem;

import mx.randalf.standard.tei.dc.RandalfTeiDCStru;
import mx.randalf.xsd.exception.XsdException;

public abstract class RandalfTeiDCCarteggioMsContents  extends RandalfTeiDCCarteggioMsIdentifier{

  public RandalfTeiDCCarteggioMsContents() {
    super();
  }


  protected void init(MsContents msContents) throws XsdException {

    if (msContents != null) {
      if (msContents.getMsItem() != null && msContents.getMsItem().size() > 0) {
        for (MsItem msItem : msContents.getMsItem()) {

          addStru(new RandalfTeiDCStru(msItem.getLocus(), msItem.getTitle(), msItem.getN()));

          init(msItem.getAll());
        }
      }

      if (msContents != null
          && msContents.getAll() != null) {
        init(msContents.getAll());
      }

    }
  }

}
