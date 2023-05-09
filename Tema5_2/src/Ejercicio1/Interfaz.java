package Ejercicio1;

import java.util.Scanner;

public class Interfaz {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {

			Disco disco1 = new Disco();

			System.out.print("Introduce el nombre del disco> ");
			disco1.setTitulo(teclado.nextLine());

			System.out.print("Introduce el numero de canciones> ");
			disco1.setNCanciones(teclado.nextInt());

			System.out.print("Introduce el precio del disco> ");
			disco1.setPrecio(teclado.nextDouble());

			System.out.print("Introduce la fecha de compra> ");
			disco1.setFechaCompra(teclado.next());

			System.out.println("Nombre: " + disco1.getNombre());
			System.out.println("NCanciones: " + disco1.getNCanciones());
			System.out.println("Precio: " + disco1.getPrecio());
			System.out.println("FechaCompra: " + disco1.getFechaCompra());

		}
	}
}
