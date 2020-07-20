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
@XmlType(name="physDesc")
public class PhysDesc {

  private P p;
  
  private ObjectDesc objectDesc;
  
  private HandDesc handDesc;

  private DecoDesc decoDesc;
  
  private BindingDesc bindingDesc;

  private MusicNotation musicNotation;

  /**
   * 
   */
  public PhysDesc() {
  }

  public P getP() {
    return p;
  }

  public void setP(P p) {
    this.p = p;
  }

  public ObjectDesc getObjectDesc() {
    return objectDesc;
  }

  public void setObjectDesc(ObjectDesc objectDesc) {
    this.objectDesc = objectDesc;
  }

  public HandDesc getHandDesc() {
    return handDesc;
  }

  public void setHandDesc(HandDesc handDesc) {
    this.handDesc = handDesc;
  }

  public DecoDesc getDecoDesc() {
    return decoDesc;
  }

  public void setDecoDesc(DecoDesc decoDesc) {
    this.decoDesc = decoDesc;
  }

  public BindingDesc getBindingDesc() {
    return bindingDesc;
  }

  public void setBindingDesc(BindingDesc bindingDesc) {
    this.bindingDesc = bindingDesc;
  }

  public MusicNotation getMusicNotation() {
    return musicNotation;
  }

  public void setMusicNotation(MusicNotation musicNotation) {
    this.musicNotation = musicNotation;
  }

}
