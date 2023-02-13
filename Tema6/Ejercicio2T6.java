package Tema6;

import java.util.Scanner;

/*
 * Leer dos vectores de dimensión 10 para construir un tercer vector cuyos componentes sean la suma de los dos anteriores e imprimirlo
*/

public class Ejercicio2T6 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] vector1 = new int[10];
            int[] vector2 = new int[10];
            int[] vectorResultante = new int[10];

            // Leemos el primer vector
            System.out.println("Ingresa los valores del primer vector:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Valor " + (i + 1) + ": ");
                vector1[i] = scan.nextInt();
            }

            // Leemos el segundo vector
            System.out.println("Ingresa los valores del segundo vector:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Valor " + (i + 1) + ": ");
                vector2[i] = scan.nextInt();
            }

            // Calculamos el vector resultante
            for (int i = 0; i < 10; i++) {
                vectorResultante[i] = vector1[i] + vector2[i];
            }

            // Imprimimos el vector resultante
            System.out.println("Vector resultante:");
            for (int i = 0; i < 10; i++) {
                System.out.println("Valor " + (i + 1) + ": " + vectorResultante[i]);
            }
        }
    }
}
