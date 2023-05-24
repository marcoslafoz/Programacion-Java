package vueloFeliz;

import java.util.*;

public class Services {

	//Metodo para imprimir la lista de los aviones
	public void imprimirListaAviones(List<Avion> listaAviones) {
		System.out.println("\nLista aviones \n--------------");
		for (Avion avion : listaAviones) {
			System.out.println(avion.verAvion());
		}
		System.out.println("\n");
	}

	//Metodo para imprimir la lista de los tripulantes
	public void imprimirListaTripulantes(List<Tripulante> listaTripulantes) {
		System.out.println("\nLista tripulantes \n--------------");
		for (Tripulante tripulante : listaTripulantes) {
			System.out.println(tripulante.verTripulante());
		}
		System.out.println("\n");
	}

	//Metodo para imprimir las opciones del menu
	public static void imprimirMenu() {
		System.out.println("1. Añadir avión");
		System.out.println("2. Borrar avión");
		System.out.println("3. Lista aviones en order alfabetico");
		System.out.println("4. Lista aviones por numero de plazas");
		System.out.println("5. Añadir tripulante");
		System.out.println("6. Lista tripulantes en orden alfabetico");
		System.out.println("7. Asignar tripulante a un avión");
		System.out.println("8. Mostrar avion y tripulantes");
		System.out.println("0. Salir");
		System.out.println("Selecciona una opcion> ");
	}

	public static boolean validarDNI(String dni) {

		if (dni.length() != 9) {return false;}

		//Dividimos la letra en una variable y los numeros en otra
		String numeros = dni.substring(0, 8);
		char letra = dni.charAt(8);

		// Comprueba que los 8 primeros caracteres son dígitos
		for (int i = 0; i < 8; i++) {
			char caracter = numeros.charAt(i);

			if (!Character.isDigit(caracter)) {
				return false;
			}
		}

		int posicionLetra = "TRWAGMYFPDXBNJZSQVHLCKE".indexOf(Character.toUpperCase(letra));
		if (posicionLetra == -1) {return false;}

		// Digito de control
		int numerosDNI = Integer.parseInt(numeros);
		int resto = numerosDNI % 23;

		// Verificamos resto con la letra
		if (posicionLetra != resto) {return false;}

		return true;
	}

	//Metodo para ordenar la lista de aviones alfabeticamente
	public static void ordenarListaAviones(List<Avion> listaAviones) {
		int n = listaAviones.size();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				Avion avion1 = listaAviones.get(j);
				Avion avion2 = listaAviones.get(j + 1);
				if (avion1.getNombre().compareToIgnoreCase(avion2.getNombre()) > 0) {
					listaAviones.set(j, avion2);
					listaAviones.set(j + 1, avion1);
				}
			}
		}
	}

	//Metodo para ordenar la lista de aviones por el numero de plazas descendentemente
	public static void ordenarListaAvionesPorPlazas(List<Avion> listaAviones) {
		int n = listaAviones.size();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				Avion avion1 = listaAviones.get(j);
				Avion avion2 = listaAviones.get(j + 1);
				if (avion1.getCapacidad() < avion2.getCapacidad()) {
					listaAviones.set(j, avion2);
					listaAviones.set(j + 1, avion1);
				}
			}
		}
	}

	//Metodo para ordenar la lista de tripulantes alfabeticamente
	public static void ordenarListaTripulantesPorNombre(List<Tripulante> listaTripulantes) {
		int n = listaTripulantes.size();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				Tripulante tripulante1 = listaTripulantes.get(j);
				Tripulante tripulante2 = listaTripulantes.get(j + 1);
				if (tripulante1.getNombre().compareToIgnoreCase(tripulante2.getNombre()) > 0) {
					listaTripulantes.set(j, tripulante2);
					listaTripulantes.set(j + 1, tripulante1);
				}
			}
		}
	}

	//Metodo que pasamos el nombre del avion y nos devuelve los datos del avion y sus tripulantes
	public static void mostrarDatosAvionYTripulantes(String nombreAvion, List<Avion> listaAviones, List<Tripulante> listaTripulantes) {
		boolean avionEncontrado = false;

		for (Avion avion : listaAviones) {
			if (avion.getNombre().equals(nombreAvion)) {
				avionEncontrado = true;
				System.out.println("Datos del avión:");
				System.out.println("Nombre: " + avion.getNombre());
				System.out.println("Capacidad: " + avion.getCapacidad());

				System.out.println("Tripulantes asociados:");
				boolean tripulantesEncontrados = false;
				for (Tripulante tripulante : listaTripulantes) {
					if (tripulante.getIdAvion().equals(avion.getNombre())) {
						System.out.println("- " + tripulante.getNombre());
						tripulantesEncontrados = true;
					}
				}

				if (!tripulantesEncontrados) {
					System.out.println("No hay tripulantes asociados a este avión.");
				}

				break;
			}
		}

		if (!avionEncontrado) {
			System.out.println("Avión no encontrado.");
		}
	}

	//Metodo para ver si un DNI esta ya en la lista de tripulantes
	public static boolean verificarDNI(String dni, List<Tripulante> listaTripulantes) {
		for (Tripulante tripulante : listaTripulantes) {
			if (tripulante.getDni().equals(dni)) {
				return false;
			}
		}
		return true;
	}


}