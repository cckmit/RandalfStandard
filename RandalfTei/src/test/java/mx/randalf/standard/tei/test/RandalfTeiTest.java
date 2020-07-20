/**
 * 
 */
package mx.randalf.standard.tei.test;

import java.io.File;
import java.util.List;

import mx.randalf.standard.tei.RandalfTei;
import mx.randalf.standard.tei.dc.RandalfTeiDC;
import mx.randalf.standard.tei.dc.RandalfTeiDCStru;
import mx.randalf.xsd.exception.XsdException;

/**
 * @author massi
 *
 */
public class RandalfTeiTest {

  /**
   * 
   */
  public RandalfTeiTest() {
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    File fXml = null;
    RandalfTeiTest randalfTeiTest = null;
    try {
      if (args.length == 1) {
        fXml = new File(args[0]);
        if (fXml.exists()) {
          randalfTeiTest = new RandalfTeiTest();

          if (fXml.isFile()) {
            randalfTeiTest.elabora(fXml);
          }

        } else {
          System.out
              .println("Il file " + fXml.getAbsolutePath() + " non esiste");
        }
      } else {
        System.out.println("Indcare il nome del file da testare");
      }
    } catch (XsdException e) {
      e.printStackTrace();
    }
  }

  public void elabora(File fXml) throws XsdException {
    RandalfTei randalfTei = null;

    try {
      randalfTei = new RandalfTei();
      randalfTei.elabora(fXml);
      
      if (randalfTei.getRandalfTeiDCs() != null) {
        System.out.println("File: " + fXml.getName());
        System.out.println("tei");
        for (RandalfTeiDC randalfTeiDC: randalfTei.getRandalfTeiDCs()) {
          print("", randalfTeiDC);
        }
      }
    } catch (XsdException e) {
      throw e;
    }
  }

  private void print(String prefix, RandalfTeiDC randalfTeiDC) {
    print(prefix, "-------------");
    print(prefix, "RandalfTeiDC");
    
    if (randalfTeiDC.getLevel() != null) {
      print(prefix, "Level", randalfTeiDC.getLevel());
    }
    
    if (randalfTeiDC.getIdentifier() != null) {
      print(prefix, "Identifier", randalfTeiDC.getIdentifier());
    }
    
    if (randalfTeiDC.getLocus() != null) {
      print(prefix, "Locus", randalfTeiDC.getLocus());
    }
    
    if (randalfTeiDC.getTitle() != null) {
      print(prefix, "Title", randalfTeiDC.getTitle());
    }
    
    if (randalfTeiDC.getCreator() != null) {
      print(prefix, "Creator", randalfTeiDC.getCreator());
    }
    
    if (randalfTeiDC.getSubject() != null) {
      print(prefix, "Subject", randalfTeiDC.getSubject());
    }
    
    if (randalfTeiDC.getPublisher() != null) {
      print(prefix, "Publisher", randalfTeiDC.getPublisher());
    }
    
    if (randalfTeiDC.getDate() != null) {
      print(prefix, "Date", randalfTeiDC.getDate());
    }
    
    if (randalfTeiDC.getDescription() != null) {
      print(prefix, "Description", randalfTeiDC.getDescription());
    }
    
    if (randalfTeiDC.getContributor() != null) {
      print(prefix, "Contributor", randalfTeiDC.getContributor());
    }
    
    if (randalfTeiDC.getFormat() != null) {
      print(prefix, "Format", randalfTeiDC.getFormat());
    }
    
    if (randalfTeiDC.getLibrary() != null) {
      print(prefix, "Library", randalfTeiDC.getLibrary());
    }
    
    if (randalfTeiDC.getMsParts() != null) {
      print(prefix, "MsParts", randalfTeiDC.getMsParts());
    }
    
    if (randalfTeiDC.getMsItems() != null) {
      print(prefix, "MsItems", randalfTeiDC.getMsItems());
    }
    
    if (randalfTeiDC.getTipItem() != null) {
      print(prefix, "TipItem", randalfTeiDC.getTipItem());
    }

    if (randalfTeiDC.getStru() != null &&
        randalfTeiDC.getStru().size()>0) {
      print(prefix, "[STRU]");
      if (randalfTeiDC.getN()!=null) {
        print(prefix+"\t", randalfTeiDC.getTitle().get(0)+" Unita codicologica "+randalfTeiDC.getN());
        prefix += "\t";
      }
      for (Object randalfTeiDCStru: randalfTeiDC.getStru()) {
        print(prefix+"\t", ((RandalfTeiDCStru)randalfTeiDCStru).toString());
      }
    }

  }

  private void print(String prefix, String key, List value) {

    if (value != null && value.size() > 0) {
      if (key != null && !key.trim().equals("")) {
        System.out.println(prefix + key);
        prefix += "\t";
      }
      for (int x = 0; x < value.size(); x++) {
        if (value.get(x) instanceof RandalfTeiDC) {
          print(prefix, (RandalfTeiDC) value.get(x));
        } else {
          print(prefix, (String)value.get(x));
        }
      }
    }
  }

  private void print(String prefix, String value) {

    if (value != null) {
      System.out.println(prefix + value);
    }
  }

  private void print(String prefix, String key, String value) {

    if (value != null) {
      System.out.println(prefix + key + (value==null?"":": " + value));
    }
  }

}
