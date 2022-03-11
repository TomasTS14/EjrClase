package pruebasExamen;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class PruebasHora {

	public static void main(String[] args) {
		
	LocalDate fecha1 = LocalDate.of(2021, Month.MARCH, 10);
	
	LocalDate fecha2 = LocalDate.of(2022, Month.MARCH, 30);
	
	System.out.println(fecha1.until(fecha2));
	
	ArrayList<Evento> lista  = new ArrayList<>();
	
	lista.add(new Evento(LocalDate.of(1945, 4, 30), "Muerte de Hitler", "Rodeado por el ejercito sovietico y con los aliados subiendo desde el sur de Alemania, Hitler se suicida en su bunker"));
	lista.add(new Evento(LocalDate.of(1917, 3, 8), "Revolucion Roja", "Tras grandes perdidas en la IGM, comienza las huelgas de trabajadores en Petrogrado"));
	lista.add(new Evento(LocalDate.of(1989, 11, 9), "Caida del muro de Berlin", "Con la inminente disolución de la URSS, el muro de Berlin cae."));
	
	
	Iterator<Evento> it = lista.iterator();
	
	while (it.hasNext()) {
		Evento auxiliar = it.next();
		System.out.println(auxiliar+"\n\n");
	}
	
	Collections.sort(lista);
	
	Iterator<Evento> it2 = lista.iterator();
	
	while (it2.hasNext()) {
		Evento auxiliar2 = it2.next();
		System.out.println(auxiliar2+"\n\n");
	}
	
	
	
	}
	
	


}
