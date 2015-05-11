package curso.ejemplos.basicos;

import java.util.Scanner;

public class MainPassSegura {
	
	public static String pedirPass(){
		String clave = null;
		Scanner sc =null;
		
		
		sc = new Scanner(System.in);
		System.out.println("|------------------------------------|");
		System.out.println("|         INTRODUCE UNA PASS         |");
		System.out.println("|------------------------------------|");
		System.out.println("| Debe contener al menos:            |");
		System.out.println("| - 2 Letras mayusculas              |");
		System.out.println("| - 2 Letras minusculas              |");
		System.out.println("| - 2 Letras numerias                |");
		System.out.println("| - El tamaño debe ser mayor a 4     |");
		System.out.println("|------------------------------------|");
		clave = sc.next();
		
		sc.close();
		return clave;
	}
	

	public static void main(String[] args) {
		String clave = null;
		Passsword pass = null;


		clave = pedirPass();
		
		pass = new Passsword(clave);
		pass.mostrarSeguridad();
		
		pass.encriptarPass();
		
		
	}
	
}
