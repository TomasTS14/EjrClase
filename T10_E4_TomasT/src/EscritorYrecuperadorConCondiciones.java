import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class EscritorYrecuperadorConCondiciones {
	
	private static FileInputStream fileInStream;
	private static  ObjectInputStream objInStream;
	
	private static FileOutputStream fileOutStream;
	private static ObjectOutputStream objectOutStream;

	public static void crearYescribirEnHashMap(String fileName, Object objetoAescribir) {
		try{
			
			 fileOutStream = new FileOutputStream(fileName);
			 objectOutStream = new ObjectOutputStream(fileOutStream);
			
			objectOutStream.writeObject(objetoAescribir);
			
			fileOutStream.close();
			objectOutStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	

	}
	public static Map recuperarHashMap(String file) {
		
		HashMap<String,char[]> myMap = new HashMap<>();
		
		try {
			fileInStream = new FileInputStream(file);
			objInStream = new ObjectInputStream(fileInStream);
			
			
			
			myMap = (HashMap)objInStream.readObject();
			fileInStream.close();
			objInStream.close();
		
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return myMap;
		
	}

	
	
		
	
	
}
