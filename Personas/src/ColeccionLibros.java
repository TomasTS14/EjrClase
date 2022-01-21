
import java.util.ArrayList;

public class ColeccionLibros {

	private ArrayList<Libro> coleccion;

	public ColeccionLibros() {
		coleccion = new ArrayList<>();
	}

	public int sizeColeccion() {
		return coleccion.size();
	}

	public boolean insertarLibro(Libro libro) {

		if (coleccion.isEmpty()) {
			coleccion.add(libro);
			return true; // Primero comprobará si la lista está lista.
		}

		/*
		 * Ahora comparará el el libro argumento con toda la lista hasta llegar a uno,
		 * que alfabeticamente esté por detras de él, ocupará el puesto de la posicion
		 * en la que está, desplazando al que ocupa hacía delante empujando al resto.
		 * No llega hasta 0 para no comparar detras de de 0(out of bonds),
		 * compara con 0 solo si termina saliendo del bucle
		 */
		for (int i = coleccion.size(); i > 0; i--) {
			if (i > 0 && libro.getTitulo().compareToIgnoreCase(coleccion.get(i - 1).getTitulo()) > 0 || i == 0) {
				coleccion.add(i, libro);
				return true;
			}

		}
		//sale del bucle y compara con 0.

		coleccion.add(0, libro);

		return true;

	}

	public void eliminarLibro(int index) {

		coleccion.remove(index);
	}
	
	public int getPorTitulo(String parteTitulo) {
		for(int i=0; i<coleccion.size(); i++) {
			if(coleccion.get(i).getTitulo().contains(parteTitulo)) return i+1;
		}
		return -1;
	}

	public Libro getLibro(int index) {
		return coleccion.get(index);
	}
	
	public int getSize() {
		return coleccion.size();
	}

	@Override

	public String toString() {
		String listaLibros = "Coleccion: \n";
		
		int i=1;
		for (Libro libro : coleccion) {
			listaLibros +=i+")===========================<<<<<\n"+ libro.toString();
			i++;

			listaLibros += "\n\n";
		}
		return listaLibros;
	}

}
