package Repaso1Ev;

//Importamos bibliotecas
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            //Pedimos hora 
            System.out.print("Introduce una hora > ");
            //Asignamos varibale y definimos
            int hora = teclado.nextInt();
            
            System.out.println();
            //If
            if (hora >= 6 & hora <= 12) {
                System.out.println("Buenos dias");
            } 
            if (hora >= 13 & hora <= 20) {
                System.out.println("Buenos tardes");
            } 
            if (hora >= 21 & hora <= 23 | hora >= 1 & hora <= 5) {
                System.out.println("Buenos noches");
            } 
            
            if(hora>24){
                System.out.println("Error");
            };
        }
    }
}