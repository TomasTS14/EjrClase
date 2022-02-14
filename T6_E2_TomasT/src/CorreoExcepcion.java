import javax.swing.JOptionPane;
public class CorreoExcepcion extends Exception {

	private String correo;


	public CorreoExcepcion(String correo) {
	super("No sirve ese correo");
	this.correo = correo;

	}

	public String getCorreo(){
		return this.correo;
	}
}
