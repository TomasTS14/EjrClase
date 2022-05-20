package gui;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import commons.GestorXMLCDs;
import entities.CD;

import javax.swing.ImageIcon;;

public class MainFrame extends JFrame{

	private JMenuBar menuBar;
	
	private JMenu datos;
	private JMenu musicoteca;
	
	//DE MENU DATOS:
	private JMenuItem importarXML;
	private JMenuItem cargar;
	private JMenuItem guardar;
	private JMenuItem exportarCSV;
	
	//DE MENU MUSICOTECA
	private JMenuItem verColeccion;
	
	
	//IMAGEN PRESENTACION 
	private ImageIcon imagen;
	
	public MainFrame() {
		super("Bienvenido a la Musicoteca");
		setSize(420, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		//MENUBAR
		menuBar = new JMenuBar();
		//MENUS
		datos = new JMenu("Datos");
		musicoteca = new JMenu("Musicoteca");
		
		//menu1
		importarXML = new JMenuItem("importar XML");
		cargar = new JMenuItem("Cargar");
		guardar = new JMenuItem("guardar");
		exportarCSV = new JMenuItem("exportar a CSV");
		
		
		//menu2
		verColeccion = new JMenuItem("Ver coleccion");
		
		//Imagen:
		imagen = new ImageIcon("./src/gui/cds.png");
		
		setJMenuBar(menuBar);
			menuBar.add(datos);
				datos.add(importarXML);
				datos.add(cargar);
				datos.add(guardar);
				datos.add(exportarCSV);
			menuBar.add(musicoteca);
				musicoteca.add(verColeccion);
		JLabel imagenLabel = new JLabel(imagen);
		add(imagenLabel, BorderLayout.CENTER);
		
		//ACTION LISTENERS::::::::::::::::::::::::::::::::::::::::::
		importarXML.addActionListener((a)->{
			
			try {
				 GestorXMLCDs.getInstance().cargarArrayList("./src/files/cd_catalog.xml");
			} catch (SAXException | IOException | ParserConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		});
		
		cargar.addActionListener((a)->{
			
			if (new File("./src/files/coleccion.dat").exists()) {
				
				try {
				FileInputStream fileInStrm = new FileInputStream(new File("./src/files/coleccion.dat"));
				ObjectInputStream objInStrm = new ObjectInputStream(fileInStrm);
				GestorXMLCDs.cargarArrayListOVERWRITE((ArrayList<CD>)objInStrm.readObject());
				
				fileInStrm.close();
				objInStrm.close();
				
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		});
		
		guardar.addActionListener((a)->{
			
		try {	File fileNuevo = new File("./src/files/coleccion.dat");
			FileOutputStream fileOutStrm = new FileOutputStream(fileNuevo);
			ObjectOutputStream objOutStrm = new ObjectOutputStream(fileOutStrm);
			
			objOutStrm.writeObject(GestorXMLCDs.getColeccionCDs());
			
			fileOutStrm.close();
			objOutStrm.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		});
		
		exportarCSV.addActionListener((a)->{
			
			try{
				GestorXMLCDs.exportar_a_CSV();
			}catch(Exception e) {
				e.printStackTrace();
			}
		});
		
		verColeccion.addActionListener((a)->{
			try{
				new coleccionFrame();
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null,"carga o el xml o el archivo local para poder mostrarte la coleccion");
			}
		});
		
		
		setVisible(true);
	}
	
	
}
