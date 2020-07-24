package mx.randalf.standard.tei.carteggio;

import java.util.List;

import org.teic.ns._10.Measure;
import org.teic.ns._10.MsDesc;
import org.teic.ns._10.MsPart;
import org.teic.ns._10.Note;
import org.teic.ns._10.Num;
import org.teic.ns._10.OrigDate;
import org.teic.ns._10.Term;
import org.teic.ns._10.Title;

import mx.randalf.xsd.exception.XsdException;

public class RandalfTeiDCCarteggio extends RandalfTeiDCCarteggioMsPart {

  public RandalfTeiDCCarteggio() {
    super();
    setLevel("m");
    addType("manoscritto");
    addLanguage("ita");
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
    init(msDesc.getMsIdentifier());
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
    Num num = null;
    Measure measure = null;
    List<Object> objects = null;

    if (msDesc.getPhysDesc() != null) {
      if (msDesc.getPhysDesc().getObjectDesc() != null) {
        if (msDesc.getPhysDesc().getObjectDesc().getSupportDesc() != null) {
          if (msDesc.getPhysDesc().getObjectDesc().getSupportDesc()
              .getMaterial().equals("chart")) {
            description += " manoscritto cartaceo";
          }
        }
      }
      if (msDesc.getPhysDesc().getP() != null) {
        term = msDesc.getPhysDesc().getP().getTerm("1", "Composito", null);
        if (term != null) {
          description += " composito";
        }
        num = msDesc.getPhysDesc().getP().getNum("01Elementi");
        if (num != null && num.getContent() != null
            && num.getContent().size() > 0) {
          description += " di " + num.getContent().get(0);
        }
      }
      if (msDesc.getPhysDesc().getObjectDesc() != null) {
        if (msDesc.getPhysDesc().getObjectDesc().getSupportDesc() != null) {
          if (msDesc.getPhysDesc().getObjectDesc().getSupportDesc()
              .getExtent() != null) {
            measure = msDesc.getPhysDesc().getObjectDesc().getSupportDesc()
                .getExtent().getMeasure("Corpo");
            if (measure != null) {
              description += " cc. " + measure.getContent().get(0);
            }
            measure = msDesc.getPhysDesc().getObjectDesc().getSupportDesc()
                .getExtent().getMeasure("carte");
            if (measure != null) {
              description += " " + measure.getUnit() + " "
                  + measure.getContent().get(0);
            }
          }
        }
      }
    }

    if (msDesc.getHistory() != null) {
      if (msDesc.getHistory().getOrigin() != null) {
        if (msDesc.getHistory().getOrigin().getP() != null) {
          objects = msDesc.getHistory().getOrigin().getP().getOrigDates(null);
          if (objects != null) {
            for (Object object : objects) {
              description += " ; Estremi cronologici " + ((OrigDate) object).getContent().get(0);
            }
          }
        }
      }
      if (msDesc.getHistory().getSummary() != null) {
        objects = msDesc.getHistory().getSummary().getTitles();
        if (objects != null) {
          for (Object object: objects) {
            description += " Camicia: " + ((Title) object).getContent().get(0);
          }
        }
        objects = msDesc.getHistory().getSummary().getNotes("38", "ossercamcia");
        if (objects != null) {
          for (Object object: objects) {
            description += " ; " + ((Note) object).getContent().get(0);
          }
        }
      }
    }
    if (!description.trim().equals("Il documento fa parte di un")) {
      addDescription(description);
    }
  }

}
