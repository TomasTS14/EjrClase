package pruebasExamen;

import java.time.LocalDate;

public class Evento implements Comparable<Evento> {
	
	private LocalDate fechaEvento;
	private String titulo;
	private String breveDescripcion;
	
	public Evento(LocalDate fecha, String titulo,String descripcion) {
		this.fechaEvento = fecha;
		this.titulo = titulo;
		breveDescripcion = descripcion;
	}
	public LocalDate getFechaEvento() {
		return fechaEvento;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getFechaString() {
		String dia = String.valueOf(fechaEvento.getDayOfMonth());
		String mes = String.valueOf(fechaEvento.getMonthValue());
		String anno = String.valueOf(fechaEvento.getYear());
		
		return dia+"/"+mes+"/"+anno;
	}
	public String getDescripcion() {
		return breveDescripcion;
	}
	public void setDescripcion(String descripcion) {
		breveDescripcion = descripcion;
	}
	@Override
	public int compareTo(Evento o) {
	
		return this.getFechaEvento().compareTo(o.getFechaEvento());
	}
	@Override
	public String toString() {
		StringBuilder eventoString = new StringBuilder();
		
		eventoString.append("Titulo: "+this.titulo+"\n");
		eventoString.append("Fecha: "+getFechaString()+"\n");
		eventoString.append("Descripcion: "+getDescripcion()+"\n");
		return eventoString.toString();
	}
	

	
	

}
