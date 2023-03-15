package Repaso1Ev;

//Importamos bibliotecas
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            
            //Pedimos una hora y le asignamos una variable
            System.out.println("Introduce la hora> ");
            int hora = teclado.nextInt(); 

            //Pedimos los minutos y le asignamos una variable
            System.out.println("Introduce los minutos> ");
            int minutos = teclado.nextInt(); 
            
            //Convertimos de horas a segundos
            int horaSegundos = hora*3600;

            //Convertimos de minutos a segundos
            int minutosSegundos = minutos*60;

            //Sumanos los segundos
            int segundos = minutosSegundos + horaSegundos;

            //Definimos los segundos de media noche = 00:00
            int segundosMedianoche = 24 * 3600;

            //Restamos
            int resultado = segundosMedianoche - segundos; 

            //Imprimimos resultados
            System.out.println("Quedan " + resultado + "s para medianoche");
        }
    }
}