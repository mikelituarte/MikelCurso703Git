package curso.ejemplos.basicos;

public class Alumno extends Persona{
	
	public enum NotaCualitativa {
		BRUTO, SUSPENSO, APROBADO, BIEN, NOTABLE, SOBRESALIENTE
	}
	
	
	private int nota;  
	private NotaCualitativa notaPalabra = NotaCualitativa.SUSPENSO;



	public Alumno(String nombre, int edad){
		super (nombre, edad);
	}
	
	public Alumno(String nombre, int edad, int nota) {
		//super();
		super (nombre, edad); // llama al constructor de la clase Persona
		this.nota = nota;
		this.notaPalabra = this.notaEquivalente(); // transformamos la nota numerica al tipo enumerado
	}
	
	
	private NotaCualitativa notaEquivalente(){
		NotaCualitativa notaPalabra = NotaCualitativa.SUSPENSO;
		
		switch (this.nota) {
		case 10:		
		case 9:	
			notaPalabra = NotaCualitativa.SOBRESALIENTE;
			break;
		case 8:		
		case 7:		
			notaPalabra = NotaCualitativa.NOTABLE;
			break;
		case 6:		
			notaPalabra = NotaCualitativa.BIEN;
			break;
		case 5:		
			notaPalabra = NotaCualitativa.APROBADO;
			break;
		case 1:	
		case 0:		
			notaPalabra = NotaCualitativa.BRUTO;
			break;

		default:
			notaPalabra = NotaCualitativa.SUSPENSO; 
			break;
		}
		
		return notaPalabra;
	}
	
	
	public int getNota() {
		return nota;
	}
	
   
	public void setNota(int nota) {
		this.nota = nota;
		this.notaPalabra = notaEquivalente(); 
	}
	
	
	public NotaCualitativa getNotaPalabra() {
		return this.notaPalabra;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		String nota = null;
		String datos = null;
		nota =  "\nNota:" + Integer.toString(this.nota) + "\nNota Cualitativa: "+ this.notaPalabra;
		datos = super.toString() + nota;

		//datos = "El nombre es" + super.nombre + ", la edad es: " + super.edad + " y la edad es: " + nota; 
		return datos;
		//return super.toString();
	}
	

}
