package Ejercicio4;

import java.util.Scanner;

/**
 * 
 * @author marcos
 * Programa para gestion de usuarios
 *
 */

public class Main {
	public static void main(String[] args) {
		try(Scanner teclado = new Scanner(System.in)){
		
		
		//Creamos el objeto
		Usuario[] usuario = new Usuario[10];
		
		//Metodo que instancia todos los usuarios
		Herramientas.instUsers(usuario);
	
		//Menu de opciones
		int option = 1;
		String username, password;
		while(option != 0) {
			Herramientas.showOptions();
			option = teclado.nextInt();
			switch(option) {
				case 1: 
					System.out.println("username: ");
					username = teclado.next();
					System.out.println("password: ");
					password = teclado.next();
					usuario[Herramientas.checkTam(usuario)] = Usuario.addUser(Herramientas.checkTam(usuario), username, password);
					break;
				default: 
					option = 0;
					System.out.println(usuario[0].getUsername());
					break;
			}
		}
		
					
		//Mostramos lista usuarios y mostramos tamaño
		System.out.println("\nLista usuarios\n-----------");
		Herramientas.showUsers(usuario);
		System.out.println("-----------\nTamaño: " + Herramientas.checkTam(usuario));
	
		
		
		}
	}
}

