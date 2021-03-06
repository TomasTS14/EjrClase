package gui;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class MainFrame extends JFrame{

	private JPanel leftPanel;
	private JPanel rightPanel;
	
	private JButton refreshBtn;
	
	private JList<String> lista;
	
	public MainFrame() {
		super("DATOS AEMET");
		setSize(400,350);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		//setResizable(false)
		
		//initialize components
		leftPanel = new JPanel();
			leftPanel.setSize(190, 350);
		rightPanel = new JPanel();
			rightPanel.setSize(190,350);
		lista = new JList<String>();
		refreshBtn = new JButton("Actualizar");
		
		
		//layouts
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//agrego paneles
		add(leftPanel);
			leftPanel.add(refreshBtn);
		add(rightPanel);
			rightPanel.add(lista);
			
		
	}

}
