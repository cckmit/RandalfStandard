package mx.randalf.standard.tei.manoscritto;

import java.util.List;

import org.teic.ns._10.History;
import org.teic.ns._10.Name;
import org.teic.ns._10.OrigDate;
import org.teic.ns._10.Origin;
import org.teic.ns._10.P;

public abstract class RandalfTeiDCManoscrittoHistory extends RandalfTeiDCManoscrittoMsIdentifier {

	public RandalfTeiDCManoscrittoHistory() {
		super();
	}

	protected void init(History history) {
//		String carteggio = "";

		if (history != null) {
			if (history.getSummary() != null) {
				publisher(history.getSummary().getAll());
			}
			if (history.getOrigin() != null) {
				init(history.getOrigin());
			}
		}
	}

	private void publisher(List<Object> all) {
		Name name = null;
		int pos = 0;
		String luogo = "";
		String copista = "";
		String carteggio = "";
		String[] st = null;

		for (Object object : all) {
			if (object instanceof Name) {
				name = (Name) object;
				if (name.getRole() != null && name.getRole().equals("luogo_di_copia")) {

					carteggio = ((Name) object).getContent().get(0);

					pos = carteggio.indexOf("$");
					if (pos > -1) {
						luogo = cleanString(carteggio.substring(pos + 1)) + " ; " + cleanString(carteggio.substring(0, pos));
						addPublisher(luogo);
					} else {
						addPublisher(cleanString(carteggio));
					}

				} else if (name.getRole() != null && name.getRole().equals("copista")) {

					carteggio = ((Name) object).getContent().get(0);

					pos = carteggio.indexOf("$");
					if (pos > -1) {
						copista = cleanString(carteggio.substring(pos + 1)) + " ; " + cleanString(carteggio.substring(0, pos));
						addPublisher("copia " + copista);
					} else {
						addPublisher("copia " + cleanString(carteggio));
					}

				} else if (name.getRole() != null
						&& (name.getRole().equals("possessore") || name.getRole().equals("libraio"))) {
					carteggio = ((Name) object).getContent().get(0);

					carteggio = carteggio.replace("$$$$", "$");
					carteggio = carteggio.replace("$$$", "$");
					carteggio = carteggio.replace("$$", "$");
					st = carteggio.split("\\$");

					if (st.length > 0) {
						if (st.length == 1) {
							copista = cleanString(st[0]) + " [possessore]";
						} else {
							copista = cleanString(st[0]) + " <" + cleanString(st[1]) + "> [possessore]";
						}
						copista = copista.replace("\\'", "'");
						addContributor(copista);
					}
//					pos = carteggio.indexOf("$$");
//					if ( pos > -1) {
//						carteggio = carteggio.substring(0, pos);
//					}
//					pos = carteggio.indexOf("$");
//					if ( pos > -1) {
//						copista = cleanString(carteggio.substring(0,pos))+" <"+
//								cleanString(carteggio.substring(pos+1))+">";
//						copista = copista.replace("\\'", "'");
//						addContributor(copista);
//					} else {
//						addContributor(cleanString(carteggio));
//					}
				}
			}
		}
	}

	private void init(Origin origin) {
		P p = null;
		OrigDate origDate = null;
		String date = null;
		String[] st = null;

		p = origin.getP();

		origDate = p.getOrigDate(null);

		if (origDate != null && origDate.getContent() != null && origDate.getContent().size() > 0
				&& !origDate.getContent().get(0).trim().equals("")) {
			date = origDate.getContent().get(0).trim();
			st = date.split("-");
			for (String testo : st) {
				addDate(testo.trim());
			}
		}
	}

}
