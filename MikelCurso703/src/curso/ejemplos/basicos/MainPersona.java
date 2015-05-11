package curso.ejemplos.basicos;

import java.io.ObjectInputStream.GetField;
import java.net.PasswordAuthentication;
import java.util.Comparator;
import java.util.Scanner;
import java.*;



public class MainPersona {
	
	
	
	
	
	
	public static String pedirNombre(Scanner sc){
		String nombre = null;
		
		System.out.println("INTRODUCE EL NOMBRE ");
		//sc = new Scanner(System.in);
		nombre = sc.next();
		//sc.close();
		return nombre;
	}
	
	public static int pedirEdad(Scanner sc){
		int edad = 0;
		
		System.out.println("INTRODUCE LA EDAD ");
		//sc =  new Scanner(System.in);
		edad = sc.nextInt();
		//sc.close();
		return edad;
	}
	
	
	
	
	
	
	/*public static boolean tieneMayusculas(String pass) {
		boolean res = false;
		boolean encontrada = false;
		int a = 0;
		int b = 0;
		
		String mayusculas= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		

		while (!encontrada && a <pass.length()){
			b=0;
			while (!encontrada && b<mayusculas.length()){
				if (pass.charAt(a) == mayusculas.charAt(b)){
					encontrada = true;
				}
				b++;
			}
			a++;
		}
		
		return encontrada;
	}*/
	
	
	
	public static int tieneMayusculas(String pass) {
		//boolean res = false;
		//boolean encontrada = false;
		int a = 0;
		int b = 0;
		int contadorMayusculas = 0;
		
		String mayusculas= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		while (a <pass.length()){
			b=0;
			while (b<mayusculas.length()){
				if (pass.charAt(a) == mayusculas.charAt(b)){
					contadorMayusculas++;
				}
				b++;
			}
			a++;
		}
		
		return contadorMayusculas;
	}
	
	
	
	
	

	
	public static void main(String[] args) {
		String nombre;
		int edad;
		//PedirDatos solicitarDatos = null;
		Persona persona = null;
		Persona persona2 = null;
		//Persona persona3 = null;
		int numeroPersonas = 1;
		
	//	solicitarDatos = new PedirDatos();
		for (int contador =0; contador < numeroPersonas; contador++){
			
			System.out.println("                   ");
			System.out.println("-----  Persona:   " + (contador+1)+ "   --------");
			nombre = PedirDatos.pedirNombre();
			edad = PedirDatos.pedirEdad();
			if (contador == 0){
				persona = new Persona(nombre, edad);
			//	persona2 = new Persona(nombre, edad);
			}
			else{
				persona.setNombre(nombre);
				persona.setEdad(edad);
			}
			//persona.mostrar();
			if (persona.esMayorDeEdad()){
				System.out.println("Es mayor de edad");
			}
			else
				System.out.println("Es menor de edad");
		}
		
		
		System.out.println(persona.toString());
		System.out.println(persona);

		System.out.println("--- Prueba mayusculas ---");
		
		String pass = "ARLH";
		int res = tieneMayusculas(pass);
		System.out.println(res);
		
		//System.out.println("--- Fin Programa ---");
		

	}
	

}
