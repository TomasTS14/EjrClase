package principal;

import auxiliar.Formato;
import auxiliar.Prestable;

public class DiscoPrestable extends Disco implements Prestable {

	private boolean prestado;
	
	
	public DiscoPrestable(String titulo, String autor, double duracion, Formato formato, String genero) {
		super(titulo, autor, duracion, formato, genero);
		
	}
	
	public void prestar() {
		prestado= true;
	}
	public void recoger() {
		prestado=false;
	
	}
	public boolean getPrestado() {
		return prestado;
	}
	@Override
	public boolean esPrestable() {
		
		return true;
	}

}
