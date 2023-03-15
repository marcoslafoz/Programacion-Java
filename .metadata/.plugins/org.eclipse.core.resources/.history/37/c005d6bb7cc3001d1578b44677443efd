package Tema6;

import java.util.Random;

/*
 * Se generan 20 números aleatorios de tipo entero y se almacenan en un vector.
 * Hay que calcular y mostrar la media y, además, mostrar cuántos números hay:
 * -Superiores a la media
 * -Inferiores a la media
 * -Iguales a la media
 */

public class Ejercicio1T6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[20];
        int sum = 0;
        int countAbove = 0;
        int countBelow = 0;
        int countEqual = 0;
        
        // Generamos 20 números aleatorios y los almacenamos en el vector
        System.out.println("Números aleatorios generados:");
        for (int i = 0; i < 20; i++) {
            numbers[i] = rand.nextInt(100);
            System.out.println("Valor " + (i + 1) + ": " + numbers[i]);
            sum += numbers[i];
        }
        
        // Calculamos la media
        double average = (double) sum / 20;
        System.out.println("Media: " + average);
        
        // Recuento de números por encima, por debajo y igual a la media
        for (int i = 0; i < 20; i++) {
            if (numbers[i] > average) {
                countAbove++;
            } else if (numbers[i] < average) {
                countBelow++;
            } else {
                countEqual++;
            }
        }
        
        System.out.println("Números por encima de la media: " + countAbove);
        System.out.println("Números por debajo de la media: " + countBelow);
        System.out.println("Números iguales a la media: " + countEqual);
    }
}