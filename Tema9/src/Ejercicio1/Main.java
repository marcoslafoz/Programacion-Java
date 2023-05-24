package Ejercicio1;

public class Main {
	public static void main(String[] args) {

		// Definomis tamaño del vector y vector
		int[] vector1 = new int[10];

		// Bucle llenar vector
		for (int i = 0; i < 10; i++) {
			vector1[i] = i;
			System.out.print(vector1[i] + " ");
		}

		int elemento = 2;

		System.out.println("\nEl numero " + elemento + " esta en la posicion " + Algoritmo.buscar(vector1, elemento));

	}
}
