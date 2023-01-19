package Tema4;

//Importamos bibliotecas
import java.util.Scanner;

//Clase EjercicioLunes7_5
public class Ejercicio9T4 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            // Pedimos la frase
            System.out.println();
            System.out.println("Introduce una frase");
            System.out.println();

            // Asignamos frase a variable
            String frase = teclado.nextLine();
            System.out.println();

            // Pedimos el numero de caracteres a desplazar para cifrarlo
            System.out.println("Numero de desplazamientos para realizar el cifrado, 1-10");
            System.out.println();
            int n1 = teclado.nextInt();
            System.out.println();

            // Carga
            System.out.println("Cifrando frase... 100%");
            System.out.println();

            // Definimos longitud de frase
            int nCaracteres = frase.length();

            // Definimos variable "caracter" que ira pasando por toda la frase
            char caracter = ' ';
            int caracterCesarInt = ' ';
            String fraseCesar = " ";

            // Filtro n1 este entre 1 y 10
            if (n1 >= 1 & n1 <= 10) {
                // Bucle
                for (int i = 0; i < nCaracteres; i++) {
                    // Asignamos un caracter a la variable caracter
                    caracter = frase.charAt(i);

                    // Convertimos la frase normal a frase cesar sumando 3 al caracter en numero
                    // ASCII
                    caracterCesarInt = caracter + n1;

                    // Acumulamos los caracteres cesar en la frase cesar
                    fraseCesar = fraseCesar + (char) caracterCesarInt;
                }
            } else {
                System.out.println("Error, El numero introducido debe estar entre el 1 - 10");
            }

            // Imprimimos la frase convertida
            System.out.println(fraseCesar);
            System.out.println();
        }
    }
}