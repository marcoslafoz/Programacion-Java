
//Importamos bibliotecas
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            // Definimos variables
            int salario, horas;

            // Pedimos numero de horas
            System.out.println();
            System.out.print("Introduce el numero de horas trabajado> ");
            // Le asignamos una variable
            horas = teclado.nextInt();

            // Division
            if (horas > 40) {
                // 40 primeras horas + extra
                salario = (40 * 12) + ((horas - 40) * 16);
                System.out.println();
                System.out.println("El salario es = " + salario);
            }

            if (horas <= 40) {
                // Sin horas extra
                salario = horas * 12;
                System.out.println();
                System.out.println("El salario es = " + salario);
            }
        }
    }
}