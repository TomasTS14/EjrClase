import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class t9_e1_main {

	public static void main(String[] args) {

		System.out.println(sumaYMediaArchivo(args[0])); //el fichero lo estoy pasando por la terminal: java t9_e1_main ../src/archivoNumeros.txt


	}

	public static String sumaYMediaArchivo( String file) {
		
		
		double suma = 0;
		int contador = 0;
		double media ;
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(file));){ //usando try con recurso
			
			String leido = br.readLine();
			
			do {
				suma += Double.parseDouble(leido); //se que todo son doubles así que parseo. 
				contador++;
				leido = br.readLine(); //lo vuelvo a actualizar dentro del bucleo
			}while (leido != null);
			
			
		}catch(IOException e) {
			
			System.out.println("Error leyendo archivo");
			
		}catch( Exception e) {
			e.printStackTrace();
		}
		media = suma/contador;
		String sumaYMedia = String.format("La suma de los elementos es %f , y la media de todos ellos es %f", suma,media);
		return sumaYMedia;
	}

}
