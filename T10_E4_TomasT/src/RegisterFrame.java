import java.util.Arrays;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.HashMap;

import javax.crypto.NoSuchPaddingException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
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
	private JPasswordField pass1TF;
	private JPasswordField pass2TF;
	
	private JButton cancelarBtn;
	private JButton registrarBtn;
	
 private HashMap<String, char[]> myLoginsHashMap;
 private  String storedLoginsLocation;

	public RegisterFrame() {
		
		super("Registro");
		storedLoginsLocation = MainFrame.storedLoginsLocation;
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
		pass1TF = new JPasswordField(10);
		pass2TF = new JPasswordField(10);
		
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
	
	public char[] getPass1() {
		return pass1TF.getPassword();
	}
	public char[] getPass2() {
		return pass2TF.getPassword();
	}
	
	public boolean comparePasswords() {
		return (Arrays.equals(getPass2(), getPass1()));
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton btnPressed = (JButton) e.getSource();
		
		if ( btnPressed == cancelarBtn) this.dispose();
		else if ( btnPressed == registrarBtn && comparePasswords() ) {
			if (new File(storedLoginsLocation).exists()) {
				
				myLoginsHashMap =(HashMap<String, char[]>)  EscritorYrecuperadorConCondiciones.recuperarHashMap(storedLoginsLocation);
				myLoginsHashMap.put(getNombre(), getPass2());
				EscritorYrecuperadorConCondiciones.crearYescribirEnHashMap(storedLoginsLocation, myLoginsHashMap);
				
				
			}else {
				
				myLoginsHashMap = new HashMap<>();
				myLoginsHashMap.put(getNombre(), getPass2());
				EscritorYrecuperadorConCondiciones.crearYescribirEnHashMap(storedLoginsLocation, myLoginsHashMap);

			}
			this.dispose();
		}
	}
	

}
