/*
 * Realizar una “calculadora” en la que se introduzcan dos números. 
 * Además dispondrá de dos botones, uno de suma y otro de resta.
 *  Al pulsarlos se presentará el resultado correspondiente a esa operación.
 */
import javax.swing.SwingUtilities;
public class Main {

	public static void main(String[] args) {
		
		
		SwingUtilities.invokeLater(()->{
			new CalculadoraPlusMinus();
		});
	}

}
