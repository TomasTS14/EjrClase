import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Mainframe extends JFrame {
	
	private ArrayList<food> listaFuente;
	private GestorDesayunos gestor;
	
	private JPanel listaPanel;
	private JPanel selectionPanel;
	private JPanel checkPanel;
	private JPanel dropPanel;
	
	private JTextArea contenidoArea;
	
	private JCheckBox numCartaCBox;
	private JCheckBox nomCBox;
	private JCheckBox priceCBox;
	private JCheckBox descripCBox;
	private JCheckBox caloriesCBox;
	
	private JComboBox<Object> campoCombo;
	private JComboBox<Object> indiceCombo;
	public Mainframe() {
		setSize(950, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
		// listaFuente
		LectorDesayunos lector = new LectorDesayunos("./src/desayunos.xml");
		 gestor = GestorDesayunos.getInstance();
		 gestor.setArrayList(lector.getArrayDesayunos());
		listaFuente = gestor.getArrayList();
		//inicializo paneles:
		listaPanel = new JPanel(); 
		selectionPanel= new JPanel(); dropPanel = new JPanel(); checkPanel = new JPanel();
		
		//lista..
		contenidoArea = new JTextArea(30,60 );
		contenidoArea.setEditable(false);
		//checkBoxes:
		numCartaCBox = new JCheckBox("nº carta"); nomCBox = new JCheckBox("Nombre"); priceCBox = new JCheckBox("Precio");
		descripCBox = new JCheckBox("descripcion"); caloriesCBox = new JCheckBox("Calorias");
		//boton
		JButton verTodoBtn = new JButton("Ver Todo");
		
		//comboBoxes:
		indiceCombo = new JComboBox<>(); campoCombo = new JComboBox<>();
		
		//config layouts:
		setLayout(new FlowLayout());
		listaPanel.setLayout(new FlowLayout());
		listaPanel.setSize(600, 500);
		selectionPanel.setLayout(new GridLayout(2, 1));
		checkPanel.setLayout(new GridLayout(3,2));
		dropPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
		
		//Agrego opciones a los dropdown:
		campoCombo.addItem("nº carta");
		campoCombo.addItem("nombre");
		campoCombo.addItem("precio");
		campoCombo.addItem("descripcion");
		campoCombo.addItem("calorias");
		
		for( int i = 1 ; i <= listaFuente.size(); i++) {
			indiceCombo.addItem(i);
		}
		//agrego botones a paneles:
		//panel dropDown:
		dropPanel.add(campoCombo); dropPanel.add(indiceCombo);
		//panel checkBox:
		checkPanel.add(numCartaCBox); checkPanel.add(nomCBox); checkPanel.add(priceCBox);
		checkPanel.add(descripCBox); checkPanel.add(caloriesCBox); checkPanel.add(verTodoBtn);
		
		listaPanel.add(contenidoArea);
		
		
		
		//Agrego Paneles:
		selectionPanel.add(dropPanel); selectionPanel.add(checkPanel); 
		add(selectionPanel);
		
		add(listaPanel);
		
		
		
		//lista Original:
		contenidoArea.append(listaFuente.toString());
		contenidoArea.setSize(600,500);
		
		//actionListeners:
		
		verTodoBtn.addActionListener((a)->{
			contenidoArea.setText(gestor.getArrayList().toString());
		});
		
		campoCombo.addActionListener((a)->{
			int itemSelectedCampo = campoCombo.getSelectedIndex()+1;
			int itemSelectedIndice = indiceCombo.getSelectedIndex();
		contenidoArea.setText(gestor.filtrarComidaSingular(itemSelectedIndice, itemSelectedCampo));
		});
		
		indiceCombo.addActionListener((a)->{
			int itemSelectedCampo = campoCombo.getSelectedIndex()+1;
			int itemSelectedIndice = indiceCombo.getSelectedIndex();
		contenidoArea.setText(gestor.filtrarComidaSingular(itemSelectedIndice, itemSelectedCampo));
		});
		
		numCartaCBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		nomCBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		//
		
		
		
		
	}

	
	
}
