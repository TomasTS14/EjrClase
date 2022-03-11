package pruebasExamen;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class pruebaHashSet {
	
public static void main(String[] args) {
	
	Set<Evento> lista = new HashSet<>();
	
	lista.add(new Evento(LocalDate.of(1945, 4, 30), "Muerte de Hitler", "Rodeado por el ejercito sovietico y con los aliados subiendo desde el sur de Alemania, Hitler se suicida en su bunker"));
	lista.add(new Evento(LocalDate.of(1917, 3, 8), "Revolucion Roja", "Tras grandes perdidas en la IGM, comienza las huelgas de trabajadores en Petrogrado"));
	lista.add(new Evento(LocalDate.of(1989, 11, 9), "Caida del muro de Berlin", "Con la inminente disolución de la URSS, el muro de Berlin cae."));
	lista.add(new Evento(LocalDate.of(1989, 11, 9), "Caida dasdasdel muro de Berlin", "Con la inmineasdasdnte disolución de la URSS, el muro de Berlin cae."));
	System.out.println(lista);
	
	lista.forEach(t ->System.out.println(t+"\n") );
	
}



}
