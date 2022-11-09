
//Importamos bibliotecas
import java.util.Scanner;

//Clase EjercicioLunes7_5
public class EjercicioLunes7_6 {
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
            int nVocales = 0;
            int nConsonantes = 0;
            int nNumeros = 0;

            // Bucle hasta que acabe la frase
            for (int i = 0; i < numeroCaracteres; i++) {

                // Definimos variable para caracter en concreto dentro del bucle
                char caracter = (frase.charAt(i));

                switch (caracter) {
                    case 'A', 'E', 'I', 'O', 'U':
                        nVocales++;
                        break;
                        case 'a', 'e', 'i', 'o', 'u':
                        nVocales++;
                        break;
                    case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':
                        nNumeros++;
                        break;

                    default:
                        nConsonantes++;
                        break;
                }
            }

            // Decimos cuantas vocales, consonantes y numeros contiene la frase
            System.out.println();
            System.out.println("Vocales: " + nVocales);
            System.out.println("Consonantes: " + nConsonantes);
            System.out.println("Numeros: " + nNumeros);
            System.out.println();

        }
    }
}