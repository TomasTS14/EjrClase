import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.NoSuchPaddingException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RegisterFrame extends JFrame implements ActionListener{
	private JPanel nombrePanel;
	private JPanel pass1Panel;
	private JPanel pass2Panel;
	private JPanel btnPanel;
	
	private JLabel nombreLabel;
	private JLabel pass1Label;
	private JLabel pass2Label;

	private JTextField nombreTF;
	private JTextField pass1TF;
	private JTextField pass2TF;
	
	private JButton cancelarBtn;
	private JButton registrarBtn;
	

	public RegisterFrame() {
		super("Registro");
		setVisible(true);
		setSize(300,200);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new GridLayout(4,1));
		
		nombrePanel = new JPanel();
		pass1Panel = new JPanel();
		pass2Panel = new JPanel();
		btnPanel = new JPanel();
		
		nombrePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		pass1Panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		pass2Panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		btnPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		nombreLabel = new JLabel("Introduce tu nombre: ");
		pass1Label = new JLabel("Introduce contrasena: ");
		pass2Label = new JLabel("Introducela de nuevo: ");
		
		nombreTF = new JTextField(10);
		pass1TF = new JTextField(10);
		pass2TF = new JTextField(10);
		
		cancelarBtn = new JButton("cancelar");
		registrarBtn = new JButton("registrar");
		
		cancelarBtn.addActionListener(this);
		registrarBtn.addActionListener(this);
		
		add(nombrePanel);
		add(pass1Panel);
		add(pass2Panel);
		add(btnPanel);
		
		nombrePanel.add(nombreLabel);
		pass1Panel.add(pass1Label);
		pass2Panel.add(pass2Label);
		
		nombrePanel.add(nombreTF);
		pass1Panel.add(pass1TF);
		pass2Panel.add(pass2TF);
		
		btnPanel.add(cancelarBtn);
		btnPanel.add(registrarBtn);
		
	}
	public String getNombre() {
		return nombreTF.getText();
	}
	
	public String getPass1() {
		return pass1TF.getText();
	}
	public String getPass2() {
		return pass2TF.getText();
	}
	
	public boolean comparePasswords() {
		return (getPass1().equals(getPass2()));
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton btnPressed = (JButton) e.getSource();
		
		if ( btnPressed == cancelarBtn) this.dispose();
		else if ( btnPressed == registrarBtn && comparePasswords() ) {
		
			
			//encriptador.encriptarInfo(getNombre(), getPass1());
		}
	}
	

}
