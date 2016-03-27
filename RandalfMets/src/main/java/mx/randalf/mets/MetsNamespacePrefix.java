/**
 * 
 */
package mx.randalf.mets;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

/**
 * @author massi
 * 
 */
public class MetsNamespacePrefix extends NamespacePrefixMapper {

	/**
	 * 
	 */
	public MetsNamespacePrefix() {
	}

	/**
	 * @see com.sun.xml.bind.marshaller.NamespacePrefixMapper#getPreferredPrefix(java.lang.String,
	 *      java.lang.String, boolean)
	 */
	@Override
	public String getPreferredPrefix(String namespaceUri, String suggestion,
			boolean requirePrefix) {
		
		if (namespaceUri.equals("http://www.loc.gov/METS/"))
			return "mets";
		else if (namespaceUri.equals("http://www.w3.org/1999/xlink"))
			return "xlink";
		else if (namespaceUri.equals("http://www.loc.gov/VMD/"))
			return "vmd";
		else if (namespaceUri.equals("http://www.loc.gov/mix/v20"))
			return "mix";
		else if (namespaceUri.equals("http://www.vraweb.org/vracore4.htm"))
			return "vra";
		else if (namespaceUri.equals("info:lc/xmlns/premis-v2"))
			return "premis";
		else if (namespaceUri.equals("http://www.iccu.sbn.it/metaAG1.pdf"))
			return "mag";
		else if (namespaceUri.equals("http://www.w3.org/TR/xlink"))
			return "xlink";
		else if (namespaceUri.equals("http://www.niso.org/pdfs/DataDict.pdf"))
			return "niso";
		else if (namespaceUri.equals("http://purl.org/dc/elements/1.1/"))
			return "dc";
		else if (namespaceUri.equals("urn:isbn:1-931666-22-9"))
			return "ead";
		else if (namespaceUri.equals("http://www.randalf.mx/schedaF"))
			return "csm";
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
