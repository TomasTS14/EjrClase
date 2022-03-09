package uso;
import principal.*;
import auxiliar.Formato;

public class PruebaListaMultimedia {

	public static void main(String[] args) {
		
		
		// Peliculas
		
		Multimedia titanic = new Pelicula("Titanic", "James Cameron", 2.3, "Leonardo Dicaprio",null);
		Multimedia avatar = new Pelicula("Avatar", "James Cameron", 2.1, "Sam Worthtington","Zoe Saldanna");
		Multimedia cloudAtlas = new Pelicula("Cloud Atlas","Tom Tykwer",3.1,"Tom Hanks",null);		
		//Discos
		
		Multimedia hurricane = new Disco("Hurricane", "Scorpion", 0.8, Formato.WAW, "rock");
		Multimedia ahundredMillionSuns= new Disco("A Hundred Million Suns", "Snow Patrol", 1, Formato.MP3, "rock");
		Multimedia war = new Disco("War", "U2", 1, Formato.WAW, "pop-rock");
		
		//trabajo con lista
		
		ListaMultimedia lista = new ListaMultimedia();
		lista.addMultimedia(titanic);
		lista.addMultimedia(avatar);
		lista.addMultimedia(cloudAtlas);
		lista.addMultimedia(hurricane);
		lista.addMultimedia(ahundredMillionSuns);
		lista.addMultimedia(war);
		
		System.out.println("la duracion total es: "+lista.getDuracionTotal());
		System.out.println(lista.cuantosDiscosDeGenero("rock")+" albumes son de rock");
		System.out.println("la cantidad de pelis sin actriz es: " + lista.numPelisSinActriz());
		
		
		
		

	}

}
