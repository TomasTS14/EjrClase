package auxiliar;

import java.util.Comparator;

import principal.Multimedia;

public class CompararPorAutor implements Comparator<Multimedia> {

	@Override
	public int compare(Multimedia o1, Multimedia o2) {
		
		return o1.getAutor().compareTo(o2.getAutor());
		
	}

}
