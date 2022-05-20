package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import commons.GestorXMLCDs;
import entities.*;
public class coleccionFrame extends JFrame{

	
	private  JList<CD> listaCDs;
	
	private JPanel panelBotones;
	private JButton botonAdd;
	private JButton botonEditar;
	
	public coleccionFrame() {
		super("Coleccion CDs");
		setSize(600, 550);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		//JLIST
		listaCDs = new JList(GestorXMLCDs.getColeccionCDs().toArray()); 
		JScrollPane listPane = new JScrollPane(listaCDs);
		//PANEL BOTONES:
		panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER));
		botonEditar = new JButton("Editar");
		botonAdd = new JButton("Añadir");
			panelBotones.add(botonEditar);
			panelBotones.add(botonAdd);
		
		add(listPane,BorderLayout.CENTER);
		add(panelBotones, BorderLayout.SOUTH);
		setVisible(true);
		
		
		botonAdd.addActionListener((a)->{
			new AnadirFrame();
			dispose();
		});
		
		botonEditar.addActionListener((a)->{
			new EditarFrame(listaCDs.getSelectedValue());
			dispose();
		});
	}
	

}
