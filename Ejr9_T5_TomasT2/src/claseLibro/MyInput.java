package claseLibro;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class MyInput {
	 
	
	private static String readString;
	private static int readInt;
	private static float readFloat;
	private static double readDouble;
	
	public  static String readStringConsole() {
		Scanner sc= new Scanner(System.in);
		readString= sc.nextLine();
		
		return readString;
		
	}
	
	public static int readIntConsole() {
		Scanner sc= new Scanner(System.in);
		readInt = sc.nextInt();
		sc.close();
		return readInt;
	}
	public static float readFloatConsole() {
		Scanner sc= new Scanner(System.in);
		readFloat = sc.nextFloat();
		sc.close();
		return readFloat;
	}
	public static double readDoubleConsole() {
		Scanner sc= new Scanner(System.in);
		readDouble= sc.nextDouble();
		sc.close();
		return readDouble;
		
	}
	
	public static String readStringWindow(String mensajeVentana) {
		readString= JOptionPane.showInputDialog(mensajeVentana);
		return readString;
	}
	public static int readIntWindow(String mensajeVentana) {
		readInt= Integer.parseInt(JOptionPane.showInputDialog(mensajeVentana));
		return readInt;
	}
	public static float readFloatWindow(String mensajeVentana) {
		readFloat= Float.parseFloat(JOptionPane.showInputDialog(mensajeVentana));
		return readFloat;
	}
	public static double readDoubleWindow(String mensajeVentana) {
		readDouble= Double.parseDouble(JOptionPane.showInputDialog(mensajeVentana));
		return readDouble;
	}
	
	public static String UpperThenLow(String objeto) {
		objeto= objeto.substring(0,1).toUpperCase()+objeto.substring(1).toLowerCase();
		return objeto;
		
	}
	
	
	
	
}
