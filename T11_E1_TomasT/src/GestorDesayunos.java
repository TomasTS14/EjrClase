import java.util.ArrayList;

public class GestorDesayunos {
	
	private ArrayList<food> desayunos;
	private static GestorDesayunos gestor;
	
	private GestorDesayunos() {};
	
	public static GestorDesayunos getInstance() {
		if (gestor == null) {
			gestor = new GestorDesayunos();
		}
		return gestor;
		
	}
	
	public ArrayList<food> getArrayList(){
		return desayunos;
	}
	public void setArrayList(ArrayList<food> lista) {
		this.desayunos = lista;
	}
	public String filtrarComidaSingular(int index, int campo){
		food comida = desayunos.get(index);
		String campoValor = comida.getCamposConConstantes(campo);
		String campoNombre ="";
		
		switch (campo) {
		case 1:
			campoNombre += "Nombre:";
			break;
		case 2:
			campoNombre += "Precio:";
			break;
		case 3:
			campoNombre += "Descripcion:";
			break;
		case 4:
			campoNombre += "Calorias:";
			break;
		default:
			break;
		}
		
		return campoNombre+" "+campoValor;
		
	}

	public ArrayList<String> mostrarEnString() {
		ArrayList<String> listaEnString = new ArrayList<>();
		for (food desayuno : desayunos) {
			listaEnString.add(desayuno.toString());
			}
		return listaEnString;
	}


}
