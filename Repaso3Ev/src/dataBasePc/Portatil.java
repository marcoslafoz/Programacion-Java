package dataBasePc;

public class Portatil extends Domestico {
    private float peso;
    private int tiempoCargaMinutos;

    public Portatil(String marca, String modelo, int añoSalida, int tiempoComercializacion ,float precio, float versionPCI, float peso, int tiempoCargaMinutos) {
        super(marca, modelo, añoSalida, tiempoComercializacion, precio, versionPCI);
        this.peso = peso;
        this.tiempoCargaMinutos = tiempoCargaMinutos;
    }

    // getters y setters

    public String toString() {
        return "PORTATIL, " + super.toString() + ", " + peso + ", " + tiempoCargaMinutos;
    }
}