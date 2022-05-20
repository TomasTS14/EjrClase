package commons;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import entities.CD;

public class GestorXMLCDs {
	
	private static ArrayList<CD> coleccionCDs;
	private static GestorXMLCDs instance;
	
	private GestorXMLCDs() {}
	
	public static GestorXMLCDs getInstance() {
		if (instance == null) {
			coleccionCDs = new ArrayList<>();
			instance = new GestorXMLCDs();
		}
		
		return instance;
	}
	
	public static void cargarArrayList(String ubicacionArchivoXML) throws SAXException, IOException, ParserConfigurationException {
		
		
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(ubicacionArchivoXML);
		
		Element raiz = doc.getDocumentElement();
		
		NodeList cdsLista = raiz.getElementsByTagName("CD");
		
		for ( int i = 0; i < cdsLista.getLength(); i++) {
			
			Element cd = (Element)cdsLista.item(i);
			
			String title = cd.getElementsByTagName("TITLE").item(0).getTextContent();
			String artist = cd.getElementsByTagName("ARTIST").item(0).getTextContent();
			String country = cd.getElementsByTagName("COUNTRY").item(0).getTextContent();
			String company = cd.getElementsByTagName("COMPANY").item(0).getTextContent();
			String price = cd.getElementsByTagName("PRICE").item(0).getTextContent();
			String year = cd.getElementsByTagName("YEAR").item(0).getTextContent();
			
			coleccionCDs.add(new CD(title, artist, country, company, price, year));
			
			
			
		}
	
	
	}
	public static void cargarArrayListOVERWRITE(ArrayList<CD> arrayList) throws SAXException, IOException, ParserConfigurationException {
		
		
		coleccionCDs = arrayList;
			
			
			
		}
	public static ArrayList<CD>  getColeccionCDs(){
		return coleccionCDs;
	}
	
	public static void addAColeccion(CD cd) {
		coleccionCDs.add(cd);
	}
	
	public static void extendColeccion(ArrayList<CD> arrayList) {
		if (coleccionCDs == null) {
			coleccionCDs = new ArrayList<>();
		}
		coleccionCDs.addAll(arrayList);
		
	}
	
	public static void exportar_a_CSV() throws FileNotFoundException {
		
		FileOutputStream fileOutStrm = new FileOutputStream(new File("./src/files/musicoteca.csv"));
		
		PrintWriter pw = new PrintWriter(fileOutStrm);
		pw.println("Title , Artist , Country , Company, Price , Year");
		
		for (CD cd : coleccionCDs) {
			
			pw.println(cd.toCSV());
			
		}
		pw.close();
		
		
	}
	

}
