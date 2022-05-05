import java.awt.BorderLayout;
import java.awt.CheckboxGroup;
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
		
		//Layouts
		
		checkPanel.setLayout(new GridLayout(3,1));
		selectionPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		//agregando dentro de paneles
		
		checkPanel.add(opcion1Box); checkPanel.add(opcion2Box); checkPanel.add(opcion3Box);
		selectionPanel.add(new JLabel("Idiomas elegidos: "));
		add(checkPanel,BorderLayout.CENTER);
		add(selectionPanel, BorderLayout.SOUTH);
		
		//listeners de checkBoxes
		
		opcion1Box.addItemListener( new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				selectionPanel.add(new JLabel(opcion1Box.getText()));
				
			}
		});
		opcion2Box.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				selectionPanel.add(new JLabel(opcion2Box.getText()));
				
			}});
		
		opcion3Box.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				selectionPanel.add(new JLabel(opcion3Box.getText()));
				selectionPanel.repaint();
				
			}
		});
	
		
		
		
		
		
		
	}

}
