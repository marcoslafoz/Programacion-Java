package Ejercicio13;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		try(Scanner teclado = new Scanner(System.in)){
			
			//Definimos un vector
			Plato[] plato = new Plato[3];
			
			
			
			for(int i = 0 ; i < 3 ; i++) {
				
				plato[i] = new Plato();
				
				//Platos
				
				System.out.println("Primer plato");
				
				System.out.print("Nombre plato: ");
				String nombrePlato = teclado.next();
				plato[i].setNombre(nombrePlato);
				
				System.out.print("Nombre categoria: ");
				String nombreCategoria = teclado.next();
				plato[i].setCategoria(nombreCategoria);
			}
			
			//Mostramos menu completo
			System.out.println("1 Plato | " + plato[0].getNombre() + " " + plato[0].getCategoria());
			System.out.println("2 Plato | " + plato[1].getNombre() + " " + plato[1].getCategoria());
			System.out.println("Bebida | " + plato[2].getNombre() + " " + plato[2].getCategoria());
			
		}
	}
}