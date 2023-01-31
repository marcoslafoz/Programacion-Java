package Tema6;

import java.util.Scanner;

public class Ejercicio1T6 {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Generando 20 numeros aleatorios del 0 - 999"); 
            int nVector = 20;
            int nGenerado = generador(nVector);
            System.out.println("Suma de numeros generados: " + nGenerado );
        }
    }

    public static int generador (int x1) {
        int acumulador = 0;
        int ramdomN = (int) (Math.random() * 1000 + 1);

        int[] vector = new int[x1];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = ramdomN;
            acumulador = acumulador + vector[i];
        }

        int total = acumulador;

        return total;
    }
}
