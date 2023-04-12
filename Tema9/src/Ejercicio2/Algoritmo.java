package Ejercicio2;

import java.util.Random;

public class Algoritmo {

    // Llenamos el vector con numeros aleatorios
    public static void llenarVector(int[] vector, Random rand, int TAMANO_ALEATORIOS) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(TAMANO_ALEATORIOS);
        }
    }

    // Imprimimos el vector
    // Imprimimos el vector
    public static void imprimirVector(int[] vector) {
        for (int numero : vector) {
            System.out.print(numero + "|");
        }
    }

    // Ordenamos el vector
    public static void ordenarVector(int[] vector) {
        int aux, cont0, cont1;

        for (int a = 0; a < vector.length; a++) {
            cont0 = 0;
            cont1 = 1;

            for (int i = 0; i < vector.length; i++) {
                if (cont1 < vector.length) {
                    if (vector[cont0] > vector[cont1]) {
                        aux = vector[cont0];
                        vector[cont0] = vector[cont1];
                        vector[cont1] = aux;
                    }
                }
                cont0++;
                cont1++;
            }
        }
    }

}
