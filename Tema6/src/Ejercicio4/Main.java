package Ejercicio4;

import java.util.Random;

/*4) Generar dos vectores de dimensión 10 (dar valores aleatorios entre 1 y 5) y comprobar para
cada uno de los elementos del primer vector cuántas veces está en el segundo, es decir
primero: 3,7,2
segundo: 3,3,5
el resultado debe ser:
elemento 1 (3): 2 veces
elemento 2 (7): 0 veces
elemento 3 (2): 0 veces*/

public class Main {
	public static void main(String[] args) {

		// Creamos 2 objetos random
		Random rand1 = new Random();
		Random rand2 = new Random();

		// Creamos 2 vectores de dimension 10
		int[] vector1 = new int[10];
		int[] vector2 = new int[10];

		// Damos un valor de 1 a 5 para cada posicion de los vectores
		for (int i = 0; i < 10; i++) {
			vector1[i] = rand1.nextInt(6);
			vector2[i] = rand2.nextInt(6);
		}

		// Imprimimos todos lo valores del vector 1
		int rep = 0;
		System.out.println("Vector1:");
		for (int i = 0; i < 10; i++) {

			for (int b = 0; b < 10; b++) {
				if (vector1[i] == vector2[b]) {
					rep++;
				}
			}

			System.out.println(vector1[i] + ": " + rep);
			rep = 0;
		}

		// Imprimimos todos lo valores del vector 2
		System.out.println("\nVector2:");
		for (int i = 0; i < 10; i++) {
			System.out.print(vector2[i] + ", ");
		}
	}
}
