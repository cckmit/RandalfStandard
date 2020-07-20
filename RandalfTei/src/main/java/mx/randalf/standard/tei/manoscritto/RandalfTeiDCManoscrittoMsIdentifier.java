package mx.randalf.standard.tei.manoscritto;

import org.teic.ns._10.MsIdentifier;

public abstract class RandalfTeiDCManoscrittoMsIdentifier
    extends
      RandalfTeiDCManoscrittoMsContents {

  public RandalfTeiDCManoscrittoMsIdentifier() {
    super();
  }

  protected void init(MsIdentifier msIdentifier) {
    String title = "";
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
        title = msIdentifier.getSettlement().trim();
        settlement = msIdentifier.getSettlement().trim();
      }
      if (msIdentifier.getRepository() != null
          && msIdentifier.getRepository().getContent() != null
          && msIdentifier.getRepository().getContent().size() > 0) {
        repositoryKey = msIdentifier.getRepository().getKey();
        for (int x = 0; x < msIdentifier.getRepository().getContent()
            .size(); x++) {
          title += (title.trim().equals("") ? "" : ", ")
              + msIdentifier.getRepository().getContent().get(x).trim();
          repository += (repository.trim().equals("") ? "" : " ")
              + msIdentifier.getRepository().getContent().get(x).trim();
        }
      }
      if (msIdentifier.getCollection() != null
          && !msIdentifier.getCollection().trim().equals("")) {
        title += (title.trim().equals("") ? "" : ", ")
            + msIdentifier.getCollection().trim();
      }
      if (msIdentifier.getIdno() != null
          && !msIdentifier.getIdno().trim().equals("")) {
        title += (title.trim().equals("") ? "" : ", ")
            + msIdentifier.getIdno().trim();
      }
      if (!title.trim().equals("")) {
        addTitle(title);
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
        library += (library.trim().equals("") ? "" : " - ") + repositoryKey;
      }

      if (library != null && !library.trim().equals("")) {
        addLibrary(library);
      }
    }
  }
}
