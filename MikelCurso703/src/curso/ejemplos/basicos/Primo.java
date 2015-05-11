package curso.ejemplos.basicos;

public class Primo {

	
	public static boolean esPrimo(int numero){
		boolean loEs = true;
		int divisor = numero-1;
		
		while (loEs && divisor > 1){
			if (numero % divisor == 0 ){
				loEs = false;
			}
			divisor --;
		}
		
		return loEs;
	}
	
	public static void mostrarPrimos(int hasta){
		for (int i=1; i<=hasta; i++){
			if (esPrimo(i)){
				System.out.println(i);
			}
		}
	}
	
}
