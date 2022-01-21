import javax.swing.JOptionPane;

public class Persona {
	private static int numerPersonas;
	
	private String  nombre;
	private String apellidos;
	private String fechaNacimiento;
	private int edad;  //Por ahora no usada
	private String paisNacimiento;
	private String ciudadNacimiento;
	
	public Persona () {
		
	}
	
	public Persona (String nombre, String apellidos, int edad) {
		
		this.nombre= nombre;
		this.apellidos= apellidos;
		this.fechaNacimiento= FechaLugar.daFechaConsole(); //Pide la fecha en un formato d/m/a
		this.edad = edad;
		this.paisNacimiento= FechaLugar.daPaisCons(); //Solo deja cualqueira palabra con la primera letra mayus.
		this.ciudadNacimiento= FechaLugar.daCiudadCons();
	}
	//////////////////Geters////////////////
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public int getEdad() {
		return edad;
	}
	public String getPaisNacimineto() {
		return paisNacimiento;
	}
	///////////////setters//////
	public void setNombre(String nombre) {
		this.nombre= nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos= apellidos;
	}
	public void setFechaNacimiento(String dia, String mes, String anno) {
		
		if(FechaLugar.fechaValida(dia, mes, anno)){
			this.fechaNacimiento= FechaLugar.convierteFechas(dia, mes, anno);
		}
	}
	
	public void setFechaNaciWindow() {
		String fecha=FechaLugar.daFechaWindow();
		this.fechaNacimiento= fecha;
	}
	public void setPaisNacimiento(String paisNacimiento) {
		this.paisNacimiento= paisNacimiento;
		this.paisNacimiento=MyInput.UpperThenLow(paisNacimiento);
	}
	
	public void leerConsola() {
		System.out.println("Nombre:");
		nombre= MyInput.readStringConsole();
		nombre=MyInput.UpperThenLow(nombre);
		System.out.println("Apellidos:");
		apellidos = MyInput.readStringConsole();
		
		fechaNacimiento= FechaLugar.daFechaConsole();
		System.out.println("País nacimiento:");
		paisNacimiento = MyInput.readStringConsole();
		paisNacimiento = MyInput.UpperThenLow(paisNacimiento);
		
	}
	//FIXME no usar por ahora.
	public void leerWindow() {
		String mensajeNombre= "Introduce el nombre de la persona:";
		String mensajeApellidos= "Introduce el apellido de la persona:";
		
		FechaLugar.mensajeDia("Introduce el dia");
		FechaLugar.mensajeMes("Introduce el mes");
		FechaLugar.mensajeAnno("Introduce el año");
		
		FechaLugar.mensajePais("Introduce el país");
		
				
		nombre = MyInput.readStringWindow(mensajeNombre);
		MyInput.UpperThenLow(nombre);
		apellidos = MyInput.readStringWindow(mensajeApellidos);
		JOptionPane.showMessageDialog(null, "Ahora fecha de nacimiento-->");
		fechaNacimiento = FechaLugar.daFechaWindow();
		paisNacimiento= FechaLugar.daPaisConWindow();
	}
	
	@Override
	
	public String toString() {
		
		String persona = "Nombre: \t\t"+this.nombre+"\n"+
						"Apellidos:\t\t"+this.apellidos+"\n"+
						"Fecha de nacimiento: \t"+	this.fechaNacimiento+"\n"
						+ "País de nacimiento:\t"+this.paisNacimiento+"\n";
		
		return persona;
	}
	
	

}
