import javax.swing.JOptionPane;
public class correoExcepcion extends Exception {

	
	public correoExcepcion() {
		JOptionPane.showMessageDialog(null, "correo incorrecto", "correo", 0);// TODO Auto-generated constructor stub
	}
}
