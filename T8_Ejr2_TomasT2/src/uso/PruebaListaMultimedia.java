package uso;
import principal.*;
import auxiliar.Formato;

public class PruebaListaMultimedia {

	public static void main(String[] args) {
			
		//Discos
		
		Multimedia hurricane = new DiscoPrestable("Hurricane", "Scorpion", 0.8, Formato.WAW, "rock");
		Multimedia ahundredMillionSuns= new DiscoPrestable("A Hundred Million Suns", "Snow Patrol", 1, Formato.MP3, "rock");
		Multimedia war = new DiscoPrestable("War", "U2", 1, Formato.WAW, "pop-rock");
		
		//Uso de lista.
		
		ListaDiscos lista= new ListaDiscos();
		
		lista.insertar((Disco) hurricane);		lista.insertar((Disco) ahundredMillionSuns);		lista.insertar((Disco) war);
		
		((DiscoPrestable) hurricane).prestar();
		((DiscoPrestable)war).prestar();
		
		System.out.println(lista);
		
		System.out.println(lista.cuentaPrestados()+" discos han sido prestados");
		
		System.out.println(lista.getDiscosPrestados());
	}

}
