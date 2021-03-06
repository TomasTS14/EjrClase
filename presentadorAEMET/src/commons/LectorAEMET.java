
package commons;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.Locale;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import entities.Day;

public class LectorAEMET {
	private static ArrayList<Day> dayList;
	private static LectorAEMET instance;
	
	private LectorAEMET() {};
	
	
	public static LectorAEMET getInstance() {
		if (instance == null) instance = new LectorAEMET();
		else { return instance; }

		return instance;
	}
	
	public static ArrayList<Day> getArrayList(){
		return dayList;
	}
	public static  void loadDayList() throws MalformedURLException, SAXException, IOException, ParserConfigurationException, ParseException {
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse (new URL("http://www.aemet.es/xml/municipios/localidad_22125.xml").openStream());
		
		NodeList daysList = doc.getElementsByTagName("dia");
		
		for (int i = 0 ; i < daysList.getLength(); i++) {
			Element dayElement =(Element) daysList.item(i);
			//FORMATEO DE FECHA
			String dateString = daysList.item(i).getAttributes().item(0).getNodeValue(); //parte del xml que contiene la fecha
			Date date = new SimpleDateFormat("yyyy-M-d").parse(dateString);
			//// trayendo rangos:
			if (dayElement.hasChildNodes()) {
				NodeList listaRangos =  dayElement.getElementsByTagName("prob_precipitacion");
				for (int j = 0; j<listaRangos.
			}
					
			dayList.add(new Day(date));
		}
		
		
	}
	

}
