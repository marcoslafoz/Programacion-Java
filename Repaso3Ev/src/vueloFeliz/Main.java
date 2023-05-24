package vueloFeliz;

/**
 * 
 * @author Marcos
 * @date 24/05/2023
 *
 * Programa para la  gestion de aviones y tripulantes de la compañia vueloFeliz
 *
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			final String FICHERO_AVIONES = "aviones.txt";
			final String FICHERO_TRIPULANTES = "tripulantes.txt";

			// Creamos lista de aviones
			List<Avion> listaAviones = new ArrayList<>();
			List<Tripulante> listaTripulantes = new ArrayList<>();

			// FILE IN
			FileReaderService readerService = new FileReaderService();
			listaAviones = readerService.leerAvionesDesdeFichero(FICHERO_AVIONES);
			listaTripulantes = readerService.leerTripulantesDesdeFichero(FICHERO_TRIPULANTES);

			// FILE OUT
			FileWriterService writerService = new FileWriterService();

			//Declaramos algunas variables
			String nombreTripulanteTemp, nombreAvionTemp, dniTemp;
			int capacidadTemp;
			boolean dniNoEncontrado;

			//Objeto para imprimir listas
			Services printerService = new Services();

			//Bucle Menu
			boolean repetir = true;
			int opcion;
			while(repetir == true) {

				Services.imprimirMenu();

				opcion = teclado.nextInt();
				switch(opcion) {

				case 0: //Salir

					repetir = false;
					writerService.escribirAvionesEnFichero(listaAviones, FICHERO_AVIONES);
					writerService.escribirTripulantesEnFichero(listaTripulantes, FICHERO_TRIPULANTES);
					System.out.println("Guardando datos...\nSaliendo...");
					break;

				case 1:  //Añadir avion
					System.out.println("Introduce el nombre del avion");
					nombreAvionTemp = teclado.next();
					System.out.println("Introduce la capacidad del avion (50-348)");
					capacidadTemp = teclado.nextInt();

					boolean avionEncontrado = false;
					for (Avion avion : listaAviones) {
						if (avion.getNombre().equals(nombreAvionTemp)) {
							avionEncontrado = true;
							break;
						}
					}

					if (avionEncontrado) {
						System.out.println("Error, el avion ya está en la lista.");
					} else {
						if (capacidadTemp >= 50 && capacidadTemp <= 348) {
							Avion avionTemp = new Avion();
							avionTemp.crearAvion(nombreAvionTemp, capacidadTemp);
							listaAviones.add(avionTemp);
						} else {
							System.out.println("Error, la capacidad es incorrecta.");
						}
					}

					writerService.escribirAvionesEnFichero(listaAviones, FICHERO_AVIONES);
					writerService.escribirTripulantesEnFichero(listaTripulantes, FICHERO_TRIPULANTES);

					break;

				case 2: // Eliminar avion
					System.out.println("Introduce el nombre del avion que deseas eliminar");
					String nombreAvionEliminar = teclado.next();

					avionEncontrado = false;
					Avion avionAEliminar = null;

					for (Avion avion : listaAviones) {
						if (avion.getNombre().equals(nombreAvionEliminar)) {
							avionEncontrado = true;
							avionAEliminar = avion;
							break;
						}
					}

					if (avionEncontrado) {
						listaAviones.remove(avionAEliminar);
						System.out.println("Avion eliminado correctamente.");
					} else {
						System.out.println("No se encontró un avion con ese nombre.");
					}

					writerService.escribirAvionesEnFichero(listaAviones, FICHERO_AVIONES);
					writerService.escribirTripulantesEnFichero(listaTripulantes, FICHERO_TRIPULANTES);

					break;

				case 3: //Ordena la lista de aviones por orden alfabetico

					System.out.println("Ordenando la lista de aviones por orden alfabetico...");
					Services.ordenarListaAviones(listaAviones);
					printerService.imprimirListaAviones(listaAviones);
					writerService.escribirAvionesEnFichero(listaAviones, FICHERO_AVIONES);

					break;

				case 4: //Ordena la lista de aviones por orden descendente segun las plazas

					System.out.println("Ordenando la lista de aviones por orden descendente segun las plazas");
					Services.ordenarListaAvionesPorPlazas(listaAviones);
					printerService.imprimirListaAviones(listaAviones);
					writerService.escribirAvionesEnFichero(listaAviones, FICHERO_AVIONES);

					break;

				case 5: //Añadir tripulante

					System.out.println("Introduce el nombre del tripulante");
					nombreTripulanteTemp = teclado.next();
					System.out.println("Introduce el DNI del tripulante ej: 12345678P");
					dniTemp = teclado.next();

					dniNoEncontrado = Services.verificarDNI(dniTemp, listaTripulantes);

					if(Services.validarDNI(dniTemp) == true && dniNoEncontrado == true ) { 

						Tripulante tripulanteTemp = new Tripulante();
						tripulanteTemp.crearTripulante(nombreTripulanteTemp, dniTemp, "null");
						listaTripulantes.add(tripulanteTemp);

					}else {
						System.out.println("DNI no valido, vuelve a intentarlo");
					}

					writerService.escribirAvionesEnFichero(listaAviones, FICHERO_AVIONES);
					writerService.escribirTripulantesEnFichero(listaTripulantes, FICHERO_TRIPULANTES);

					break;

				case 6: //Ordena la lista de tripulantes por orden alfabetico

					System.out.println("Ordenando la lista de tripulantes por orden alfabetico");
					Services.ordenarListaTripulantesPorNombre(listaTripulantes);
					printerService.imprimirListaTripulantes(listaTripulantes);
					writerService.escribirTripulantesEnFichero(listaTripulantes, FICHERO_TRIPULANTES);

					break;

				case 7: //Asigna tripulante a avion 
					System.out.println("Introduce el DNI del tripulante");
					dniTemp = teclado.next();

					if(Services.validarDNI(dniTemp) == true) { 

						System.out.println("Introduce el nombre del avion al que le quieres asignar");
						nombreAvionTemp = teclado.next();

						boolean encontrado = false;
						Tripulante tripulanteEncontrado = null;

						for (Tripulante tripulante : listaTripulantes) {
							if (tripulante.getDni().equals(dniTemp)) {
								encontrado = true;
								tripulanteEncontrado = tripulante;
								break;
							}
						}

						avionEncontrado = false;
						for (Avion avion : listaAviones) {
							if (avion.getNombre().equals(nombreAvionTemp)) {
								avionEncontrado = true;
								break;
							}
						}

						if (encontrado && avionEncontrado) {
							tripulanteEncontrado.crearTripulante(tripulanteEncontrado.getNombre(), tripulanteEncontrado.getDni(), nombreAvionTemp);
							System.out.println("Tripulante modificado y asignado al avion correctamente.");
						} else {
							if (!encontrado) {
								System.out.println("El DNI no se encuentra en la lista de tripulantes.");
							}
							if (!avionEncontrado) {
								System.out.println("El avion no se encuentra en la lista de aviones.");
							}
						}
					}else {
						System.out.println("DNI no valido, vuelve a intentarlo");
					}

					writerService.escribirAvionesEnFichero(listaAviones, FICHERO_AVIONES);
					writerService.escribirTripulantesEnFichero(listaTripulantes, FICHERO_TRIPULANTES);

					break;

				case 8: //Mostrar los datos del avion y sus tripulantes

					System.out.println("Introduce el nombre del avión para mostrar sus datos");
					String nombreAvion = teclado.next();
					Services.mostrarDatosAvionYTripulantes(nombreAvion, listaAviones, listaTripulantes);

					break;


				default: 
					break;
				}

			}

			//END



		}
	}
}