package pruebasExamen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class PruebaPatternyExcepcion {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Introduce un email para saber si es valido: ");
		 try {
			 comprobadorEmail(sc.nextLine());
			 System.out.println("Es valido");
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 
		
		

	}
	
	public static String comprobadorEmail(String email) throws InvalidEmailException {
		String usable="";
		Pattern pattern = Pattern.compile("^(\\w{8,})@(\\w+).(com|es)$");
		Matcher m = pattern.matcher(email);
		
		if (!m.matches()) throw new InvalidEmailException();
		else {
			usable= email;
		}
		return usable;
	}

}
