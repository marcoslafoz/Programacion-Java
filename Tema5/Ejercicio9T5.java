
import java.util.Scanner;

public class Ejercicio9T5 {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            System.out.print("a> ");
            double a = teclado.nextDouble();

            System.out.print("b> ");
            double b = teclado.nextDouble();

            System.out.print("c> ");
            double c = teclado.nextDouble();

            
            double R1 = R1(a, b, c);
            double R2 = R2(a, b, c);

            System.out.println("R1 = " + R1);
            System.out.println("R2 = " + R2);
        }
    }

    private static double R1(double a, double b , double c) {
        double r1 = (b*b) - (4 * a * c);
        r1 = Math.sqrt(r1);
        double r1Result = (-b + r1) / (2*a);

        return r1Result;
    }

    private static double R2(double a, double b , double c) {
        double r2 = (b*b) - (4 * a * c);
        r2 = Math.sqrt(r2);
        double r2Result = (-b - r2) / (2*a);

        return r2Result;
    }
}