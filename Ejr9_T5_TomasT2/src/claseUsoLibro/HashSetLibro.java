/*
 * Implementa una nueva solución del ejemplo ArrayListLibros utilizando la colección HashSet en lugar de ArrayList. 
 * Esta vez incluiremos un método buscarLibros(String buscada) que imprimirá por pantalla
 *  todos los libros que contengan la cadena buscada en el título, en el nombre del autor o en el apellido del autor.
Crea también una clase de prueba en la que se verifique el funcionamiento de todos los métodos.
 */
package claseUsoLibro;

import java.util.Collections;
import claseLibro.Libro;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetLibro  {

	HashSet<Libro> lista;
	Iterator<Libro> it;
	
	public HashSetLibro() {
	lista = new HashSet<>();	
	}
	
	public void insertar (Libro li) {
		lista.add(li);
	}
	public int numLibros() {
		return lista.size();
	}
	

	public void buscarLibro(String cadena) {
		 it= lista.iterator();
		 
		 while(it.hasNext()) {
			 Libro l= it.next();
			 
			 if (l.getAutor().contains(cadena) || l.getCodigo().contains(cadena) || l.getTitulo().contains(cadena)) 
				 System.out.println(l);
			 
			 
		 }
		
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
