
//Importamos bibliotecas
import java.util.Scanner;

//Clase EjercicioLunes7_1
public class Ejercicio1T4 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            //Pedimos frase
            System.out.println();
            System.out.println("Introduce una frase: ");
            System.out.println();

            //Leemos la frase y le asignamos a una variable
            String frase = teclado.nextLine();
            System.out.println();

            //Definimos variable para total de caracteres
            int numeroCaracteres = frase.length();

            //Definimos el incremento
            String incremento = "";

            //Filtro 80 caracteres
            if (numeroCaracteres <= 80) {

                for (int i = 0 ; i < numeroCaracteres ; i++) {
                    //Definimos el caracter
                    char caracter = frase.charAt(i);

                    //Definimos el incremento de letras
                    incremento = incremento + caracter;

                    //Imprimimos el incremento
                    System.out.println(incremento);
                }

            } else {
                //Respuesta de error
                System.out.println("Error, la frase tiene mas de 80 caracteres");
            }
            System.out.println();
        }
    }
}