/**
 * 
 */
package org.teic.ns._10;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author massi
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="sourceDesc", propOrder = {
    "p"
})
public class SourceDesc {

  @XmlElement(required = true)
  private List<String> p;

  /**
   * 
   */
  public SourceDesc() {
  }

  public List<String> getP() {
    if (p == null) {
      p = new ArrayList<String>();
    }
    return p;
  }

}
