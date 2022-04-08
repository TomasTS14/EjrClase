import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
public class uso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 1;
		try{
			ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(new File("./src/clientes.dat")));
			while ( menu != -1) {
				System.out.println("Para salir de la aplicacion: -1\nPara agregar clientes: 1\nPara ver los datos: 2\n");
				menu = sc.nextInt();
				sc.nextLine();
				if (menu == 1) {
					System.out.println("Agregando cliente..");
					System.out.println("Escribe el nombre del cliente:");
					String nombre = sc.nextLine();
					System.out.println("Escribe el telefono del cliente:");
					String telefono =  sc.nextLine();
					System.out.println("Escribe la direccion del cliente:");
					String direccion = sc.nextLine();
					System.out.println("Escribe el nif del cliente:");
					String nif = sc.nextLine();
					System.out.println("Es el cliente moroso ? [y/n]");
					String aux = sc.nextLine();
					sc.nextLine();
					boolean moroso = false; //por defecto
						if ( aux.equals("y")) {
							moroso = true;
						}else if (aux.equals("n")) moroso = false;
						System.out.println("Agregando cliente...");
						objectOut.writeObject(new Cliente(nombre, telefono, direccion, nif, moroso));
				}else if (menu == 2) {
					ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream("./src/clientes.dat"));
					
						System.out.println(objectIn.readObject().toString());
					
					
				}

			}
			
			
		}catch(IOException e) {
			System.out.println("No se ha podido crear el archivo o escribir en el");
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
