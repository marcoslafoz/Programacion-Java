package Ejercicio2;

import java.util.Scanner;

public class Interfaz {
public static void main(String[] args) {
	try(Scanner teclado = new Scanner(System.in)){
		
			System.out.print("Nombre empleado> ");
			String nombre = teclado.nextLine();
			
			System.out.print("N empleado> ");
			Integer nEmpleado = teclado.nextInt();
			
			//Leemos datos
			Datos.leerDatos(nombre, nEmpleado);
			
			//Mostramos datos
			System.out.println( Datos.verDatos(nombre, nEmpleado));
		
		}
	}
}
