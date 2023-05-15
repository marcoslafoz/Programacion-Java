package Ejercicio3;

import java.util.Random;

public class Herramientas {

	//Clase que genera un nombre aleatorio
	public static String generarNombre(){
		
		Random rand1 = new Random();
		
		String[] listaNombres = {"Lucas", "María", "Sofía", "Juan", "Carlos", "Ana", "Luis", "Pablo", "Alejandro","Mariana"};
		
		String nombreAleatorio = listaNombres[rand1.nextInt(10)];
		
		return nombreAleatorio ;
	}
	
	//Clase que genera un apellido aleatorio
	public static String generarApellido() {
	    
		Random rand1 = new Random();
		
		String[] listaApellidos = {"García", "Fernández", "González", "Rodríguez", "López", "Martínez", "Sánchez", "Pérez", "Gómez", "Martín"};
	    
		String apellidoAleatorio = listaApellidos[rand1.nextInt(10)];
		
		return apellidoAleatorio ;
	}
	
	//Clase que genera notas aleatorias
	public static int generarNota() {
	    
		Random rand1 = new Random();
		
		int numeroAleatorio = rand1.nextInt(11);
		
		return numeroAleatorio;
	}
	
	//Clase que imprime los datos de los alumnos
	public static void mostrarAlumnos(Alumno[] alumnos) {
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i].getAlumno());
        }
    }
	
		
		//Vector que ordena el vector segun la nota media de los alumnos
		public static void ordVecNotaMedia(Alumno[] alumnos) {
			
			Alumno alumnosAux;
			
			for (int i = 0; i < alumnos.length - 1; i++) {
		        for (int j = 0; j < alumnos.length - i - 1; j++) {
		            // Comparar las notas medias de los alumnos
		            if (alumnos[j].getNotaMedia() < alumnos[j + 1].getNotaMedia()) {
		                // Intercambiar los alumnos si están en el orden incorrecto
		            	alumnosAux = alumnos[j];
		                alumnos[j] = alumnos[j + 1];
		                alumnos[j + 1] = alumnosAux;
		            }
		        }
		    }
			
			
		}
	


}