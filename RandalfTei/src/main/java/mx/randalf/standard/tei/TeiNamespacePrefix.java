/**
 * 
 */
package mx.randalf.standard.tei;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

/**
 * @author massi
 *
 */
public class TeiNamespacePrefix extends NamespacePrefixMapper {

	/**
	 * 
	 */
	public TeiNamespacePrefix() {
	}

	@Override
	public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
		if (namespaceUri.equals("http://www.tei-c.org/ns/1.0"))
			return "";
		else {
			if (suggestion == null
					&& !namespaceUri.equals("")
					&& !namespaceUri
							.equals("http://www.w3.org/XML/1998/namespace"))
				System.out.println("namespaceUri: " + namespaceUri
						+ " suggestion: " + suggestion);
			return suggestion;
		}
	}

}
