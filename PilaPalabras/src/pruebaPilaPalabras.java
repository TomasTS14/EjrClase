
public class pruebaPilaPalabras {

	public static void main(String[] args) {
		
		PilaPalabras pila= new PilaPalabras();
		
		pila.apilarPalabra("Halcon");
		pila.apilarPalabra("Abecedarui");
		pila.apilarPalabra("Zarigüeya");
		pila.apilarPalabra("Bostezo");
		
		System.out.println(pila.pilaPalabraVacia());
		
		System.out.println(pila);
		
		System.out.println(pila.obtenerPalabraCima());
		System.out.println(pila.desapilarPalabra()+" <---quito esta");
		
		
		
		System.out.println(pila);
		
		pila.ordenarPila();
		
		System.out.println(pila+"<----------------Ordenada con pila.ordenarPila()");
	

	}

}
