import java.io.File;

/*
 * Escribir un m�todo que reciba por par�metro dos rutas correspondientes a un archivo de origen y otro de destino
 *  y que copie el archivo origen en la ubicaci�n destino. La ruta destino puede consistir en un directorio o un archivo.
 *   En el primer caso, el archivo se copiar� al directorio especificado manteniendo su nombre. 
 *   En el segundo, se tomar� como nombre del archivo copia el que especifique su ruta. 
 *   Adem�s el m�todo recibir� un tercer par�metro que actuar� de bandera en caso de que la ruta destino especifique un archivo y �ste exista.
 *    Si la bandera es cierta, el archivo destino ser� reemplazado por el que se copie. En caso contrario, la operaci�n de copia terminar�
 *    . El m�todo generar� una excepci�n si la bandera de reemplazo vale false y el archivo destino existe.
 */
public class uso {

	public static void main(String[] args) {
		
		String directorioOrigen = args[0];
		String directorioDestino = args[1];
		
		File fileOrigen = new File(directorioOrigen);
		
		

	}

}
