package Tema6;

import java.util.Scanner;

/*
 * Leer un vector de 10 componentes enteros; calcular el mayor, el menor y los
 * lugares donde se encuentran.
 */

public class Ejercicio3T6 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[] numbers = new int[10];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int maxIndex = -1;
            int minIndex = -1;

            // Leemos los números
            System.out.println("Introduce 10 números enteros:");
            for (int i = 0; i < 10; i++) {
                numbers[i] = input.nextInt();

                // Actualizamos el máximo y su posición
                if (numbers[i] > max) {
                    max = numbers[i];
                    maxIndex = i;
                }

                // Actualizamos el mínimo y su posición
                if (numbers[i] < min) {
                    min = numbers[i];
                    minIndex = i;
                }
            }

            // Mostramos los resultados
            System.out.println("El número mayor es " + max + " y se encuentra en la posición " + (maxIndex + 1));
            System.out.println("El número menor es " + min + " y se encuentra en la posición " + (minIndex + 1));
        }
    }
}
