package Ejercicio3;

import java.util.Scanner;

public class Interfaz {
	public static void main(String[] args) {
		try(Scanner teclado = new Scanner(System.in)){
			
			//Pedimos datos para el nuevo objeto y le asignamos una variable
			System.out.print("ID> ");
			int id = teclado.nextInt();
			
			System.out.print("Nombre> ");
			String nombre = teclado.next();
			
			System.out.print("Turno (D/N)> ");
			String turnoString  = teclado.next();
			char turno = turnoString.charAt(0);
			
			System.out.print("nTitulacion (1-4)> ");
			int  nTitulacion = teclado.nextInt();
			
			System.out.print("Antiguedad> ");
			int antiguedad = teclado.nextInt();
			
			//Creamos el objeto trabajador1 con los atributos que hemos introducido anteriormente
			Trabajador trabajador1 = new Trabajador(id, nombre, turno, nTitulacion, antiguedad);	
			
			//Preguntamos que queremos hacer
			System.out.println("Que quieres hacer> ");
			System.out.println("1 | Mostrar los datos");
			System.out.println("2 | Modificar nombre");
			System.out.println("3 | Calcular nomina");
			System.out.println("E | Salir");
			
			//Le asignamos una variable a la selecion
			String selectString = teclado.next();
			char select = selectString.charAt(0);
			
			//Hacemos un selector, si hemos elegido 1 mostramos los datos
			if(select == '1') {} //Opcion 1, llamamos al metodo visualizarDatos
			
			switch(select) {
			case '1': 
				trabajador1.visualizarDatos();
				;
				break;
			case '2': 
				System.out.print("Nuevo nombre> ");
				String nuevoNombre = teclado.next();
				trabajador1.cambiarNombreTrabajador(nuevoNombre);
				trabajador1.visualizarDatos();
					;
				break;
			case '3': 
				System.out.println("Total nomina> " + trabajador1.calcularNomina() );
					;
				break;
			default: 
				System.out.println("exit");
				;
				break;
			}
			
			
			
			
		}
	}
}
