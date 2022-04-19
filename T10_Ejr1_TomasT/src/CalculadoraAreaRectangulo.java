import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalculadoraAreaRectangulo {
	double base;
	double altura;
	double area;
	public CalculadoraAreaRectangulo() {
		String message = "Introduce la base del rectangulo:";

		int salida = 1;
		
		
		while (salida != -1) {

			try {
				base = pedirDato(message);
				message = "Introduce la altura del rectangulo";
				altura = pedirDato(message);
				area = base * altura;
				darArea(area);
				
				salida= -1;
			} catch (Exception e) {
				message = "Numero invalido, intentalo otra vez :";
			}
		}

	}

	public double pedirDato(String message) {
		
		return Double.parseDouble(JOptionPane.showInputDialog(null, message,"Entrada",3));
	}
	public void darArea(double area) {
		JOptionPane.showMessageDialog(null, "El area del rectangulo con altura "+this.altura+" y base "+this.base+ " es: "+this.area, "Resultado", 1);
	}


}
