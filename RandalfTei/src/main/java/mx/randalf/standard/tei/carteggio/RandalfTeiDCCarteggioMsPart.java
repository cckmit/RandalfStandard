package mx.randalf.standard.tei.carteggio;

import java.util.List;

import org.teic.ns._10.MsDesc;
import org.teic.ns._10.MsPart;

import mx.randalf.xsd.exception.XsdException;

public abstract class RandalfTeiDCCarteggioMsPart  extends RandalfTeiDCCarteggioMsContents{

  public RandalfTeiDCCarteggioMsPart() {
    super();
  }


  protected void init(MsDesc msDesc, List<MsPart> msParts) throws XsdException {
    RandalfTeiDCCarteggio randalfTeiDCManoscritto = null;

    if (msParts != null && msParts.size() > 0) {
      for (MsPart msPart : msParts) {
//        if (msPart.getN() == null || msPart.getN().equals("")) {
//          readDescriptionUnitaCodicologiche(msDesc, msPart);
//        } else {
          randalfTeiDCManoscritto = new RandalfTeiDCCarteggio();
          randalfTeiDCManoscritto.init(getIdentifier(), msPart);
          addMsParts(randalfTeiDCManoscritto);
//        }
      }
    }
  }

}
