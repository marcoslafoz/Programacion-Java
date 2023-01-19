package Repaso1Ev;

//Importamos bibliotecas
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            // Pedimos dia
            System.out.print("Introduce el dia> ");
            int dia = teclado.nextInt();
            // Pedimos mes
            System.out.print("Introduce el mes> ");
            String mes = teclado.next();
            System.out.println();

            // Clasificamos por mes
            switch (mes.toLowerCase()) {
                case "enero":
                    // Capricornio
                    if (dia > 0 & dia < 21) {
                        System.out.println("Capricornio");
                    }
                    // Acuario
                    if (dia >= 21 & dia <= 31) {
                        System.out.println("Acuario");
                    }
                    break;

                case "febrero":
                    // Acuario
                    if (dia > 0 & dia <= 20) {
                        System.out.println("Acuario");
                    }
                    // Capricornio
                    if (dia >= 21 & dia <= 31) {
                        System.out.println("Piscis");
                    }
                    break;

                case "marzo":
                    // Acuario
                    if (dia > 0 & dia <= 20) {
                        System.out.println("Piscis");
                    }
                    // Capricornio
                    if (dia >= 21 & dia <= 31) {
                        System.out.println("Aries");
                    }
                    break;
                case "abril":
                    // Acuario
                    if (dia > 0 & dia <= 20) {
                        System.out.println("Aries");
                    }
                    // Capricornio
                    if (dia >= 21 & dia <= 31) {
                        System.out.println("Tauro");
                    }
                    break;
                case "mayo":
                    // Acuario
                    if (dia > 0 & dia <= 20) {
                        System.out.println("Tauro");
                    }
                    // Capricornio
                    if (dia >= 21 & dia <= 31) {
                        System.out.println("Gemini");
                    }
                    break;
                case "junio":
                    // Acuario
                    if (dia > 0 & dia <= 20) {
                        System.out.println("Gemini");
                    }
                    // Capricornio
                    if (dia >= 21 & dia <= 31) {
                        System.out.println("Cancer");
                    }
                    break;
                case "julio":
                    // Acuario
                    if (dia > 0 & dia <= 20) {
                        System.out.println("Cancer");
                    }
                    // Capricornio
                    if (dia >= 21 & dia <= 31) {
                        System.out.println("Leo");
                    }
                    break;
                case "agosto":
                    // Acuario
                    if (dia > 0 & dia <= 20) {
                        System.out.println("Leo");
                    }
                    // Capricornio
                    if (dia >= 21 & dia <= 31) {
                        System.out.println("Virgo");
                    }
                    break;
                case "septiembre":
                    // Acuario
                    if (dia > 0 & dia <= 20) {
                        System.out.println("Virgo");
                    }
                    // Capricornio
                    if (dia >= 21 & dia <= 31) {
                        System.out.println("Libra");
                    }
                    break;
                case "octubre":
                    // Acuario
                    if (dia > 0 & dia <= 20) {
                        System.out.println("Libra");
                    }
                    // Capricornio
                    if (dia >= 21 & dia <= 31) {
                        System.out.println("Scorpio");
                    }
                    break;
                case "noviembre":
                    // Acuario
                    if (dia > 0 & dia <= 20) {
                        System.out.println("Scorpio");
                    }
                    // Capricornio
                    if (dia >= 21 & dia <= 31) {
                        System.out.println("Sagitario");
                    }
                    break;
                case "diciembre":
                    // Acuario
                    if (dia > 0 & dia <= 20) {
                        System.out.println("Sagitario");
                    }
                    // Capricornio
                    if (dia >= 21 & dia <= 31) {
                        System.out.println("Capricornio");
                    }
                    break;

                default:
                    break;
            }
        }
    }
}