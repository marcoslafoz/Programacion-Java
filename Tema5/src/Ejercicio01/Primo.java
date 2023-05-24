package Ejercicio01;

public class Primo {
	public static Boolean esPrimo(int n1) {

		int contador = 0;

		for (int i = 1; i < n1; i++) {
			if (n1 % i != 0) {
				contador++;
			}
		}

		if (contador == 2) {
			return false;
		} else {
			return true;
		}

	}
}