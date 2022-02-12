
import java.util.ArrayList;
public class ColeccionCDs {
	
	ArrayList<CD> coleccion;
	
	public ColeccionCDs() {
		coleccion= new ArrayList<>();
	}
	public CD getCD(int index) {
		
		return coleccion.get(index);
	}
	public boolean addCD(CD cd) {
		return coleccion.add(cd);
	}
	public void removeCD(int index) {
		
		int aux= index -1;
		
		 coleccion.remove(index);
	}
	
	public int enQueDiscoCancion(String parteTiulo) {
	
		
		
			for(int i=0; i<coleccion.size(); i++) {
				for(int j=0; j<coleccion.get(i).totalSize() ; j++) {
					if (coleccion.get(i).dameCancion(j).dameTitulo().contains(parteTiulo)) {
					
						return i;
						
					}
				}
			}
			
		
		return -1;
	}
	
	@Override
	
	public String toString() {
		String cadaCD="";
		
		for(int i=0; i<coleccion.size(); i++) {
			cadaCD += (i+1)+")=============================\n";
			cadaCD += coleccion.get(i);
			cadaCD += "\n";
		}
		
		return cadaCD;
		
	}
		
		

}
