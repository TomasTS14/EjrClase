/*
 * Realizar una �calculadora� en la que se introduzcan dos n�meros. 
 * Adem�s dispondr� de dos botones, uno de suma y otro de resta.
 *  Al pulsarlos se presentar� el resultado correspondiente a esa operaci�n.
 */
import javax.swing.SwingUtilities;
public class Main {

	public static void main(String[] args) {
		
		
		SwingUtilities.invokeLater(()->{
			new CalculadoraPlusMinus();
		});
	}

}
