package mx.randalf.standard.tei.manoscritto;

import org.teic.ns._10.MsDesc;
import org.teic.ns._10.MsPart;

import mx.randalf.xsd.exception.XsdException;

public class RandalfTeiDCManoscritto
    extends
    RandalfTeiDCManoscrittoMsPart {

  public RandalfTeiDCManoscritto() {
    super();
    setLevel("m");
    addType("manoscritto");
    addLanguage("greco antico (fino al 1453)");
  }

  @Override
  public void init(String id, MsDesc msDesc) throws XsdException {
    String identifier = null;
    try {
      if (msDesc instanceof MsPart) {
        identifier  = id+ "_" + msDesc.getN();
        setN(msDesc.getN());
//        readDescriptionUnitaCodicologiche((MsPart) msDesc);
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

    init(msDesc.getMsIdentifier());
    init(msDesc.getMsContents());
    init(msDesc.getHistory());
    init(msDesc, msDesc.getPhysDesc());
    init(msDesc, msDesc.getMsPart());
    if (msDesc.getLocus() != null) {
      setLocus(msDesc.getLocus().getContent().get(0).trim());
    }
  }



}
