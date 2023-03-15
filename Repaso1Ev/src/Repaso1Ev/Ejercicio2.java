package Repaso1Ev;

//Importamos bibliotecas
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
               //Pedimos los 2 numeros
               System.out.print("n1>");
               int n1 =teclado.nextInt();
               System.out.print("n2>");
               int n2 = teclado.nextInt();

              //Sacamos lo resultados
              System.out.println();
              System.out.println("Resultados");
              System.out.println("-----------");
              System.out.println("Suma> " + (n1+n2));
              System.out.println("Resta> " + (n1-n2));
              System.out.println("Multiplicacion> " + (n1*n2));
              System.out.println("Division> " + (n1/n2));
        }
    }
}