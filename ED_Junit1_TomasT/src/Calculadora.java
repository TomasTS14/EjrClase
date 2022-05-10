
public class Calculadora {
	
	public static Double suma(double val1, double val2) {
		
		Double result = val1 + val2;
		return result;
	}
	
	public static double resta (double val1, double val2) {
		
		return val1 - val2;
	}
	
	public static double multiplicacion (double val1, double val2) {
		
		return val1*val2;
	}
	
	public static double division (double dividendo , double divisor) {
		
		return dividendo/divisor;
	}
	
	public static double restoDivision (double dividendo, double divisor) {
		return dividendo%divisor;
	}
	
	public static double resultadoPotencia(double base, double e) {
		
		return Math.pow(base,e);
	}
	
	public static double resultRaizCuadrada( double val) {
		
		return Math.sqrt(val);
	}
	
	

}
