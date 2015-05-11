package curso.ejemplos.basicos;

public class ClasecomparaString {

	
	public static void main(String[] args) {
		String palabra1 = null;
		String palabra2 = null;
		
		palabra1 = new String("a");
		palabra2 = new String("a");
		
		if (palabra1 == palabra2){
			System.out.println("las dos palabras son iguales");
		}
		else
			System.out.println("las dos palabras son distintas");
		
	}
	
}
