package curso.ejemplos.basicos;

import java.util.Scanner;

public class Bucle {

	//
	public static String pedirRespuesta(Scanner sc){
		String respuesta;
		respuesta = sc.next();
		return respuesta;
	}
	
	public static boolean mantenerse(String respuesta){
		boolean res = false;
		
		if (respuesta.equals("n")){
			res = false;
		}
		else if (respuesta.equals("y")){
			res = true;
		}
		return res;
	}
	
	public static void main(String[] args) {

		String respuesta;
		Scanner sc =  null;
		sc =  new Scanner(System.in);	
		
		do{
			System.out.println("Desea reiniciar? ");
			respuesta = pedirRespuesta(sc);
		}while (mantenerse(respuesta));
		System.out.println("Fin del Programa");
		
	}	
}
