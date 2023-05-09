package Tema4;

//Importamos bibliotecas
import java.util.Scanner;

//Clase EjercicioLunes7_1
public class Ejercicio2T4 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            // Pedimos una frase
            System.out.println("Introduce una frase: ");
            System.out.println();

            // Definimos y recogemos la variable
            String frase = teclado.nextLine();

            // Definimos contasdor de mayusculas y minusculas
            int contMayus = 0;
            int contMinus = 0;

            // Definimos filtro 80 caracteres
            int nc = 0;
            nc = frase.length();

            // Filtramos 80 caracteres
            if (nc <= 80) {

                // Bucle para pasar por todos los caracteres
                for (int i = 0; i < nc; i++) {

                    // Definimos caracter suelto y le asignamos el caracter de la frase
                    char caracter = frase.charAt(i);

                    // Filtro si es mayuscula
                    if ((int) caracter >= 65 & (int) caracter <= 90) {
                        contMayus++;
                    } else {
                        // Filtro si es minuscula
                        if ((int) caracter >= 97 & (int) caracter <= 122) {
                        }
                        contMinus++;
                    }
                }

                // Decimis el numero de mayusculas y minusculas que hay en la frase
                System.out.println();
                System.out.println("Mayusculas: " + contMayus);
                System.out.println("Minusculas: " + contMinus);
            } else {
                System.out.println("Error, hay más de 80 caracteres");
            }
        }
    }
}