import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Escribe un m�todo que reciba como argumento el nombre de un fichero de texto (que habr�s creado con anterioridad)
 *  y convierta a may�sculas sus caracteres sobre otro 
 * fichero cuyo nombres se le pasar� como segundo argumento. Utiliza buffering. Incluye tambi�n el tratamiento de excepciones.
 */
public class uso {

	public static void main(String[] args) {
	
		String fileObjeto = args[0];
		String fileNueva = args[1];
		String fraseMutante="";
		
		try {
		
				BufferedReader br = new BufferedReader(new FileReader("src/"+fileObjeto));
				
				do {
					
					fraseMutante += br.readLine();
					
				}while (br.readLine() != null) ;
					
					
				fraseMutante = fraseMutante.toUpperCase();
				
				FileWriter fw = new FileWriter("src/"+fileNueva);
				fw.write(fraseMutante);
				
				fw.close();
				br.close();
			
			
		}catch(IOException e) {
			System.out.println("Fallo al tratar el archivo");
		}catch (Exception e ) {
			e.printStackTrace();
		}

	}

}
