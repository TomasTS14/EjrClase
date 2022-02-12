
public class Cancion {


		
		private String titulo;
		private String autor;
		
		public Cancion (String titulo, String autor) {
			this.titulo= titulo;
			this.autor = autor;
			
		}
		
		public String dameTitulo() {
			return this.titulo;
		}
		public String dameAutor() {
			return this.autor;
		}
		
		public void ponTitutlo( String titulo) {
			this.titulo= titulo;
		}
		public void ponAutor(String autor) {
			this.autor= autor;
		}
		@Override
		
		public String toString() {
			return "Autor: "+this.autor+"\n"+"Titulo: "+this.titulo;
		}
		

	}

