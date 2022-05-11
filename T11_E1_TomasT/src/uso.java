import java.util.ArrayList;

import javax.swing.SwingUtilities;

/*
 * En el archivo XML adjunto  hay una serie de desayunos.
 *  El objetivo es disponer de esa información en un programa java 
 *  para trabajar con campos de objetos en lugar de un archivo. 
En el último paso deberá presentarse organizada toda la información de todos los objetos.
Antes de este paso plantea sacar diferente información del documento 
como las calorías de la tercera comida, los nombres de todos los desayunos...
 */
public class uso {

	public static void main(String[] args) {
		
//		SwingUtilities.invokeLater(() -> {
//			new lectorDesayunos();
//		});
		
//		LectorDesayunos lector = new LectorDesayunos("./src/desayunos.xml");
//		ArrayList<food> desayunos = lector.getArrayDesayunos();
//		
//		GestorDesayunos gestor = GestorDesayunos.getInstance();
//		gestor.setArrayList(desayunos);
//		
//		System.out.println(gestor.mostrarEnString());
//		System.out.println(gestor.mostrarComidasPorCampo(3));
//		System.out.println(gestor.mostrarCampoComida(2, 3));

		SwingUtilities.invokeLater(() -> new Mainframe());
	}

}
