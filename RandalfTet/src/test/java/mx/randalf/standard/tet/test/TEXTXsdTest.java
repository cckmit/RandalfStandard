/**
 * 
 */
package mx.randalf.standard.tet.test;

import java.io.File;
import java.util.ArrayList;
import java.util.Vector;

import com.pdflib.xml.tet5.tet_5.Box;
import com.pdflib.xml.tet5.tet_5.Document;
import com.pdflib.xml.tet5.tet_5.Document.Pages.Page;
import com.pdflib.xml.tet5.tet_5.Para;
import com.pdflib.xml.tet5.tet_5.TET;
import com.pdflib.xml.tet5.tet_5.Text;
import com.pdflib.xml.tet5.tet_5.Word;

import mx.randalf.standard.tet.TETXsd;
import mx.randalf.xsd.exception.XsdException;

/**
 * @author massi
 *
 */
public class TEXTXsdTest {

	/**
	 * 
	 */
	public TEXTXsdTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TEXTXsdTest textXsdTest = null;

		if (args.length==1) {
			textXsdTest = new TEXTXsdTest();
			textXsdTest.leggi(args[0]);
		}else {
			System.out.println("Indicare il file da leggere");
		}
	}

	public void leggi(String fTet) {
		TETXsd tetXsd = null;
		TET tet = null;
		File f = null;
		
		try {
			f = new File(fTet);
			if (f.exists()) {
				System.out.println("Leggo il file ["+f.getAbsolutePath()+"]");
				tetXsd = new TETXsd();
				tet = tetXsd.read(f);
				if (tet.getDocument() != null) {
					leggi(tet.getDocument());
				} else {
					System.out.println("Non ci sono Documento da leggere");
				}
			} else {
				System.out.println("Il file ["+f.getAbsolutePath()+"] non esiste");
			}
		} catch (XsdException e) {
			e.printStackTrace();
		}
	}

	private void leggi(Document document) {
		if (document.getPages() != null && 
				document.getPages().getPage()!= null &&
				document.getPages().getPage().size()>0) {
			for (int x=0; x<document.getPages().getPage().size(); x++) {
				System.out.println("Leggo la pagina ["+(x+1)+"]");
				leggi(document.getPages().getPage().get(x));
			}
		} else {
			System.out.println("Non ci sono pagine da analizzare ");
		}
	}

	private void leggi(Page page) {
		ArrayList<Object> contentGroup = null;
		Para para = null;

		if (page.getContent() != null &&
				page.getContent().getContentGroup() != null &&
				page.getContent().getContentGroup().size()>0) {
			contentGroup = (ArrayList<Object>) page.getContent().getContentGroup();
			for ( int x=0; x<contentGroup.size(); x++) {
				if (contentGroup.get(x).getClass().getName().equals(Para.class.getName())) {
					para = (Para) contentGroup.get(x);
					leggi(para);
				} else {
					System.out.println(contentGroup.get(x).getClass().getName());
				}
			}
		}
	}

	private void leggi(Para para) {
		ArrayList<Object> boxOrWordOrA = null;
		Box box = null;
		
		if (para.getBoxOrWordOrA() != null &&
				para.getBoxOrWordOrA().size()>0) {
			boxOrWordOrA = (ArrayList<Object>) para.getBoxOrWordOrA();
			for (int x=0; x<boxOrWordOrA.size(); x++) {
				if (boxOrWordOrA.get(x).getClass().getName().equals(Box.class.getName())) {
					box = (Box) boxOrWordOrA.get(x);
					leggi(box);
				} else {
					System.out.println(boxOrWordOrA.get(x).getClass().getName());
				}
			}
		}
	}

	private void leggi(Box box) {
		ArrayList<Object> contentGroup = null;
		Word word = null;
		
		if (box.getContentGroup() != null &&
				box.getContentGroup().size()>0) {
			contentGroup = (ArrayList<Object>) box.getContentGroup();
			for (int x=0; x<contentGroup.size(); x++) {
				if (contentGroup.get(x).getClass().getName().equals(Word.class.getName())) {
					word = (Word) contentGroup.get(x);
					leggi(word);
				}else {
					System.out.println(contentGroup.get(x).getClass().getName());
				}
			}
		}
	}

	private void leggi(Word word) {
		ArrayList<Box> boxs = null;
		Text text= null;
		
		text = word.getText();
		
		if (word.getBox() != null &&
				word.getBox().size()>0) {
			boxs = (ArrayList<Box>) word.getBox();
			if (boxs.size()>1) {
				System.out.println("boxs.size: "+boxs.size());
			}
			for (int x=0; x<boxs.size(); x++) {
				leggi(text, boxs.get(x));
			}
		}
	}

	private void leggi(Text text, Box box) {
		System.out.println(text.getValue()+
				"\t Llx: "+box.getLlx()+
				"\t Lly: "+box.getLly()+
				"\t Urx: "+box.getUrx()+
				"\t Ury: "+box.getUry()+
				"\t Lrx: "+box.getLrx()+
				"\t Lry: "+box.getLry()+
				"\t Ulx: "+box.getUlx()+
				"\t Uly: "+box.getUly()
				);
	}

}
