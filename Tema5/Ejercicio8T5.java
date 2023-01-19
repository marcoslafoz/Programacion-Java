package Tema5;

import java.util.Scanner;

public class Ejercicio8T5 {

    public static void main(String[] args) {
        // Clase interfaz
        try (Scanner teclado = new Scanner(System.in)) {

            // Pedimos la variable N y M
            System.out.print("Introduce N> ");
            int n = teclado.nextInt();
            System.out.print("Introduce M> ");
            int m = teclado.nextInt();

            int r = (m - n);

            int factN = factorial(n);
            int factM = factorial(m);
            int factR = factorial(r);

            int resultado = factM / (factN * factR);

            if (m >= n) {
                System.out.println(resultado);
            }

        }
    }

    private static int factorial(int x1) {

        int factorial = 1;

        for (int i = x1; i > 0; i--) {
            factorial = factorial * i;

        }

        return factorial;
    }
}
