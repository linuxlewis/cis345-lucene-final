package edu.uwsp.lucene;

import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.apache.lucene.document.Document;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

public class LuceneMain {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception{
		File dir = new File("data/");

    	File[] fileArray = {};
    	fileArray = dir.listFiles(new FilenameFilter() { 
    	         public boolean accept(File dir, String filename)
    	              { return filename.endsWith(".xml"); }
    	} );
		
//		String file = "department.xml";
		SAXParserFactory pfactory = SAXParserFactory.newInstance();
		pfactory.setValidating(false);
		pfactory.setNamespaceAware(true);
		SAXParser parser = pfactory.newSAXParser();
		XMLReader reader = parser.getXMLReader();
		LuceneSaxParser splitter = new LuceneSaxParser();
		reader.setContentHandler(splitter);
		if(fileArray != null)
		{
			for (File file : fileArray) {
				reader.parse(new InputSource(new FileReader(file)));
				Document doc = splitter.getDoc();			
				System.out.println(doc.getFields().size());
			}
		}
	}

}
