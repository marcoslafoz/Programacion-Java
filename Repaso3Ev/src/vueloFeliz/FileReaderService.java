package vueloFeliz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderService {

	public List<Avion> leerAvionesDesdeFichero(String nombreFichero) {
		List<Avion> listaAviones = new ArrayList<>();
		String linea;
		String[] datos;

		try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {
			while ((linea = br.readLine()) != null) {
				datos = linea.split(", ");

				String propiedad1 = datos[0];
				int propiedad2 = Integer.parseInt(datos[1]);

				Avion avion = new Avion();
				avion.crearAvion(propiedad1, propiedad2);
				listaAviones.add(avion);
			}
		} catch (IOException e) {
			System.out.println("Archivo no encontrado");
		}

		return listaAviones;
	}

	public List<Tripulante> leerTripulantesDesdeFichero(String nombreFichero) {
		List<Tripulante> listaTripulantes = new ArrayList<>();

		String linea;
		String[] datos;

		try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {
			while ((linea = br.readLine()) != null) {
				datos = linea.split(", ");

				String propiedad1 = datos[0];
				String propiedad2 = datos[1];
				String propiedad3 = datos[2];

				Tripulante tripulante = new Tripulante();
				tripulante.crearTripulante(propiedad1, propiedad2, propiedad3);
				listaTripulantes.add(tripulante);
			}
		} catch (IOException e) {
			System.out.println("Archivo no encontrado");
		}

		return listaTripulantes;
	}
}
