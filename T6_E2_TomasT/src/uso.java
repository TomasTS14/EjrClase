import java.util.Scanner;
import java.util.concurrent.ExecutionException;

/*
Escribe una clase con un método de nombre enviarMensaje,
que reciba como parámetro una cadena de caracteres correspondiente a
 una dirección de correo electrónico. El método comprobará que la dirección
  recibida es correcta elevando la excepción DirCorreoIncorrectaException en
   caso contrario. La comprobación consistirá en verificar que la dirección contien
    algo antes del carácter “@”, algún carácter después de él y antes del carácter “.”
     y algún carácter después de este.
 */
public class uso {

    public static void main(String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);
        Email email = new Email();
        String mensaje;


        mensaje=email.enviarMensaje();

        System.out.println("Mensaje: "+mensaje);
    }
}
