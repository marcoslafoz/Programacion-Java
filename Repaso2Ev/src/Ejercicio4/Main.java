package Ejercicio4;

import java.util.Scanner;

/*Un restaurante nos ha encargado una aplicación para colocar a los clientes en sus mesas. En
una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales (mesa llena).
Cuando llega un cliente se le pregunta cuántos son. De momento el programa no está
preparado para colocar a grupos mayores a 4, por tanto, si un cliente dice por ejemplo que
son un grupo de 6, el programa dará el mensaje “Lo siento, no admitimos grupos de 6, solo
grupos de 4 personas como máximo”. Para el grupo que llega, se busca siempre la primera
mesa libre (con 0 personas). Si no quedan mesas libres, se indica con el mensaje “Lo siento,
no quedan mesas libres”. Una mesa puede quedar libre porque sus comensales han
finalizado.
Escribe un programa interactivo en el que puedas ir ocupando/liberando 10 mesas (de la 1
a la 10), hasta que decidas finalizar. El programa debe mostrar el estado de las mesas cada
vez que éste cambia.*/

public class Main {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            // Instancianos el vector para el objeto mesa
            Mesa[] mesa = new Mesa[10];

            // Bucle para crear los 10 objetos de mesa y definir una mesa
            for (int i = 0; i < 10; i++) {
                mesa[i] = new Mesa();
                mesa[i].setNumeroMesa(i);
            }

            boolean bucle = true;
            while (bucle == true) {
                // Selector de opciones
                System.out.println("1 | Anadir mesa");
                System.out.println("2 | Mostrar todas las mesas");
                System.out.println("3 | Eliminar mesa");
                System.out.println("0 | Salir");

                int opcion = teclado.nextInt();
                System.out.print("Introduce una opcion> \n");

                switch (opcion) {
                    case 1: // Opcion1
                        System.out.print("Numero de mesa");
                        int nMesa = teclado.nextInt();
                        System.out.print("Numero de clientes");
                        int nClientes = teclado.nextInt();
                        mesa[nMesa].setNumeroClientes(nClientes);
                        ;
                        break;
                    case 2: // Opcion2
                        for (int i = 0; i < 10; i++) {
                            System.out.println("Numero de mesa: " + mesa[i].getNumeroMesa());
                            System.out.println("Numero de clientes de mesa " + mesa[i].getNumeroMesa() + ": "
                                    + mesa[i].getNumeroClientes());
                        }
                        ;
                        break;
                    case 3: // Opcion3
                        System.out.print("Numero de mesa");
                        nMesa = teclado.nextInt();
                        mesa[nMesa].setNumeroClientes(0);
                        ;
                        break;
                    case 0: // Opcion salir
                        System.out.println("Saliendo...");
                        bucle = false;
                        ;
                        break;
                }

            }
        }
    }
}
