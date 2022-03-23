import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
 * Escribe un método que reciba por parámetro el nombre de un fichero (que habrás creado con anterioridad)
 y cuente el número de palabras que contiene. Incluye también el tratamiento de excepciones
 */
public class uso {

	public static void main(String[] args) {
		
		System.out.println("Este archivo tiene "+cuentaPalabras("src/archivoTexto.txt")+ " palabras");
	}
	
	public static int cuentaPalabras (String file) {
		
		int contadorPalabras=0;
		
		try(BufferedReader br= new BufferedReader(new FileReader(file))){
			String linea = br.readLine();
			String textoEntero = "";
			do {
				textoEntero += linea;
				linea = br.readLine();
				
			}while(linea != null);
			
			String[] palabras = textoEntero.split(" ");
			contadorPalabras = palabras.length;
		}catch(IOException ioE) {
			System.out.println("Fallo al leer archivo");
		}
		
		return contadorPalabras;
	}

}
