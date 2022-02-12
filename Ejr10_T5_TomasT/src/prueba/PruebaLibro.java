package prueba;

import claseLibro.*;
import claseUsoLibro.*;

		
public class PruebaLibro {
			//Estan desordenados por titulo.
				public static void main(String[] args) {
					
					Autor autor1= new Autor();
					

					
					autor1.setNombre("Marco");
					autor1.setApellidos("inaros");
					autor1.setPaisNacimiento("Myammar");
					
					Autor autor2= new Autor();
					
					autor2.setNombre("Miguel");
					autor2.setApellidos("de Cervantes");
					autor2.setPaisNacimiento("Francia");
					
				
					
					Libro libro1= new Libro();
					libro1.setAutor(autor1);
					libro1.setTitulo("Alemania en ruinas");
					libro1.setPaginas(1200);
					libro1.setCodigo("ISHBHJAKHDS4");
					
		
					
					Libro libro2 = new Libro();
					libro2.setAutor(autor2);
					libro2.setTitulo("El Quijote");
					libro2.setEdicion("1ª edicion");
					libro2.setCodigo("12318243-X");
					libro2.setLugarPubli("Kubre", "Toiloisse", "España");
					libro2.setfechaPublicacion("2", "4", "1943");
					libro2.setPaginas(981);


					Libro libro3= new Libro();
					libro3.setTitulo("AAAustria");
					libro3.setAutor(autor1);
					libro3.setLugarPubli("ciudad", "estado", "pais");
					libro3.setfechaPublicacion("11", "1", "1998");
					
					TreeSetLibro lista= new TreeSetLibro();
				
					lista.insertar(libro2); lista.insertar(libro1); lista.insertar(libro3);
					
					System.out.println("Tiene que estar ordenada.. \n"+lista+"\n\n");

				
					
					//System.out.println("Buscando libro..");
					//lista.buscarLibro("Alemania");

					//System.out.println("Buscando libro..");
					//lista.buscarLibro("Miguel");

					//System.out.println("Buscando libro..");
					//slista.buscarLibro("243-X");
				
					
					

	}

}
