
public class Libro {
	
	private String titulo;
	private String autor;
	private String editorial;
	private int numPaginas;
	
	public Libro(String titulo, String autor, String editorial, int numPaginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.numPaginas = numPaginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public int getNumPaginas() {
		return numPaginas;
	}
	
	

}
