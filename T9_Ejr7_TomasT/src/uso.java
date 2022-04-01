import java.io.BufferedInputStream;+
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.LocalDate;

/*
 * A partir de los datos de temperaturas por cada hora del 1 de enero de 2022
 *  en Huesca, escribe un m�todo que cree un archivo de almacenamiento de datos con la siguiente estructura:
El primer registro es la cadena �1 de enero 2022�.
El resto de registros lo componen 24 pares hora (entero comenzando en 0) - temperatura (double).
 Las horas se registran en el formato 0-23; las temperaturas puedes simularlas utilizando el m�todo Math.random().
Incluye tambi�n el tratamiento de excepciones.

El fichero que contiene los datos no necesita ser "legible por humanos"
 */
public class uso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre del archivo a crear:");
		
		
		try (FileOutputStream ouS = new FileOutputStream(new File ("src/data.dat"));){
			
			FechaHoras_y_Temps3.guardaFecha(2022, 1, 1, ouS);
			FechaHoras_y_Temps3.guardaHorasYTemps(ouS);
			
		}catch(IOException e) {
			e.printStackTrace();
		}catch( Exception e) {
			e.printStackTrace();
		}
		
		try (ObjectInputStream oIS = new ObjectInputStream(new FileInputStream("src/data.dat"));){
			
			System.out.println()oIS.readObject().toString();
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	
	}
}
