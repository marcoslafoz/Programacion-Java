
//Importamos bibliotecas
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            //Pedimos una cifra en euros
            System.out.print("Euros> ");
            //Asignamos una variable y la definimos a euros
            double nEuros = teclado.nextDouble();
            //Convertimos
            double nPesetas = (nEuros * 166.3860);
            //Mostramos las pesetas
            System.out.print("Pesetas> " + nPesetas);
        }
    }
}