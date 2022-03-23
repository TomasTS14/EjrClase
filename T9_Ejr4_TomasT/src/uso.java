import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Escribe un método que reciba por parámetro el nombre de un fichero de texto 
 * (que habrás creado con anterioridad y lo muestre por pantalla sin espacios en blanco. Incluye también el tratamiento de excepciones.
 */
public class uso {

	public static void main(String[] args) {
		
		
		System.out.println("Este archivo sin espacios sería: \n "+textoSinEspacios("src/archivoTexto.txt"));
	}
	
	public static String textoSinEspacios(String file) {
		String textoConEspacios="";
		String textoSinEspacios="";
		
		try(BufferedReader br = new BufferedReader(new FileReader(file));){
			String linea = br.readLine();
			do {
				
				textoConEspacios += linea;
				linea = br.readLine();
				
			}while(linea != null);
			
			String[] palabras = textoConEspacios.split(" ");
			
			for (String palabra : palabras) {
				textoSinEspacios += palabra;
			}
			
		}catch(IOException ioE) {
			
			System.out.println("fallo al leer el archivo");
			
		}
		
		return textoSinEspacios;
	}

}
