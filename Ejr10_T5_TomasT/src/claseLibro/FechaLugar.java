package claseLibro;

public class FechaLugar {
	
	private static String mensajeDia;
	private static String mensajeMes;
	private static String mensajeAnno;
	
	private static String mensajePais;
	private static String mensajeCiudad;
	
	
	private static String dia;
	private static String mes;
	private static String anno;
	private static String fecha;
	private static String pais;
	private static String ciudad;
	
	
	
public static void mensajeDia(String mensajeDiaVentana) {
		
		mensajeDia = mensajeDiaVentana;
		
		
	}
	public static void mensajeMes(String mensajeMesVentana) {
		
		mensajeMes= mensajeMesVentana;
	}
	public static void mensajeAnno(String mensajeAnnoVentana) {
		
		mensajeAnno= mensajeAnnoVentana;
	}
	
	public static void mensajePais(String mensajePaisVentana) {
		
		mensajePais=mensajePaisVentana;
		
		
	}
public static void mensajeCiudad(String mensajeCiudadVentana) {
		
		mensajeCiudad=mensajeCiudadVentana;
		
		
	}

	
	
	
	public static String daFechaConsole() {
		
	do {	
		System.out.println("dia en nº:");
	 dia= MyInput.readStringConsole();
	 System.out.println("Mes en nº");
	 mes=MyInput.readStringConsole();
	 System.out.println("Año en nº:");
	 anno=MyInput.readStringConsole();
	
	 
	if (!fechaValida(dia, mes, anno)) System.out.println ("Fecha incorrecta");
	
	}while (!fechaValida(dia, mes, anno));
	
	
	fecha = dia+"/"+mes+"/"+anno;
	
	return fecha;
	}
	
	
	public static String daFechaWindow() {
		
		do {	
			 dia= MyInput.readStringWindow(mensajeDia);
			
			 mes=MyInput.readStringWindow(mensajeMes);

			 anno=MyInput.readStringWindow(mensajeAnno);
			
			 
			if (!fechaValida(dia, mes, anno)) System.out.println ("Fecha incorrecta");
			
			}while (!fechaValida(dia, mes, anno));
			
			
			fecha = dia+"/"+mes+"/"+anno;
			
			return fecha;
	}
	public static boolean fechaValida (String dia, String mes, String anno) {
		int diaNum= Integer.parseInt(dia);
		int mesNum = Integer.parseInt(mes);
		int annoNum= Integer.parseInt(anno);
		
		if (diaNum <1 || diaNum >31) return false;
		
		else if (mesNum < 1 || mesNum > 12) return false;
		
		else if (annoNum < 0 || annoNum > 2030) return false;
	
		return true;
	}
	public static String convierteFechas(String dia, String mes, String anno) {
		String fechaCompleta;
		if (fechaValida(dia, mes, anno)) {
			 fechaCompleta= dia+"/"+mes+"/"+anno;
			return fechaCompleta;
		}
		return "error";
		
	}
	
	public static String daPaisCons() {
		pais= MyInput.readStringConsole();
		
		
		MyInput.UpperThenLow(pais);
		
		return pais;
	}
	public static String daPaisConWindow() {
		pais= MyInput.readStringWindow(mensajePais);
		MyInput.UpperThenLow(pais);
		return pais;
	}
	
	public static String daCiudadCons() {
		
		ciudad= MyInput.readStringConsole();
		MyInput.UpperThenLow(ciudad);
		
		return ciudad;
	}
	public static String daCiudadConWindow() {
		ciudad= MyInput.readStringWindow(mensajeCiudad);
		MyInput.UpperThenLow(ciudad);
		return ciudad;
	}
	public static  String leerLugar() {
		System.out.printf("Ciudad: \t");
		ciudad = daCiudadCons();
		System.out.println("Pais: \t");
		pais= daPaisCons();
		
		String lugarCompleto = ciudad+" ,"+pais;
		
		return lugarCompleto;
	}
	

}
