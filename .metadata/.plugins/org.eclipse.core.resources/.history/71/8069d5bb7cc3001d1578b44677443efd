package Tema6;

import java.util.Random;

/*
 * 7) Escribir una clase Conjunto que gestione un conjunto de enteros (int) con
 * ayuda de una tabla de
 * tamaño fijo (100) (un conjunto contiene una lista no ordenada de elementos y
 * se caracteriza por
 * el hecho de que cada elemento es único: no se debe encontrar dos veces el
 * mismo valor en la
 * tabla). Las operaciones a implementar (métodos de la clase) son las
 * siguientes:
 * • vaciar: vacía el conjunto.
 * • agregar: añade un entero al conjunto
 * • eliminar: retira un entero del conjunto
 * • copiar: recopila un conjunto en otro
 * • esMiembro: devuelve verdadero si existe en el conjunto un entero dado, o
 * falso si no existe
 * • esIgual: devuelve true si un conjunto es igual a otro, teniendo en cuenta
 * que dos conjuntos son iguales si tienen los mismos elementos
 * • imprimir: realiza la visualización del conjunto.
 */

public class Ejercicio7T6 {
    private int[][] tabla;

    public Ejercicio7T6() {
        this.tabla = new int[10][10];
        Random aleatorio = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                this.tabla[i][j] = aleatorio.nextInt(100) + 1;
            }
        }
    }

    public int[][] getTabla() {
        return this.tabla;
    }

    public static void main(String[] args) {
        Ejercicio7T6 miTabla = new Ejercicio7T6();
        int[][] tabla = miTabla.getTabla();

        System.out.println("+----+----+----+----+----+----+----+----+----+----+");
        for (int i = 0; i < 10; i++) {
            System.out.print("|");
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + tabla[i][j] + " |");
            }
            System.out.println();
            System.out.println("+----+----+----+----+----+----+----+----+----+----+");
        }
    }
}
