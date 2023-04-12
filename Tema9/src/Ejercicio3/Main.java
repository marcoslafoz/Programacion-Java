package Ejercicio3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        /*
         * @param TAMANO_ALEATORIOS, TAMANO_VECTOR
         * 
         * @author Marcos
         */

        final int TAMANO_ALEATORIOS = 20, TAMANO_VECTOR = 6;

        // Instanciamos el vector
        int[] vector1 = new int[TAMANO_VECTOR];

        // Creamoso el objeto para los numeros aleatorios
        Random rand1 = new Random();

        // Llenar el vector con números aleatorios
        Algoritmo.llenarVector(vector1, rand1, TAMANO_ALEATORIOS);

        System.out.println("Vector desordenado:");
        Algoritmo.imprimirVector(vector1);

        // Ordenar el vector
        AlgoritmoOrdenacion.ordenarVector(vector1);

        System.out.println("\nVector ordenado:");
        Algoritmo.imprimirVector(vector1);
<<<<<<< HEAD

=======
        
>>>>>>> workspace
    }

}
