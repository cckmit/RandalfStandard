/**
 * 
 */
package mx.randalf.standard.tei.dc;

import java.util.List;

import org.teic.ns._10.DecoNote;
import org.teic.ns._10.Locus;
import org.teic.ns._10.MsPart;
import org.teic.ns._10.Name;
import org.teic.ns._10.Note;
import org.teic.ns._10.Num;
import org.teic.ns._10.OrigDate;
import org.teic.ns._10.Osservazioni;
import org.teic.ns._10.PhysDesc;
import org.teic.ns._10.Term;
import org.teic.ns._10.Title;

/**
 * @author massi
 *
 */
public abstract class RandalfDCDescritionUnitaCodicologiche<T>
    extends
      RandalfDCDescritionManoscritto<T> {

  /**
   * 
   */
  public RandalfDCDescritionUnitaCodicologiche() {
    super();
  }

  protected void readDescriptionUnitaCodicologiche(MsPart msPart) {
    PhysDesc physDesc = null;
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
    Osservazioni osservazioni = null;

    description = "Unità codicologica " + msPart.getN();
    physDesc = msPart.getPhysDesc();

    locus = msPart.getLocus();
    if (locus != null && locus.getContent() != null
        && locus.getContent().size() > 0
        && !locus.getContent().get(0).trim().equals("")) {
      description += (description.trim().equals("") ? "" : " ") + "cc "
          + locus.getContent().get(0).trim();
    }

    if (msPart.getHistory() != null && msPart.getHistory().getOrigin() != null
        && msPart.getHistory().getOrigin().getP() != null) {
      origDate = msPart.getHistory().getOrigin().getP().getOrigDate("high");
      if (origDate != null && origDate.getContent() != null
          && origDate.getContent().size() > 0) {
        description += (description.trim().equals("") ? "" : " ; ")
            + origDate.getContent().get(0);
      }
      origDate = msPart.getHistory().getOrigin().getP().getOrigDate("medium");
      if (origDate != null && origDate.getContent() != null
          && origDate.getContent().size() > 0) {
        description += (description.trim().equals("") ? "" : " ; ")
            + origDate.getContent().get(0);
      }
      origDate = msPart.getHistory().getOrigin().getP().getOrigDate("low");
      if (origDate != null && origDate.getContent() != null
          && origDate.getContent().size() > 0) {
        description += (description.trim().equals("") ? "" : " ; ")
            + origDate.getContent().get(0);
      }
    }

    if (msPart.getMsContents() != null
        && msPart.getMsContents().getSummary() != null) {
      title = msPart.getMsContents().getSummary().getTitle();
      if (title != null && title.getContent() != null
          && title.getContent().size() > 0) {
        description += (description.trim().equals("") ? "" : " ; ")
            + title.getContent().get(0);
      }
    }

    if (physDesc.getHandDesc() != null && physDesc.getHandDesc().getP() != null
        && physDesc.getHandDesc().getP().getContent() != null
        && physDesc.getHandDesc().getP().getContent().size() > 0) {
      description += (description.trim().equals("") ? "" : " ; ")
          + physDesc.getHandDesc().getP().getContent().get(0);
    }

    if (physDesc.getDecoDesc() != null) {
      decoNote = physDesc.getDecoDesc().getDecoNote("Iniziali", "");
      if (decoNote != null) {
        note = decoNote.getNote(null, "noteiniziali");
        if (note != null && note.getContent() != null
            && note.getContent().size() > 0) {
          description += (description.trim().equals("") ? "" : " ; ")
              + "iniziali: " + note.getContent().get(0);
        }
      }

      decoNote = physDesc.getDecoDesc().getDecoNote("", null);
      if (decoNote != null && decoNote.getContent() != null
          && decoNote.getContent().size() > 0) {
        description += (description.trim().equals("") ? "" : " ; ")
            + decoNote.getContent().get(0);
      }
      if (decoNote != null) {
        note = decoNote.getNote(null, "notealtrielementi");
        if (note != null && note.getContent() != null
            && note.getContent().size() > 0) {
          description += (description.trim().equals("") ? "" : " : ")
              + "il seguente " + note.getContent().get(0);
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
        description += (description.trim().equals("") ? "" : " ; ")
            + "notazione musicale " + locus.getContent().get(0);
      }

      terms = physDesc.getMusicNotation().getTerms(null, null, "notazione");
      for (Object object : terms) {
        term = (Term) object;
        if (term != null && term.getContent() != null
            && term.getContent().size() > 0) {
          description += (description.trim().equals("") ? "" : ", ")
              + term.getContent().get(0);
        }
      }

      term = physDesc.getMusicNotation().getTerm(null, null, "colorenote");
      if (term != null && term.getContent() != null
          && term.getContent().size() > 0) {
        description += (description.trim().equals("") ? "" : "; ") + "note in "
            + term.getContent().get(0);
      }

      term = physDesc.getMusicNotation().getTerm(null, null, "16olumispazi");
      if (term != null && term.getContent() != null
          && term.getContent().size() > 0) {
        description += (description.trim().equals("") ? "" : ", ") + "righe in "
            + term.getContent().get(0);
      }

      num = physDesc.getMusicNotation().getNum("1");
      if (num != null && num.getContent() != null
          && num.getContent().size() > 0) {
        description += (description.trim().equals("") ? "" : ", ")
            + "linee per rigo " + num.getContent().get(0);
      }

      num = physDesc.getMusicNotation().getNum("2");
      if (num != null && num.getContent() != null
          && num.getContent().size() > 0) {
        description += (description.trim().equals("") ? "" : ", ")
            + "righi per pagina " + num.getContent().get(0);
      }

      note = physDesc.getMusicNotation().getNote(null, null);
      if (note != null && note.getContent() != null
          && note.getContent().size() > 0) {
        description += (description.trim().equals("") ? "" : "; ")
            + note.getContent().get(0);
      }

    }

    if (msPart.getSummary() != null) {
      names = msPart.getSummary().getNames("");

      for (Object object : names) {
        name = (Name) object;
        if (name.getRole() == null || !(name.getRole().equals("luogo_di_copia")
            || name.getRole().equals("altra_relazione_di_D.E.")
            || name.getRole().equals("variantems"))) {
          if (name != null && name.getContent() != null
              && name.getContent().size() > 0) {
            description += (description.trim().equals("") ? "" : " ; ")
                + name.getContent().get(0);
          }
        }
      }
    }

    if (msPart.getOsservazioni() != null) {
      osservazioni = msPart.getOsservazioni();
      if (osservazioni != null && osservazioni.getContent() != null
          && osservazioni.getContent().size() > 0 && !osservazioni.getContent()
              .get(0).toLowerCase().startsWith("timbro")) {
        description += (description.trim().equals("") ? "" : " ; ")
            + osservazioni.getContent().get(0);
      }
    }


    if (description != null && !description.trim().equals("")) {
      addDescription(description);
    }
  }
}
