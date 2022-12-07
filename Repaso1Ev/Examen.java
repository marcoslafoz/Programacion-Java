/**
 Marcos Lafoz
 7-12-22
 Ejercicios Examen 1Ev
**/

//Importamos bibliotecas
import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            // Selecciona el ejercicio
            System.out.println();
            System.out.println("Selecciona el ejercicio: [1-4]");
            System.out.println();
            System.out.println("1> Ejercicio 1");
            System.out.println("2> Ejercicio 2");
            System.out.println("3> Ejercicio 3");
            System.out.println("4> Ejercicio 4");
            System.out.println();

            int selector = teclado.nextInt();
            System.out.println();

            switch (selector) {
                case 1: // Ejercicio 1
                    System.out.println("Has seleccionado el ejercicio " + selector);
                    System.out.println();

                    System.out.println("Selecciona un numero para hacer una piramide inversa");
                    System.out.println();
                    int numero = teclado.nextInt();
                    System.out.println();
                    System.out.println("Piramide de " + numero + " niveles"); // Imprimimos la seleccion
                    System.out.println();

                    for (int i = numero; i > 0; i--) { // Bucle que cuenta desde numero hasta 0 (Filas)

                        for (int a = 1; a <= i; a++) { // Bucle para las columnas
                            System.out.print("*"); // Imprimimos *
                        }
                        System.out.println(); // Salto de linea para la fila
                    }

                    break;

                case 2: // Ejercicio 2
                    System.out.println("Has seleccionado el ejercicio " + selector);

                    break;
                case 3:
                    System.out.println("Has seleccionado el ejercicio " + selector);

                    break;
                case 4:
                    System.out.println("Has seleccionado el ejercicio " + selector);

                    System.out.println();

                    System.out.print("Nombre del producto> "); // Pedimos el nombre del producto
                    String producto = teclado.next(); // Asignamos una variable String

                    System.out.print("Precio> "); // Pedimos precio unitario
                    double precio = teclado.nextDouble(); // Asignamos una variable Double

                    System.out.print("Cantidad> ");// Pedimos precio unitario
                    double cantidad = teclado.nextDouble(); // Asignamos una variable Double

                    // Imprimimos resumen
                    System.out.println();
                    System.out.println("Producto> " + producto + " | Precio> " + precio + " | Cantidad> " + cantidad);
                    System.out.println("Precio total> " + (precio * cantidad));

                    // Pedimos el dinero con el que se va a pagar
                    System.out.print("Dinero en efectivo con el que se va a pagar> ");
                    double efectivo = teclado.nextDouble();

                    // Imprimimos cambio
                    double cambio = (efectivo - (precio * cantidad));
                    System.out.println("A devolver> " + cambio);
                    System.out.println();

                    // Asignamos cambios optimos
                    int b500 = 0, b200 = 0, b100 = 0, b50 = 0, b20 = 0, b10 = 0, b5 = 0, b2 = 0, b1 = 0;
                    // 500
                    while (cambio >= 500) {
                        cambio = cambio - 500;
                        b500++;
                    }
                    // 200
                    while (cambio >= 200) {
                        cambio = cambio - 200;
                        b200++;
                    }
                    // 100
                    while (cambio >= 100) {
                        cambio = cambio - 100;
                        b100++;
                    }
                    // 50
                    while (cambio >= 50) {
                        cambio = cambio - 50;
                        b50++;
                    }
                    // 20
                    while (cambio >= 20) {
                        cambio = cambio - 20;
                        b20++;
                    }
                    // 10
                    while (cambio >= 10) {
                        cambio = cambio - 10;
                        b10++;
                    }
                    // 5
                    while (cambio >= 5) {
                        cambio = cambio - 5;
                        b5++;
                    }
                    // 2
                    while (cambio >= 2) {
                        cambio = cambio - 2;
                        b2++;
                    }
                    // 1
                    while (cambio >= 1) {
                        cambio = cambio - 1;
                        b1++;
                    }

                    // Imprimimos cambios optimos
                    System.out.println("Billetes de 500> " + b500);
                    System.out.println("Billetes de 200> " + b200);
                    System.out.println("Billetes de 100> " + b100);
                    System.out.println("Billetes de 50> " + b50);
                    System.out.println("Billetes de 20> " + b20);
                    System.out.println("Billetes de 10> " + b10);
                    System.out.println("Billetes de 5> " + b5);
                    System.out.println("Billetes de 2> " + b2);
                    System.out.println("Billetes de 1> " + b1);
                    System.out.println("Centimos> " + cambio);

                    break;

                default:
                    System.out.println("Error");
                    break;
            }
        }
    }
}