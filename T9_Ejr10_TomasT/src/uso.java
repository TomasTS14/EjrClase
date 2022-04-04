import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

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
			
			boolean remplazar=false;
			if  ( args[2].equals("true") ) {
				remplazar = true;
				
			}else if ( args[2].equals("false")) {
				 remplazar = false;		
			}		
			
		File fileOrigen = new File(directorioOrigen);
		File fileDestino = new File(directorioDestino);
		System.out.println(new File(".").getAbsolutePath()	);
		try (FileInputStream fileIn = new FileInputStream(fileOrigen.getAbsolutePath());
				FileOutputStream fileOut = new FileOutputStream(fileDestino.getAbsolutePath());){
			
			System.out.println("intentando copiar de '"+directorioOrigen +"' a '" + directorioDestino+"' Con opcion "+remplazar);
			try {
				TimeUnit.SECONDS.sleep(2);
			}catch(Exception e) {
				System.out.println("Fallo de sistema..");
			}
				if (fileDestino.isDirectory()) {
					
					fileIn.transferTo(fileOut);
					
				}
				
				if ( fileDestino.isFile() &&  fileDestino.exists() ) {
					
					 if (  remplazar == true) {
						fileDestino.delete();
						fileIn.transferTo(fileOut);
						}else {
							throw new Exception("Fallo copiando en archivo ya existente, parametro usado: false");
						}
					 
					}else if (fileDestino.isFile() && !fileDestino.exists()) {
						fileIn.transferTo(fileOut);
				}
				
				System.out.println("Copiado con exito");
				
		}catch(IOException e){
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
