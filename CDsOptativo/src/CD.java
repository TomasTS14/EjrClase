public class CD {
	
	private Cancion[] canciones;
	
	private int contador;
	
	public CD() {
		
	}
	
	public CD(int numCanciones) {
		this.canciones= new Cancion [numCanciones];
		this.contador=0;
	}
	public int numCanciones() {
		 contador=0;
		
		for(int i=0; i<canciones.length ; i++) {
			if (canciones[i] != null) contador++;
		}
		return contador;
	}
	
	public int totalSize() {
		return canciones.length;
	}
	
	public Cancion dameCancion(int posicion) {
		
		return this.canciones[posicion];
	}
	public void grabaCancion(int posicion, Cancion cancion) {
		
		this.canciones[posicion-1]= cancion;
	}
	public void agrega(Cancion cancion) {
		
		try {
			this.canciones[this.contador]= cancion;
			this.contador++;
		}catch(Exception e){
			System.out.println("No se ha podido agregar la pista");
			
		}
		
	}
	public void elimina (int posicion) {
		posicion--;
		this.canciones[posicion]= null;
	}
	public String muestraCanciones() {
		String todasLasCanciones="";
		for (int i=0; i<this.canciones.length; i++) {
			if(canciones[i]!=null)todasLasCanciones+= canciones[i]+"\n\n";
			
		}
		return todasLasCanciones+"\n---------------------------------------------";
	}
	
	@Override
	
	public String toString() {
		return muestraCanciones();
	}
	

}
