
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculadoraPlusMinus extends JFrame implements ActionListener {
	private BorderLayout layout1;
	private JPanel panelPadreWest;
	private JPanel panelIzquierda;
	private JPanel panelDerecha;
	private JPanel panelResultado;
	private JLabel val1;
	private JLabel val2;
	private JTextField val1TF;
	private JTextField val2TF;

	private JButton minusBtn;
	private JButton plusBtn;
	private JLabel resultadoLabel;

	public CalculadoraPlusMinus() {
		super("Calculadora restas y sumas");
		setVisible(true);
		setSize(400, 200);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		layout1 = new BorderLayout();
		layout1.setHgap(10);
		setLayout(layout1);
		GridLayout gL = new GridLayout(2, 1);
		gL.setVgap(20);

		panelPadreWest = new JPanel();
		panelIzquierda = new JPanel(gL);
		panelDerecha = new JPanel(gL);
		panelResultado = new JPanel(new FlowLayout(FlowLayout.CENTER));

		val1 = new JLabel("num1:");
		val2 = new JLabel("num2:");
		resultadoLabel = new JLabel();

		val1TF = new JTextField(10);
		val2TF = new JTextField(10);

		minusBtn = new JButton("-");
		plusBtn = new JButton("+");

		minusBtn.addActionListener(this);
		plusBtn.addActionListener(this);

		this.add(panelPadreWest, BorderLayout.WEST);
		this.add(panelResultado, BorderLayout.SOUTH);
		panelPadreWest.add(panelIzquierda);
		panelPadreWest.add(panelDerecha);

		panelIzquierda.add(val1);
		panelIzquierda.add(val2);

		panelDerecha.add(val1TF);
		panelDerecha.add(val2TF);

		panelResultado.add(minusBtn);
		panelResultado.add(plusBtn);
		panelResultado.add(minusBtn);
		panelResultado.add(resultadoLabel);

	}

	@Override
	public void actionPerformed(ActionEvent event) {
		
		try {
			
		double val1 = Double.parseDouble(val1TF.getText()) ;
		double val2 = Double.parseDouble(val2TF.getText()) ;
		JButton usedBtn = (JButton)event.getSource();
		
		if (usedBtn == minusBtn) {
			resultadoLabel.setText(Double.toString(val1-val2));
		}else if (usedBtn == plusBtn) {
			resultadoLabel.setText(Double.toString(val1+val2));
		}
		}catch(NumberFormatException nFe) {
			resultadoLabel.setText("problema leyendo tus numeros, vuelve a hacerlo");
		}catch(Exception e) {

			JOptionPane.showMessageDialog(null, null, "error", JOptionPane.ERROR_MESSAGE);
		}
		
	}

}
