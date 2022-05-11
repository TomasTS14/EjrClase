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
		String campoComida = comida.getCamposConConstantes(campo);
		
		return campoComida;
		
	}
	public ArrayList<String> mostrarComidasPorCampo(int campo){
		ArrayList<String> recopilacionPorCampo = new ArrayList<>();
		for (food desayuno : desayunos) {
			String string = desayuno.getId() + " " +desayuno.getCamposConConstantes(campo);
			recopilacionPorCampo.add(string);
			
		}
		return recopilacionPorCampo;
	}
	public ArrayList<String> mostrarEnString() {
		ArrayList<String> listaEnString = new ArrayList<>();
		for (food desayuno : desayunos) {
			listaEnString.add(desayuno.toString());
			}
		return listaEnString;
	}
	public String mostrarCampoComida (int index, int campo) {
		food comida_AUX= desayunos.get(index);
		String dato = comida_AUX.getCamposConConstantes(campo);
		return dato;
	}

}
