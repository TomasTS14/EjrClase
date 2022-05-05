

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;

public class CalculadoraE5 extends JFrame{
	
	private JPanel imagenPanel;
	private JPanel camposPanel;
	private JPanel operadoresPanel;
	private JPanel botonesPanel;
	
	private JPanel camposPanel1;
	private JPanel camposPanel2;
	private JPanel campoResultadoPanel;
	
	private JLabel campo1Label;
	private JLabel campo2Label;
	private JLabel resultadoLabel;
	
	private JTextField campo1TF;
	private JTextField campo2TF;
	private JTextField showResulTF;
	
	private JButton sumaBtn;
	private JButton restaBtn;
	private JButton multiplicaBtn;
	private JButton divideBtn;
	
	private JButton salidaBtn;
	private JButton infoBtn;
	
	private ImageIcon imagenCalculadora;
	private ImageIcon imagenBotonSalida;
	private ImageIcon imagenBotonInfo;
	
	private JLabel calculadoraImgLabel;
	private JLabel salidaImgBtn;
	private JLabel inforImgBtn;
	

	public CalculadoraE5() {
		super("Calculadora");
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setSize(300, 400);
		setVisible(true);
		setResizable(true);
		//imagenes usadas:
		imagenCalculadora = new ImageIcon("./src/imagenCalculadora.jpg");
		imagenBotonSalida = new ImageIcon("./src/exit.jpg");
		imagenBotonInfo = new ImageIcon("./src/user.jpeg");
		
		
		Image aux_calculadorImg = imagenCalculadora.getImage().getScaledInstance(230, 100, Image.SCALE_SMOOTH);
		imagenCalculadora = new ImageIcon(aux_calculadorImg);
		
		Image aux_salidaImg = imagenBotonSalida.getImage().getScaledInstance(50, 40, Image.SCALE_SMOOTH);
		imagenBotonSalida = new ImageIcon(aux_salidaImg);
		
		Image aux_infoImg = imagenBotonInfo.getImage().getScaledInstance(50, 40, Image.SCALE_SMOOTH);
		imagenBotonInfo = new ImageIcon(aux_infoImg);
		
		
		//inicialización de componentes
		imagenPanel = new JPanel();
		camposPanel = new JPanel();
		operadoresPanel = new JPanel();
		botonesPanel = new JPanel();
		
		camposPanel1 = new JPanel();
		camposPanel2 = new JPanel();
		campoResultadoPanel = new JPanel();

		campo1Label= new JLabel("Dato 1:");
		campo2Label = new JLabel("Dato 2:");
		resultadoLabel = new JLabel("Resultado");
		calculadoraImgLabel = new JLabel(imagenCalculadora);
		salidaImgBtn = new JLabel();
		inforImgBtn = new JLabel();
		
		showResulTF = new JTextField(10);
				showResulTF.setEditable(false);
		campo1TF = new JTextField(10);
		campo2TF = new JTextField(10);
		
		sumaBtn = new JButton("+");
		restaBtn = new JButton("-");
		multiplicaBtn = new JButton("*");
		divideBtn = new JButton("/");
		
		salidaBtn = new JButton(imagenBotonSalida);
		infoBtn = new JButton(imagenBotonInfo);
		

		
		add(imagenPanel, BorderLayout.NORTH);
		add(camposPanel, BorderLayout.CENTER);
		add(operadoresPanel, BorderLayout.EAST);
		add(botonesPanel, BorderLayout.SOUTH);
		
		//configurando la zona de campos
		camposPanel.setLayout(new GridLayout(3,2));
		camposPanel1.setLayout(new FlowLayout(FlowLayout.LEFT));
		camposPanel2.setLayout(new FlowLayout(FlowLayout.LEFT));
		campoResultadoPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		 
		imagenPanel.add(calculadoraImgLabel);
		
		camposPanel.add(camposPanel1);
			camposPanel1.add(campo1Label);
			camposPanel1.add(campo1TF);
		camposPanel.add(camposPanel2);
			camposPanel2.add(campo2Label);
			camposPanel2.add(campo2TF);
		camposPanel.add(campoResultadoPanel);
			campoResultadoPanel.add(resultadoLabel);
			campoResultadoPanel.add(showResulTF);
	
	//configurando la zona de operadores:
	
		operadoresPanel.setLayout(new GridLayout(4,1));
		operadoresPanel.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
			
			operadoresPanel.add(sumaBtn);
			operadoresPanel.add(restaBtn);
			operadoresPanel.add(divideBtn);
			operadoresPanel.add(multiplicaBtn);
			
			
			//Configurando zona de botnoes.
			
			botonesPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
				
				botonesPanel.add(salidaBtn);
				botonesPanel.add(infoBtn);
			
			//agregando actionListeners:
			
			sumaBtn.addActionListener((a) -> {
				try {
				showResulTF.setText("");
				Double val1 = Double.parseDouble(campo1TF.getText());
				Double val2 = Double.parseDouble(campo2TF.getText());
				
				showResulTF.setText(String.valueOf(val1 + val2));
				}catch(Exception e) {
					showResulTF.setText("Ha habido un error");
				}
			});
			restaBtn.addActionListener((a) -> {
				try {
				showResulTF.setText("");
				Double val1 = Double.parseDouble(campo1TF.getText());
				Double val2 = Double.parseDouble(campo2TF.getText());
				
				showResulTF.setText(String.valueOf(val1 - val2));
				}catch(Exception e) {
					showResulTF.setText("Ha habido un error");
				}
			});
			
			multiplicaBtn.addActionListener((a) -> {
				try {
				showResulTF.setText("");
				Double val1 = Double.parseDouble(campo1TF.getText());
				Double val2 = Double.parseDouble(campo2TF.getText());
				
				showResulTF.setText(String.valueOf(val1 * val2));
				}catch(Exception e) {
					showResulTF.setText("Ha habido un error");
				}
			});
			
			divideBtn.addActionListener((a) -> {
				try {
				showResulTF.setText("");
				Double val1 = Double.parseDouble(campo1TF.getText());
				Double val2 = Double.parseDouble(campo2TF.getText());
				
				showResulTF.setText(String.valueOf(val1 / val2));
				}catch(Exception e) {
					showResulTF.setText("Ha habido un error");
				}
			});
			
			//action listeners de salida e info
			salidaBtn.addActionListener((a) ->{
				dispose();
			});
			
			infoBtn.addActionListener((a) -> {
				JOptionPane.showMessageDialog(null, "App hecha por Tomas Torres");
			});
			
	}
}
