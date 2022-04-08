import java.io.Serializable;

/*
 * Crea una aplicación que almacene como objetos en un 
 * fichero ventas.dat los datos básicos de los clientes 
 * como son el nombre completo (String), teléfono (String), 
 * dirección, (String), nif (String) y moroso (boolean). 
 * La aplicación debe tener en cuenta los métodos:

    Introducir en el fichero anterior los datos de los clientes 
    que se pedirán por teclado y se irán añadiendo al fichero.
    Visualizar los datos del fichero.
 */
public class Cliente implements Serializable {
	
	private String nombre;
	private String telefono;
	private String direccion;
	private String nif;
	private boolean moroso;
	
	public Cliente() {
		
	}
	
	public Cliente(String nombre, String telefono, String direccion, String nif, boolean moroso) {
		
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.nif = nif;
		this.moroso = moroso;
		
	}

	public String getNombre() {
		return nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getNif() {
		return nif;
	}

	public boolean isMoroso() {
		return moroso;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public void setMoroso(boolean moroso) {
		this.moroso = moroso;
	}
	
	@Override
	
	public String toString() {
		
		return String.format("[NOMBRE : %s || TELEFONO: %s || DIRECCION: %s || NIF: %s || MOROSO: %s ]", nombre, telefono, direccion, nif, moroso);
	}

}
