/*
 * Se trata de comparar en acción las clases LinkedList y ArrayList en cuanto a rendimiento en:

    Mostrar todos los elementos que contienen
    Insertar elementos al inicio
    Insertar elementos en zonas medias
    Agregar elementos al final

Para llevar el control de tiempos recurriremos a los métodos 
currentTimeMilis() y nanoTime() de la clase System
 */

import java.util.ArrayList;
import java.util.LinkedList;
public class comparacionArrayListLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> laLinked = new LinkedList<>();
		ArrayList<Integer> laArray= new ArrayList<>();
		
		//Comparacion de agregado no aleatorio para linked
		
		long tiempoAhora= System.currentTimeMillis();
		
		for(int i=0; i<20000000; i++) {
			int randomNum=(int)(Math.random()*2500);
			laLinked.add(randomNum);
		}
		long tiempoDespues= System.currentTimeMillis();
		
		long diferencia= tiempoDespues - tiempoAhora;
		
		System.out.println("Para agregar 20.000.000 LinkedList elementos tarda (milisegundos): "+ diferencia);
		
		
		tiempoAhora= System.currentTimeMillis();
		System.out.println(laLinked);
		tiempoDespues= System.currentTimeMillis();
		diferencia= tiempoDespues- tiempoAhora;
		System.out.println("Para imprimir 20.000.000 LinkedList de elementos tardo(milisegundos): "+diferencia);
		
		
		
		

	}

}
