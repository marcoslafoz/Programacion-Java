package dataBasePc;

import java.io.*;
import java.util.*;

public class DatosReader {

	private List<Profesional> listaProfesional;
	private List<Sobremesa> listaSobremesa;
	private List<Portatil> listaPortatil;

	public DatosReader() {
		listaProfesional = new ArrayList<>();
		listaSobremesa = new ArrayList<>();
		listaPortatil = new ArrayList<>();
	}

	public void leerDatos(String nombreArchivo) {
		try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {

			//Declaramos algunas variables
			String linea, marca, modelo, tipoDiscoDuro;
			int añoSalida, numeroProcesadores, ramKb, tiempoCarga, tiempoComercializacion;
			float potencia, versionPci, peso, precio;

			while ((linea = br.readLine()) != null) {

				String[] datos = linea.split(", ");

				datos[0] = datos[0].toUpperCase();

				if (datos[0].equals("PROFESIONAL")) {

					marca = datos[1];
					modelo = datos[2];
					añoSalida = Integer.parseInt(datos[3]);
					tiempoComercializacion = Integer.parseInt(datos[4]);
					numeroProcesadores = Integer.parseInt(datos[5]);
					potencia = Float.parseFloat(datos[6]);

					Profesional profesional = new Profesional(marca, modelo, añoSalida,tiempoComercializacion, numeroProcesadores, potencia);
					listaProfesional.add(profesional);

				}
				if (datos[0].equals("SOBREMESA")) {

					marca = datos[1];
					modelo = datos[2];
					añoSalida = Integer.parseInt(datos[3]);
					tiempoComercializacion = Integer.parseInt(datos[4]);
					precio = Float.parseFloat(datos[5]);
					versionPci = Float.parseFloat(datos[6]);
					tipoDiscoDuro = datos[7];
					ramKb = Integer.parseInt(datos[8]);

					Sobremesa sobremesa = new Sobremesa(marca, modelo, añoSalida,tiempoComercializacion, precio, versionPci, tipoDiscoDuro, ramKb);
					listaSobremesa.add(sobremesa);

				}
				if(datos[0].equals("PORTATIL")) {

					marca = datos[1];
					modelo = datos[2];
					añoSalida = Integer.parseInt(datos[3]);
					tiempoComercializacion = Integer.parseInt(datos[4]);
					precio = Float.parseFloat(datos[5]);
					versionPci = Float.parseFloat(datos[6]);
					peso = Float.parseFloat(datos[7]); 
					tiempoCarga = Integer.parseInt(datos[8]);

					Portatil portatil = new Portatil(marca, modelo, añoSalida, tiempoComercializacion, precio, versionPci, peso, tiempoCarga);
					listaPortatil.add(portatil);

				}
			}
		}catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado: " + nombreArchivo);
		} catch (IOException e) {
			System.out.println("Error al leer el archivo: " + e.getMessage());
		}
	}

	public List<Profesional> getListaProfesional() {
		return listaProfesional;
	}

	public List<Sobremesa> getListaSobremesa() {
		return listaSobremesa;
	}

	public List<Portatil> getListaPortatil() {
		return listaPortatil;
	}


}
