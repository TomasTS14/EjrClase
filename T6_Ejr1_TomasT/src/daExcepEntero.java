
import java.util.Scanner;


public class daExcepEntero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entero;
		System.out.println("Introduce un entero (o otra cosa)");
		try {
			entero = sc.nextInt();
		}catch(Exception e) {
			
		
			 System.out.println("La excepcion que da es: "+e.toString());  //uso el toString de la excepcion en si. 
		}

	}

}
