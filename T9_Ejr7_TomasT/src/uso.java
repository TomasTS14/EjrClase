import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.LocalDate;

/*
 * A partir de los datos de temperaturas por cada hora del 1 de enero de 2022
 *  en Huesca, escribe un mï¿½todo que cree un archivo de almacenamiento de datos con la siguiente estructura:
El primer registro es la cadena ï¿½1 de enero 2022ï¿½.
El resto de registros lo componen 24 pares hora (entero comenzando en 0) - temperatura (double).
 Las horas se registran en el formato 0-23; las temperaturas puedes simularlas utilizando el mï¿½todo Math.random().
Incluye tambiï¿½n el tratamiento de excepciones.

El fichero que contiene los datos no necesita ser "legible por humanos"
 */
public class uso {

	public static void main(String[] args) {
	//	Scanner sc = new Scanner(System.in);
	//	System.out.println("Introduce el nombre del archivo a crear:");
		
		String archivoACrear = "src/data.dat";
		

		
		try (FileOutputStream fileOutStrm = new FileOutputStream(new File (archivoACrear));){
			
			FechaHoras_y_Temps3.guardaFecha(2022,1,1,fileOutStrm);
			FechaHoras_y_Temps3.guardaHorasYTemps(fileOutStrm);
			
			fileOutStrm.close();
		}catch(IOException e) {
			e.printStackTrace();
		}catch( Exception e) {
			e.printStackTrace();
		}
		
		try{
			 DataInputStream dataIn = new DataInputStream(new FileInputStream(archivoACrear));
			 
			 for (int i = 0; i<10; i++) {
				 System.out.print(dataIn.readChar());
				 
			 }
			
			 System.out.println();
			 
			 for (int i= 0; i<dataIn.available()+20; i++) { //No se por qué tuve que agregar esto para que llegase a la hora 23, si lo dejaba en available se quedaba en 22 máximo
				 	System.out.print(dataIn.readInt());
				 	System.out.print("-");
				 	System.out.print(String.format("%3.1f", dataIn.readDouble()));
				 	System.out.println();
			 }
			
		}catch(Exception e) {
			System.out.println("error leyendo del archivo");
		}
		
	
	}
}
