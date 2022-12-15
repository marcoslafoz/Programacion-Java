/**
 * Representacion de una fecha en formato gregoriano
 * 
 * @author
 */

// Clase Fecha
public class Fecha {

    // Definimos las variables
    int dia, mes, anno;

    //////////////////////////

    public Fecha() {
        System.out.println("Creando fecha sin estado");
    }

    public Fecha(int dia, int mes, int anno) {
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
    }

    // Dia
    int getDia() {
        return dia;
    }

    void setDia(int dia) {
        this.dia = dia;
    }

    // Mes
    int getMes() {
        return mes;
    }

    void setMes(int mes) {
        this.mes = mes;
    }

    // Año
    int getAnno() {
        return anno;
    }

    void setAnno(int anno) {
        this.anno = anno;
    }

    //////////////////////////

    public String toString() {
        return String.format("%2d/2%d/%4d");
    }

}