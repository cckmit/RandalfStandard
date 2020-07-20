/**
 * 
 */
package org.teic.ns._10;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * @author massi
 *
 */
@XmlRegistry
public class ObjectFactory {

  /**
   * 
   */
  public ObjectFactory() {
  }

  public Tei createTei() {
    return new Tei();
  }
}
