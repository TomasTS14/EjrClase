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
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		registerBtn = new JButton("Registrarse");
		loginBtn = new JButton("Iniciar sesion");
		add(registerBtn);
		add(loginBtn);
		registerBtn.addActionListener(this);
		loginBtn.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		 JButton pressedBtn = (JButton) e.getSource();
		 if (pressedBtn == registerBtn) {
			 new RegisterFrame();
			System.out.println( e.getSource());
		 }
		 else if (pressedBtn == loginBtn) new LoginFrame();
		
	}

}
