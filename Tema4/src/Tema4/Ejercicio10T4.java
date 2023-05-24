package Tema4;

import java.util.Scanner;

//Clase EjercicioLunes7_10
public class Ejercicio10T4 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            // Pedimos el codigo
            System.out.println();
            System.out.print("Introduce el codigo: ");

            // Leemos el codigo y le asignamos una variable
            String codigo = teclado.nextLine();

            // Definimos variables de contadores
            int contHombres = 0;
            int contMujeres = 0;
            int contCorrectos = 0;
            int contMat1 = 0;
            int contMat2 = 0;

            // Filtramos a 8 caracteres
            if (codigo.length() == 8) {

                // Funcione mientras no sea 00000000
                if 
                (
                        codigo != "00000000"
                        &
                        codigo.length() == 8 // Tenga 8 caracteres
                        &
                        codigo.charAt(0) == 49 // Caracter 0 es 1
                        &
                        codigo.charAt(1) == 57 // Caracter 1 es 9
                        &
                        codigo.charAt(2) == 57 // Caracter 2 es 9
                        &
                        codigo.charAt(3) >= 48 // Caracter 3 sea >= 0
                        &
                        codigo.charAt(3) <= 57 // Caracter 3 sea =< 5
                        &
                        (codigo.charAt(4) == 72 || codigo.charAt(4) == 77) // Caracter 4 sea H o M
                        &
                        (codigo.charAt(5) == 49 || codigo.charAt(5) == 50) // Caracter 5 sea 1 o 2
                ) 
                {

                    // Contador de caracteristicas del codigo

                    contCorrectos++;
                    if (codigo.charAt(4) == 72) {
                        contHombres++;
                    }
                    if (codigo.charAt(4) == 77) {
                        contMujeres++;
                    }
                    if (codigo.charAt(5) == 49) {
                        contMat1++;
                    }
                    if (codigo.charAt(5) == 50) {
                        contMat2++;
                    }

                    // Pedimos el codigo dentro del bucle
                    System.out.print("Introduce el codigo: ");

                    // Leemos el codigo y le asignamos una variable dentro del bucle
                    codigo = teclado.nextLine();

                    while 
                    (
                            codigo != "00000000" // Funcione mientras no sea 00000000
                            &
                            codigo.length() == 8 // Tenga 8 caracteres
                            &
                            codigo.charAt(0) == 49 // Caracter 0 es 1
                            &
                            codigo.charAt(1) == 57 // Caracter 1 es 9
                            &
                            codigo.charAt(2) == 57 // Caracter 2 es 9
                            &
                            codigo.charAt(3) >= 48 // Caracter 3 sea >= 0
                            &
                            codigo.charAt(3) <= 57 // Caracter 3 sea =< 5
                            &
                            (codigo.charAt(4) == 72 || codigo.charAt(4) == 77) // Caracter 4 sea H o M
                            &
                            (codigo.charAt(5) == 49 || codigo.charAt(5) == 50) // Caracter 5 sea 1 o 2
                    ) 
                    {
                        // Contador decaracteristicas del codigo
                        // Correctos contador
                        contCorrectos++;
                        if (codigo.charAt(4) == 72) {
                            contHombres++;
                        }
                        if (codigo.charAt(4) == 77) {
                            contMujeres++;
                        }
                        if (codigo.charAt(5) == 49) {
                            contMat1++;
                        }
                        if (codigo.charAt(5) == 50) {
                            contMat2++;
                        }

                        // Pedimos el codigo dentro del bucle
                        System.out.print("Introduce el codigo: ");

                        // Leemos el codigo y le asignamos una variable dentro del bucle
                        codigo = teclado.nextLine();
                    }
                }

                // Error
                else {
                    System.out.println("Error, algun caracter no coincide con el formato del codigo");
                }

                // Imprimimos contadores
                System.out.println();
                System.out.println("Correctos: " + contCorrectos + " Hombres: " + contHombres + " Mujeres: " + contMujeres + " 1ºCurso: " + contMat1 + " 2ºCurso: " + contMat2);
            }

            // Error
            else {
                System.out.println("Error, algun caracter no coincide con el formato del codigo");
            }
        }
    }
}