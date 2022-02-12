/*
 * Es el mismo ejercicio que el 4 pero esta vez utilizando la clase ArrayList en lugar
 *  de LinkedListEscribe una clase de nombre PilaPalabras para gestionar una estructura de
 *   pila que permita apilar y desapilar objetos de la clase String. La clase implementará
 *    el método apilarPalabra para poner una palabra en la cima de la pila, el método 
 *    desapilarPalabra para quitar el elemento de la cima de la pila devolviéndolo y 
 *    el método obtenerPalabraCima para obtener la palabra situada en la cima de la pila 
 *    sin quitarla de ella. También se implementará el método pilasPalabrasVacia para 
 *    determinar si la pila está o no vacía. Los métodos deben implementarse utilizando la clase ArrayList

Escribe un programa que utilizando la clase PilaPalabras, introduzca varias cadenas de 
caracteres en la pila y las desapile mostrándolas por pantalla.
 */
import java.util.Collections;
import java.util.ArrayList;
public class PilaPalabrasArrayList {

	
	private ArrayList<String> pilaPalabras;
	
	public PilaPalabrasArrayList() {
		pilaPalabras = new ArrayList<>();
	}
	public boolean pilaPalabrasVacia() {
		return pilaPalabras.isEmpty();
	}
	public void ordenarPilaPalabras() {
		Collections.sort(pilaPalabras);
	}
	
	public void apilarPalabra(String palabra) {
		
		pilaPalabras.add(0,palabra);
	}
	public String desapilarPalabra() {
		if(!this.pilaPalabrasVacia()) {
			return 	pilaPalabras.remove(0);
		}
		return "No hay palabras aun";
		
	
	}
	public String obtenerPalabraCima() {
		if(!this.pilaPalabrasVacia()) {
			return 	pilaPalabras.get(0);
		}
		return "No hay palabras aun";
	}
	@Override
	
	public String toString() {
		
		return pilaPalabras.toString();
	}
	
}
