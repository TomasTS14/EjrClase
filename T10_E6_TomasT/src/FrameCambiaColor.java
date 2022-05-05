import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameCambiaColor extends JFrame {
	
	private JPanel valuePanel;
	private JPanel labelPanel;
	
	private Vector<Integer> rangoValores ;
	
	private JComboBox<Integer> colorBox1;
	private JComboBox<Integer> colorBox2;
	private JComboBox<Integer> colorBox3;
	
	private JButton resultBtn;

	public FrameCambiaColor() {
		//config inicial
		setSize(300, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		//Inicializando componentes
		rangoValores = new Vector<>();
		//relleno valores:
			for (int i =0; i<=255; i++) {
				rangoValores.add(i);
			};
				
		valuePanel = new JPanel();
		labelPanel = new JPanel();
		colorBox1 = new JComboBox<Integer>(rangoValores);
		colorBox2 = new JComboBox<Integer>(rangoValores);
		colorBox3 = new JComboBox<Integer>(rangoValores);
		resultBtn = new JButton("Resultado");

		//pocisiones
		
		GridLayout gridLayout = new GridLayout(4, 1);
		
		gridLayout.setVgap(20);
		labelPanel.setOpaque(false);
		labelPanel.setLayout(gridLayout);
			labelPanel.add(new JLabel("Rojo: "));
			labelPanel.add(new JLabel("Verde: "));
			labelPanel.add(new JLabel("Azul: "));
		this.add(labelPanel);
			
		valuePanel.setOpaque(false);
		valuePanel.setLayout(gridLayout);
			valuePanel.add(colorBox1);
			valuePanel.add(colorBox2);
			valuePanel.add(colorBox3);
			valuePanel.add(resultBtn);
		this.add(valuePanel);
		
		//Event listener resultado:
		resultBtn.addActionListener((a)-> {
			
			Color colorNuevo = new Color(colorBox1.getSelectedIndex(), colorBox2.getSelectedIndex(), colorBox3.getSelectedIndex());
			System.out.println("hey");
			this.getContentPane().setBackground(colorNuevo);
			
		});
		

			
	}
	
}
