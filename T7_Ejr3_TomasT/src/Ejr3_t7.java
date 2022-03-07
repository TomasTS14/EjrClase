/*
Escribe un procedimiento que a partir de una cadena formada
por tu nombre completo, lo desglose y visualice separadamente por
 nombre, apellido 1º y apellido utilizando el método split de la clase String

 */
import java.util.Scanner;
public class Ejr3_t7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreSinSeparar;
        String[] nombreSeparado;
        System.out.println("Introduce tu nombre completo separados por espacio Ej: Carlos Mendoza Suarez");
        nombreSinSeparar = sc.nextLine();
        nombreSeparado = nombreSinSeparar.split(" ");
        System.out.printf("Nombre: %s\nApellido 1º: %s\nApellido 2º: %s\n",nombreSeparado[0],nombreSeparado[1],nombreSeparado[2]);


    }
}
