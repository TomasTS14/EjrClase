import java.util.Collections;
import java.util.LinkedList;
public class PilaPalabras {
	
	private LinkedList<String> pilaPalabra;
	
	public PilaPalabras() {
		pilaPalabra= new LinkedList<>();
	}
	
	public boolean pilaPalabraVacia() {
		
		return pilaPalabra.isEmpty();
	}
	
	public void ordenarPila() {
		
		Collections.sort(pilaPalabra);
	}
	
	public void apilarPalabra(String palabra) {
		pilaPalabra.addFirst(palabra);
	}
	
	public String desapilarPalabra() {

		return pilaPalabra.remove();
	}
	
	public String obtenerPalabraCima() {
		
		return pilaPalabra.element();
	}
	@Override
	
	public String toString() {
		return pilaPalabra.toString();
	}
	
	

}
