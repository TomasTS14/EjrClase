import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.events.Attribute;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ConvertirAotraMoneda {
	
	public static void convertir(String archivoAconvertir, String archivoNuevo, double tasaCambio, String currencySymbol ) {
		ArrayList<Object> listaDesayunos = leerXML(archivoAconvertir);
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
		Element raizElement = doc.createElement("breakfast menu");
		for (int i = 0; i < listaDesayunos.size(); i++) {
			
		}
		
	}
	
	private static ArrayList<Object> leerXML(String archivoLeido) throws SAXException, IOException, ParserConfigurationException {
		ArrayList<Object> listaDesayunos = new ArrayList<>();
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File(archivoLeido));
		Element raizElement = doc.getDocumentElement();
		NodeList listaHijos = doc.getElementsByTagName("food");
		
		for (int i = 0;  i<listaHijos.getLength(); i++) {
			Element hijo = (Element)listaHijos.item(i);
			
			NodeList datosHijo = hijo.getChildNodes();
			
			//elementos para crear objeto:
			String numCarta = hijo.getAttribute("numCarta");
			String name = hijo.getElementsByTagName("name").item(0).getTextContent();
			String price =hijo.getElementsByTagName("price").item(0).getTextContent();
			String description =hijo.getElementsByTagName("description").item(0).getTextContent();
			String calories =hijo.getElementsByTagName("calories").item(0).getTextContent();
	
			listaDesayunos.add(new food(Integer.parseInt(numCarta), name, Double.parseDouble(price.substring(1)), description, Integer.parseInt(calories)));
		}
		
		return listaDesayunos;
	}
	
	private static String conversorAEuro(String numero, double tasaConvercion, String currencySymbol) {
		
		return (Double.parseDouble(numero.substring(1))*tasaConvercion)+currencySymbol;
	}
	

}
