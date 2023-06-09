package dataBasePc;

public class Profesional extends Ordenador {
    private int numeroProcesadores;
    private float potencia;

    public Profesional(String marca, String modelo, int añoSalida, int tiempoComercializacion, int numeroProcesadores, float potencia) {
        super(marca, modelo, añoSalida, tiempoComercializacion);
        this.numeroProcesadores = numeroProcesadores;
        this.potencia = potencia;
    }

    // getters y setters

    public String toString() {
        return "PROFESIONAL, " + super.toString() + ", " + numeroProcesadores + ", " + potencia;
    }
}
