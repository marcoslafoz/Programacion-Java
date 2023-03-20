package Examen;

public class Electrodomestico {
	
	private int peso;
	private int color;
	private int diasTranscurridos;
	
	//Peso
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public int getPeso() {
		return peso;
	}
	
	//Pintar
	
	public void pintar(int color) {
		this.color = color;
	}
	
	public int getColor() {
		return color;
	}
	
	//Cafeteria
	
	public void setDiasTranscurridos(int diasTranscurridos) {
		this.diasTranscurridos = diasTranscurridos;
	}
	
	public int getDiasTranscurridos() {
		return diasTranscurridos;
	}
	
	
	
	
}
