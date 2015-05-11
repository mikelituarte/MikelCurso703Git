package curso.ejemplos.basicos;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;


public class Prueba5 {
	
	public int calcula(int num1, int num2){
		return num1+num2;
	}
	
	public static void main(String[] argumentos) throws IOException {		
		/*Prueba5 prueba5 = null;
		prueba5 = new Prueba5();
		int num1=2;
		int num2 =3;
		String letra;
		
		int res;
		
		
		res = prueba5.calcula(num1,num2);
		System.out.println(res);*/

	
		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in)); 

		String entrada; 

		System.out.print("Teclee un numero: "); 
		entrada = teclado.readLine();
		int A=0;
		int c=0;
		 A=Integer.parseInt(entrada);  

		System.out.print("Teclee otro numero: "); 
		entrada= teclado.readLine(); 
		int B=Integer.parseInt(entrada); 

		 c = A+B; 
		System.out.println( "El resultado es: "+c ); 
		
		
		
		
		
		//System.out.println(calcula());
	}
	

	
}
