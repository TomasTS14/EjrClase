package principal;

import java.util.ArrayList;

public class ListaMultimedia {
	
	private ArrayList<Multimedia> lista;
	
	public ListaMultimedia() {
		lista= new ArrayList<>();
	}
	
	public void addMultimedia(Multimedia m) {
		lista.add(m);
	}
	public Multimedia getMultimedia(Multimedia m) {
		for (Multimedia i : lista) {
			if ( m == i) {
				return m;
			}
		}
	return null;
	}
	public int getSize() {
		return lista.size();
	}
	public void remove(int index) {
		lista.remove(index);
	}
	
	public double getDuracionTotal() {
		double duracion=0;
		for (Multimedia m : lista) {
			duracion += m.getDuracion();
		}
		return duracion;
	}
	// otros metodos
	
	public int cuantosDiscosDeGenero(String genero) {
		int contador = 0;
		for (Multimedia m : lista) {
			if (m instanceof Disco) {
				if (casteoMultiADisco(m).getGenero() == genero) {
					contador++;
				}
				
			}
		}
		return contador;
	}
	public Disco casteoMultiADisco ( Multimedia m) {
		return (Disco)m;
	}
	
	public int numPelisSinActriz() {
		int contador= 0;
		
		for (Multimedia m : lista) {
			if (m instanceof Pelicula) {
				Pelicula p = (Pelicula)m;
				if(p.getActriz() == null) {
					contador++;
				}
			}
		}
		
		return contador;
	}
	
	
	
	@Override 
	
	public String toString() {
		
		String string="";
		for (Multimedia m : lista) {
			string += m.toString() +"\n\n";
		}
		return "Lista de elementos multimedia:\n"+string;
	}

}
