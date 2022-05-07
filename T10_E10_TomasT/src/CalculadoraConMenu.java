import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class CalculadoraConMenu extends JFrame{

	private JMenuBar menuBar;
	
	private JMenu menu1Operaciones;
	private JMenu menu2App;
	
	private JMenuItem item1Suma;
	private JMenuItem item2Resta;
	private JMenuItem item3Multiplica;
	private JMenuItem item4Dividir;
	
	private JMenuItem item1Salir;
	private JMenuItem item2About;
	
	private JLabel imagenLabel;
	
	private ImageIcon imagenCalc;
	
	private JPanel panelCampos;
	private JPanel panelCampos1;
	private JPanel panelCampos2;
	private JPanel panelResult;
	
	private JLabel operando1Label;
	private JLabel operando2Label;
	private JLabel resultLabel;
	private JLabel showResultLabel;
	
	private JTextField operando1TF;
	private JTextField operando2TF;
	
	
	public CalculadoraConMenu() {
		super("Calculadora con menu");
		setResizable(false);
		setLocationRelativeTo(null);
		setSize(300,400);
		setVisible(true);
		
		//inicializo:
		menuBar = new JMenuBar();
			menu1Operaciones = new JMenu("Operaciones");
			menu2App = new JMenu("Aplicacion");
			
		//opciones del menu1:
				item1Suma = new JMenuItem("Suma");
				item2Resta = new JMenuItem("Resta");
				item3Multiplica = new JMenuItem("Multiplicar");
				item4Dividir = new JMenuItem("Dividir");
				
		//Opciones del menu2:
				item1Salir = new JMenuItem("Salir");
				item2About = new JMenuItem("About");
		
		//inicializo imagen NORTH:
		imagenCalc = new ImageIcon(CalculadoraConMenu.class.getResource("./imagenCalculadora.jpg"));
		Image imagen_AUX = imagenCalc.getImage().getScaledInstance(300, 100, Image.SCALE_SMOOTH);
		imagenCalc =new ImageIcon(imagen_AUX);
		imagenLabel = new JLabel(imagenCalc); //<----usare esta
		
		//inicializo panel de campos y un panel interno por cada label+text:
		panelCampos = new JPanel();
			panelCampos1 = new JPanel();
				operando1Label = new JLabel("Dato 1"); operando1TF = new JTextField(10);
			panelCampos2 = new JPanel();
				operando2Label = new JLabel("Dato 2"); operando2TF = new JTextField(10);
			panelResult = new JPanel();
				resultLabel = new JLabel("Resultado"); showResultLabel = new JLabel(); 
			
				//Layouts de cada Panel:
				panelCampos.setLayout(new GridLayout(3,1));
				panelCampos1.setLayout(new FlowLayout());
				panelCampos2.setLayout(new FlowLayout());
				panelResult.setLayout(new FlowLayout());
				
		//construyo la menuBar:
			menu1Operaciones.add(item1Suma); menu1Operaciones.add(item2Resta); menu1Operaciones.add(item3Multiplica); menu1Operaciones.add(item4Dividir);
			menu2App.add(item1Salir); menu2App.add(item2About);
			menuBar.add(menu1Operaciones); menuBar.add(menu2App);
			//la agrego al frame:
			this.add(menuBar, BorderLayout.NORTH);
			
		//Construyo los paneles:
			panelCampos1.add(operando1Label); panelCampos1.add(operando1TF);
			panelCampos2.add(operando2Label); panelCampos2.add(operando2TF);
			panelResult.add(resultLabel); panelResult.add(showResultLabel);
			panelCampos.add(panelCampos1); panelCampos.add(panelCampos2); panelCampos.add(panelResult);
			panelCampos.setSize(300, 300);
			this.add(panelCampos, BorderLayout.SOUTH);
			
				
		//agrego imagen:
			this.add(imagenLabel);
			
			
		//agrego actionListeners:
			item1Suma.addActionListener((a) -> {
				Double resultado = (Double.parseDouble(operando1TF.getText())+Double.parseDouble(operando2TF.getText()));
				showResultLabel.setText(resultado.toString());
			});
			
			item2Resta.addActionListener((a) -> {
				Double resultado = (Double.parseDouble(operando1TF.getText()) - Double.parseDouble(operando2TF.getText()));
				showResultLabel.setText(resultado.toString());
			});
			
			item3Multiplica.addActionListener((a)->{
				Double resultado = (Double.parseDouble(operando1TF.getText())*Double.parseDouble(operando2TF.getText()));
				showResultLabel.setText(resultado.toString());
			});
			item4Dividir.addActionListener((a)->{
				Double resultado = (Double.parseDouble(operando1TF.getText())/Double.parseDouble(operando2TF.getText()));
				showResultLabel.setText(resultado.toString());
			});
			
			//action listeners del menu2:
			item1Salir.addActionListener((a)->{
				this.dispose();
			});
			item2About.addActionListener((a)->{
				JOptionPane.showMessageDialog(null, "Calculadora hecha por Tomas");
			});
		
		
	}
}
