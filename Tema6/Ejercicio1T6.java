package Tema6;

import java.util.Scanner;

public class Ejercicio1T6 {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            /*
             * 1) Se generan 20 números aleatorios de tipo entero y se almacenan en un
             * vector. Hay que calcular y mostrar la media y, además, mostrar cuántos
             * números hay:
             * -Superiores a la media
             * -Inferiores a la media
             * -Iguales a la media
             */

            System.out.println("Generando 20 numeros aleatorios del 0 - 999");

        }
    }

    private int generador;

    public void generador(int x1) {
        int r1;
        int acumulador = 0;
        int ramdomN = (int) (Math.random() * 1000 + 1);

        int[] vector = new int[x1];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = ramdomN;
            acumulador = acumulador + vector[i];
        }

        r1 = acumulador;

        this.generador = r1;
    }

    public int generador() {
        return this.generador;
    }

    private int media;

    public void media(int x2) {
        int r2 = x2 / 20;

        this.media = r2;
    }

    public int media() {
        return this.media;
    }

    /*
     * class Prueba{
     * Papa a=new Papa();
     * int edad = a.getEdad;
     * String nombre = a.getNombre;
     * }
     */
}
