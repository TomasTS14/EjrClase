
package principal;
import auxiliar.*;
public class Multimedia implements Comparable<Multimedia> {

	private String titulo;
	private String autor;
	private double duracion;
	private Formato formato;
	
	public Multimedia() {
		titulo="";
		autor="";
		duracion= 0;
		formato=Formato.UNKNOWN;
	}
	public Multimedia(String titulo, String autor, double duracion, Formato formato) {
		this.titulo = titulo;
		this.autor = autor;
		this.duracion = duracion;
		this.formato = formato;
	}
	
	//GETTERS///////////////////////////
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public double getDuracion() {
		return duracion;
	}
	public String getFormato() {
		return formato.name();
	}
	
	
	//SETTERS///////////////////////////////////////
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	public void setFormato(Formato formato) {
		this.formato = formato;
	}
	
	@Override
	
	public String toString() {
		return String.format("Titulo: %s\nAutor: %s\nDuracion: %1.2f\nFormato: %s", titulo, autor, duracion,getFormato());
	}
	@Override
	public int compareTo(Multimedia o) {
		
		return this.getTitulo().compareTo(o.getTitulo());

	}

	
}
