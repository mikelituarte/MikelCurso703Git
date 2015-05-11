package curso.ejemplos.basicos;

public class ElMayorDeTres {

	public static int elMayor (int numero1, int numero2){
		int mayor =numero2;
		if (numero1>=numero2){
			mayor = numero1;
		}
		return mayor;
		
	}
	
	public static void main(String[] args) {
		int numero1 = 0;
		int numero2 = 0;
		int numero3 = 0;
		int mayor = 0;

		//Pedimos los datos al usuario
		numero1 = PedirNumero.pedirNumero();
		numero2 = PedirNumero.pedirNumero();
		numero3 = PedirNumero.pedirNumero();
		
		//comparamos los tres numeros y asignamos a mayor el numero que sea mayor
		mayor = elMayor(numero1, numero2);
		mayor = elMayor(mayor, numero3);
		
		System.out.println("El numero Mayor de:" + numero1 +", " + numero2 +", " + numero3 +" es: " + mayor);
	}
}
