package Ejercicio2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Definomis tamaño del vector y vector
        int[] vector1 = new int[10];

        // Objeto random
        Random rand1 = new Random();

        // Bucle ordenado
        System.out.println("Bucle desordenado");
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = rand1.nextInt(100);
            System.out.print(vector1[i] + " ");
        }

        // Aux
        int aux, cont0, cont1;

        // code
        for (int a = 0; a < vector1.length; a++) {
            cont0 = 0;
            cont1 = 1;
            for (int i = 0; i < vector1.length; i++) {

                if (cont1 < vector1.length) {

                    if (vector1[cont0] > vector1[cont1]) {
                        aux = vector1[cont0];
                        vector1[cont0] = vector1[cont1];
                        vector1[cont1] = aux;
                    }
                }

                cont0++;
                cont1++;
            }

        }

        System.out.println("\nBucle ordenado");

        // Bucle ordenado
        for (int i = 0; i < vector1.length; i++) {
            System.out.print(vector1[i] + " ");
        }

    }
}
