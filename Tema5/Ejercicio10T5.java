package Tema5;

public class Ejercicio10T5 {
    private String titulo;
    private int numeroCanciones;
    private float precio;
    private Fecha fechaCompra;


    public Ejercicio10T5(String titulo) {
        this.titulo = titulo;
    }

    public Ejercicio10T5(String titulo, int canciones) {
        this(titulo);
        setNumeroCanciones(canciones);
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroCanciones() {
        return numeroCanciones;
    }

    public int setNumeroCanciones() {
        return numeroCanciones;
    }

    public void setNumeroCanciones(int numeroCanciones) {
        if (numeroCanciones > 0) {
            this.numeroCanciones = numeroCanciones;
        } else {
            System.out.println("El numero de canciones es erroneo");
        }
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setFecha(int dia, int mes, int anno) {
        fechaCompra = new Fecha(dia, mes, anno);
    }

    public String getFecha() {
        return "" + fechaCompra;
    }
}

class Fecha {
    int dia, mes, anno;
    public Fecha(int dia, int mes, int anno){}
}
