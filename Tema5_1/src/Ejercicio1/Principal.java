/**
 * Marcos Lafoz
 * Ejercicio 1 Tema 5 
 */

package Ejercicio1;

import java.util.Scanner;

public class Principal{
	public static void main(String[] args) {
		try(Scanner teclado = new Scanner(System.in)){
			
			//Pedimos un numero y le asignamos una variable
			System.out.print("Introduce un numero entero: ");
			int n1 = teclado.nextInt();
			
			if(Primo.esPrimo(n1) == true) {
				System.out.println("El numero " + n1 + " es Primo");
			}else {
				System.out.println("El numero " + n1 + " no es Primo");
			}
			
		}
	}
}