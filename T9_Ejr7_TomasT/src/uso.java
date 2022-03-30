import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

/*
 * A partir de los datos de temperaturas por cada hora del 1 de enero de 2022
 *  en Huesca, escribe un método que cree un archivo de almacenamiento de datos con la siguiente estructura:
El primer registro es la cadena “1 de enero 2022”.
El resto de registros lo componen 24 pares hora (entero comenzando en 0) - temperatura (double).
 Las horas se registran en el formato 0-23; las temperaturas puedes simularlas utilizando el método Math.random().
Incluye también el tratamiento de excepciones.

El fichero que contiene los datos no necesita ser "legible por humanos"
 */
public class uso {

	public static void main(String[] args) {
		
		try( BufferedOutputStream bos = new BufferedOutputStream( new FileOutputStream("src/temp.dat"));
				BufferedInputStream bis = new BufferedInputStream();){
			
			FileOutputStream fis = new FileOutputStream("src/data.dat");
			LocalDate fecha = LocalDate.of(2022, 1, 1);
			bos.write(bis.re)
				
		}catch ( IOException e	) {
			e.printStackTrace();
		}
		
		
	

}
