/*
 * Escribe una clase Producto con atributos codigo (int),
 *  nombre (String), tipo (String), precio (double), 
 *  stock (int). Implementa la clase ArrayProducto,
 *   con un atributo de nombre lista y tipo ArrayList<Producto> 
 *   y con los métodos agregar, eliminar, obtener (el producto a partir de su posición),
 *    buscar (y recuperar el producto por su código), tamaño, imprimirLista, cambiarPrecio
 *     (del producto mediante su código y el nuevo precio). Escribe después un programa para probar
 *      la clase anterior.
 */
public class Producto {

	private int codigo;
	private String nombre;
	private String tipo;
	private double precio;
	private int stock;
	
	public Producto() {
		
	}
	
	public Producto(int codigo, String nombre, String tipo, double precio, int stock) {
		this.codigo= codigo;
		this.nombre= nombre;
		this.tipo= tipo;
		this.precio= precio;
		this.stock= stock;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	
	public String toString() {
		String productoEscrito="Codigo: "+getCodigo()+"\nNombre: "+getNombre()+
				"\nTipo: "+getTipo()+"\nPrecio: "+getPrecio()+"\nStock: "+getStock()+"\n";
		
		return productoEscrito;
		
	}
	
	
	
	
	
	
	
}
