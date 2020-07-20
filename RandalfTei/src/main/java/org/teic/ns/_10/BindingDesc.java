/**
 * 
 */
package org.teic.ns._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * @author massi
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="bindingDesc", propOrder = {
    "p",
    "decoNote",
    "condition"
})
public class BindingDesc {

  private P p;
 
  private DecoNote decoNote;

  private Condition condition;

  /**
   * 
   */
  public BindingDesc() {
    // TODO Auto-generated constructor stub
  }

  public P getP() {
    return p;
  }

  public void setP(P p) {
    this.p = p;
  }

  public DecoNote getDecoNote() {
    return decoNote;
  }

  public void setDecoNote(DecoNote decoNote) {
    this.decoNote = decoNote;
  }

  public Condition getCondition() {
    return condition;
  }

  public void setCondition(Condition condition) {
    this.condition = condition;
  }

}
