package curso.ejemplos.basicos;

import java.util.Scanner;

public class PedirNumero {

	
private static Scanner sc = new Scanner(System.in);

	public static int pedirNumero(){
		int numero = 0;
		
		System.out.println("INTRODUCE UN NUMERO ");
		numero = sc.nextInt();
		return numero;
	}
}
