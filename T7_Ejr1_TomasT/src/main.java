/*Realiza un procedimiento que a partir de un día, mes 
 * y año que se leerán por teclado, visualice el día de la semana que le corresponde
 */

import java.time.*;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String fechaTexto;
		System.out.println("Introduce la fecha en numeros separada por '-' EJ: DD-MM-AAAA ");
		fechaTexto = sc.nextLine();
		String[] datos= fechaTexto.split("-");
		int dia= Integer.parseInt(datos[0]);
		int mes = Integer.parseInt(datos[1]);
		int anno = Integer.parseInt(datos[2]);
		
		LocalDate fecha= LocalDate.of(anno,mes,dia);
		
		System.out.println("El día de la semana correspondiente a la fecha introduce es: "+fecha.getDayOfWeek());
				
		
		
		
		
		
	}

}
