package Tema2;

import java.util.Scanner;

public class Ejercicio3T2 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            char letra;
            String cad;
            int contador = 0;
            boolean terminar = false;

            while (!terminar) {

                System.out.println("Ingrese una letra: ");
                // letra = (String) teclado.toString();
                cad = teclado.nextLine();
                letra = cad.charAt(0);

                switch (letra) {
                    case '*':
                        System.out.println('1');
                        break;
                    case 'a':
                    case 'b':
                    case 'c':
                        System.out.println('2');
                        break;
                    case 'd':
                    case 'e':
                    case 'f':
                        System.out.println('3');
                        break;
                    case 'g':
                    case 'h':
                    case 'i':
                        System.out.println('4');
                        break;
                    case 'j':
                    case 'k':
                    case 'l':
                        System.out.println('5');
                        break;
                    case 'm':
                    case 'n':
                    case 'o':
                        System.out.println('6');
                        break;
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                        System.out.println('7');
                        break;
                    case 't':
                    case 'u':
                    case 'v':
                        System.out.println('8');
                        break;
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                        System.out.println('9');
                        break;
                    case '0':
                        terminar = true;
                        System.out.println("Fin del programa, el caracter es 0");
                        System.out.println("El n" + "\u00fa" + "mero de errores es " + contador);
                        break;

                    default:
                        System.out.println("Opcion no valida");
                        contador = contador + 1;
                }
            }
        }
    }
}
