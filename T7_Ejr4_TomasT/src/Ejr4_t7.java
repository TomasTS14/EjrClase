
/*
Escribe un método que a partir de un String,
una palabra a buscar y otra a reemplazar, cree y visualice
 un nuevo texto con la palabra reemplazada. Utiliza el método replaceAll de la clase String.
 */
import java.util.Scanner;

public class Ejr4_t7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        String[] datos;

        System.out.println("Introduce la frase que deseas modificar");
        frase = sc.nextLine();
        System.out.println("Introduce la palabra que quieres remplazar, y la palabra que la remplazará, separadas por un espacio:");
        datos = sc.nextLine().split(" "); //separo la palabra buscada de su remplazo

        String fraseMod= frase.replaceAll(datos[0],datos[1]);
        System.out.println("Frase modificada: " + fraseMod);


    }
}
