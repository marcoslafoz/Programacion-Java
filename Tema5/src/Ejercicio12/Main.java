package Ejercicio12;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner teclado = new Scanner(System.in)){
		
			//Creamos el objeto empleado1
			Empleado empleado1 = new Empleado();
			
			//Pedimos nombre y codigo y le asignamos una variable
			System.out.print("Nombre> ");
			String nombreEmpleado = teclado.next();
			
			System.out.print("Codigo> ");
			int codigoEmpleado = teclado.nextInt(); 
			
			//Le asignamos el codigo al setter
			empleado1.setNombre(nombreEmpleado);
			empleado1.setCodigo(codigoEmpleado);
			
			//Mostramos los datos
			System.out.println("Nombre: " + empleado1.getNombre());
			System.out.println("Codigo: " + empleado1.getCodigo());
			
			//Pedimos el nuevo nombre y codigo y le asignamos una variable
			System.out.print("Nuevo Nombre> ");
			nombreEmpleado = teclado.next();
			
			System.out.print("Nuevo Codigo> ");
			codigoEmpleado = teclado.nextInt(); 
			
			//Invocamos al metodo modificador
			empleado1.setNombre(nombreEmpleado);
			empleado1.setCodigo(codigoEmpleado);
			
			//Mostramos los datos
			System.out.println("Nuevo Nombre: " + empleado1.getNombre());
			System.out.println("Nuevo Codigo: " + empleado1.getCodigo());
			
			
			
			
			
			
		}
	}
}
