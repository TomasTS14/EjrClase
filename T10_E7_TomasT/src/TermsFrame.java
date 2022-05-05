import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TermsFrame extends JFrame{
	
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	
	private final String  frase= "He leido el documento y estoy de acuerdo con las condiciones";
	private JLabel fraseLabel;
	private JCheckBox aceptarCheckBox;
	private JButton continuarBtn;
	
	public TermsFrame() {
		setSize(400, 150);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		this.setLayout(new GridLayout(3,1));
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		
		fraseLabel = new JLabel(frase);
		
		aceptarCheckBox = new JCheckBox("Aceptar");
		
		continuarBtn = new JButton("Continuar");
			continuarBtn.setEnabled(false);
		
		panel1.setLayout(new FlowLayout());
		panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel3.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		this.add(panel1); this.add(panel2); this.add(panel3);
		
		panel1.add(fraseLabel);
		panel2.add(aceptarCheckBox);
		panel3.add(continuarBtn);
		
		//actionListenerCheckBox
		
		aceptarCheckBox.addChangeListener( (a) -> {
			
			if (aceptarCheckBox.isSelected()) {
				continuarBtn.setEnabled(true);
			}else {
				continuarBtn.setEnabled(false);
			}
		});

		
		
	}
	

}
