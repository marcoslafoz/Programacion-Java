
//Importamos bibliotecas
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            //Entrada de datos
            System.out.print("Lado1> ");
            double l1 = teclado.nextDouble();
            System.out.print("Lado2> ");
            double l2 = teclado.nextDouble();

            //Imprimimos resultados
            System.out.println();
            System.out.println("El area del rectangulo es > " + (l1*l2));
        }
    }
}