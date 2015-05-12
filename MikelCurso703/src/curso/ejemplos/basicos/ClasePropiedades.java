package curso.ejemplos.basicos;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;

import java.io.IOException;

import java.util.Properties;

public class ClasePropiedades {
	
	private static boolean guardarHistoriaEnFichero(String ruta, String historia) throws IOException{
		boolean exito = true;
		File archivo = null;
		FileWriter fw = null;
		
		
		try{
			archivo = new File(ruta);
			archivo.createNewFile();
			fw = new FileWriter(archivo);
			
			fw.write(historia);
			
		}
		catch(Exception e){
			System.out.println("Error al crear el fichero "+ ruta);
			exito = false;
		}
		finally{
			fw.close();
		}

		
		return exito;
	}
	
	
	private static String propiedadesAfichero(String ficheroPropiedad) throws IOException{
		Properties propiedades = new Properties();
		String historia = "";
		FileInputStream fInputStream = null;
		String ruta = null;
		
		try{
			fInputStream = new FileInputStream(ficheroPropiedad);
			propiedades.load(fInputStream);
			historia = historia + (propiedades.getProperty("start") + "\n");
			historia = historia + (propiedades.getProperty("body") + "\n");
			historia = historia + (propiedades.getProperty("end") + "\n");
			ruta = propiedades.getProperty("outfile");
			
			guardarHistoriaEnFichero(ruta, historia);
			/*System.out.println(propiedades.getProperty("start"));
			System.out.println(propiedades.getProperty("end"));
			System.out.println(propiedades.getProperty("body"));
			System.out.println(propiedades.getProperty("outfile")); */
		
		}
		catch(Exception e){
			System.out.println("Error al leer el fichero");
		}
		finally{
			fInputStream.close();
		}
		
		return historia;
	}
	
	
	private static void cargarCuento(String idioma) throws IOException{
		
		switch (idioma) {
		case "IT":
			propiedadesAfichero("story_it.properties");
			break;
		case "ES":
			propiedadesAfichero("story_es.properties");
			break;	
		
		default://Ingles
			propiedadesAfichero("story_en.properties");
			break;
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		
		//File fPropiedadesEN = new File("story_en.properties");

		System.out.println("Inicio Programa\n");

		cargarCuento(args[0]);
		
		System.out.println("\nFin programa");
	
			
			
			
			
		
		
	}
	
	
}
