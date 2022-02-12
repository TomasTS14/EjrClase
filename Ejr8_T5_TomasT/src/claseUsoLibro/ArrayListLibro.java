/*
 * Vamos a realizar un ejercicio similar al ejercicio 3 pero mejorado con las nuevas clases e interfaces de 
 * las que disponemos.
Utilizaremos la clase Libro y todas las demás necesarias (pon una copia en el nuevo proyecto) y la que vamos 
a modificar es la lista de Libros, que en este caso va a estar definida en una clase llamada ArrayListLibros.
 Esta vez, tendremos los siguientes métodos:

    insertar ( Libro li): Lo añade a la colección, pero esta vez sin preocuparnos del orden.
    numLibros(): Nos devuelve la cantidad de libros que contiene la colección.
    eliminarLibro(int posicion): Elimina de la colección el libro que se encuentra en la posición indicada.
    obtenerLibro(int posicion): Devuelve el libro que se encuentra en esa posición (sin eliminarlo).
    buscarLibro(String buscada): Devuelve la posición en la que se encuentra el primer libro que contiene
     en su título la cadena buscada (-1 si no encuentra).
    ordenarPorTitulo(): Ordenará la colección por orden alfabético del título (sin distinguir mayúsculas y minúsculas).
    ordenarPorPaginas(): Ordenará la colección por el número de páginas de menor a mayor.

Para poder hacer estos métodos de ordenación tendrás que haber creado dos clases que implementen la 
interfaz Comparator: la clase TituloComparator y la clase PaginasComparator.
Crea una clase PruebaArrayListLibros en la que se verifique que todos los métodos funcionan correctamente.
 */
package claseUsoLibro;

import java.util.Collections;
import claseLibro.Libro;
import java.util.ArrayList;
public class ArrayListLibro {

	ArrayList<Libro> lista;
	
	public ArrayListLibro() {
	lista = new ArrayList<>();	
	}
	
	public void insertar (Libro li) {
		lista.add(li);
	}
	public int numLibros() {
		return lista.size();
	}
	public void eliminarLibro(int index) {
		
		 lista.remove(index);
	}
	public Libro obternerLibro(int index) {
		return lista.get(index);
	}
	public int buscarLibro(String titulo) {
		for (int i=0; i<lista.size(); i++) {
			if(lista.get(i).getTitulo().contains(titulo)) return i;
		}
		return -1;
	}
	public void ordenarPorTitulo() {
		Collections.sort(lista, new tituloComparator());
	}
	public void ordenarPorPaginas() {
		Collections.sort(lista, new PaginasComparator());
	}
	
	@Override

	public String toString() {
		String listaLibros = "Coleccion: \n";
		
		int i=1;
		for (Libro libro : lista) {
			listaLibros +=i+")===========================<<<<<\n"+ libro.toString();
			i++;

			listaLibros += "\n\n";
		}
		return listaLibros;
	}
}
