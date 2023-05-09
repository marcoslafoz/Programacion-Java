package Ejercicio2;

public class Divisores {
	public static String nDivisores(int x1, int x2) {

		int contadorN1 = 0;
		int contadorN2 = 0;
		String resultado = "Error";

		for (int i = 1; i <= x1; i++) {
			if (x1 % i == 0) {
				contadorN1++;
			}
		}

		for (int e = 1; e <= x2; e++) {
			if (x2 % e == 0) {
				contadorN2++;
			}
		}

		if (contadorN1 > contadorN2) {
			resultado = "" + x1;
		} else {
			resultado = "" + x2;
		}

		return resultado;

	}
}
