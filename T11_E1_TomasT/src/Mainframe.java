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

import javax.swing.BorderFactory;
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

	
	private JCheckBox nomCBox;
	private JCheckBox priceCBox;
	private JCheckBox descripCBox;
	private JCheckBox caloriesCBox;

	private JComboBox<Object> campoCombo;
	private JComboBox<Object> indiceCombo;

	public Mainframe() {
		super("Filtra desayunos");
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
		// inicializo paneles:
		listaPanel = new JPanel(); listaPanel.setSize(600, 500);
		selectionPanel = new JPanel();
		dropPanel = new JPanel(); dropPanel.setBorder(BorderFactory.createTitledBorder("Buscar individualmente"));
		checkPanel = new JPanel(); checkPanel.setBorder(BorderFactory.createTitledBorder("Filtrar todos a la vez"));

		// Area con texto..
		contenidoArea = new JTextArea(30, 60);
		contenidoArea.setEditable(false);
		// checkBoxes:
		
		nomCBox = new JCheckBox("Nombre");
		priceCBox = new JCheckBox("Precio");
		descripCBox = new JCheckBox("descripcion");
		caloriesCBox = new JCheckBox("Calorias");
		// boton para ver todo denuevo
		JButton verTodoBtn = new JButton("Ver sin filtros");

		// comboBoxes:
		indiceCombo = new JComboBox<>();
		campoCombo = new JComboBox<>();

		// config layouts:
		setLayout(new FlowLayout());
		listaPanel.setLayout(new FlowLayout());
		selectionPanel.setLayout(new GridLayout(2, 1));
		checkPanel.setLayout(new GridLayout(3, 2));
		dropPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));

		// Agrego opciones a los dropdown:
		//campoCombo.addItem("nº carta");
		campoCombo.addItem("nombre");
		campoCombo.addItem("precio");
		campoCombo.addItem("descripcion");
		campoCombo.addItem("calorias");

		//bucle para agregar indices al dropdown de indices.
		for (int i = 1; i <= listaFuente.size(); i++) {
			indiceCombo.addItem(i);
		}
		// agrego botones a paneles:
		// panel dropDown:
		dropPanel.add(campoCombo);
		dropPanel.add(indiceCombo);
		// panel checkBox:
		
		checkPanel.add(nomCBox);
		checkPanel.add(priceCBox);
		checkPanel.add(descripCBox);
		checkPanel.add(caloriesCBox);
		checkPanel.add(verTodoBtn);

		listaPanel.add(contenidoArea);

		// Agrego Paneles:
		selectionPanel.add(dropPanel);
		selectionPanel.add(checkPanel);
		add(selectionPanel);

		add(listaPanel);

		// lista Original:
		contenidoArea.append(listaFuente.toString());
		contenidoArea.setSize(600, 500);

		// actionListeners:

		verTodoBtn.addActionListener((a) -> {
			contenidoArea.setText(gestor.getArrayList().toString());
		});

		campoCombo.addActionListener((a) -> {
			int itemSelectedCampo = campoCombo.getSelectedIndex() + 1;
			int itemSelectedIndice = indiceCombo.getSelectedIndex();
			contenidoArea.setText(gestor.filtrarComidaSingular(itemSelectedIndice, itemSelectedCampo));
		});

		indiceCombo.addActionListener((a) -> {
			int itemSelectedCampo = campoCombo.getSelectedIndex() + 1;
			int itemSelectedIndice = indiceCombo.getSelectedIndex();
			contenidoArea.setText(gestor.filtrarComidaSingular(itemSelectedIndice, itemSelectedCampo));
		});

		//checkboxes filtro: 
	
		
		nomCBox.addItemListener((a) -> actualizarPorCheckboxes());
		priceCBox.addItemListener((a) -> actualizarPorCheckboxes());
		descripCBox.addItemListener((a) -> actualizarPorCheckboxes());
		caloriesCBox.addItemListener((a) -> actualizarPorCheckboxes());

	}

	private void actualizarPorCheckboxes() {

		StringBuilder strBldr = new StringBuilder();

		for (int i = 0; i < listaFuente.size(); i++) {
			
			strBldr.append("[\n");
				strBldr.append("Nº en carta: "+listaFuente.get(i).getId()+"\n");
			
			if (nomCBox.isSelected())strBldr.append(gestor.filtrarComidaSingular(i, food.NOMBRE)+ "\n");	
			if(priceCBox.isSelected()) strBldr.append(gestor.filtrarComidaSingular(i, food.PRECIO)+"\n");
			if(descripCBox.isSelected()) strBldr.append(gestor.filtrarComidaSingular(i, food.DESCRIPCION)+"\n");
			if(caloriesCBox.isSelected()) strBldr.append(gestor.filtrarComidaSingular(i, food.CALORIAS)+"\n");
			
			strBldr.append("]\n");
		}
		
		contenidoArea.setText(strBldr.toString());

	}
}
