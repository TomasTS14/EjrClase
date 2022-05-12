
public class uso {

	public static void main(String[] args) {
		
		
		Biblioteca biblio = new Biblioteca();
		biblio.addLibro(new Libro("La comunidad del anillo", "JRR Tolkien", "noSe", 400));
		biblio.addLibro(new Libro("El vacio de los suenos", "P.F. Hamilton", "lasuya", 700));
		biblio.addLibro(new Libro("Endymion", "Dan Simmons"	, "nose", 1299));
		
		ConversorAXML.convertirArrayAxml(biblio, "./biblioteca.xml");
	}

}
