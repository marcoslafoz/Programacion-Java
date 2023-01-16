
//Importamos bibliotecas
import java.util.Scanner;

//Clase Ej2Tema3
public class Ejercicio3T3 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            // Ejercicio 2
            // Definimos Variables
            int n1;
            int contador = 2;
            // Generamos numero aleatorio
            double nr = Math.random() / Math.nextDown(0.1);
            // Print inicio
            System.out.println();
            System.out.println("Adivina el numero, dispones de 7 intentos");
            System.out.println();
            System.out.println("Introduce un numero");
            System.out.println();
            n1 = teclado.nextInt();
            if (n1 == (int) nr) {
                System.out.println("Correcto");
                contador = contador + 10;
            } else {
                if (n1 < nr) {
                    System.out.println();
                    System.out.println("El numero es mayor");
                } else {
                    System.out.println();
                    System.out.println("El numero es menor");
                }
            }
            // Bucle
            while (contador <= 7) {
                // Print introduce numero
                System.out.println();
                n1 = teclado.nextInt();

                // Si lo adivinas
                if (n1 == (int) nr) {
                    System.out.println();
                    System.out.println("Correcto");
                    contador = contador + 10;
                } else {
                    if (n1 < nr) {
                        System.out.println();
                        System.out.println("El numero es mayor, llevas " + contador + " intentos");
                        // Contador
                        contador++;
                    } else {
                        System.out.println();
                        System.out.println("El numero es menor, llevas " + contador + " intentos");
                        // Contador
                        contador++;
                    }
                }

            }
            if (contador == 7) {
                System.out.println("Has superado el numero de intentos ");
            }

        }
    }
}