package pruebasExamen;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class pruebaPorConsola {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Evento> lista = new ArrayList<>();
		
		lista.add(new Evento(LocalDate.of(1945, 4, 30), "Muerte de Hitler", "Rodeado por el ejercito sovietico y con los aliados subiendo desde el sur de Alemania, Hitler se suicida en su bunker"));
		lista.add(new Evento(LocalDate.of(1917, 3, 8), "Revolucion Roja", "Tras grandes perdidas en la IGM, comienza las huelgas de trabajadores en Petrogrado"));
		lista.add(new Evento(LocalDate.of(1989, 11, 9), "Caida del muro de Berlin", "Con la inminente disolución de la URSS, el muro de Berlin cae."));
		
		boolean salida = false;
		while(!salida) {

			System.out.println("Introduce la fecha del evento en numeros en formato dd/mm/aaaa");
			String fechaSinFormato = sc.nextLine();
			
			System.out.println("Introduce el titulo del evento: ");
			String titulo = sc.nextLine();
			
			System.out.println("Introduce una pequeña descripcion del evento:");
			String descripcion= sc.nextLine();
			
			String[] fechaDatos = fechaSinFormato.split("/");
			try {
			LocalDate fechaConFormato = LocalDate.of(Integer.parseInt(fechaDatos[2]),Integer.parseInt(fechaDatos[1]),Integer.parseInt(fechaDatos[0]));
			
				lista.add(new Evento(fechaConFormato, titulo, descripcion));
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				
				System.out.println("Deseas continuar agregando? [y|n]");
				char salidaChar = sc.next().charAt(0);
				sc.nextLine();
				if (salidaChar == 'n') salida= true;
			}
		}
		Collections.sort(lista);
		System.out.println("Lista:");
		
		for (Evento i : lista) {
			System.out.println(i+"\n");
		}
		
		lista.sort(new comparaPorTiulo());
	
		for (Evento i : lista) {
			System.out.println(i+"\n");
		}
	}
}