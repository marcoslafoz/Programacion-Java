package vueloFeliz;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileWriterService {

	public void escribirAvionesEnFichero(List<Avion> listaAviones, String nombreFichero) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreFichero))) {
			for (Avion avion: listaAviones) {
				String linea = avion.verAvion();
				writer.write(linea);
				writer.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error al escribir en el archivo: " + e.getMessage());
		}
	}

	public void escribirTripulantesEnFichero(List<Tripulante> listaTripulantes, String nombreFichero) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreFichero))) {
			for (Tripulante tripulante: listaTripulantes) {
				String linea = tripulante.verTripulante();
				writer.write(linea);
				writer.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error al escribir en el archivo: " + e.getMessage());
		}
	}
}
