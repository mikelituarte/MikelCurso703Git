package curso.ejemplos.basicos;

import java.util.ArrayList;



public class MainAlumno {

	
	public static void main(String[] args) {

		boolean notaCorrecta = false;
		int nota =0;
		
		ArrayList<Persona> miArray = new ArrayList<>();

		int [] arrayNotas = {10,-5,2,50,11,-1,0,5,6,10};
		int contadorNotas =0;
		Persona [] arrayPersonas;
		int numeroAlumnos = 5;
		arrayPersonas = new Persona[numeroAlumnos];
		for (int i=0; i<arrayPersonas.length; i++){
			do{
				nota = arrayNotas[contadorNotas];
				if(nota <0 || nota>10){
					notaCorrecta = false;
					
				}
				else{
					arrayPersonas[i] = new Alumno("Juan"+i, i+1, nota);
					notaCorrecta = true;
				}
				contadorNotas++;
			}
			while (!notaCorrecta);
			System.out.println(arrayPersonas[i].toString());
			System.out.println("--------------------------");
			
		}
		
		//p = new Alumno("Menganito", 54, 8);
		//System.out.println(p.toString());
	}
}
