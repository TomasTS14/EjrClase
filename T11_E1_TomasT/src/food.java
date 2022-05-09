
public class food {
	
	private int id;
	private String name;
	private Double price;
	private String description;
	private int calories;
	
	public food (int id, String name, Double price, String description, int calories) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.calories = calories;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

	public int getCalories() {
		return calories;
	}
	public String getCamposConConstantes(int campo) {
		String campoEncontrado="";
		switch (campo) {
		case 1:
			campoEncontrado = String.format("%d", getId());
			break;
		case 2:
			campoEncontrado = ""+getName();
			break;
		case 3:
			campoEncontrado = ""+getPrice();
			break;
		case 4:
			campoEncontrado = ""+getDescription();
			break;
		case 5:
			campoEncontrado = ""+getCalories();
		}
		return campoEncontrado;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	@Override
	
	public String toString() {
		return String.format("\nNombre: %s\nPrecio: %.2f\nDescripcion: %s\nCalorias: %d", this.name, this.price,this.description, this.calories);
	}

}
