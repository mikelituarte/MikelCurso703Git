package curso.ejemplos.basicos;

public class EscribirFormato {
	
	public static String escribir(String constante, String variable, int tamano){
		String texto = "| ";
		int longitud = 0;
		
		if (constante != null){
			texto = texto + constante + variable;
			longitud = texto.length();
			for(int i = longitud; i < tamano; i++){
				texto = texto + " ";
			}
			texto = texto + "|";			
		}
		else{

			texto = texto + variable;
			longitud = texto.length();
			for(int i = longitud; i < tamano; i++){
				texto = texto + " ";
			}
			texto = texto + "|";	
			
		}	
		return texto;
	}
	
	public static String escribirFinal(int tamano){
		String texto = "|";
		
		for(int i = 1; i < tamano; i++){
			texto = texto + "-";
		}
		texto = texto + "|";
		
		return texto;
	}
	
}
