package Tema5;

import java.util.Scanner;

public class Ejercicio5T5 {

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {

			System.out.print("Introduce un numero A> ");
			int a = teclado.nextInt();
			System.out.print("Introduce un numero B> ");
			int b = teclado.nextInt();

			a = maximoComunDivisor(a, b);
			System.out.println("El MCD es " + a);
		}
	}

	public static int maximoComunDivisor(int a, int b) {
		int temporal;// Para no perder b
		while (b != 0) {
			temporal = b;
			b = a % b;
			a = temporal;
		}
		return a;
	}
}