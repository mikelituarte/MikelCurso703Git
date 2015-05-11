package curso.ejemplos.basicos;

import java.util.Scanner;


public class PedirDatos {
	
	private static Scanner sc = new Scanner(System.in);
	
	
	public static String pedirNombre(){
		String nombre = null;
		
		System.out.println("INTRODUCE EL NOMBRE ");
		nombre = sc.next();;
		return nombre;
	}
	
	public static int pedirEdad(){
		int edad = 0;
		
		System.out.println("INTRODUCE LA EDAD ");
		edad = sc.nextInt();
		return edad;
	}
	
}
