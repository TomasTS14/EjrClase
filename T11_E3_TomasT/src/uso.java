import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class uso {

	public static void main(String[] args) {
	try {	ArrayList<Object> listaDesayunos = new ArrayList<>();
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("./src/desayunos.xml"));
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
	System.out.println(listaDesayunos);
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	}

}
