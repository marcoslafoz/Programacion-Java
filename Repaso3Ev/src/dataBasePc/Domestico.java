package dataBasePc;

public class Domestico extends Ordenador {
    private float precio;
    private float versionPCI;

    public Domestico(String marca, String modelo, int añoSalida, int tiempoComercializacion, float precio, float versionPCI) {
        super(marca, modelo, añoSalida, tiempoComercializacion);
        this.precio = precio;
        this.versionPCI = versionPCI;
    }

    // getters y setters
    // ...

    public String toString() {
        return super.toString() + ", " + precio + ", " + versionPCI;
    }
}
