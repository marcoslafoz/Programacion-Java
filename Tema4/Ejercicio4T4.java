
//Importamos bibliotecas
import java.util.Scanner;

//Clase EjercicioLunes7_1
public class Ejercicio4T4 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            // Pedimos una frase y le asignamos una variable
            System.out.println();
            System.out.println("Introduce una frase: ");
            System.out.println();
            String frase = teclado.nextLine();
            System.out.println();

            // Opcion de minusculas o mayusculas (1/2)
            System.out.println("A que desea convertir la frase: ");
            System.out.println();
            System.out.println("1 - Mayusculas");
            System.out.println("2 - Minusculas");
            System.out.println();
            int opcion = teclado.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                System.out.println(frase.toUpperCase());
                    break;
                case 2:
                System.out.println(frase.toLowerCase());
                    break;

                default:
                    break;
            }

            System.out.println();
        }
    }
}