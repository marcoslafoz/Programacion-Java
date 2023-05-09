package Ejercicio1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
		
			//Instanciamos vector
			int[] pila = new int[100];
			
			//Declaramos variables
			boolean repeat = true;
			int select = 0;
			
			while(repeat == true) {
				
				Operaciones.impOpciones();
				select = teclado.nextInt();
				
				switch (select) { 
				case 0: 
					repeat = false;
					break;
				case 1: 
					System.out.print("Introduce un numero> ");
					int numeroToPush = teclado.nextInt();
					Operaciones.push(numeroToPush, pila);
					break;
				case 2: 
					//Operaciones.pop(pila);
					break;
				case 3: 
					System.out.println("Tamaño> " + Operaciones.size(pila));
					break;
				case 4: 
					Operaciones.impVector(pila);
					break;
			
				}
				
			}
			
		System.out.println("Saliendo...");
			
		}
	}
}
