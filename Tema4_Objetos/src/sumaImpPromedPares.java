

//Escribe un programa en JAVA tal que dado como datos 270 números enteros
// (introducidos por teclado), obtenga la suma de los números impares y el promedio de los números pares.
//Datos: NUM1, NUM2, . . ., NUM270
//Donde: NUMi es una variable de tipo entero que representa el número entero i que se ingresa (1 ≤ i ≤ 270).

import java.util.Scanner;
public class sumaImpPromedPares {
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] listaNumeros= new int[270];
		int sumImpares=0;
		int sumPares=0;
		int contadorPares=0;
		
		System.out.println("Presiona Y para ingresar manualmente 270 numeros o X para hacerlo aleatoriamente");
		char aux= sc.next().charAt(0);
		System.out.println();
		
		if(aux == 'Y' || aux == 'y') {
			for( int i=0; i < 270; i++) {
				
				listaNumeros[i]= sc.nextInt();
			}
		}else if (aux == 'X' || aux == 'x'){
			
			rellenaLista(listaNumeros);
		}
		
		
		for (int i=0; i<270; i++) {
			if (listaNumeros[i]%2!=0) {
				sumImpares += listaNumeros[i];
			}
			else {
				sumPares += listaNumeros[i];
				 contadorPares++;
			}
			
		}
		int promedPares= sumPares/contadorPares;
		
		System.out.printf("La suma de los impares es %d, el promedio de todos los pares es %d", sumImpares, promedPares);
		
		
		
		

	}
	
	public static void rellenaLista (int[] lista) {
		for (int i=0; i<lista.length; i++) {
			lista[i]=(int)( Math.random()*270);
		}
	}

}
