package Ejercicio09;

import java.util.Scanner;

/*
 * 4) Sea la clase CuentaCorriente, cuyos atributos son, al menos: titular (string), saldo
(float) y codigo (string de 8 dígitos numéricos, filtrado). Diseñar la clase para poder
realizar las siguientes operaciones:
	• IngresoDinero, actualizando el saldo.
	• RetiroDinero, actualizando el saldo siempre que sea posible; para ello habrá otro
	método llamado PuedoSacar que devolverá true si hay saldo suficiente y false si
	no lo hay. En caso de no haber saldo se avisará con un mensaje indicando el hecho
	y un "pulse return".*/

public class Interfaz {	
	public static void main(String[] args) {
		try(Scanner teclado = new Scanner(System.in)){
			
			//Creamos un objeto que se llame cuenta1
			Cuenta cuenta1 = new Cuenta();
			
			//Pedimos los datos de la cuenta bancaria (cuenta1) y le asignamos las variables
			System.out.print("Introduce tu nombre> ");
			String nombre = teclado.next();
			System.out.print("Introduce tu cantidad de saldo inicial> ");
			float saldo = teclado.nextFloat();
			System.out.println("Introduce tu IBAN");
			String codigo = teclado.next();
			
			//Asignamos las variables al objeto (cuenta1)
			cuenta1.setTitular(nombre);
			cuenta1.setSaldo(saldo);
			cuenta1.setCodigo(codigo);
			
			//Selector de operaciones
			System.out.println("Introduca la operacion que quieres realizar");
			System.out.println("1 | Mostrar datos bancarios");
			System.out.println("2 | Ingresar saldo");
			System.out.println("3 | Retirar saldo");
			
			//Le asignamos una variable a la seleccion anterior de tipo char
			String selecString = teclado.next();
			char selec = selecString.charAt(0);
			
			//Switch con las distintas opciones anteriores
			switch(selec) {
				//Opcion 1 | Mostrar datos
				case '1': 
					System.out.println("Titular: " + cuenta1.getTitular());
					System.out.println("Saldo: " + cuenta1.getSaldo());
					System.out.println("IBAN: " + cuenta1.getCodigo());
				;
					break;
				//Opcion 2 | Ingresar saldo
				case '2': 
					System.out.print("Introduce la cantidad del ingreso> "); //Mostramos la operacion de ingreso
					float ingreso = teclado.nextFloat();
					cuenta1.setSaldo(Operaciones.ingresoDinero(cuenta1.getSaldo(), ingreso));;
					System.out.println("Saldo actualizado correctamente");
					System.out.println("Saldo actual: " + cuenta1.getSaldo() + " E");
				;
					break;
				//Opcion 3 | Retirar saldo
				case '3': 
					System.out.print("Introduce la cantidad de la retirada> "); //Mostramos la operacion de retirada
					float retirada = teclado.nextFloat();
					
					if(Operaciones.comprobarSaldo(saldo, retirada)== true) {
						cuenta1.setSaldo(Operaciones.retirarDinero(cuenta1.getSaldo(), retirada));
						System.out.println("Saldo actualizado correctamente");
						System.out.println("Saldo actual: " + cuenta1.getSaldo() + " E");
					}else {
						System.out.println("Error, no tienes saldo suficiente");
					}
					
				;
					break;
				//Default
				default: 
						System.out.println("Error, no has seleccionado ninguna operacion");
					;
					break;
			}
			
			
			
			
			
		}
	}
}
