
public class pruebaListaProducto {

	public static void main(String[] args) {
		
		Producto arroz = new Producto(191,"arroz","comida" , 2.25, 800);
		Producto soja = new Producto(181, "soja", "comida", 1.20, 1000);
		Producto tv = new Producto(122, "TV lg", "electrodomesticos", 899.29, 10);
		
		ListaProducto lista= new ListaProducto();
		lista.setNombreLista("Cosas a comprar");
		
		lista.agregar(arroz); lista.agregar(soja); lista.agregar(tv);
		
		lista.cambiarPrecio(122, 1200.99);
		
		
		lista.imprimirLista();
		
		System.out.println(lista.buscar(122));

	}

}
