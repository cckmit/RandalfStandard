/**
 * 
 */
package mx.randalf.standard.tei.dc;

import java.util.List;

import org.teic.ns._10.DecoNote;
import org.teic.ns._10.Locus;
import org.teic.ns._10.Material;
import org.teic.ns._10.MsDesc;
import org.teic.ns._10.Name;
import org.teic.ns._10.Note;
import org.teic.ns._10.Num;
import org.teic.ns._10.OrigDate;
import org.teic.ns._10.Osservazioni;
import org.teic.ns._10.PhysDesc;
import org.teic.ns._10.Summary;
import org.teic.ns._10.Term;
import org.teic.ns._10.Title;

/**
 * @author massi
 *
 */
public abstract class RandalfDCDescritionManoscritto<T>
    extends
      RandalfTeiDC<T> {

  /**
   * 
   */
  public RandalfDCDescritionManoscritto() {
    super();
  }

  protected void readDescriptionManoscritto(MsDesc msDesc) {
    PhysDesc physDesc = null;
    Material material = null;
    Term term = null;
    List<Object> terms = null;
    Num num = null;
    Note note = null;
    OrigDate origDate = null;
    Title title = null;
    String description = "";
    DecoNote decoNote = null;
    DecoNote decoNoteAzzurro = null;
    DecoNote decoNoteOro = null;
    Locus locus = null;
    Name name = null;
    List<Object> names = null;
    Summary summary = null;
    Osservazioni osservazioni = null;

    physDesc = msDesc.getPhysDesc();

    material = physDesc.getObjectDesc().getSupportDesc().getSupport().getP()
        .getMaterial("1");

    if (material != null && material.getContent() != null
        && material.getContent().size() > 0) {
      if (material.getContent().get(0).trim().toLowerCase().equals("chart")) {
        description = "Manoscritto cartaceo";
      } else if (material.getContent().get(0).trim().toLowerCase()
          .equals("perg")) {
        description = "Manoscritto membranaceo";
      } else if (material.getContent().get(0).trim().toLowerCase()
          .equals("mixed")) {
        description = "Manoscritto misto";
      }
    }

    term = physDesc.getP().getTerm("1", "Composito", null);
    if (term != null) {
      description += (description.trim().equals("") ? "" : " ; composito");
    }

    num = physDesc.getP().getNum("01Elementi");
    if (num != null && num.getContent() != null
        && num.getContent().size() > 0) {
      description += (description.trim().equals("") ? "" : " ") + "di "
          + num.getContent().get(0) + " elementi";
    }

    if (physDesc.getObjectDesc() != null
        && physDesc.getObjectDesc().getSupportDesc() != null
        && physDesc.getObjectDesc().getSupportDesc().getExtent() != null) {
      note = physDesc.getObjectDesc().getSupportDesc().getExtent()
          .getNote("partistampa");
      if (note != null) {
        description += (description.trim().equals("")
            ? ""
            : " ; presenza di testo a stampa");
      }
    }

    if (msDesc.getHistory() != null && msDesc.getHistory().getOrigin() != null
        && msDesc.getHistory().getOrigin().getP() != null) {
      origDate = msDesc.getHistory().getOrigin().getP().getOrigDate("medium");
      if (origDate != null && origDate.getContent() != null
          && origDate.getContent().size() > 0) {
        description += (description.trim().equals("") ? "" : " ; ")
            + origDate.getContent().get(0).trim();
      }
      origDate = msDesc.getHistory().getOrigin().getP().getOrigDate("low");
      if (origDate != null && origDate.getContent() != null
          && origDate.getContent().size() > 0) {
        description += (description.trim().equals("") ? "" : " ; ")
            + origDate.getContent().get(0).trim();
      }
    }

    if (msDesc.getMsContents() != null
        && msDesc.getMsContents().getSummary() != null) {
      title = msDesc.getMsContents().getSummary().getTitle();
      if (title != null && title.getContent() != null
          && title.getContent().size() > 0) {
        description += (description.trim().equals("") ? "" : " ; camicia")
            + title.getContent().get(0).trim();
      }
    }

    if (physDesc.getHandDesc() != null && physDesc.getHandDesc().getP() != null
        && physDesc.getHandDesc().getP().getContent() != null
        && physDesc.getHandDesc().getP().getContent().size() > 0) {
      description += (description.trim().equals("") ? "" : " ; ")
          + physDesc.getHandDesc().getP().getContent().get(0).trim();
    }

    if (physDesc.getDecoDesc() != null) {
      decoNote = physDesc.getDecoDesc().getDecoNote("Iniziali", "");
      if (decoNote != null) {
        note = decoNote.getNote("noteiniziali");
        if (note != null && note.getContent() != null
            && note.getContent().size() > 0) {
          description += (description.trim().equals("") ? "" : " ; ")
              + "iniziali: " + note.getContent().get(0).trim();
        }
      }

      decoNote = physDesc.getDecoDesc().getDecoNote("", null);
      if (decoNote != null && decoNote.getContent() != null
          && decoNote.getContent().size() > 0) {
        description += (description.trim().equals("") ? "" : " ; ")
            + decoNote.getContent().get(0).trim();
      }
      if (decoNote != null) {
        note = decoNote.getNote("notealtrielementi");
        if (note != null && note.getContent() != null
            && note.getContent().size() > 0) {
          description += (description.trim().equals("") ? "" : " : ")
              + "il seguente " + note.getContent().get(0).trim();
        }
      }
    }

    if (physDesc.getDecoDesc() != null) {
      decoNoteAzzurro = physDesc.getDecoDesc().getDecoNote("azzurro", null);
      decoNoteOro = physDesc.getDecoDesc().getDecoNote("oro", null);

      if (decoNoteAzzurro != null || decoNoteOro != null) {
        description += (description.trim().equals("") ? "" : " ; ");
        if (decoNoteAzzurro != null) {
          description += "presenza di azzurro";
        }
        if (decoNoteOro != null) {
          if (decoNoteAzzurro != null) {
            description += ", ";
          }
          description += "oro e oro in foglia";
        }
      }
    }

    if (physDesc.getMusicNotation() != null) {
      locus = physDesc.getMusicNotation().getLocus();
      if (locus != null && locus.getContent() != null
          && locus.getContent().size() > 0) {
        description += (description.trim().equals("") ? "" : " : ")
            + "notazione musicale " + locus.getContent().get(0).trim();
      }

      terms = physDesc.getMusicNotation().getTerms(null, null, "notazione");
      for (Object object : terms) {
        term = (Term) object;
        if (term != null && term.getContent() != null
            && term.getContent().size() > 0) {
          description += (description.trim().equals("") ? "" : ", ")
              + term.getContent().get(0).trim();
        }
      }

      term = physDesc.getMusicNotation().getTerm(null, null, "colorenote");
      if (term != null && term.getContent() != null
          && term.getContent().size() > 0) {
        description += (description.trim().equals("") ? "" : "; ") + "note in "
            + term.getContent().get(0).trim();
      }

      term = physDesc.getMusicNotation().getTerm(null, null, "11olumispazi");
      if (term != null && term.getContent() != null
          && term.getContent().size() > 0) {
        description += (description.trim().equals("") ? "" : ", ") + "righe in "
            + term.getContent().get(0).trim();
      }

      num = physDesc.getMusicNotation().getNum("1");
      if (num != null && num.getContent() != null
          && num.getContent().size() > 0) {
        description += (description.trim().equals("") ? "" : ", ")
            + "linee per rigo " + num.getContent().get(0).trim();
      }

      num = physDesc.getMusicNotation().getNum("2");
      if (num != null && num.getContent() != null
          && num.getContent().size() > 0) {
        description += (description.trim().equals("") ? "" : ", ")
            + "righi per pagina " + num.getContent().get(0).trim();
      }

      note = physDesc.getMusicNotation().getNote(null);
      if (note != null && note.getContent() != null
          && note.getContent().size() > 0) {
        description += (description.trim().equals("") ? "" : "; ")
            + note.getContent().get(0).trim();
      }
    }

    if (msDesc.getSummary() != null) {
      names = msDesc.getSummary().getNames("");

      for (Object object : names) {
        name = (Name) object;
        if (name.getRole() == null || !(name.getRole().equals("luogo_di_copia")
            || name.getRole().equals("altra_relazione_di_D.E.")
            || name.getRole().equals("variantems"))) {
          if (name != null && name.getContent() != null
              && name.getContent().size() > 0
              && !name.getContent().get(0).trim().equals("")) {
            description += (description.trim().equals("") ? "" : " ; ")
                + name.getContent().get(0).trim();
          }
        }
      }
    }

    if (msDesc.getHistory() != null
        && msDesc.getHistory().getSummary() != null) {
      summary = msDesc.getHistory().getSummary();
      if (summary != null && summary.getContent() != null
          && summary.getContent().size() > 0
          && !summary.getContent().get(0).trim().equals("")) {
        description += (description.trim().equals("") ? "" : " ; ")
            + summary.getContent().get(0).trim();
      }
    }

    if (msDesc.getOsservazioni() != null) {
      osservazioni = msDesc.getOsservazioni();
      if (osservazioni != null && osservazioni.getContent() != null
          && osservazioni.getContent().size() > 0 && !osservazioni.getContent()
              .get(0).toLowerCase().startsWith("timbro")) {
        description += (description.trim().equals("") ? "" : " ; ")
            + osservazioni.getContent().get(0).trim();
      }
    }

    if (description != null && !description.trim().equals("")) {
      addDescription(description.trim());
    }
  }
}
