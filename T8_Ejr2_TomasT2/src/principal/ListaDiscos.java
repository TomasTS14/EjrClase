package principal;

public class ListaDiscos {
	private Disco[] lista;
	private int contador=0;
	
	public ListaDiscos() {
		lista= new Disco[3];
	}
	
	public Disco getDisco(int index) {
		
		return lista[index];
	}
	public String getDiscosPrestados() {
		String string = "Discos prestados:\n\n";
		for (Disco d : lista) {
			if (((DiscoPrestable)d).esPrestable( ) && ((DiscoPrestable)d).getPrestado()) {
				string += d.toString()+"\n\n";
			}
		}
		return string;
	}
	
	public void insertar(Disco d) {
		lista[contador] = d;
		contador++;
	}
	public boolean borrarDisco(Disco d) {
		
		for (int i=0; i<lista.length; i++) {
			if( lista[i] == d) {
				lista[i] = null;
				return true;
			}
		}
		return false;
	}
	public int cuentaPrestados() {
		int cuentaPrestados= 0;
		
		for (Disco d : lista) {
			if ( ((DiscoPrestable)d).esPrestable()) {
				DiscoPrestable dp = (DiscoPrestable)d;
				if( dp.getPrestado() == true) {
					cuentaPrestados++;
				}
			}
		}
		return cuentaPrestados;
	}
	
	@Override
	
	public String toString() {
		String string = "Lista de discos: \n\n";
		for (Disco d: lista) {
			string += d.toString()+"\n\n";
		}
		
		return string;
	}
	
}
