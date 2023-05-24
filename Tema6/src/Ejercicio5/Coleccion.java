package Ejercicio5;

public class Coleccion {
    private Disco[] discos;
    private int indice;

    public Coleccion() {
        discos = new Disco[100];
        indice = 0;
    }

    public void insertarDisco(Disco nuevoDisco) {
        if (indice >= 100) {
            System.out.println("La colección está llena, no se pueden añadir más discos");
            return;
        }

        discos[indice] = nuevoDisco;
        indice++;
    }

    public void eliminarDisco(Disco discoAEliminar) {
        for (int i = 0; i < indice; i++) {
            if (discos[i].equals(discoAEliminar)) {
                // Desplazamos todos los discos a la izquierda para "eliminar" el disco
                for (int j = i; j < indice - 1; j++) {
                    discos[j] = discos[j + 1];
                }
                discos[indice - 1] = null;
                indice--;
                System.out.println("Disco eliminado correctamente");
                return;
            }
        }

        System.out.println("No se encontró el disco especificado");
    }

    public void listarDiscos() {
        if (indice == 0) {
            System.out.println("La colección está vacía");
            return;
        }

        System.out.println("Discos en la colección:");
        for (int i = 0; i < indice; i++) {
            System.out.println(discos[i].toString());
        }
    }
}
