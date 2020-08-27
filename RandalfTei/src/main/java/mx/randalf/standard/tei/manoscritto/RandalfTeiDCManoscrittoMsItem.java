package mx.randalf.standard.tei.manoscritto;

import java.util.List;

import org.teic.ns._10.MsItem;
import org.teic.ns._10.Name;
import org.teic.ns._10.RespStmt;

import mx.randalf.standard.tei.dc.RandalfTeiDCStru;

public abstract class RandalfTeiDCManoscrittoMsItem
    extends
      RandalfTeiDCManoscrittoAll {

  public RandalfTeiDCManoscrittoMsItem() {
    super();
  }

  protected void initMsItem(MsItem msItem) {

    addStru(new RandalfTeiDCStru(msItem.getLocus(), msItem.getTitle(), msItem.getN()));
    
    initRespStmts(msItem.getRespStmts());

    init(msItem.getAll());
  }

  private void initRespStmts(List<Object> respStmts) {
    List<Object> names = null;
    Name name = null;
    RespStmt respStmt = null;
    int n = 0;

    if (respStmts != null) {
      for (Object object : respStmts) {
        respStmt = ((RespStmt) object);
        names = respStmt.getNames(null);

        for (Object object2 : names) {
          name = (Name) object2;
          if (name.getN().indexOf("_")>-1){
            n = Integer.valueOf(name.getN().substring(0,name.getN().indexOf("_")).replace("_", ""));
          } else {
            n =Integer.valueOf(name.getN());
          }
          if (n > 3) {
            if (name.getContent() != null && name.getContent().size() > 0
                && !name.getContent().get(0).trim().equals("")) {
              addContributor(name.getContent().get(0).trim());
            }
          }
        }
      }
    }
  }

//  private void description(MsItem msItem) {
//    Locus locus = null;
//    Title title = null;
//    String description = "";
//    List<Object> incipits = null;
//    Incipit incipit = null;
//    List<Object> names = null;
//    Name name = null;
//    List<Object> respStmts = null;
//    RespStmt respStmt = null;
//    List<Object> notes = null;
//    Note note = null;
//
//    locus = msItem.getLocus();
//    if (locus != null && locus.getContent() != null
//        && locus.getContent().size() > 0
//        && !locus.getContent().get(0).trim().equals("")) {
//      description = locus.getContent().get(0).trim();
//    }
//
//    title = msItem.getTitle();
//    if (title != null && title.getContent() != null
//        && title.getContent().size() > 0
//        && !title.getContent().get(0).trim().equals("")) {
//      description += (description.trim().equals("") ? "" : ", ")
//          + (title.getType() != null ? title.getType() + ": " : "")
//          + title.getContent().get(0).trim();
//    }
//
//    if (msItem.getClazz() != null
//        && msItem.getClazz().trim().toLowerCase().equals("autografo")) {
//      description += (description.trim().equals("") ? "" : " ; ") + "autografo";
//    }
//
//    incipits = msItem.getIncipits(null);
//
//    if (incipits != null && incipits.size() > 0) {
//      for (Object object : incipits) {
//        incipit = (Incipit) object;
//        if (incipit.getType() != null
//            && (incipit.getType().trim().equals("testo")
//                || incipit.getType().trim().equals("primo testo"))
//            && incipit.getContent() != null && incipit.getContent().size() > 0
//            && !incipit.getContent().get(0).trim().equals("")) {
//          description += (description.trim().equals("") ? "" : " ; ")
//              + "incipit: " + incipit.getContent().get(0).trim();
//        }
//      }
//    }
//
//    names = msItem.getNames(null);
//
//    if (names != null && names.size() > 0) {
//      for (Object object : names) {
//        name = (Name) object;
//        if (name.getContent() != null && name.getContent().size() > 0
//            && !name.getContent().get(0).trim().equals("")) {
//          description += (description.trim().equals("") ? "" : " ; ")
//              + name.getContent().get(0).trim();
//        }
//      }
//    }
//
//    respStmts = msItem.getRespStmts();
//
//    if (respStmts != null && respStmts.size() > 0) {
//      for (Object object : respStmts) {
//        respStmt = (RespStmt) object;
//
//        name = respStmt.getName(null);
//        if (name.getContent() != null && name.getContent().size() > 0
//            && !name.getContent().get(0).trim().equals("")) {
//          description += (description.trim().equals("") ? "" : ", ")
//              + (respStmt.getResp() != null
//                  && !respStmt.getResp().equals("altra_relazione_di_D.I.")
//                      ? respStmt.getResp() + " "
//                      : "")
//              + name.getContent().get(0).trim();
//        }
//      }
//    }
//
//    notes = msItem.getNotes(null);
//
//    if (notes != null && notes.size() > 0) {
//      for (Object object : notes) {
//        note = (Note) object;
//
//        if (note.getType() != null
//            && (note.getType().equals("oscescinterna")
//                || note.getType().equals("osservazioni"))
//            && note.getContent() != null && note.getContent().size() > 0
//            && !note.getContent().get(0).trim().equals("")) {
//          description += (description.trim().equals("") ? "" : " ; ")
//              + note.getContent().get(0).trim();
//        }
//      }
//    }
//
//    if (description != null && !description.trim().equals("")) {
//      addDescription(description);
//    }
//
//  }
}
