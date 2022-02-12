
public class pruebaArrayProducto {

	public static void main(String[] args) {
		
		Producto prod1 = new Producto(9871, "Pan", "Comida", 1.20, 100);
		Producto prod2 = new Producto(1981, "Arroz", "Comida", 1.45, 220);
		Producto prod3 = new Producto(8871, "Auriculares", "Electronica", 9.9, 80);
		
		ArrayProducto lista= new ArrayProducto();
		
		lista.agregar(prod1); lista.agregar(prod2); lista.agregar(prod3);
		
		lista.imprimirLista();
		
		lista.cambiarPrecio(1981, 2.2);
		
		System.out.println(lista.buscar(1981));
		
		System.out.println(lista.obtener(2));
		

	}

}
