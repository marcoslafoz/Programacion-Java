package Ejercicio3;

import java.util.Random;

public class Algoritmo {

    // Llenamos el vector con numeros aleatorios
    public static void llenarVector(int[] vector, Random rand, int TAMANO_ALEATORIOS) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(TAMANO_ALEATORIOS);
        }
    }

    // Imprimimos el vector
    public static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
}
