import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculadoraAreaTriangulo extends JFrame implements ActionListener {
	
	//Agrego todo lo que usará la clase
	private JPanel datosPanel;
	private Container botonContainer;

	private JLabel areaCalculadaLabel;
	private JButton areaBtn;

	private JLabel baseLabel;
	private JLabel alturaLabel;
	private JTextField baseTF;
	private JTextField alturaTF;

	public CalculadoraAreaTriangulo() {
		super("Area de un triangulo");

		datosPanel = new JPanel(new GridLayout(2, 2, 5, 40)); //Uso este constructor para que haya espacio entre los textField a pesar de usar GridLayout
		botonContainer = new Container(); //Aqui amontonare en horizontal boton y resultado

		datosPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); //Lo utilizo para no tocar los bordes del frame.
		botonContainer.setLayout(new FlowLayout(FlowLayout.LEFT));

		areaBtn = new JButton("Area");
		areaBtn.addActionListener(this); //Esta escuchando eventos que ocurran en el objeto padre (creo)
		areaCalculadaLabel = new JLabel();

		baseTF = new JTextField();
		alturaTF = new JTextField();

		baseLabel = new JLabel("base");
		alturaLabel = new JLabel("altura");

		this.add(datosPanel, BorderLayout.WEST);
		this.add(botonContainer, BorderLayout.SOUTH);

		datosPanel.add(alturaLabel);
		datosPanel.add(alturaTF);

		datosPanel.add(baseLabel);
		datosPanel.add(baseTF);

		botonContainer.add(areaBtn);
		botonContainer.add(areaCalculadaLabel);

		this.setSize(300, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		try { //Lo meto todo en un try catch para poder usar el label de resultado como aviso en caso de que salte una excepcion por valores incompatibles con el parseo a double 
		double altura= Double.parseDouble(alturaTF.getText());
		double base = Double.parseDouble(baseTF.getText());
		
		double area = (base * altura)/2;
		
		areaCalculadaLabel.setText( Double.toString(area));
		}catch(NumberFormatException NFE) {
			areaCalculadaLabel.setText("Valores incorrectos");
		}
	}

}
