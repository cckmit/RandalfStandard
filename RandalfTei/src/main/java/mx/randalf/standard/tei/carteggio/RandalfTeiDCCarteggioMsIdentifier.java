package mx.randalf.standard.tei.carteggio;

import org.teic.ns._10.MsIdentifier;

public abstract class RandalfTeiDCCarteggioMsIdentifier  extends RandalfTeiDCCarteggioAll{

  public RandalfTeiDCCarteggioMsIdentifier() {
    super();
  }


  protected void init(MsIdentifier msIdentifier) {
    String relation = "";
    String repository = "";
    String repositoryKey = "";
    String settlement = "";
    String countryKey = "";
    String library = "";

    if (msIdentifier != null) {
      if (msIdentifier.getCountry() != null
          && msIdentifier.getCountry().getKey() != null) {
        countryKey = msIdentifier.getCountry().getKey().trim().toUpperCase();
      }
      if (msIdentifier.getSettlement() != null
          && !msIdentifier.getSettlement().trim().equals("")) {
        settlement = msIdentifier.getSettlement().trim();
      }
      if (msIdentifier.getRepository() != null
          && msIdentifier.getRepository().getContent() != null
          && msIdentifier.getRepository().getContent().size() > 0) {
        repositoryKey = msIdentifier.getRepository().getKey();
        for (int x = 0; x < msIdentifier.getRepository().getContent()
            .size(); x++) {
          repository += (repository.trim().equals("") ? "" : " ")
              + msIdentifier.getRepository().getContent().get(x).trim();
        }
      }
      if (msIdentifier.getCollection() != null
          && !msIdentifier.getCollection().trim().equals("")) {
        relation += (relation.trim().equals("") ? "" : " ")
            +"Fondo "+ msIdentifier.getCollection().trim();
      }
      if (msIdentifier.getIdno() != null
          && !msIdentifier.getIdno().trim().equals("")) {
        relation += (relation.trim().equals("") ? "" : " ")+
            "Segnatura "+ msIdentifier.getIdno().trim();
      }
      if (!relation.trim().equals("")) {
        addRelation("fa parte di: "+relation);
      }

      if (!repository.equals("")) {
        library = repository;
      }

      if (!settlement.equals("")) {
        library += (library.trim().equals("") ? "" : " - ") + settlement;
      }

      if (!countryKey.equals("")) {
        library += (library.trim().equals("") ? "" : " - ") + countryKey;
      }

      if (!repositoryKey.equals("")) {
        library += (library.trim().equals("") ? "" : "-") + repositoryKey;
      }

      if (library != null && !library.trim().equals("")) {
        addLibrary(library);
      }
    }
  }

}
