package Ejercicio5;

public class Disco {
    private String titulo;
    private String artista;
    private int anioPublicacion;

    public Disco(String titulo, String artista, int anioPublicacion) {
        this.titulo = titulo;
        this.artista = artista;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public String toString() {
        return titulo + " - " + artista + " (" + anioPublicacion + ")";
    }
}
