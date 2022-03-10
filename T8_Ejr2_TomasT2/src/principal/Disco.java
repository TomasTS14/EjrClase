package principal;
import auxiliar.*;
public class Disco extends Multimedia {
	
	private String genero;
	
	public Disco(String titulo,String autor, double duracion, Formato formato,String genero ) {
		super(titulo, autor, duracion, formato);
		this.genero = genero;
	}
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero= genero;
	}
	
	@Override
	
	public String toString() {
		return super.toString()+"\nGenero: "+genero;
	}
	
	

}
