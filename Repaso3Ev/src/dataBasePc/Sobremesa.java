package dataBasePc;

public class Sobremesa extends Domestico {
    private String tipoDiscoDuro;
    private int ramKb;

    public Sobremesa(String marca, String modelo, int añoSalida, int tiempoComercializacion, float precio, float versionPCI, String tipoDiscoDuro, int ramKb) {
        super(marca, modelo, añoSalida, tiempoComercializacion, precio, versionPCI);
        this.tipoDiscoDuro = tipoDiscoDuro.toUpperCase();
        this.ramKb = ramKb;
    }

    // getters y setters

    public String toString() {
        return "SOBREMESA, " + super.toString() + ", " + tipoDiscoDuro + ", " + ramKb;
    }
    
    public String getTipoDiscoDuro() {
    	return tipoDiscoDuro;
    }
}
