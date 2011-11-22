package edu.uwsp.lucene;

import org.apache.lucene.document.Document;




public class LuceneMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String dirPath = "/data/";
		String fileName = "address-example.xml";
		
		Document xmlDoc = DOMUtil.parse();
		xmlDoc.getChildNodes().item(0).

	}

}
