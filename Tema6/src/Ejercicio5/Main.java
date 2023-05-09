package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Coleccion coleccion = new Coleccion();

        Disco disco1 = new Disco("Nevermind", "Nirvana", 1991);
        Disco disco2 = new Disco("The Dark Side of the Moon", "Pink Floyd", 1973);
        Disco disco3 = new Disco("Abbey Road", "The Beatles", 1969);
        Disco disco4 = new Disco("Thriller", "Michael Jackson", 1982);

        coleccion.insertarDisco(disco1);
        coleccion.insertarDisco(disco2);
        coleccion.insertarDisco(disco3);
        coleccion.insertarDisco(disco4);

        System.out.println("Listado de discos:");
        coleccion.listarDiscos();

        coleccion.eliminarDisco(disco2);

        System.out.println("Listado de discos actualizado:");
        coleccion.listarDiscos();
    }
}
