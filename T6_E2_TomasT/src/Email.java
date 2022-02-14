
public class Email {
	
	private String email;
	
	public Email() {
		
		
	}
	
	public void setEmail(String cadena) throws Exception{
		
		email= cadena;
	}
	
	public boolean comprobarEmail(String cadena) {
		
		String[] datos = cadena.split("@");  //usa su propio iterador , divide la cadena en el momento que encuentra el caracter señalado
		String nombre = datos[0]; //Primer elemento del array
		String dominio = datos[1]; //Segundo elemento del array
		
		String[] dominioDividido= datos[1].split(".");
		System.out.println(nombre);
		System.out.println(dominio);
		
		if (datos[0] != null && datos[1] != null) {			
		return true;
			
		}
		else if (dominioDividido[0] != null && dominioDividido[1] != null ) return true;
		
		else return false;
		
		//Ahora a dividir el dominio
		
	}
	
	
}
