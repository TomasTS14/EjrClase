import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class uso {

	public static void main(String[] args) {
		

	}
	
	public static String contadorVocales(String file) {
		
		int contadorVocal = 0;
		
		try(BufferedReader br = new BufferedReader(new FileReader(file));){
			String leido = Integer.toString(br.read());
		
			do {
				if(leido.equalsIgnoreCase("a") || leido.equalsIgnoreCase("e") || leido.equalsIgnoreCase("i") || leido.equalsIgnoreCase("o") || leido.equalsIgnoreCase("u")  )
			
			}while (!leido.equalsIgnoreCase("-1"));
			
		}catch (IOException ioE) {
			System.out.println("problema leyendo archivo");
		}catch ( Exception e ) {
			e.printStackTrace();
		}
	}

}
