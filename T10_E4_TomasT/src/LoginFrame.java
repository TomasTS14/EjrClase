
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.HashMap;

import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {
	private JPanel nombrePanel;
	private JPanel pass1Panel;
	private JPanel btnPanel;

	private JLabel nombreLabel;
	private JLabel pass1Label;

	private JTextField nombreTF;
	private JPasswordField pass1TF;

	private JButton cancelarBtn;
	private JButton loginBtn;

	private HashMap<String, char[]> loginHashMap;
	private String storedLoginsLocation = MainFrame.storedLoginsLocation;

	public LoginFrame() {
		super("Login");
		setVisible(true);
		setSize(300, 200);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new GridLayout(3, 1));

		nombrePanel = new JPanel();
		pass1Panel = new JPanel();
		btnPanel = new JPanel();

		nombrePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		pass1Panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		btnPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

		nombreLabel = new JLabel("Introduce tu nombre: ");
		pass1Label = new JLabel("Introduce contrasena: ");

		nombreTF = new JTextField(10);
		pass1TF = new JPasswordField(10);

		cancelarBtn = new JButton("cancelar");
		loginBtn = new JButton("iniciar sesion");

		add(nombrePanel);
		add(pass1Panel);
		add(btnPanel);

		nombrePanel.add(nombreLabel);
		pass1Panel.add(pass1Label);

		nombrePanel.add(nombreTF);
		pass1Panel.add(pass1TF);

		btnPanel.add(cancelarBtn);
		btnPanel.add(loginBtn);

		loginBtn.addActionListener((ae) -> {
			if(comprobarUsuarioPassword()) {
				JOptionPane.showMessageDialog(null, "logueado con exito!!");
			}else {
				JOptionPane.showMessageDialog(null, "Datos incorrectos");
			}
		});

		cancelarBtn.addActionListener((ae) -> {
			dispose();
		});
	}

	public boolean comprobarUsuarioPassword() {
		loginHashMap = (HashMap<String, char[]>) EscritorYrecuperadorConCondiciones
				.recuperarHashMap(storedLoginsLocation);

		char[] passwordTemp = loginHashMap.get(nombreTF.getText());

		if (passwordTemp != null && Arrays.equals(passwordTemp, pass1TF.getPassword())) {
			return true;

		}
		return false;
	}
}
