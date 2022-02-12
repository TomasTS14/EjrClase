/*
 * Escribe una clase Producto con atributos codigo (int),
 *  nombre (String), tipo (String), precio (double), 
 *  stock (int). Implementa la clase ArrayProducto,
 *   con un atributo de nombre lista y tipo ArrayList<Producto> 
 *   y con los métodos agregar, eliminar, obtener (el producto a partir de su posición),
 *    buscar (y recuperar el producto por su código), tamaño, imprimirLista, cambiarPrecio
 *     (del producto mediante su código y el nuevo precio). Escribe después un programa para probar
 *      la clase anterior.
 */
import java.util.ArrayList;
import java.util.Iterator; ////<---- interfaz
public class ArrayProducto {
	
	ArrayList<Producto> lista;
	Iterator<Producto> it;  //<---- la uso aqui, objeto iterador
	
	public ArrayProducto() {
		lista= new ArrayList<>();
	}
	
	public void agregar(Producto p) {
		lista.add(p);
	}
	
	public void eliminar(Producto p) {
		it=lista.iterator(); //<----ArrrayList tiene metodo que devuelve(crea) iterador.
		
		while(it.hasNext()) {
			if(it.next() == p) it.remove();
		}
		
	}
	public Producto obtener(int index) {
		
		return lista.get(index);
	}
	public Producto buscar(int codigo) {
		
		it= lista.iterator();
		
		
		while(it.hasNext()) {
			
			Producto aux= it.next();
			
			if(aux.getCodigo()== codigo) {
				
				return aux;
			}
		}
		return null;
		
		
	}
	
	public int tamaño() {
		return lista.size();
	}
	
	public void cambiarPrecio(int codigo, double precio) {
		
		for(int i=0; i<lista.size(); i++) {
			
			if (lista.get(i).getCodigo() == codigo) {
				
				lista.get(i).setPrecio(precio);
			}
		}
		
	}
	
	public void imprimirLista() {
		
		for(Producto p: lista) {
			System.out.println(p);
		}
	}

}
