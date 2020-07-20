package mx.randalf.standard.tei.carteggio;

import org.teic.ns._10.MsDesc;

import mx.randalf.standard.tei.dc.RandalfTeiDC;

public class RandalfTeiDCCarteggio  extends RandalfTeiDC<RandalfTeiDCCarteggio>{

  public RandalfTeiDCCarteggio() {
    super();
    setLevel("d");
  }

  @Override
  public void init(String id, MsDesc msDesc) {
  }

}
