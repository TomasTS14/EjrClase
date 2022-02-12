
import java.util.Scanner;

public class matrizInversa {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n; 
		
		
		System.out.println("--PROGRAMA PARA SACAR MATRICES INVERSAS");
		
		System.out.println("Da la dimension de la matriz nxn");
		n= sc.nextInt();
		n= sc.nextInt();
		
		int[][] matrizOriginal= new int[n][n];
		
		System.out.println("Ve introduciendo cada valor, pasa a la siguiente fila con enter:");
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++)
				matrizOriginal[i][j]= sc.nextInt();
		}
		
		
		
		
		
		
		
		

	}

}
