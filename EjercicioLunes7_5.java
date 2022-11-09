
//Importamos bibliotecas
import java.util.Scanner;

//Clase EjercicioLunes7_5
public class EjercicioLunes7_5 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            // Pedimos una frase
            System.out.println("Introduce una frase: ");

            // La recogemos y le asignamos la variable frase
            String frase = teclado.nextLine();

            // Numero de caracteres de la frase
            int numeroCaracteres = frase.length();

            // Definimos cadenas de caracteres pares e impares
            String frasePares = "";
            String fraseImpares = "";

            // Detectamos los caracteres pares
            for (int i = 1; i < numeroCaracteres; i = i + 2) {
                frasePares = frasePares + frase.charAt(i);
            }
            // Detectamos los caracteres impares
            for (int i = 0; i < numeroCaracteres; i = i + 2) {
                fraseImpares = fraseImpares + frase.charAt(i);
            }

            // Imprimimos por pantalla la cadena de caracteres pares e impares
            System.out.println("Caracteres impares: " + fraseImpares);
            System.out.println("Caracteres pares: " + frasePares);

        }
    }
}