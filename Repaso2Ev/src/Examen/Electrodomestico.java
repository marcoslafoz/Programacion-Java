package Examen;

public abstract class Electrodomestico {
	
	private int peso;
	private int color;
	private int diasTranscurridos;
	private boolean pasarRevision;
	
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
	
	//Dias transcurridos
	
	public void setDiasTranscurridos(int diasTranscurridos) {
		this.diasTranscurridos = diasTranscurridos;
	}
	
	public int getDiasTranscurridos() {
		return diasTranscurridos;
	}
	
	//Mantenimiento
	
	public void setPasarRevision (boolean pasarRevision) {
		this.pasarRevision = pasarRevision;
	}
	
	public boolean getPasarRevision() {
		return pasarRevision;
	}
	
	
	
	
}
