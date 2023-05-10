/**
 * @param NPARTIDOS Cantidad de partidos politicos, dentro se almacenaran los partidos.
 * @param NESCANOS Cantidad de escaños, dentro se almacenaran los votos.
 */

 package Ejercicio2;

 import java.util.Scanner;
 
 public class Main {
     public static void main(String[] args) {
         try (Scanner teclado = new Scanner(System.in)){
             
             //Definimos los parametros y le asignamos cantidades aleatorias
             final int NPARTIDOS = 3;
             final int NESCANOS = 2;
             
             //Instanciamos la matrizes y vectores
             int[][] matriz = new int[NPARTIDOS][NESCANOS];
             int[] totalVotos = new int[NPARTIDOS];
             
             //Llamamos a la funcion GenerarPartidos y sumar votos
             Herramientas.GenerarPartidos(matriz);
             Herramientas.SumarVotos(matriz, NPARTIDOS, totalVotos);
             
             //Llamamos a la funcion ImpPartidos
             Herramientas.ImpPartidos(matriz, totalVotos);
             
             //Temp
             Herramientas.ordPartidos(totalVotos);
             
         }
         
     }
 }
 