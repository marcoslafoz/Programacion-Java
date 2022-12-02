
//Importamos bibliotecas
import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            // Leemos un numero
            System.out.print("Introduce un numero> ");
            // Le asignamos una variable
            int numero = teclado.nextInt();

            String numeroString = Integer.toString(numero);
            int longitud = numeroString.length();

            for (int i = 0; i <= longitud + 2; i++) {

                char digito = numeroString.charAt(longitud - 1);
                longitud--;
                System.out.println(((int) digito) - 48);

            }
        }
    }
}