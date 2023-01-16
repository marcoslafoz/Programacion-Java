
//Importamos bibliotecas
import java.util.Scanner;

//Clase EjercicioLunes7_5
public class Ejercicio8T4 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            // Pedimos la frase
            System.out.println();
            System.out.println("Introduce una frase");
            System.out.println();

            // Asignamos frase a variable
            String frase = teclado.nextLine();
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

            // Bucle
            for (int i = 0; i < nCaracteres; i++) {
                // Asignamos un caracter a la variable caracter
                caracter = frase.charAt(i);

                //Convertimos la frase normal a frase cesar sumando 3 al caracter en numero ASCII
                caracterCesarInt = caracter + 3;

                //Acumulamos los caracteres cesar en la frase cesar
                fraseCesar = fraseCesar + (char) caracterCesarInt;
            }
            
            // Imprimimos la frase convertida
            System.out.println(fraseCesar);
            System.out.println();
        }
    }
}