/**
Este programa ..
Autor: Marcos
Fecha: 
**/

//Importamos bibliotecas
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            // Pedimos un numero en el que introduciremos el
            System.out.print("Introduce un numero> ");
            // Asignamos una variable
            String numero = teclado.next();

            // Pedimos un digito a introducir
            System.out.print("Elige un digito> ");
            // Asignamos una variable
            String digito = teclado.next();

            // Pedimos la posicion en la que se introducira el digito
            System.out.print("Introduce la posicion> ");
            // Asiganamos una variable
            int posicion = teclado.nextInt();

            for (int i = 0; i < numero.length(); i++) {
                System.out.print(numero.charAt(i));

                if (i == (posicion)-2) {
                    System.out.print(digito.charAt(0));
                }
            }
        }
    }
}
