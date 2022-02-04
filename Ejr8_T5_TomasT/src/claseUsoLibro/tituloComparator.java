package claseUsoLibro;


import java.util.Comparator;
import claseLibro.Libro;
public class tituloComparator implements Comparator<Libro> {

	public int compare(Libro l1, Libro l2) {
		
		return (l1.getTitulo().compareToIgnoreCase(l2.getTitulo()));
	}
}
