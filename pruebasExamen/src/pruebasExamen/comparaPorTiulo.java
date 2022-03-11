package pruebasExamen;

import java.util.Comparator;

public class comparaPorTiulo implements Comparator<Evento> {

	@Override
	public int compare(Evento o1, Evento o2) {
	
		return o1.getTitulo().compareToIgnoreCase(o2.getTitulo());
	}

}
