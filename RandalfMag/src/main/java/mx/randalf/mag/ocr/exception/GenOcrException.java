/**
 * 
 */
package mx.randalf.mag.ocr.exception;

/**
 * @author massi
 *
 */
public class GenOcrException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6852545959924430239L;

	/**
	 * @param arg0
	 */
	public GenOcrException(String arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GenOcrException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

}
