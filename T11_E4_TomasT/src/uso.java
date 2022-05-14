import java.net.URL;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.events.Attribute;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/*
 * Crea un programa que obtenga los datos de la localidad que quieras y 
 * calcule cuántas horas van a tener una probabilidad de precipitación mayor 
 * o igual al 70% y cuantas horas probabilidad menor del 30%.
 *  Utiliza los bloques de 6 horas que proporciona AEMET en su web.
 */
public class uso {

	public static void main(String[] args) {
		
	try {
		System.out.println(numeroHorasPorPrecipitacion());

	}catch(Exception e) {
		e.printStackTrace();
	}
		

	}
	
	public static String numeroHorasPorPrecipitacion() throws Exception {
		String result="";
		int horasMalas =0;
		int horasBuenas =0;
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse( new URL("http://www.aemet.es/xml/municipios/localidad_22125.xml").openStream());
		String nombreProvincia = doc.getElementsByTagName("provincia").item(0).getTextContent();
		NodeList dias = doc.getElementsByTagName("dia");
		
		for (int i = 0; i<dias.getLength(); i++) {
			Element dia = (Element)dias.item(i);
			NodeList prob_precipitacionList = dia.getElementsByTagName("prob_precipitacion");
			for (int j = 0; j<prob_precipitacionList.getLength(); j++) {
				Element prob_precipitacionElement = (Element)prob_precipitacionList.item(j);
			
				if (prob_precipitacionElement.hasAttribute("periodo")) {
					String periodo = prob_precipitacionElement.getAttribute("periodo");
					if (getRangoHoras(periodo)== 6 ) {
						if(prob_precipitacionElement.hasChildNodes()) {
						int posibilidad = Integer.parseInt( prob_precipitacionElement.getTextContent());
						if ( posibilidad >= 70) horasMalas += 6;
						else  if (posibilidad <= 30) horasBuenas += 6;
						}else {
							horasBuenas += 6;
						}
					}
				}
			}
			
		}
		
		result = String.format("En %s:"
				+ "\nHoras con <30%% posibilidad de lluvia: %d"
				+ "\nHoras con >70%% posibilidad de lluvia: %d",
				nombreProvincia,horasBuenas, horasMalas);
		return result;
	}
	public static int getRangoHoras (String rango) {
		String[] datos = rango.split("-");
		int dato1 = Integer.parseInt(datos[0]);
		int dato2 = Integer.parseInt(datos[1]);
		return dato2-dato1;
	}

}
