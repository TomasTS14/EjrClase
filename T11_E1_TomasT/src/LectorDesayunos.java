import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class LectorDesayunos {

	private ArrayList<food> desayunos;
	private String ubicacion;

	private File file;
	private Document doc;

	LectorDesayunos(String ubicacion) {
		desayunos = new ArrayList<>();
		this.ubicacion = ubicacion;
		file = new File(ubicacion);
		try {
			leerDocumento(file);

		} catch (Exception e) {
			e.printStackTrace();
		}

	};

	private void leerDocumento(File file) throws Exception {
		doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);

		Element raiz = doc.getDocumentElement();
		NodeList comidas = raiz.getElementsByTagName("food");

		for (int i = 0; i < comidas.getLength(); i++) {

			Node comida = comidas.item(i);
			Element comidaElement = (Element) comida;

			int id = Integer.parseInt(comidaElement.getAttribute("numCarta"));
			String name = "";
			Double price= 0.0;
			String description;
			int calories;
			NodeList datosComidaElement = comidaElement.getChildNodes();

			 name = datosComidaElement.item(1).getTextContent();
			 price =  arreglarPrecio(datosComidaElement.item(3).getTextContent());
			 description = datosComidaElement.item(5).getTextContent();
			 calories = Integer.parseInt( datosComidaElement.item(7).getTextContent());
		
			 desayunos.add(new food(id, name, price, description, calories));
		}

	}
	public ArrayList<food> getArrayDesayunos(){
		return desayunos;
	}
	private Double arreglarPrecio (String precio) {
		char[] datosAux = precio.toCharArray();
		char[] datos = new char[datosAux.length];
		
		datos = Arrays.copyOfRange(datosAux, 1, datos.length);
		String datosString = "";
		StringBuilder strBuilder = new StringBuilder();
		for(int i = 0; i < datos.length; i++) {
				
					strBuilder.append(datos[i]);
				
		}
		datosString = strBuilder.toString();
		Double precioDouble = Double.parseDouble(datosString);
		return precioDouble;
	}
}
