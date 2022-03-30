import java.io.*;

/*
 * Escribe un método que pida al usuario una cadena de caracteres y
 *  la guarde al revés en un archivo de texto cuyo nombre se le pasará como
 *   segundo argumento. Incluye también el tratamiento de excepciones.
 */
public class uso {

	public static void main(String[] args) {
		
		String frase = args[0];
		String fraseReves ="";
		String fileName = args[1];
		
		try(FileOutputStream fileNueva = new FileOutputStream(fileName); ) {
			
			for (int i= frase.length(); i > 0 ; i--) {
				fraseReves += frase.charAt(i-1);
			}
			
			PrintWriter pw = new PrintWriter(fileNueva);
			
			pw.print(fraseReves);
			
		}catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
