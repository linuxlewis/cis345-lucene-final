package edu.uwsp.lucene;

//import org.apache.lucene.document.Document;
import org.w3c.*; 
import org.w3c.dom.Document;
import org.apache.lucene.document.*;



public class LuceneMain {

	/**
	 * @param args
	 */
	private static org.apache.lucene.document.Document luceneDocument;
	
	public static void main(String[] args) {
		String dirPath = "/data/";
		String fileName = "address-example.xml";
		
		//parses XML file into Document object
		Document xmlDoc = DOMUtil.parse(dirPath+fileName);
	
		luceneDocument = new org.apache.lucene.document.Document();
		//luceneDocument.add(new Field.Text());
		
	
		
	}
	
	

}
