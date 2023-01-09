
import java.util.Scanner;

public class Ejercicio3T5 {

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			int n1;

			System.out.print("Introduce N1> ");
			n1 = teclado.nextInt();

			int factN1 = factorialN1(n1);

			if (factN1 > 0) {
				System.out.println("El factorial de "+ n1 +" es " + factN1);
			}
		}
	}

	private static int factorialN1(int x1) {

		int factorial = 1;

		for (int i=x1;i>0;i--)
		 {
		 factorial=factorial*i;

		 }		

		return factorial;
	}
}