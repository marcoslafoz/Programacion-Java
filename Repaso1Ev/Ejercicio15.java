package Repaso1Ev;

/**
Este programa pide un numero y un digito y nos dice la posicion que ocupa el caracter en el numero
Autor: Marcos
Fecha: 29/11/2022
**/

//Importamos librerias
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            // Pedimos un numero
            System.out.print("Introduce un numero> ");
            String numero = teclado.next();

            // Pedimos un digito
            System.out.print("Introduce un digito para saber la posicion> ");
            String digito = teclado.next();

            for (int i = 0; i < numero.length(); i++) {
                if ((int) numero.charAt(i) == (int) digito.charAt(0)) {
                    System.out.println("El digito " + digito + " esta en la posicion " + (i + 1));
                }
            }
        }
    }
}
