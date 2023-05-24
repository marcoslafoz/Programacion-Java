package Ejercicio03;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {

			System.out.print("N1> ");
			int n1 = teclado.nextInt();

			int resultado = Factorial.resFactorial(n1);
			System.out.println("El factorial de " + n1 + " es " + resultado);

		}
	}
}
