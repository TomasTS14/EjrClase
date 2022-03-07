/*
Realiza un procedimiento que descomponga la fecha
 actual en 6 variables enteras correspondientes al año, mes, día, hora, minutos y segundos.
 */
import java.util.Scanner;
import java.time.*;

public class ejr2_T7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LocalDateTime fechaActual= LocalDateTime.now();

    String fechaUtil = fechaActual.toString();
    String[] aux = fechaUtil.split(":");
    String[] datosFecha = aux[0].split("-");
    int anno= Integer.parseInt(datosFecha[0]);
    int mes = Integer.parseInt(datosFecha[1]);
    int dia = Integer.parseInt(datosFecha[2].substring(0,2));

    //Para revisar el formato de LocalDate.toString:
      //  System.out.println(fechaActual);
    System.out.printf("Dia: %d\nMes: %d\nAnno: %d\n",dia, mes,anno); //Imprimo primero la fecha separada en variables
        //Como se el formato de localDate y que rellena con 0s le puedo dar un substring que siempre va a coger lo necesario
    String datosTiempo = fechaActual.toString().substring(11,19);
    String[] arrayTiempo = datosTiempo.split(":");

    int horas= Integer.parseInt(arrayTiempo[0]);
    int minutos = Integer.parseInt(arrayTiempo[1]);
    int segundos = Integer.parseInt(arrayTiempo[2]);

    System.out.printf("Hora: %d\nMinuto: %d\nSegundo: %d\n",horas,minutos,segundos);


    }
}
