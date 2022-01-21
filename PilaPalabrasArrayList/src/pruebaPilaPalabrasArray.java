/*
 * Es el mismo ejercicio que el 4 pero esta vez utilizando la
 *  clase ArrayList en lugar de LinkedListEscribe una clase 
 *  de nombre PilaPalabras para gestionar una estructura de
 *   pila que permita apilar y desapilar objetos de la clase
 *    String. La clase implementará el método apilarPalabra para
 *     poner una palabra en la cima de la pila, el método desapilarPalabra 
 *     para quitar el elemento de la cima de la pila devolviéndolo y el método o
 *     btenerPalabraCima para obtener la palabra situada en la cima de la pila sin 
 *     quitarla de ella. También se implementará el método pilasPalabrasVacia para 
 *     determinar si la pila está o no vacía. Los métodos deben implementarse utilizando la clase ArrayList

Escribe un programa que utilizando la clase PilaPalabras, introduzca varias 
cadenas de caracteres en la pila y las desapile mostrándolas por pantalla.
 */
public class pruebaPilaPalabrasArray {

	public static void main(String[] args) {
		PilaPalabrasArrayList pila= new PilaPalabrasArrayList();
		
		pila.apilarPalabra("Halcon");
		pila.apilarPalabra("Abecedarui");
		pila.apilarPalabra("Zarigüeya");
		pila.apilarPalabra("Bostezo");
		
		System.out.println(pila.pilaPalabrasVacia());
		
		System.out.println(pila);
		
		System.out.println(pila.obtenerPalabraCima());
		System.out.println(pila.desapilarPalabra()+" <---quito esta");
		
		
		
		System.out.println(pila);
		
		pila.ordenarPilaPalabras();
		
	
		
		System.out.println(pila+"<----------------Ordenada con pila.ordenarPila()");
	
	}

}
