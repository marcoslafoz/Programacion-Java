
import java.util.Scanner;

public class Ejemplo1 {
	public static boolean esprimo(int numero) {

		boolean primo;
		int contador = 2;

		primo = true;
		while (primo && contador < numero) {
			primo = numero % contador != 0;
			contador++;
		}
		return primo;
	}

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			int numero;
			boolean primo;

			System.out.print("Introduce un numero> ");
			numero = teclado.nextInt();

			primo = esprimo(numero);
			System.out.println("El numero " + numero + (primo ? "" : " no") + " es primo");
		}
	}
}	