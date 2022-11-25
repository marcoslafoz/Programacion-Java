
//Importamos bibliotecas
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            
            //Definimos las variables
            double g = 9.81;
            double resultado;
            
            //Pedimos altura de la que cae el objeto
            System.out.print("Introduce la altura> ");
            
            //Asignamos una variable y la definimos
            double h = teclado.nextDouble();
            
            // Operamos
            resultado = Math.sqrt((2*h)/g);

            //Imprimimos resultados
            System.out.println();
            System.out.println("Resultado = " + resultado);
        }
    }
}