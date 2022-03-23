import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class uso {

	public static void main(String[] args) {
		
		
		System.out.println("Este archivo tiene "+contadorVocales("src/archivoTexto.txt")+" vocales");
	}
	
	
	
	
	
	public static int contadorVocales(String file) {
		
		int contadorVocal = 0;
		
		try(BufferedReader br = new BufferedReader(new FileReader(file));){
			int leidoASCI = br.read();
			char character = (char) (leidoASCI);
			String leido = Character.toString(character);
			
		
			do {
				if(leido.equalsIgnoreCase("a") || leido.equalsIgnoreCase("e") || leido.equalsIgnoreCase("i") || leido.equalsIgnoreCase("o") || leido.equalsIgnoreCase("u")  ) {
					contadorVocal ++;
					 
				}
				leidoASCI = br.read();
				character = (char) (leidoASCI);
				leido = Character.toString(character);
			
			}while (leidoASCI != -1);
			
		}catch (IOException ioE) {
			
			System.out.println("problema leyendo archivo");
		
		}catch ( Exception e ) {
			e.printStackTrace();
		}
		return contadorVocal;
	}

}
