package Tema3;

import java.util.Scanner;

public class Ejercicio1T3 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {

            int ejercicio;

            System.out.println();
            System.out.println("Selecciona una opcion:");
            System.out.println();
            System.out.println("1 - Ejercicio 1: Suma de numeros - 19/10/2022 - Marcos Lafoz");
            System.out.println("2 - Ejercicio 2: Tabla de multiplicar - 19/10/2022 - Marcos Lafoz");
            System.out.println("3 - Ejercicio 3: Divisor propio de un numero - 19/10/2022 - Marcos Lafoz");
            System.out.println("4 - Ejercicio 4: Detector de primos - 24/10/2022 - Marcos Lafoz");
            System.out.println("5 - Ejercicio 5: Suma de numeros - 24/10/2022 - Marcos Lafoz");
            System.out.println("6 - Ejercicio 6: Contador de pares e impares - 24/10/2022 - Marcos Lafoz");
            System.out.println("7 - Ejercicio 7: Media de numeros - 24/10/2022 - Marcos Lafoz");
            System.out.println("8 - Ejercicio 8: Factorial de un numero - 24/10/2022 - Marcos Lafoz");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println("12 - Ejercicio 12: Calculadora lados figuras - 24/10/2022 - Marcos Lafoz");
            System.out.println();

            System.out.println("Introduzca el numero de ejercicio: ");
            System.out.println();
            ejercicio = teclado.nextInt();

            switch (ejercicio) {

                case 1: /* Ejercicio 1 */

                    System.out.println();
                    System.out.println("Has seleccionado el ejercicio " + ejercicio);
                    System.out.println();
                    System.out.println(
                            "Escribir un programa que calcule e imprima la suma de los numeros enteros comprendidos entre A y B que deben leerse por teclado y filtrarse para que A<=B. Los valores de A y B no deben incluirse en la suma.");

                    System.out.println();

                    int A, B, suma, i;

                    System.out.println("Introduzca el numero A: ");
                    System.out.println();
                    A = teclado.nextInt();
                    System.out.println();
                    System.out.println("El numero seleccionado ha sido: " + A);
                    System.out.println();
                    System.out.println("Introduzca el numero B: ");
                    System.out.println();
                    B = teclado.nextInt();
                    System.out.println();
                    System.out.println("El numero seleccionado ha sido: " + B);

                    i = A + 1;
                    suma = 0;

                    while (i < B) {
                        suma = suma + i;
                        i = i + 1;
                    }

                    if (A <= B) {
                        System.out.println();
                        System.out.println("El resultado ha sido: " + suma);
                    } else {
                        System.out.println();
                        System.out.println("Error, el numero B (" + B + ") debe ser mayor que el A (" + A + ")");
                    }
                    break;

                case 2: /* Ejercicio 2 */

                    System.out.println();
                    System.out.println("Has seleccionado el ejercicio " + ejercicio);
                    System.out.println();
                    System.out.println(
                            "Leer un numero N que debe filtrarse entre 1 y 10 y a continuacion calcular y escribir la tabla de multiplicar de ese numero con el siguiente formato:");
                    System.out.println();

                    int n1;

                    System.out.println("Introduzca un numero: ");
                    System.out.println();
                    n1 = teclado.nextInt();
                    System.out.println();
                    if (n1 >= 1 && n1 <= 10) {
                        System.out.println("Tabla de multiplicar del " + n1);
                        System.out.println("--------------------------");
                        System.out.println();
                        for (i = 1; i <= 10; i++) {

                            int resultado;
                            resultado = n1 * i;
                            System.out.println(n1 + " X " + i + " = " + resultado);
                        }
                    } else {
                        System.out.println("Error, el numero seleccionado debe ser entre 0-10");
                    }

                    break;

                case 3: /* Ejercicio 3 */

                    System.out.println();
                    System.out.println("Has seleccionado el ejercicio " + ejercicio);
                    System.out.println();
                    System.out.println(
                            "Escribir un programa que, una vez que lea un numero N por teclado, calcule y escriba los divisores propios de N por la pantalla (sin incluirse a si mismo).");
                    System.out.println();

                    System.out.println("Introduce un numero: ");
                    System.out.println();
                    n1 = teclado.nextInt();
                    System.out.println();
                    System.out.println("Has seleccionado el " + n1);
                    System.out.println();
                    for (i = 2; i < n1; i++) {

                        int operacion = n1 / i;
                        if ((n1 % i) == 0) {
                            System.out.println(operacion + " es divisor.");
                        } else {
                        }

                    }
                    break;
                case 4: /* Ejercicio 4 */
                    System.out.println();
                    System.out.println("Has seleccionado el ejercicio " + ejercicio);
                    System.out.println();
                    System.out.println(
                            "Hacer un programa que lea un número N y nos escriba en la pantalla mediante un mensaje si es o no primo (NOTA: Número primo es aquél que es divisible solo por sí mismo y por la unidad)");
                    System.out.println();

                    System.out.println("Introduce un numero: ");
                    System.out.println();
                    double n2 = teclado.nextInt();
                    System.out.println();
                    System.out.println("Has seleccionado el " + (int) n2);
                    int contador = 0;
                    for (i = 0; i <= n2; i++) {
                        if (n2 % i == 0) {

                            contador++;
                        }
                    }

                    if (contador <= 2) {
                        System.out.println();
                        System.out.println("El numero " + (int) n2 + " es primo");
                    } else {
                        System.out.println();
                        System.out.println("El numero " + (int) n2 + " no es primo");
                    }

                    break;

                case 5: /* Ejercicio 5 */
                    System.out.println();
                    System.out.println("Has seleccionado el ejercicio " + ejercicio);

                    System.out.println();
                    System.out.println(
                            "Hacer un programa que lea un número N y nos escriba en la pantalla mediante un mensaje si es o no primo (NOTA: Número primo es aquél que es divisible solo por sí mismo y por la unidad)");
                    System.out.println();
                    System.out.println();
                    System.out.println("----------------------");
                    System.out.println("Introduce un numero: ");
                    n1 = teclado.nextInt();
                    System.out.println("Suma: " + n1);
                    System.out.println("Numeros introducidos: 1");
                    contador = 1;
                    suma = 0;
                    if (n1 != 0) {
                        while (n1 != 0) {
                            System.out.println("----------------------");
                            System.out.println("Introduce un numero: ");
                            n1 = teclado.nextInt();

                            // Suma numeros
                            suma = suma + n1;
                            System.out.println("Suma: " + suma);

                            // Contador numeros
                            contador++;
                            System.out.println("Numeros introducidos: " + contador);
                        }
                    }
                    break;

                case 6: /* Ejercicio 6 */

                    /* Intro */
                    System.out.println();
                    System.out.println("Has seleccionado el ejercicio " + ejercicio);
                    System.out.println();
                    System.out.println(
                            "Hacer un programa que lea un número N y nos escriba en la pantalla mediante un mensaje si es o no primo (NOTA: Número primo es aquél que es divisible solo por sí mismo y por la unidad)");
                    System.out.println();

                    // Pide numeros 1
                    System.out.println("Introduce un numero: ");
                    System.out.println();
                    n1 = teclado.nextInt();
                    System.out.println();

                    // Declaracion variables
                    int sumapar = 0;
                    int sumaimpar = 0;
                    // Filtro 0
                    if (n1 != 0) {
                        while (n1 != 0) {
                            // Pide numeros 2
                            System.out.println("Introduce un numero: ");
                            System.out.println();
                            n1 = teclado.nextInt();
                            System.out.println();

                            /* Par */
                            if (n1 % 2 == 0) {
                                sumapar = sumapar + n1;
                            } else {
                                /* ImPar */
                                if (n1 % 2 != 0) {
                                    sumaimpar = sumaimpar + n1;
                                } else {
                                    System.out.println("Error");
                                }
                            }
                            // Print suma final
                            System.out.println("Suma PAR:" + sumapar);
                            System.out.println("Suma IMPAR:" + sumaimpar);
                        }
                    }

                    break;

                case 7: /* Ejercicio 7 */
                    n1 = 0;
                    // Pide numeros 1
                    System.out.println("Introduce un numero: ");
                    n1 = teclado.nextInt();
                    System.out.println();

                    // Declaracion variables
                    contador = 0;
                    suma = n1;
                    int mayor = n1;
                    int menor = n1;
                    // Filtro 0

                    while (n1 != 0) {
                        // Pide numeros
                        System.out.println("Introduce un numero: ");
                        n1 = teclado.nextInt();

                        // Contador numero de entradas
                        contador++;

                        // Suma de todas las entradas
                        suma = suma + n1;

                        // Asignamos numero mayor
                        if (n1 > mayor) {
                            mayor = n1;
                        }

                        // Asignamos numero menor
                        if (n1 < menor & n1 !=0) {
                            menor = n1;
                        }
                    }
                    
                    double media = (suma / contador);
                    System.out.println("contador"+contador+"suma"+suma);
                    System.out.println();
                    System.out.println("Menor " + menor);
                    System.out.println("Mayor " + mayor);
                    System.out.println("Media: " + media);
                    break;

                case 8: /* Ejercicio 8 */

                    // Pide numeros
                    System.out.println();
                    System.out.println("Introduce un numero: ");
                    System.out.println();
                    n1 = teclado.nextInt();

                    // Declaracion variables
                    contador = 1;

                    // Filtro 0
                    if (n1 > 0) {
                        for (i = 1; i <= n1; i++) {
                            contador = contador * i;
                        }
                        System.out.println();
                        System.out.println("El factorial de " + n1 + " es " + contador);
                    } else {
                        System.out.println();
                        System.out.println("El numero debe ser mayor que 0");
                    }
                    break;

                case 12: /* Ejercicio 12 */

                    // Elegir opcion
                    System.out.println();
                    System.out.println("Elige una figura");
                    System.out.println();
                    System.out.println("1. Triangulo");
                    System.out.println("2. Cuadrado");
                    System.out.println("3. Rectangulo");
                    System.out.println();
                    int opcion = teclado.nextInt();
                    System.out.println();

                    // Opciones formas
                    switch (opcion) {
                        case 1:
                            // Triangulo
                            // Pedidos medidas
                            System.out.println("Introduce su base");
                            System.out.println();
                            int base = teclado.nextInt();
                            System.out.println();
                            System.out.println("Introduce su altura");
                            System.out.println();
                            int altura = teclado.nextInt();
                            System.out.println();
                            // Operacion
                            double resultado = (base * altura) / 2;
                            System.out.println("El area del triangulo de base " + base + " y de altura " + altura
                                    + " es " + resultado);
                            break;
                        case 2:
                            // Cuadrado
                            // Pedidos medidas
                            System.out.println("Introduce el lado 1");
                            System.out.println();
                            base = teclado.nextInt();
                            System.out.println();
                            System.out.println("Introduce el lado 2");
                            System.out.println();
                            altura = teclado.nextInt();
                            System.out.println();
                            // Operacion
                            resultado = (base * altura);
                            System.out.println("El area del cuadrado de lado-1 " + base + " y de lado-2" + altura
                                    + " es " + resultado);
                            break;
                        case 3:
                            // Rectangulo
                            // Pedidos medidas
                            System.out.println("Introduce su base");
                            System.out.println();
                            base = teclado.nextInt();
                            System.out.println();
                            System.out.println("Introduce su altura");
                            System.out.println();
                            altura = teclado.nextInt();
                            System.out.println();
                            // Operacion
                            resultado = (base * altura);
                            System.out.println("El area del rectangulo de base " + base + " y de altura " + altura
                                    + " es " + resultado);
                            break;

                        default:
                            break;
                    }
                    break;

                default: /* Respuesta de error */
                    System.out.println("Ningun ejercicio seleccionado, el ejercicio no existe");
                    break;
            }
        }
    }
}
