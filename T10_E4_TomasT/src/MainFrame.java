import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame implements ActionListener {
	private JButton registerBtn;
	private JButton loginBtn;
	
	public MainFrame() {
		setVisible(true);
		setSize(300,200);
		setResizable(false);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		registerBtn = new JButton("Registrarse");
		loginBtn = new JButton("Iniciar sesion");
		add(registerBtn);
		add(loginBtn);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		 JButton pressedBtn = (JButton) e.getSource();
		 if (pressedBtn == registerBtn) new RegisterFrame();
		 else if (pressedBtn == loginBtn) new LoginFrame();
		
	}

}
