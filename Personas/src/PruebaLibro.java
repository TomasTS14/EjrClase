
public class PruebaLibro {
//Estan desordenados por titulo.
	public static void main(String[] args) {
		
		Autor autor1= new Autor();
		

		
		autor1.setNombre("Marco");
		autor1.setApellidos("inaros");
		autor1.setPaisNacimiento("Myammar");
		
		Autor autor2= new Autor();
		
		autor2.setNombre("Antoine");
		autor2.setApellidos("de Saint");
		autor2.setPaisNacimiento("Francia");
		
		ColeccionLibros coleccion1 = new ColeccionLibros();
		
		Libro libro5= new Libro();
		libro5.setAutor(autor2);
		libro5.setTitulo("Alemania en ruinas");
		
		coleccion1.insertarLibro(libro5);
		
		Libro libro4 = new Libro();
		libro4.setAutor(autor2);
		libro4.setTitulo("El Quijote");
		libro4.setEdicion("1ª edicion");
		libro4.setCodigo("12318243-X");
		libro4.setLugarPubli("Kubre", "Toiloisse", "España");
		libro4.setfechaPublicacion("2", "4", "1943");
		libro4.setPaginas(981);
		
		
		coleccion1.insertarLibro(libro4);
		
		
		Libro libro3= new Libro();
		libro3.setAutor(autor1);
		libro3.setTitulo("Zarai");
		libro3.setEdicion("1ª edicion");
		libro3.setCodigo("12318243-X");
		libro3.setLugarPubli("Kubre", "Toiloisse", "España");
		libro3.setfechaPublicacion("2", "4", "1943");
		libro3.setPaginas(981);
		
		coleccion1.insertarLibro(libro3);
		
		
		Libro libro1= new Libro();

		libro1.setAutor(autor1);
		libro1.setTitulo("Des Ruggo");
		libro1.setEdicion("3ª edicion");
		libro1.setCodigo("123612837-X");
		libro1.setLugarPubli("higiro", "Monge", "Burundi");
		libro1.setfechaPublicacion("2", "4", "1998");
		libro1.setPaginas(981);
		
		coleccion1.insertarLibro(libro1);
		
		
		Libro libro2= new Libro();
		libro2.setAutor(autor1);
		libro2.setTitulo("El principito");
		libro2.setEdicion("1ª edicion");
		libro2.setCodigo("1231823-X");
		libro2.setLugarPubli("Kubre", "Toiloisse", "Francia");
		libro2.setfechaPublicacion("2", "4", "1943");
		libro2.setPaginas(981);
		
		coleccion1.insertarLibro(libro2);
		
		Libro libro6 = new Libro();
		libro6.setAutor(autor2);
		libro6.setTitulo("Aaalo");
		libro6.setEdicion("1ª edicion");
		libro6.setCodigo("12318243-X");
		libro6.setLugarPubli("Kubre", "Toiloisse", "España");
		libro6.setfechaPublicacion("2", "4", "1943");
		libro6.setPaginas(981);
		
		
		coleccion1.insertarLibro(libro6);
		
		Libro ultimoLibro = new Libro();
		ultimoLibro.setAutor(autor2);
		ultimoLibro.setTitulo("Zootopia");
		ultimoLibro.setEdicion("1ª edicion");
		ultimoLibro.setCodigo("12318243-X");
		ultimoLibro.setLugarPubli("Kubre", "Toiloisse", "España");
		ultimoLibro.setfechaPublicacion("2", "4", "1943");
		ultimoLibro.setPaginas(981);
		
		coleccion1.insertarLibro(ultimoLibro);
		
		
		//DESCOMENTAR PARA PROBAR POR CONSOLA, lo deje comentado para agilizar la prueba con libros ya hechos. 
		
//		Libro libroPorConsola = new Libro();
//		
//		libroPorConsola.leerConsola(); 
//		libroPorConsola.setAutor(autor2); //agrego el autor manual, porque es en realidad un objeto. 
//		
//		coleccion1.insertarLibro(libroPorConsola);		
		
		
		
		
		
		
		System.out.println(coleccion1);
		
		System.out.println(coleccion1.getPorTitulo("ra")); //El libro sería Zarai, posicion: 5+1
		
		System.out.println(coleccion1.getPorTitulo("XXz")); //Devolverá -1 porque no hay ningun libro agregado con un titulo similar
		
		

	}

}
