package Ejercicio04;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            // Pedimos un numero y le asignamos una variable
            System.out.print("Introduce un numero entero: ");
            int nLoop = teclado.nextInt();

            // Si el numero es positovo comprobamos si todos los numeros hasta el indicado
            // son primos
            if (nLoop > 0) {
                for (int i = 2; i <= nLoop; i++) {
                    if (Primo.esPrimo(i)) {
                        System.out.println("El numero " + i + " es Primo");
                    }
                }
            } else {
                System.out.println("El número introducido deber ser positivo");
            }
        }
    }
}
