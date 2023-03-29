package Ejercicio1;

public class Algoritmo {

	public static int buscar(int[] vector1, int elemento) {

		// Variables para la media, ultimo y primero
		int p, m = 0, u;
		p = 0;
		u = vector1.length;

		while (p <= u) {
			m = (p + u / 2);

			if (elemento == vector1[m]) {
				return m;
			} else if (elemento < vector1[m]) {
				u = m - 1;
			} else {
				p = m + 1;
			}

		}

		return vector1[m];

	}

}
