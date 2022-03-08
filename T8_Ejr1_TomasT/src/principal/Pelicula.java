package principal;

import aux.Formato;

public class Pelicula extends Multimedia {
	private String actorPrincipal;
	private String actrizPrincipal;

	public Pelicula(String titulo, String autor, double duracion, String actorPrincipal, String actrizPrincipal) throws IllegalArgumentException{
		
		super(titulo, autor, duracion, Formato.MP4);
		
		
		if(actorPrincipal == null && actrizPrincipal == null) {
			throw new IllegalArgumentException("Solo puede faltar uno de los tipos de actores");
		}else if(actorPrincipal == null) {
			this.actrizPrincipal = actrizPrincipal;
		}else if (actrizPrincipal == null) {
			this.actorPrincipal = actorPrincipal;
		}
		
	}
	
	@Override
	
	public String toString() {
		return super.toString() + 
	}
	
	

}
