package Tema5;

import java.util.Scanner;

public class Ejercicio2T5 {

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			int n1, n2;

			System.out.print("Introduce N1> ");
			n1 = teclado.nextInt();

			System.out.print("Introduce N2> ");
			n2 = teclado.nextInt();

			int nDiv1 = divisoresN1(n1);
			int nDiv2 = divisoresN2(n2);

			if (nDiv1 > nDiv2) {
				System.out.println("N1 tiene mas divisores que N2");
			}
			if (nDiv1 < nDiv2) {
				System.out.println("N2 tiene mas divisores que N1");
			}
			if (nDiv1 == nDiv2) {
				System.out.println("N1 y N2 tienen los mismo divisores");
			}
		}
	}

	private static int divisoresN1(int x1) {

		int nDivisores = 0;

		for (int i = 1; x1 % i == 0; i++) {
			nDivisores++;
		}

		return nDivisores;
	}

	private static int divisoresN2(int x1) {

		int nDivisores = 0;

		for (int i = 1; x1 % i == 0; i++) {
			nDivisores++;
		}

		return nDivisores;
	}
}