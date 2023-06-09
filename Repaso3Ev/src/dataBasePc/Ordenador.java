package dataBasePc;

import java.util.Random;

public class Ordenador {

	Random random = new Random();

	private String marca;
	private String modelo;
	private int añoSalida;
	private int tiempoComercializacion;

	public Ordenador(String marca, String modelo, int añoSalida, int tiempoComercializacion) {
		this.marca = marca.toUpperCase();
		this.modelo = modelo.toUpperCase();
		this.tiempoComercializacion = tiempoComercializacion;

		if (añoSalida >= 1951) {
			this.añoSalida = añoSalida;
		} else {
			System.out.println("El año de salida debe ser igual o mayor a 1951. Se ajustará automáticamente.");
			this.añoSalida = 1951;
		}

		if (tiempoComercializacion >= 2 && tiempoComercializacion <= 6) {
			this.tiempoComercializacion = tiempoComercializacion;
		} else {
			this.tiempoComercializacion = random.nextInt(5) + 2;
		}
	}

	// getters y setters

	public String toString() {
		return marca + ", " + modelo + ", " + añoSalida + ", " + tiempoComercializacion ;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAñoSalida() {
		return añoSalida;
	}

	public int getTiempoComercializacion() {
		return tiempoComercializacion;
	}
}

