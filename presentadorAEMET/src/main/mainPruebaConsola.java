package main;

import java.io.IOException;
import java.text.ParseException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import commons.LectorAEMET;

public class mainPruebaConsola {

	public static void main(String[] args) {
		
		try {
			LectorAEMET.getInstance().loadDayList();
		} catch (SAXException | IOException | ParserConfigurationException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
