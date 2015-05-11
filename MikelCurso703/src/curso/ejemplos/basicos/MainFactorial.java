package curso.ejemplos.basicos;

public class MainFactorial {
	public static void main(String[] args) {
		int hoja = 59;
		int numero = 5;
		String texto = "";
		
		System.out.println(Factorial.factorialNumero(numero));
		System.out.println(EscribirFormato.escribirFinal(hoja));
		System.out.println(EscribirFormato.escribir("El nombre es: ", texto, hoja));
		System.out.println(EscribirFormato.escribir("La edad es: ", Integer.toString(numero), hoja));
		System.out.println(EscribirFormato.escribir("El numero de Serie es: ", Integer.toString(4589614), hoja));
		System.out.println(EscribirFormato.escribir(null, Integer.toString(589614), hoja));
		
		for (int i = 0; i<=8; i++){
			texto = texto +" " + SucesionFibonacci.fibonacci(i);
		}
		System.out.println(EscribirFormato.escribir("Sucesion de Fibonacci: ", texto, hoja));
		System.out.println(EscribirFormato.escribirFinal(hoja));
		//System.out.println(SucesionFibonacci.fibonacci(4));
		
		//System.out.println(Primo.esPrimo(37));
		//Primo.mostrarPrimos(100);
	}
}
