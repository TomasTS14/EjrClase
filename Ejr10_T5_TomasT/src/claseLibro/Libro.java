package claseLibro;

public class Libro implements Comparable<Libro> {

	private String titulo;
	private String edicion;
	private Autor autor;
	private String ISBN;
	private String fechaPubli;
	private String lugarPubli;
	private int paginas;

	public Libro() {

	}

	public Libro(String titulo, String edicion, Autor autor, String ISBN, String lugar, String fecha, int paginas) {

		this.titulo = titulo;
		this.edicion = edicion;
		this.autor = autor;
		this.ISBN = ISBN;

		this.fechaPubli = FechaLugar.daFechaConsole();
		this.lugarPubli = lugar;
		MyInput.UpperThenLow(lugarPubli);
		this.paginas = paginas;
	}

	public int compareTo(Libro l2){
		
		return(this.getTitulo().compareToIgnoreCase(l2.getTitulo()));
	}

	public String getTitulo() {

		return this.titulo;
	}

	public String getEdicion() {
		return this.edicion;
	}

	public String getAutor() {
		return autor.getApellidos() + ", " + autor.getNombre();
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
		this.titulo = titulo;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;

	}

	public void setCodigo(String ISBN) {
		this.ISBN = ISBN;
	}

	public void setLugarPubli(String ciudad, String estado, String pais) {
		ciudad = MyInput.UpperThenLow(ciudad); // convierte "cosa" en "Cosa"
		estado = MyInput.UpperThenLow(estado);
		pais = MyInput.UpperThenLow(pais);
		lugarPubli = ciudad + ", " + estado + " (" + pais + ")";
	}

	public void setfechaPublicacion(String dia, String mes, String anno) {
		fechaPubli = FechaLugar.convierteFechas(dia, mes, anno);

	}

	public void setPaginas(int numero) {
		paginas = numero;
	}

	@Override

	public String toString() {

		return "Titulo:\t\t" + titulo + "\nEdicion:\t" + edicion + "\nAutor:\t\t" + this.getAutor() + "\nISBN:\t\t"
				+ ISBN + "\n" + lugarPubli + "," + " " + fechaPubli + "\nPaginas:\t" + paginas;
	}
}
