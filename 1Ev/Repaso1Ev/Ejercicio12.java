
//Importamos bibliotecas
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            // Pedimos caracter
            System.out.print("Elige un caracter, letra, numero o simbolo> "); // (int)caracter
            // Asignamos una variable
            String caracterBruto = teclado.next();
            System.out.println();
            // Cogemos el primer caracter y le asignamos una variable
            char caracter = caracterBruto.charAt(0);

            // Pedimos la posicion y le asignamos una variable
            System.out.println("Elige la direccion a la que apunta el vertice de la piramide");
            System.out.print("[Arriba | Abajo | Derecha | Izquierda]> ");
            String posicion = teclado.next();
            System.out.println();

            // Pedimos la altura y le asignamos una variable
            System.out.print("Elige la altura de la piramide>");
            int altura = teclado.nextInt();
            System.out.println();

            // Definimos piramide
            String piramide = "";

            // Definimos espacio (caracter que aparecera a los lados de la piramide para
            // darle forma)
            String espacio = "-";

            // Switch con todas las posiciones
            switch (posicion.toLowerCase()) {
                case "arriba":
                    // Bucle para piramide mirando hacia arriba
                    for (int i = 1; i <= altura; i++) {

                        // Definimos una variable para la acumulacion de caracteres para la piramide
                        piramide = piramide + caracter;

                        // Imprimimos la piramide
                        System.out.println(piramide);

                    }

                    break;
                case "abajo":   

                    break;
                case "izquierda":

                    break;
                case "derecha":

                    break;

                default:
                    break;
            }

        }
    }
}