import java.util.ArrayList;

public class Biblioteca {

	ArrayList<Libro> listaLibros;
	
	public Biblioteca() {
		listaLibros = new ArrayList<>();
	}
	public void addLibro(Libro libro) {
		listaLibros.add(libro);
	}
	public ArrayList<Libro> getLibros(){
		return listaLibros;
	}
}
