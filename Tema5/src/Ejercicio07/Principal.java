package Ejercicio07;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {

			// Selector
			System.out.println("Selecciona una opción");
			System.out.println("[1] - Longitud de un circulo a partir del radio (r) ");
			System.out.println("[2] - Superficie de un circulo a partir del radio (r) ");
			System.out.println("[3] - Volumen de una esfera a partir del radio (r) ");
			System.out.print("Seleccion> ");

			// Asignamos una variable a la seleccion
			int select = teclado.nextInt();

			// Pedimos el radio y le asignamos una variable
			System.out.print("Introduce el radio> ");
			double radio = teclado.nextInt();

			switch (select) {
				case 1: // Opcion1
					System.out.println(
							"Longitud con radio (" + radio + "): " + longitudCirculo.calcLongitudCirculo(radio));
					break;
				case 2: // Opcion2
					System.out.println(
							"Superficie con radio (" + radio + "): " + superficieCirculo.calcSuperficieCirculo(radio));
					break;
				case 3: // Opcion3
					System.out.println("Volumen de una esfera con radio (" + radio + "): "
							+ volumenEsfera.calcVolumenEsfera(radio));
					break;
				default:
					System.out.println("Error");
					break;
			}

		}
	}
}
