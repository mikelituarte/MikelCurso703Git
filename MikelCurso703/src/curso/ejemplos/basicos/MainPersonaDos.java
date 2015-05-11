package curso.ejemplos.basicos;

public class MainPersonaDos {

	
	public static void main(String[] args) {
		
		
		Persona p = new Persona("ABC", 10);
		Persona p2 = null;
		Persona p3 = new Persona("CBA", 45);
		System.out.println(p.toString());
		p = p.sumarAnos(10);
		System.out.println(p.toString());
		
		System.out.println("------ Metodo dos -------");
		
		p2 = p.sumarAnosNueva(p,10);
		System.out.println(p2.toString());
		
		System.out.println("------ Metodo tres -------");
		System.out.println("Mostramos la persona tres ANTES de incrementar su edad con el metodo 3");
		System.out.println(p3.toString());
		Persona.sumarTres(p3, 10);
		System.out.println("Mostramos la persona tres DESPUES de incrementar su edad con el metodo 3");
		System.out.println(p3.toString());
		
	}
}
