package Ejercicio1;

import java.util.Random;

/*Se generan 20 números aleatorios de tipo entero y se almacenan en un vector. Hay que calcular
y mostrar la media y, además, mostrar cuántos números hay:
	-Superiores a la media
	-Inferiores a la media
	-Iguales a la media*/

public class Main {
  public static void main(String[] args) {

    // Creamos objeto numero ramndom
    Random rand = new Random();

    // Crear el vector
    int[] vector = new int[20];

    // Accedemos al vector y le asignamos un numero a cada posicion
    for (int i = 0; i < 20; i++) {
      vector[i] = rand.nextInt(101);
      ;
      System.out.println(" [" + i + "] => " + vector[i]);
    }

    // Hacemos una variable que recoja todos los numeros de vector y los acumule

    int acumulador = 0;

    for (int i = 0; i < 20; i++) {
      acumulador = acumulador + vector[i];
    }

    System.out.println("Acumulador => " + acumulador);

    // Calculamos la media

    int media = acumulador / 20;

    System.out.println("Media => " + media);

    // Mostramos los numeros que hay superiores a la media

    int nSuperiores = 0;
    String cadenaSuperiores = "";

    for (int i = 0; i < 20; i++) {
      if (vector[i] > media) {
        nSuperiores++; // [18] => 39
        cadenaSuperiores = cadenaSuperiores + " " + "[" + i + "] => " + vector[i];
      }
    }

    System.out.println("nSuperioes a la media => " + nSuperiores + " |" + cadenaSuperiores);

    // Mostramos los numeros que hay inferiores a la media

    int nInferiores = 0;
    String cadenaInferiores = "";

    for (int i = 0; i < 20; i++) {
      if (vector[i] < media) {
        nInferiores++; // [18] => 39
        cadenaInferiores = cadenaInferiores + " " + "[" + i + "] => " + vector[i];
      }
    }

    System.out.println("nInferiores a la media => " + nInferiores + " |" + cadenaInferiores);

    // Mostramos los numeros que hay inferiores a la media

    int nIguales = 0;
    String cadenaIguales = "";

    for (int i = 0; i < 20; i++) {
      if (vector[i] == media) {
        nIguales++; // [18] => 39
        cadenaIguales = cadenaIguales + " " + "[" + i + "] => " + vector[i];
      }
    }

    System.out.println("nIguales a la media => " + nIguales + " |" + cadenaIguales);

  }
}
