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

	@Override
	public void leerWindow() {
		
		
		Autor autor = new Autor();
		String mensajeNombre = "Introduce el nombre del autor:";
		String mensajeApellidos = "Introduce el apellido de la persona:";

		FechaLugar.mensajeDia("Introduce el dia");
		FechaLugar.mensajeMes("Introduce el mes");
		FechaLugar.mensajeAnno("Introduce el año");

		FechaLugar.mensajePais("Introduce el país");

		autor.setNombre(MyInput.readStringWindow(mensajeNombre));
		MyInput.UpperThenLow(autor.getNombre());

		autor.setApellidos(MyInput.readStringWindow(mensajeApellidos));

		JOptionPane.showMessageDialog(null, "Ahora fecha de nacimiento-->");
		autor.setFechaNaciWindow();
		autor.setPaisNacimiento(FechaLugar.daPaisConWindow());

	}

}
