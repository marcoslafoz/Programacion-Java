
import java.util.Scanner;

public class Ejercicio7T5 {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            System.out.print("Intrucuce el valor radio> ");
            double radio = teclado.nextDouble();

            System.out.println("1 | Longitud de un circulo");
            System.out.println("2 | Superficie de un circulo");
            System.out.println("3 | Volumen de una esfera");

            System.out.print("Selección> ");
            int selector = teclado.nextInt();

            double longitud = longitudCirculo(radio);
            double superficie = superficieCirculo(radio);
            double volumen = volumenEsfera(radio);

            if (selector == 1) { // Longitud
                System.out.println("La longitud del circulo con radio = " + radio + " es " + longitud);
            }
            if (selector == 2) { // Superficie
                System.out.println("La superficie del circulo con radio = " + radio + " es " + superficie);
            }
            if (selector == 3) { // Volumen
                System.out.println("La volumen de una esfera con radio = " + radio + " es " + volumen);
            }

        }
    }

    private static double longitudCirculo(double r1) {
        double longitud = 2 * (Math.PI) * r1;

        return longitud;
    }

    private static double superficieCirculo(double r1) {
        double superficie = Math.PI * (r1 * r1);

        return superficie;
    }

    private static double volumenEsfera(double r1) {
        double volumen = (4 / 3) * (Math.PI) * (Math.pow(r1, 3));

        return volumen;
    }
}