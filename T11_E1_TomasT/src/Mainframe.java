import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class Mainframe extends JFrame{
	
	private ArrayList<food> listaFuente;
	private GestorDesayunos gestor;
	
	private JPanel listaPanel;
	private JPanel selectionPanel;
	private JPanel checkPanel;
	private JPanel dropPanel;
	
	private JList<String> contenidoList;
	
	private JCheckBox numCartaCBox;
	private JCheckBox nomCBox;
	private JCheckBox priceCBox;
	private JCheckBox descripCBox;
	private JCheckBox caloriesCBox;
	
	private JComboBox<Object> campoCombo;
	private JComboBox<Object> indiceCombo;
	public Mainframe() {
		setSize(400, 350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
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
		contenidoList = new JList<>();
		
		//checkBoxes:
		numCartaCBox = new JCheckBox("nº carta"); nomCBox = new JCheckBox("Nombre"); priceCBox = new JCheckBox("Precio");
		descripCBox = new JCheckBox("descripcion"); caloriesCBox = new JCheckBox("Calorias");
		
		//comboBoxes:
		indiceCombo = new JComboBox<>(); campoCombo = new JComboBox<>();
		
		//config layouts:
		setLayout(new BorderLayout());
		selectionPanel.setLayout(new GridLayout(2, 1));
		checkPanel.setLayout(new GridLayout(2,3));
		dropPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
		
		//Agrego opciones a los dropdown:
		campoCombo.addItem( new String[] {"nº carta","nombre", "precio","descripcion", "calorias"});
		
		Vector<Object> listaIndices = new Vector<>();
		
		for( int i = 1 ; i<= listaIndices.size(); i++) {
			listaIndices.add(i);
		}
		indiceCombo.addItem(listaIndices);
		//agrego botones a paneles:
		//panel dropDown:
		dropPanel.add(campoCombo); dropPanel.add(indiceCombo);
		//panel checkBox:
		checkPanel.add(numCartaCBox); checkPanel.add(nomCBox); checkPanel.add(priceCBox);
		checkPanel.add(descripCBox); checkPanel.add(caloriesCBox);
		
		//Agrego Paneles:
		selectionPanel.add(dropPanel); selectionPanel.add(checkPanel); 
		add(selectionPanel, BorderLayout.WEST);
		
		add(listaPanel,BorderLayout.EAST);
		
	}
	
	
}
