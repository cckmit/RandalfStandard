package mx.randalf.standard.tei.manoscritto;

import org.teic.ns._10.Extent;
import org.teic.ns._10.Material;
import org.teic.ns._10.Measure;
import org.teic.ns._10.MsDesc;
import org.teic.ns._10.MsPart;
import org.teic.ns._10.PhysDesc;
import org.teic.ns._10.SupportDesc;

public abstract class RandalfTeiDCManoscrittoPhysDesc
    extends
      RandalfTeiDCManoscrittoHistory {

  public RandalfTeiDCManoscrittoPhysDesc() {
    super();
  }

  protected void init(MsDesc msDesc, PhysDesc physDesc) {

    if (physDesc != null) {
      if (physDesc.getObjectDesc() != null
          && physDesc.getObjectDesc().getSupportDesc() != null
          && physDesc.getObjectDesc().getSupportDesc().getSupport() != null
          && physDesc.getObjectDesc().getSupportDesc().getSupport()
              .getP() != null
          && physDesc.getObjectDesc().getSupportDesc().getSupport().getP()
              .getMaterial("1") != null) {
        if (!(msDesc instanceof MsPart)) {
          readDescriptionManoscritto(msDesc);
        }
      } else {
        format(physDesc.getObjectDesc().getSupportDesc());
      }
      if (physDesc.getP().getTerm("1", "Composito", null) != null) {

      }
    }
  }

  private void format(SupportDesc supportDesc) {
    String format = "";
    Material material = null;
    Extent extent = null;
    Measure measure = null;

    if (supportDesc != null && supportDesc.getSupport() != null
        && supportDesc.getSupport().getP() != null
        && supportDesc.getSupport().getP().getMaterial(null) != null) {
      material = supportDesc.getSupport().getP().getMaterial(null);
      if (material.getContent() != null && material.getContent().size() > 0
          && !material.getContent().get(0).trim().equals("")) {
        if (material.getContent().get(0).trim().equals("chart")) {
          format = "cartaceo";
        } else if (material.getContent().get(0).trim().equals("perg")) {
          format = "membranaceo";
        } else if (material.getContent().get(0).trim().equals("mix")) {
          format = "misto";
        }
      }
    }

    if (supportDesc != null && supportDesc.getExtent() != null) {
      extent = supportDesc.getExtent();

      measure = extent.getMeasure("Guardieiniziali");
      if (measure != null &&measure.getContent() != null && measure.getContent().size() > 0
          && !measure.getContent().get(0).trim().equals("")) {
        format +=(format.equals("")?"": " ; ")+"cc. "+measure.getContent().get(0).trim();
      }

      measure = extent.getMeasure("Corpo");
      if (measure != null && measure.getContent() != null && measure.getContent().size() > 0
          && !measure.getContent().get(0).trim().equals("")) {
        format +=(format.equals("")?"": " ")+measure.getContent().get(0).trim();
      }

      measure = extent.getMeasure("Guardiefinali");
      if (measure != null && measure.getContent() != null && measure.getContent().size() > 0
          && !measure.getContent().get(0).trim().equals("")) {
        format +=(format.equals("")?"": " ")+measure.getContent().get(0).trim();
      }

      measure = extent.getMeasure("height");
      if (measure != null &&measure.getContent() != null && measure.getContent().size() > 0
          && !measure.getContent().get(0).trim().equals("")) {
        format +=(format.equals("")?"": " ; ")+"mm "+measure.getContent().get(0).trim();
      }

      measure = extent.getMeasure("width");
      if (measure != null && measure.getContent() != null && measure.getContent().size() > 0
          && !measure.getContent().get(0).trim().equals("")) {
        format +=(format.equals("")?"": "x")+measure.getContent().get(0).trim();
      }
    }

    if (format != null && !format.trim().equals("")) {
      addFormat(format);
    }

  }

}
