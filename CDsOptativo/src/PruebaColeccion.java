
public class PruebaColeccion {

	public static void main(String[] args) {
		Cancion cancion1 = new Cancion("Wreath", "Opeth");
		Cancion cancion2 = new Cancion("Deliverance", "Opeth");
		Cancion cancion3 = new Cancion("For absent friends","Opeth");
		
		CD cd1 = new CD(3);
		
		cd1.agrega(cancion1); cd1.agrega(cancion2); cd1.agrega(cancion3);
		
		Cancion cancion4 = new Cancion("Roundabout","Yes");
		Cancion cancion5= new Cancion("We have heaven", "Yes");
		Cancion cancion6 = new Cancion("Heart of the sunrise","Yes");
		
		CD cd2 = new CD(3);
		
		cd2.agrega(cancion4); cd2.agrega(cancion5); cd2.agrega(cancion6);
		
		Cancion cancion7 = new Cancion("Run away with me","Sufjan Steven");
		Cancion cancion8 = new Cancion("Lamentations","Sufjan Steven");
		Cancion cancion9 = new Cancion("Videogame","Sufjan Steven");
		
		CD cd3 = new CD(3);

		cd3.agrega(cancion7); cd3.agrega(cancion8); cd3.agrega(cancion9);
		
		ColeccionCDs coleccion= new ColeccionCDs();
		
		coleccion.addCD(cd1); coleccion.addCD(cd2); coleccion.addCD(cd3);
		
		System.out.println(coleccion);
		
		System.out.println(coleccion.enQueDiscoCancion("Vid")); //Devuelve el disco en el que está la cancion con ese titulo, no es case sensistive
		System.out.println("-----------------------------\n\n");
		coleccion.removeCD(1);
		
		System.out.println(coleccion);
	}

}
