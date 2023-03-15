package Ejercicio2;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		try(Scanner teclado = new Scanner(System.in)){
			
			System.out.print("n1> ");
			int n1 = teclado.nextInt();
			
			System.out.print("n2> ");
			int n2 = teclado.nextInt();
			
			String resultado = Divisores.nDivisores(n1, n2);
			
			System.out.println("Solucion: " + resultado);
			
			}
		}
}
