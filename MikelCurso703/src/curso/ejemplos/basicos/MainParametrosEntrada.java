package curso.ejemplos.basicos;

public class MainParametrosEntrada {

	
/*	public static String rellenar(String entrada){
		String res = null;
		
		res = entrada;
		for (int i=51+entrada.length(); i<=60; i++){
			if (i==60)
				res = res + "|";
			else
				res = res + " ";
		}
				
		return res;		
	}
	
	public static String rellenaro(String entrada){
		String res = null;
		
		res = entrada;
		for (int i=51+entrada.length(); i<=60; i++){
			if (i==60)
				res = res + "|";
			else
				res = res + " ";
		}
				
		return res;		
	}*/
	
	
	
	
	public static int contarCoincidencias (String palabra, char letra){
		int numeroCoincidencias = 0;
		int tamanoPalabra = palabra.length();
		for (int i = 0; i<tamanoPalabra; i++){
			if (palabra.charAt(i) == letra){
				numeroCoincidencias++;
			}
		}
		
		return numeroCoincidencias;
	}
	
	
	public static boolean esPar(int numero){
		boolean respuesta = false;
		
		if (numero % 2 == 0){
			respuesta = true;
		}
		
		return respuesta;
	}
	
	
	public static String voltear(String entrada){
		String res = "";
		int tamanoEntrada = entrada.length();
		char letra;
		
		for (int i = tamanoEntrada -1; i>=0; i--){
			letra = entrada.charAt(i);
			res = res + letra;
		}
		
		return res;
	}
	
	public static int factorial(int numero){
		int res =1;
		
		for(int i = 1; i <= numero; i++){
			res = res * i;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
	
		/*int posMayor = 0;
		String palabraAnterior = null;
		String palabraActual = null;
		
		for (int i =0; i<args.length; i++){
			palabraActual = args[i];
			if (i==0){
				palabraAnterior = palabraActual;
			}
			else{
				if(palabraActual.length() >= palabraAnterior.length()){
					posMayor = i;
					palabraAnterior = palabraActual;
				}
			}
		}
		System.out.println("La palabra mas larga es: " + args[posMayor] + "\nLongitud: " + args[posMayor].length()+ "\nPosicion: " + posMayor);
		System.out.println("\n\n------------------|---  Fin Programa -------------------------");
		
		System.out.println("Longitud:"+ rellenar(args[posMayor]));   */
		
		
		char caracter = args[args.length-1].charAt(0);
		int contadorCoincidencas = 0;
		
		for (int i =0; i <args.length-1; i++){
			contadorCoincidencas = contadorCoincidencas + contarCoincidencias(args[i], caracter);
		}
		System.out.println("El numero de coincidencias de "+ caracter +" es: " + contadorCoincidencas);
		
		System.out.println(voltear("Hola"));
		
		System.out.println(esPar(-2));
		System.out.println(factorial(3));
	}
}
