package curso.ejemplos.basicos;

import java.text.ParseException;
import java.util.Observer;



public class Passsword {

	private String pass = null;
	private int longitudPass = 0;
	

	
	public Passsword(String pass) {
		// TODO Auto-generated constructor stub
		this.pass = pass;
		this.longitudPass = pass.length();
	}
	
	//Cuenta el numero de coincidencias del atributo pass con el String pasado como parametro
	public int contarCoincidencias(String palabra){
		int a = 0;
		int b = 0;
		int contadorLetra = 0;
		int longitudPalabra= 0;
		
		longitudPalabra = palabra.length();
		while (a < this.longitudPass){
			b=0;
			while (b < longitudPalabra){
				if (this.pass.charAt(a) == palabra.charAt(b)){
					contadorLetra++;
				}
				b++;
			}
			a++;
		}
		return contadorLetra;
	}
	
	// Devuelve true si las pass es segura 
	public boolean esPassSegura(){
		
		boolean esSegura = false;
		//if (contarCoincidencias(mayusculas) >1 && contarCoincidencias(minusculas)>1 && contarCoincidencias(numeros)>1 &&this.longitudPass>4){
		if (contarMayusculas() >1 && contarMinusculas()>1 && contarNumeros()>1 &&this.longitudPass>4){
			esSegura = true;
		}
		return esSegura;
	}
	
	public int contarMayusculas(){
		int contador = 0;
		
		for (int i = 0; i < longitudPass; i++){
			if ( ((pass.substring(i, i+1)).hashCode() >= 65)  &&  ((pass.substring(i, i+1)).hashCode() <= 90)  ){
				contador++;
			}
		}
		return contador;
	}
	
	public int contarMinusculas(){
		int contador = 0;
		
		for (int i = 0; i < longitudPass; i++){
			if ( ((pass.substring(i, i+1)).hashCode() >= 97)  &&  ((pass.substring(i, i+1)).hashCode() <= 122)  ){
				contador++;
			}
		}
		return contador;
	}
	
	
	public int contarNumeros(){
		int contador = 0;
		
		for (int i = 0; i < longitudPass; i++){
			if ( ((pass.substring(i, i+1)).hashCode() >= 48)  &&  ((pass.substring(i, i+1)).hashCode() <= 57)  ){
				contador++;
			}
		}
		return contador;
	}
	
	
	public String encriptarPass(){
		String encriptada = "";
		Character c = new Character('A');
		int letra =66;
		
		//encriptada = Character.getDirectionality(65);

	/*	for (int i = 0; i < longitudPass; i++){
			pass.substring(i, i+1)
		}
		*/
		System.out.println("ZZZZZ "+encriptada +" XXXXXXX");
		return encriptada;
	}
	
	
	public  void mostrarSeguridad(){

		
		if (esPassSegura()){
			System.out.println("La contraseña es segura!!!!!!!!");
			System.out.println("El numero de letras mayusculas es: " + contarMayusculas());
			System.out.println("El numero de letras minusculas es: " + contarMinusculas());
			System.out.println("El numero de letras numericas  es: " + contarNumeros());
		}
		else{
			System.out.println("No es segura");
		}
		
	}
	

	


}
