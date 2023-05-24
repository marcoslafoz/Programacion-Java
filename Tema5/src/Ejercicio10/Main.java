package Ejercicio10;

import java.util.Scanner;

/*Desarrollar un programa en Java que utilice una clase que se llame Indicador que sea
la representación de un indicador de la vida real (indicadores de nivel, de velocidad,
tacómetros, etc.). Deberá tener los mínimos elementos para representar valores,
ajustarlos con un valor de inicio, imprimir el valor, modificarlos a un valor
determinado e incrementar y disminuir el valor con el que cuentan.*/

public class Main {
	public static void main(String[] args) {
		try(Scanner teclado = new Scanner(System.in)){
			
			//Creamos un objeto
			Indicador indicador1 = new Indicador();
			
			//Pedimos la valocidad y le asignamos una variable
			System.out.print("Introduce la velocidad> ");
			int velocidad = teclado.nextInt();
			
			//Usamos el setter para darle el valor a el objeto indicador1
			indicador1.setVelocidad(velocidad);
			
			//Selector de opciones
			System.out.println("Elige una opcion");
			System.out.println("1 | Modicar velocidad");
			System.out.println("2 | Borrar velocidad");
			System.out.println("3 | Mostrar velocidad");
			
			String selecString = teclado.next();
			char selec = selecString.charAt(0);
			
			if(selec == '1') {
				System.out.print("Introduce la nueva velocidad> ");
				int nuevaVelocidad = teclado.nextInt();
				System.out.println("Velocidad actual> " + indicador1.modVelocidad(nuevaVelocidad) + " Km/h");
			}
			
			if(selec == '2') {
				System.out.println("Borrando velocidad");
				System.out.println("Velocidad actual> " + indicador1.modVelocidad(0) + " Km/h");
			}
			
			if(selec == '3') {
				System.out.println("Velocidad actual> " + indicador1.getVelocidad() + " Km/h");
			}
			
			
		}
	}
}
