/**
 * 
 */
package mx.randalf.dc;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

/**
 * @author massi
 *
 */
public class DcNamespacePrefix extends NamespacePrefixMapper {

	/**
	 * 
	 */
	public DcNamespacePrefix() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.sun.xml.bind.marshaller.NamespacePrefixMapper#getPreferredPrefix(java.lang.String, java.lang.String, boolean)
	 */
	@Override
	public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
		if (namespaceUri.equals("http://purl.org/dc/elements/1.1/"))
			return "dc";
		else if (namespaceUri.equals("http://www.openarchives.org/OAI/2.0/oai_dc/"))
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
