package Ejercicio3;

import java.util.Random;

/*Leer un vector de 10 componentes enteros; calcular el mayor, el menor y los lugares donde se
encuentran.*/

public class Main {
	public static void main(String[] args) {

		// Creamos el objeto random
		Random rand = new Random();

		// Creamos el vector
		int[] vector = new int[10];

		// Asignamos un numero aleatorio a cada posicion del vector
		for (int i = 0; i < 10; i++) {
			vector[i] = rand.nextInt(101);
		}

		// Mostramos todo el vector
		System.out.println("Vector: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " => [" + vector[i] + "] ");
		}

		// Calcular el mayor

		int vecMayor = 0;
		int posVecMayor = 0;
		for (int i = 0; i < 10; i++) {
			if (vector[i] > vecMayor) {
				vecMayor = vector[i];
				posVecMayor = i;
			}
		}

		// Calcular el menor

		int vecMenor = 100;
		int posVecMenor = 100;
		for (int i = 0; i < 10; i++) {
			if (vector[i] < vecMenor) {
				vecMenor = vector[i];
				posVecMenor = i;
			}
		}

		// Mostramos el mayor
		System.out.println("\n\nPosicion mayor: " + posVecMayor);
		System.out.println("Numero mayor: " + vecMayor);
		System.out.println("\nPosicion menor: " + posVecMenor);
		System.out.println("Numero menor: " + vecMenor);

	}
}
