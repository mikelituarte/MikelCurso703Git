package curso.ejemplos.basicos;




public class MainValorReferencia {
	private static int[] a = new int[]{5,6,8,7};
	
	public static int suma(int a, int b ){
		
		return  (a+b);
		
	}
	public static void porValor (int a){
		a = a + 7;
	}
	public static void mostrarArray(int[] array){
		for (int i =0; i<array.length; i++){
			System.out.println(array[i]);
		}
	}
	
	public static void incrementarArray(int[] arrayAntiguo, int incremento){	
		//int[] nuevoArray = new int[arrayAntiguo.length];
		int[] nuevoArray = arrayAntiguo;

		System.out.println("Dirección de mi array al principio del método " + arrayAntiguo);
		
		for(int i = 0; i<arrayAntiguo.length; i++){
			//arrayAntiguo[i] = arrayAntiguo[i] + incremento;
			nuevoArray[i] = arrayAntiguo[i] + incremento;

		}

		/*arrayAntiguo = nuevoArray;
		mostrarArray(arrayAntiguo);
		System.out.println("Dirección de mi array al final del método " + arrayAntiguo);
		*/
	}
	
	public static void main(String[] args) {
		int a =5;
		String b = "c";
		
		porValor(a);
		//porValor(b);
		//System.out.println(b);
		
		int[] miArray = new int[]{2,3,4,7};
		System.out.println("------- Array Original -------");
		mostrarArray(miArray);
		System.out.println("------- INCREMENTADO -------");
		System.out.println("Dirección de mi array antes de llamar " + miArray);
		incrementarArray(miArray, 5);
		System.out.println("Dirección de mi array después de llamar " + miArray);
		mostrarArray(miArray);
	//	System.out.println("------- Array Original clase -------");
	//	mostrarArray(a);
	}
	
}
