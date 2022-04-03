
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class uso {

	public static void main(String[] args) {
		Scanner sc;
		
		try {
			String archivo="../T9_Ejr7_TomasT/src/data.dat"; //El programa funciona conectandose al otro ejercicio, que debe estar en la misma carpeta raiz que este.
			double doubleActual=0;
			double suma = 0;
			double max = 0;
			double min = Double.MAX_VALUE;   //Lo uso para que no compare con un numero que pueda ser menor a las posibles temepraturas del archivo

			DataInputStream dataIn = new DataInputStream(new FileInputStream(archivo));
			sc = new Scanner(dataIn);
			 
			 for (int i = 0; i<10; i++) {
				 System.out.print(dataIn.readChar()); //Los diez primeros caracteres corresponden al String de la fecha. 
				 
			 }
			
			 System.out.println();
			 
			 for (int i= 0; i<dataIn.available()+20; i++) { //No se por qué tuve que agregar esto para que llegase a la hora 23, si lo dejaba en available se quedaba en 22 máximo
				 	
				 System.out.print(dataIn.readInt()); //voy leyendo las horas, no las proceso de ninguna forma. 
				 	System.out.print("-");
		
				 	
				 	
				 	 doubleActual = dataIn.readDouble(); //actualizo al primer dato double dela rchivo 
				 	max = Math.max(max, doubleActual); //El maximo siempre sera el mayor entre el actual y el original maximo (0)
				 	min = Math.min(min, doubleActual); //El maximo siempre sera el menro entre Double.MAx_VALUE y el actual dato double. 
				 	
				 	
				 	suma += doubleActual;
				 	System.out.print(String.format("%3.1f", doubleActual));
				 	System.out.println();
			 }
			 
			 System.out.println();
			 System.out.println(String.format("La temperatura maxima es: %3.1f ",max));
			System.out.println(String.format("La temperatura minima es: %3.1f", min));
			System.out.println(String.format("La temperatura media es: %4.2f", (suma/24)));
		}catch(FileNotFoundException notFound) {
			System.out.println("No se ha encontrado el archivo, deben estar los dos proyectos en la misma carpeta.");
		}catch(IOException ioE) {
			System.out.println("Fallo en la lectura");
		}catch(ArithmeticException aE) {
			System.out.println("Fallo sacando la media");
		}

	}

}
