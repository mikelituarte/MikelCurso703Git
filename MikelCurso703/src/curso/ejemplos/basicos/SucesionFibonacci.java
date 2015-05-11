package curso.ejemplos.basicos;

public class SucesionFibonacci {

	public static int fibonacci(int numero){
		int sucesion = 0;
		
		if (numero == 1){
			sucesion = 1;
		}
		else
			if (numero == 0) {
				sucesion = 0;
			}
			else{
				if ((numero -2) >= 0){
					sucesion =  fibonacci(numero-1) + fibonacci(numero -2);
				}
			}	
		return sucesion;
	}
	
}
