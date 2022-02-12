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
					
					autor2.setNombre("Antoine");
					autor2.setApellidos("de Saint");
					autor2.setPaisNacimiento("Francia");
					
				
					
					Libro libro1= new Libro();
					libro1.setAutor(autor2);
					libro1.setTitulo("Alemania en ruinas");
					libro1.setPaginas(1200);
					
		
					
					Libro libro2 = new Libro();
					libro2.setAutor(autor2);
					libro2.setTitulo("El Quijote");
					libro2.setEdicion("1ª edicion");
					libro2.setCodigo("12318243-X");
					libro2.setLugarPubli("Kubre", "Toiloisse", "España");
					libro2.setfechaPublicacion("2", "4", "1943");
					libro2.setPaginas(981);
					
					ArrayListLibro lista= new ArrayListLibro();
					
					lista.insertar(libro2); lista.insertar(libro1);
					
					System.out.println("Sin ordenar \n"+lista);
					
					lista.ordenarPorTitulo();
					
					System.out.println("Ordenada por titulo: \n"+lista);
					
					lista.ordenarPorPaginas();
					
					System.out.println("Ordenada por nº de paginas: \n"+lista);
					
					
					

	}

}
