package curso.ejemplos.basicos;

import java.io.Serializable;


public class Persona implements Serializable{
	
	public String nombre;
	public int edad;
	public static final int MAYOREDAD = 18;
	
	/**
	 * Constructor de la clase Persona que recibe Nombre y Edad
	 * @param nombre Indica el nombre del nuevo objeto
	 * @param edad Indica la edad del nuevo objeto
	 */
	public Persona(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void mostrar() {
		System.out.println("El nombre es: " + this.nombre);
		System.out.println("La edad es: " + this.edad);
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setEdad(int edad){
		this.edad = edad;
	}
	
	public boolean esMayorDeEdad(){
		boolean esMayor = false;
		if (this.edad >=18){
			esMayor = true;
		}
		else 
			esMayor = false;
		return esMayor;
		//return (this.edad >= MAYOREDAD);
	}
	
	
	/**
	 * Compara dos personas
	 */
	public boolean equals(Object ob) {
		// TODO Auto-generated method stub
		boolean iguales;
		Persona p = null;
		
		if ((ob instanceof Persona) && (ob !=null) && (this != ob) ) {
			p = (Persona)ob;
			if ((this.nombre.equals(p.nombre)) && (this.edad == p.edad)){
				iguales = true;
			}else
				iguales = false;
		}
		else
			iguales = false;
		return iguales;
		//return super.equals(arg0); 
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		String datos = null;
		
		datos = "Nombre: " + this.nombre + "\nEdad: " + this.edad;
		
		return datos;
	}
	
	public Persona sumarAnos(int sumarTanto){
		this.setEdad(this.edad + sumarTanto);
		return this;
	}
	
	public Persona sumarAnosNueva( Persona personaAntigua,int sumarTanto){
		Persona personaNueva = new Persona(personaAntigua.nombre, personaAntigua.edad + sumarTanto);

		return personaNueva;
	}
	
	public static void sumarTres(Persona personaAntigua, int sumarTanto){
	    //Persona p3 = new Persona(personaAntigua.nombre, personaAntigua.edad + sumarTanto);
		//personaAntigua = p3;
		
		
		personaAntigua.setEdad( personaAntigua.edad + sumarTanto);
		
	}
	


	

	
}
