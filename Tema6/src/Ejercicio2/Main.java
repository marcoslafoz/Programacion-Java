package Ejercicio2;

import java.util.Random;

public class Main {
	public static void main(String[] args) {

		// Creamos el objeto random
		Random rand1 = new Random();
		Random rand2 = new Random();

		// Creamos los vectores
		int[] vector1 = new int[10];
		int[] vector2 = new int[10];
		int[] vector3 = new int[10];

		// Asignamos un numero aleatorio a cada dimension del vector 1 y vector 2
		for (int i = 0; i < 10; i++) {
			vector1[i] = rand1.nextInt(11);
			vector2[i] = rand2.nextInt(11);
			vector3[i] = vector1[i] + vector2[i]; // Sumamos las dimensiones del vector1 y vector2 en el vector3
		}

		System.out.println("Vector 1:");
		for (int i = 0; i < 10; i++) {
			System.out.print("[" + i + "] => " + vector1[i] + " ");
		}
		System.out.println("\n");
		System.out.println("Vector 2:");
		for (int i = 0; i < 10; i++) {
			System.out.print("[" + i + "] => " + vector2[i] + " ");
		}
		System.out.println("\n");
		System.out.println("Vector 3:");
		for (int i = 0; i < 10; i++) {
			System.out.print("[" + i + "] => " + vector3[i] + " ");
		}

	}
}
