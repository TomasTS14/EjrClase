import java.io.File;

/*
 * Escribir un método que reciba por parámetro dos rutas correspondientes a un archivo de origen y otro de destino
 *  y que copie el archivo origen en la ubicación destino. La ruta destino puede consistir en un directorio o un archivo.
 *   En el primer caso, el archivo se copiará al directorio especificado manteniendo su nombre. 
 *   En el segundo, se tomará como nombre del archivo copia el que especifique su ruta. 
 *   Además el método recibirá un tercer parámetro que actuará de bandera en caso de que la ruta destino especifique un archivo y éste exista.
 *    Si la bandera es cierta, el archivo destino será reemplazado por el que se copie. En caso contrario, la operación de copia terminará
 *    . El método generará una excepción si la bandera de reemplazo vale false y el archivo destino existe.
 */
public class uso {

	public static void main(String[] args) {
		
		String directorioOrigen = args[0];
		String directorioDestino = args[1];
		
		File fileOrigen = new File(directorioOrigen);
		
		

	}

}
