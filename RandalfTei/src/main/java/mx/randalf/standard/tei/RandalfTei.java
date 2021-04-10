/**
 * 
 */
package mx.randalf.standard.tei;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.teic.ns._10.MsDesc;
import org.teic.ns._10.Tei;
import org.teic.ns._10.Text;

import mx.randalf.standard.tei.carteggio.RandalfTeiDCCarteggio;
import mx.randalf.standard.tei.dc.RandalfTeiDC;
import mx.randalf.standard.tei.manoscritto.RandalfTeiDCManoscritto;
import mx.randalf.xsd.exception.XsdException;

/**
 * @author massi
 *
 */
public class RandalfTei {

  private List<RandalfTeiDC<?>> randalfTeiDCs = null;

  private String xmlTei =null;

  /**
   * 
   */
  public RandalfTei() {
  }

  public void elabora(String xmlTei) throws XsdException {
    RandalfTeiXsd randalfTeiXsd = null;
    Tei tei = null;
  	
    randalfTeiXsd = new RandalfTeiXsd();
    tei = randalfTeiXsd.read(xmlTei);
    this.xmlTei = xmlTei;
    elabora(tei);
  }
  
  public void elabora(File fileTei) throws XsdException {
  	RandalfTeiXsd randalfTeiXsd = null;
    Tei tei = null;

  	randalfTeiXsd = new RandalfTeiXsd();
    tei = randalfTeiXsd.read(fileTei);

    this.xmlTei = randalfTeiXsd.write(tei, false);
    elabora(tei);
  }

  private void elabora (Tei tei) throws XsdException {
    Text text = null;
    MsDesc msDesc = null;
    RandalfTeiDC<?> randalfTeiDC = null;

    try {

      randalfTeiDCs = new ArrayList<RandalfTeiDC<?>>();
      for (int x = 0; x < tei.getText().size(); x++) {
        text = tei.getText().get(x);
        for (int y = 0; y < text.getBody().getListBibl().getMsDesc()
            .size(); y++) {
          msDesc = text.getBody().getListBibl().getMsDesc().get(y);
          if (msDesc.getMsPart() != null && msDesc.getMsPart().size() > 0
              && msDesc.getMsPart().get(0) != null
              && msDesc.getMsPart().get(0).getMsContents() != null
              && msDesc.getMsPart().get(0).getMsContents().getMsItem() != null
              && msDesc.getMsPart().get(0).getMsContents().getMsItem()
                  .size() > 0
              && msDesc.getMsPart().get(0).getMsContents().getMsItem()
                  .get(0) != null
              && msDesc.getMsPart().get(0).getMsContents().getMsItem().get(0)
                  .getClazz() != null
              && msDesc.getMsPart().get(0).getMsContents().getMsItem().get(0)
                  .getClazz().equals("carteggio")) {
            randalfTeiDC = new RandalfTeiDCCarteggio();
          } else {
            randalfTeiDC = new RandalfTeiDCManoscritto();
          }
          randalfTeiDC.init(msDesc);
          randalfTeiDCs.add(randalfTeiDC);
        }
      }
    } catch (XsdException e) {
      throw e;
    }

  }

  public List<RandalfTeiDC<?>> getRandalfTeiDCs() {
    return randalfTeiDCs;
  }

	public String getXmlTei() {
		return xmlTei;
	}
}
