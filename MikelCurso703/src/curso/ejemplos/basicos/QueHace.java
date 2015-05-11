package curso.ejemplos.basicos;

import java.util.Scanner;

public class QueHace {

	int a;// por estar declarada aquí, fuera de cualquier método; a es un
			// atributo de la clase. Por lo tanto, es accesible y visible desde
			// todos los métodos de la clase
	static int b = 50;

	
	public QueHace(){
		a = 0;
		b = 50;
	}
	
	
	public QueHace(int valor){
		a = valor;
	}
	
	void metodo() {
		System.out.println("El valor de A es: " + a);
		a++; // equivalente --> a = a + 1;

	}
	


	public static void main(String args[]) {
		QueHace qh1 = null;
		QueHace qh2 = null;
		String nombre;
		QueHace qh7 = null;
		

		qh1 = new QueHace();
		qh2 = new QueHace();

		qh7 = new QueHace();
		System.out.println("El valor de A de qh7 (contructor vacio) es: " + qh7.a);
		qh7 = new QueHace(7);
		System.out.println("El valor de A de qh7 (contructor con parametros) es: " + qh7.a);
		
		
		System.out.println("El valor de B de qh1 es: " + qh1.b);
		qh1.b++;
		System.out.println("El valor de B de qh1 es: " + qh1.b);
		System.out.println("El valor de B de qh2 es: " + qh2.b);
		System.out.println("El valor de B de qh2 es: " + QueHace.b);
		qh1.metodo();
		qh1.metodo();
		qh1.a = 33;
		qh1.metodo();
		System.out.println(qh1.a);
		qh2.metodo();

		/*
		System.out.println("------");
		System.out.println("INTRODUCE UN NOMBRE ");
		Scanner sc = new Scanner(System.in);
		nombre = sc.nextLine();
		System.out.println("El nombre es: " + nombre);
		sc.close();*/
	}

}
