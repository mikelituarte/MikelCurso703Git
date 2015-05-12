package curso.ejemplos.basicos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;


public class SerliazarPersona implements Serializable{
	
	
	
	private static Persona[] crearArraysPersonas(int tamaño){
		Persona[] array= new Persona[tamaño];
		int edad = 0;
		Persona p = null;
		String nombre = "";
		
		for(int i=0; i<array.length; i++){
			nombre = "Persona"+ i;
			edad = (int)Math.floor(Math.random()*50);
			p = new Persona(nombre,edad);
			array[i] = p;
		
		}
		
		return array;
	}
	
	public static Persona pedirPersona(){
		Persona persona = null;
		Scanner sc = new Scanner(System.in);
		String nombre = null;
		int edad = 0;
		
		System.out.println("Introduce un Nombre:");
		nombre = sc.next();
		System.out.println("Introduce una edad:");
		edad = sc.nextInt();
		
		
		
		return persona;
	}
	
	private static void mostrarArrayPersonas(Persona[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i].mostrar();
		}
	}
	
	private static void arrayPersonasToFichero(String ruta, Persona[] array) throws IOException{

		ObjectOutputStream salida = null;
		
		try{
			salida = new ObjectOutputStream(new FileOutputStream(ruta));
			salida.writeObject(array);
		}
		catch(Exception e){
			System.out.println("Error al grabar persona en el fichero" + ruta);
		}
		finally{
			salida.close();
		}
	}
	
	
	
	private static Persona[] ficheroToArrayPersonas(String ruta) throws IOException{
		
		ObjectInputStream entrada = null;
		Persona[]  p = null;
		
		try{
			entrada = new ObjectInputStream(new FileInputStream(ruta));
			p = (Persona[])entrada.readObject();
		}
		catch(Exception e){
			System.out.println("Error al leer fichero");
		}
		finally{
			entrada.close();
		} 
		
		return p;
	}
	
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		System.out.println("Inicio pograma");

		String ruta =  "Personas2";
		Persona[] arrayPersonas = null;
		

		
		arrayPersonas = crearArraysPersonas(3);
		arrayPersonasToFichero(ruta, arrayPersonas);
		mostrarArrayPersonas(arrayPersonas);
		System.out.println("-----------------------");
		arrayPersonas = ficheroToArrayPersonas(ruta);
		mostrarArrayPersonas(arrayPersonas);
		//mostrarArrayPersonas(arrayPersonas);
		System.out.println("Fin programa");
		
		
	}

}
