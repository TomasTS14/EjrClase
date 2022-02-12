
public class Libro {
	
	private String titulo;
	private String edicion;
	private Autor autor;
	private String ISBN;
	private String fechaPubli;	
	private String lugarPubli;
	private int paginas;
	
	
	public  Libro() {
		
	}

	public Libro   (String titulo, String edicion, Autor autor, String ISBN,String lugar, String fecha, int paginas) {
	
		this.titulo= titulo;
		this.edicion= edicion;
		this.autor= autor;
		this.ISBN = ISBN;

		this.fechaPubli = FechaLugar.daFechaConsole();
		this.lugarPubli= lugar;
		MyInput.UpperThenLow(lugarPubli);
		this.paginas= paginas;
	}
	public String getTitulo() {
		
		
		return this.titulo;
	}
	public String getEdicion() {
		return this.edicion;
	}
	public String getAutor() {
		return autor.getApellidos()+", "+autor.getNombre();
	}
	public String getCodigo() {
		return ISBN;
	}
	public String getLugarPublic() {
		return lugarPubli;
	}
	public String getFecha() {
		return fechaPubli;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setTitulo(String titulo) {
		this.titulo= titulo;
	}
	public void setEdicion(String edicion) {
		this.edicion=edicion;
	}
	public void setAutor(Autor autor) {
	this.autor= autor;
		
	}
	public void setCodigo (String ISBN) {
		this.ISBN= ISBN;
	}
	public void setLugarPubli (String ciudad, String estado, String pais) {
		ciudad=MyInput.UpperThenLow(ciudad); //convierte "cosa" en "Cosa"
		estado=MyInput.UpperThenLow(estado);
		pais=MyInput.UpperThenLow(pais);
		lugarPubli=ciudad+", "+estado+" ("+pais+")";
	}
	public void setfechaPublicacion(String dia, String mes, String anno) {
		fechaPubli=FechaLugar.convierteFechas(dia, mes, anno);
		
	}
	public void setPaginas(int numero) {
		paginas= numero;
	}
	
	public void leerConsola() {
		System.out.println("Titulo:");
		titulo= MyInput.readStringConsole();
		MyInput.UpperThenLow(this.titulo);
		System.out.println("Edicion con nº:");
		edicion = MyInput.readStringConsole();
		System.out.println("ISBN:");
		setCodigo(MyInput.readStringConsole());
		System.out.println("Fecha de publicacion:");
		fechaPubli= FechaLugar.daFechaConsole();
		System.out.println("Ciudad, Estado, Pais separados por enter:");
		String ciudad=MyInput.readStringConsole();
		String estado=MyInput.readStringConsole();
		String pais=MyInput.readStringConsole();
		setLugarPubli(ciudad, estado, pais);
		System.out.println("Nº de paginas:");
		setPaginas(MyInput.readIntConsole());
	}
	
//	public Libro leerWindow() {
//		Libro libro= new Libro();
//		Autor autorAux= new Autor();
//		
//		libro.autor= autorAux;
//		
//		FechaLugar.mensajeDia("dia:");
//		FechaLugar.mensajeMes("mes:");
//		FechaLugar.mensajeAnno("año:");
//		FechaLugar.mensajeCiudad("Que ciudad:");
//		FechaLugar.mensajePais("Que pais:");
//		libro.titulo= MyInput.readStringWindow("Titulo:");
//		libro.edicion= MyInput.readStringWindow("Edicion:");
//		autorAux.setNombre(MyInput.readStringWindow("Nombre autor:"));
//		autorAux.setApellidos(MyInput.readStringWindow("Apellido del autor:"));
//		libro.ISBN=MyInput.readStringWindow("ISBN:");
//		libro.fechaPubli= FechaLugar.daFechaWindow();
//		libro.lugarPubli= FechaLugar.daCiudadConWindow() +", "+ FechaLugar.daPaisConWindow();
//		
//		return libro;
//	}
	
	@Override
	
	public String toString() {
		
		return "Titulo:\t\t"+titulo+
				"\nEdicion:\t"+edicion+
				"\nAutor:\t\t"+this.getAutor()+
				"\nISBN:\t\t"+ISBN+
				"\n"+lugarPubli+","+" "+fechaPubli+
				"\nPaginas:\t"+paginas;
	}
}
