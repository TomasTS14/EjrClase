import java.io.File;

/*
 * Escribir un programa que muestre los nombres de los archivos y directorios que se encuentren en el directorio que se pase como argumento (args[0]).
 */
public class uso {

	public static void main (String[] args) {
	
		String directorioArg = ".";
		
	if ( args.length > 0 ) { //Compruebo que se hayan pasado argumentos, en caso de que no, se usará el directorio desde el que se ejecute el programa
		directorioArg = args[0];
	}
	
	File fileObjeto = new File(directorioArg);
	
	File[] elementos = fileObjeto.listFiles();
	

	for (File elemento : elementos) {
		
		if (elemento.isDirectory()) {
			System.out.println("Directorio => "+elemento.getName());	 //un tipo de string para directorio y otro para archivo. 
		}else if (elemento.isFile()) {
			System.out.println("Archivo => "+elemento.getName());
		}
		
	}
		
	}
}
