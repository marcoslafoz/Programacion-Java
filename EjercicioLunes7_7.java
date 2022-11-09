
//Importamos bibliotecas
import java.util.Scanner;

//Clase EjercicioLunes7_5
public class EjercicioLunes7_7 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            // Pedimos frase
            System.out.println();
            System.out.println("Introduce una frase: ");
            System.out.println();

            // Leemos frase
            String frase = teclado.nextLine();

            // Definimos variable para total de caracteres
            int numeroCaracteres = frase.length();

            // Definimos contador para vocales, consonantes y numeros que contiene la frase
            int nMayus = 0;
            int nMinus = 0;
            int nNumeros = 0;

            // Bucle hasta que acabe la frase
            for (int i = 0; i < numeroCaracteres; i++) {

                // Definimos variable para caracter en concreto dentro del bucle
                int caracter = (frase.charAt(i));

                //Contador minuscula
                if (caracter >= 97 & caracter <= 122) {nMinus++;}
                //Contador mayuscula
                if (caracter >= 65 & caracter <= 90) {nMayus++;}
                //Contador numero
                if (caracter >= 49 & caracter <= 57) {nNumeros++;} 

            }

            // Decimos cuantas vocales, consonantes y numeros contiene la frase
            System.out.println();
            System.out.println("Vocales: " + nMayus);
            System.out.println("Consonantes: " + nMinus);
            System.out.println("Numeros: " + nNumeros);
            System.out.println();

        }
    }
}