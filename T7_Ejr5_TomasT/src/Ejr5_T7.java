/*
Utilizando expresiones regulares, realiza los siguientes procedimientos para validar strings que se leerán por teclado:
Validar un número de teléfono nacional sin espacios: ej 974283921
Validar un número de teléfono internacional: ej (+34)974283921
Validar un código postal
Validar una fecha en formato dd/mm/aaaa
Validar una matrícula "moderna" española (cuatro números, guión y tres mayúsculas que no sean vocales ni ñ)
 */
import java.util.Scanner;
import java.util.regex.*;
public class Ejr5_T7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        String caracteres;
        System.out.printf("Presiona:\n" +
                "1 para validar un telefono nacional\n" +
                "2 para validar un telefono internacional\n" +
                "3 para validar un codigo postal\n" +
                "4 para validar una fecha para formato dd/mm/aaaa\n" +
                "5 para validar una matricula moderna española\n");
        menu = Integer.parseInt(String.valueOf(sc.next().charAt(0)));
        sc.nextLine();

        switch (menu){
            case 1:
                System.out.println("Introduce el numero local");
                caracteres = sc.nextLine();
                System.out.println(validadorTelefNacional(caracteres)?"telefono valido":"telefono invalido");
                break;
            case 2:
                System.out.println("Introduce el numero internacional");
                caracteres = sc.nextLine();
                System.out.println(validadorTelefInterNacional(caracteres)?"telefono valido":"telefono invalido");
                break;
            case 3:
                System.out.println("Introduce el codigo postal");
                caracteres = sc.nextLine();
                System.out.println(validadorCodigPostal(caracteres)?"codigo postal valido":"codigo postal invalido");
                break;
            case 4:
                System.out.println("Introduce una fecha");
                caracteres = sc.nextLine();
                System.out.println(validadorFecha(caracteres)?"fecha valida":"fecha invalida");
                break;
            case 5:
                System.out.println("Introduce una matricula");
                caracteres = sc.nextLine();
                System.out.println(validadorMatricula(caracteres)?"matricula valida":"matricula invalida");
                break;

        }

    }
    public static boolean validadorTelefNacional(String telefono){

        Pattern telfNacionalValido= Pattern.compile("^[9]{1}\\d{8}$");
        Matcher m = telfNacionalValido.matcher(telefono);
        return m.matches();

    }
    public static boolean validadorTelefInterNacional(String telefono){
        Pattern telfInterValido = Pattern.compile("^\\(?(0034|\\+34)\\)?(\\d\\d\\d)-? ?(\\d\\d)-? ?(\\d)-? ?(\\d)-? ?(\\d\\d)$");
        Matcher m = telfInterValido.matcher(telefono);
        return m.matches();
    }
    public static boolean validadorCodigPostal(String codigoPostal){
        Pattern codigoValido = Pattern.compile("^[0-5]\\d{4}");
        Matcher m = codigoValido.matcher(codigoPostal);
        return m.matches();
    }
    public static boolean validadorFecha(String fecha){
        Pattern fechaValida = Pattern.compile("^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$");
        Matcher m = fechaValida.matcher(fecha);
        return m.matches();
    }
    public static boolean validadorMatricula (String matricula){
        Pattern matriculaValida = Pattern.compile("\\d{4}-[B-Z&&[^AEIOUÑ]]{3}$");
        Matcher m = matriculaValida.matcher(matricula);
        return m.matches();
    }
}
