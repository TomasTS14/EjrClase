import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.events.Attribute;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ConvertirAotraMoneda {
	
	public static void convertir(String archivoAconvertir, String archivoNuevo, double tasaCambio, String currencySymbol ) throws ParserConfigurationException, SAXException, IOException, TransformerFactoryConfigurationError, TransformerException {
		ArrayList<food> listaDesayunos = leerXML(archivoAconvertir);
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
		Element raizElement = doc.createElement("breakfast_menu");
		doc.appendChild(raizElement);
		for (int i = 0; i < listaDesayunos.size(); i++) {
			Element foodElemento = doc.createElement("food");
			foodElemento.setAttribute("numCarta", listaDesayunos.get(i).getId()+"");
			String name = listaDesayunos.get(i).getName();
			String price = conversorAEuro(listaDesayunos.get(i).getPrice().toString(), tasaCambio, currencySymbol) ;
			String description = listaDesayunos.get(i).getDescription();
			String calories = String.valueOf( listaDesayunos.get(i).getCalories());
			foodElemento.appendChild(doc.createElement("name")).setTextContent(name);
			foodElemento.appendChild(doc.createElement("price")).setTextContent(price);
			foodElemento.appendChild(doc.createElement("description")).setTextContent(description);
			foodElemento.appendChild(doc.createElement("calories")).setTextContent(calories);
			raizElement.appendChild(foodElemento);
		}
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File(archivoNuevo));
		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		transformer.transform(source, result);
		
	}
	
	private static ArrayList<food> leerXML(String archivoLeido) throws SAXException, IOException, ParserConfigurationException {
		ArrayList<food> listaDesayunos = new ArrayList<>();
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
		
		return String.format("%.2f"+currencySymbol, Double.parseDouble(numero.substring(1))*tasaConvercion);
	}
	

}
