import java.awt.BorderLayout;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IdiomasFrame extends JFrame{
	
	private JPanel checkPanel;
	private JPanel selectionPanel;
	
	private JCheckBox opcion1Box;
	private JCheckBox opcion2Box;
	private JCheckBox opcion3Box;
	
	private JLabel idioma1Label;
	private JLabel idioma2Label;
	private JLabel idioma3Label;
	
	
	public IdiomasFrame() {
		super("Seleccion Idiomas");
		setSize(350, 400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		//inicializo:
		checkPanel = new JPanel();
		selectionPanel = new JPanel();
		
		opcion1Box = new JCheckBox("Ingles");
		opcion2Box = new JCheckBox("Frances");
		opcion3Box = new JCheckBox("Aleman");
		
		idioma1Label = new JLabel();
		idioma2Label = new JLabel();
		idioma3Label = new JLabel();
		
		idioma1Label.setForeground(Color.blue);
		idioma2Label.setForeground(Color.blue);
		idioma3Label.setForeground(Color.blue);
		
		//Layouts
		
		checkPanel.setLayout(new GridLayout(3,1));
		selectionPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		//agregando dentro de paneles
		
		checkPanel.add(opcion1Box); checkPanel.add(opcion2Box); checkPanel.add(opcion3Box);
		selectionPanel.add(new JLabel("Idiomas elegidos: "));
		selectionPanel.add(idioma1Label);
		selectionPanel.add(idioma2Label);
		selectionPanel.add(idioma3Label);
		
		add(checkPanel,BorderLayout.CENTER);
		add(selectionPanel, BorderLayout.SOUTH);
		
		//listeners de checkBoxes
		
		opcion1Box.addItemListener( new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(opcion1Box.isSelected()) {
					idioma1Label.setText("Ingles");
				}else {
					idioma1Label.setText("");
				}
				
			}
		});
		opcion2Box.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(opcion2Box.isSelected()) {
					idioma2Label.setText("Frances");
				}else {
					idioma2Label.setText("");
				}
			}});
		
		opcion3Box.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(opcion3Box.isSelected()) {
					idioma3Label.setText("Aleman");
				}else {
					idioma3Label.setText("");
				}
				
			}
		});
	
		
		
		
		
		
		
	}

}
