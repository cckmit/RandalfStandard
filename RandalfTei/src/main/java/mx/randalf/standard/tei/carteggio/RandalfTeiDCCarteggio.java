package mx.randalf.standard.tei.carteggio;

import java.util.List;

import org.teic.ns._10.Measure;
import org.teic.ns._10.MsDesc;
import org.teic.ns._10.MsPart;
import org.teic.ns._10.Term;

import mx.randalf.standard.tei.dc.RandalfTeiDC;
import mx.randalf.standard.tei.manoscritto.RandalfTeiDCManoscritto;
import mx.randalf.xsd.exception.XsdException;

public class RandalfTeiDCCarteggio extends RandalfTeiDCCarteggioMsPart {

  public RandalfTeiDCCarteggio() {
    super();
    setLevel("d");
  }

  @Override
  public void init(String id, MsDesc msDesc) throws XsdException {
    String identifier = null;

    try {
      if (msDesc instanceof MsPart) {
        identifier = id + "_" + msDesc.getN();
        setN(msDesc.getN());
        // readDescriptionUnitaCodicologiche((MsPart) msDesc);
      } else {

        identifier = msDesc.getXmlId();
        if (identifier != null) {
          if (identifier.startsWith("ICCU_")) {
            identifier = identifier.substring(5);
          }
        } else {
          throw new XsdException(
              "Il campi xml:id del tag msDesc non è stato valorizzato");
        }
      }
      setIdentifier(identifier);
      elabora(msDesc);
    } catch (XsdException e) {
      throw e;
    }
  }

  private void elabora(MsDesc msDesc) throws XsdException {

    initDescription(msDesc);
    // init(msDesc.getMsIdentifier());
    init(msDesc.getMsContents());
    // init(msDesc.getHistory());
    // init(msDesc, msDesc.getPhysDesc());
    init(msDesc, msDesc.getMsPart());
    if (msDesc.getLocus() != null) {
      setLocus(msDesc.getLocus().getContent().get(0).trim());
    }
  }

  private void initDescription(MsDesc msDesc) {
    String description = "Il documento fa parte di un";
    Term term = null;
    Measure measure = null;
    
    if (msDesc.getPhysDesc()!= null) {
      if (msDesc.getPhysDesc().getObjectDesc() != null) {
        if (msDesc.getPhysDesc().getObjectDesc().getSupportDesc()!= null) {
          if (msDesc.getPhysDesc().getObjectDesc().getSupportDesc().getMaterial().equals("chart")){
            description += " manoscritto cartaceo";
          }
        }
      }
      if (msDesc.getPhysDesc().getP() != null) {
        term = msDesc.getPhysDesc().getP().getTerm("1", "Composito", null);
        if (term != null) {
          description += " composito";
        }
        term = msDesc.getPhysDesc().getP().getTerm("01Elementi", null, null);
        if (term != null && term.getContent() != null
            && term.getContent().size() > 0) {
          description += " di " + term.getContent().get(0);
        }
      }
      if (msDesc.getPhysDesc().getObjectDesc() != null) {
        if (msDesc.getPhysDesc().getObjectDesc().getSupportDesc() != null) {
          if (msDesc.getPhysDesc().getObjectDesc().getSupportDesc().getExtent() != null) {
            measure = msDesc.getPhysDesc().getObjectDesc().getSupportDesc().getExtent().getMeasure("Corpo");
            if (measure != null) {
              description += "";
            }
          }
        }
      }
    }
    if (!description.trim().equals("Il documento fa parte di un")) {
      addDescription(description);
    }
  }

}
