import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.time.LocalDate;

public class FechaHoras_y_Temps3 {
	
	
	
	
	public static void guardaFecha(int anno, int mes, int dia, FileOutputStream file) throws Exception{
		
	
		DataOutputStream doS = new DataOutputStream(file);
		doS.writeChars(LocalDate.of(anno, mes, dia).toString());

	}
	
	public static void guardaHorasYTemps(FileOutputStream fileOutS) throws Exception{
		
		DataOutputStream doS = new DataOutputStream(fileOutS);
	
		
		
		for (int i = 0; i<24; i++) {
			double temp =( Math.random()*30);
			doS.writeInt(i);
			doS.writeDouble(temp);	
		}
		
	}

}
