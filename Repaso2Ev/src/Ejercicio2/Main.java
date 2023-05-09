package Ejercicio2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        Random rand = new Random();
        
        // Generar 20 números aleatorios entre 0 y 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(101);
        }
        
        // Copiar los números pares en las primeras posiciones y los impares en las celdas restantes
        int[] aux = new int[numeros.length];
        int i = 0; // Índice para números pares
        int j = numeros.length - 1; // Índice para números impares
        for (int k = 0; k < numeros.length; k++) {
            if (numeros[k] % 2 == 0) {
                aux[i] = numeros[k];
                i++;
            } else {
                aux[j] = numeros[k];
                j--;
            }
        }
        
        // Imprimir el vector original y el vector modificado
        System.out.println("Vector original:");
        for (int k = 0; k < numeros.length; k++) {
            System.out.print(numeros[k] + " ");
        }
        System.out.println();
        
        System.out.println("Vector modificado:");
        for (int k = 0; k < aux.length; k++) {
            System.out.print(aux[k] + " ");
        }
        System.out.println();
    }
}
