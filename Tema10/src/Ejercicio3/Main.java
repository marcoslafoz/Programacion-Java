package Ejercicio3;

public class Main {
	public static void main(String[] args) {
		
		//Numero de alumnos
		final int N_ALUMNOS = 10;
		
		
		//Creamos vector de objetos y llamamos a la funcion para llenarlos de datos
		Alumno[] alumno = Alumno.crearVectorAlumnos(N_ALUMNOS);

		//Imprimir datos
		Herramientas.mostrarAlumnos(alumno);

		//Ordenamos el vector de objetos segun la nota media
		Herramientas.ordVecNotaMedia(alumno);
		
		//Imprimir datos ordenados
		System.out.println("\n**Ordenados por notaMedia**");
		Herramientas.mostrarAlumnos(alumno);
		
		
		
		
	}
}
