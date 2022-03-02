import java.util.Scanner;
public class Email {
    private  Scanner sc;
    private String email;

    public Email() {


    }

//	public String enviarMensaje() throws Exception {
//		sc = new Scanner(System.in);
//		System.out.println("Introduce mensaje");
//		String mensaje;
//		String aux = sc.nextLine();
//		try {
//			comprobarEmail(aux);
//			mensaje = aux;
//			System.out.println("Ha funcionado");
//
//			email = mensaje;
//
//		} catch (CorreoExcepcion e) {
//			e.printStackTrace();
//			enviarMensaje();
//		}
//
//		return email;
//
//	}

    public  void enviarMensaje(String cadena) throws Exception {

        try {
            String[] datos = cadena.split("@");  //usa su propio iterador , divide la cadena en el momento que encuentra el caracter señalado
            String nombre = datos[0]; //Primer elemento del array
            String dominio = datos[1]; //Segundo elemento del array

            String[] dominioDividido = dominio.split("\\.");  //AL PARECER ES UN CARACTER ESPECIAL EL PUNTO.
            String dom1= dominioDividido[0];
            String dom2 = dominioDividido[1];

        } catch (Exception e) {
            throw new CorreoExcepcion(cadena);



        }


    }


}
