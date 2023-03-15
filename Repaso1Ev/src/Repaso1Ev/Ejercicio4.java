package Repaso1Ev;

//Importamos bibliotecas
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            //Pedimos horas trabajadas esta semana
            System.out.print("Horas trabajadas > ");
            //Asignamos una  variable y la definimos
            int horas = teclado.nextInt();

            //Imprimimos resultado
            System.out.println();
            System.out.println("Salario semanal > " + horas*12 + " euros");
            
        }
    }
}