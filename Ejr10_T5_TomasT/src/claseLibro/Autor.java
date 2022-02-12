package claseLibro;


	import java.util.ArrayList;

	import javax.swing.JOptionPane;

	public class Autor extends Persona {

		private ArrayList<Libro> coleccionLibros;

		public Autor() {
			super();
		}

		public boolean insertarLibro(Libro Libro) {
			coleccionLibros.add(Libro);
			return true;
		}

		public boolean eliminarLibro(String tituloLibro) {

			for (Libro Libro : coleccionLibros) {
				if (Libro.getTitulo().equals(tituloLibro)) {
					coleccionLibros.remove(Libro);
					return true;
				}
			}
			return false;
		}



		}

	


