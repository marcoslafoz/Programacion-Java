package Ejercicio1;

public class Operaciones {

    // Selector de opciones
    public static void impOpciones() {
        System.out.println("0 | exit | Salir");
        System.out.println("1 | push | Apilar en la cima");
        System.out.println("2 | pop | Desapilar de la cima");
        System.out.println("3 | size | Conocer el número de elementos apilados");
        System.out.println("4 | print | Imprimir la pila");
        System.out.println("Opcion>");
    }

    // push - Añadir el nuevo numero en la primera posicion y desplazar el resto una posicion
    public static void push(int numero, int[] pila) {

        int[] pilaAuxPush = new int[100];

        if (Operaciones.size(pila) <= 100) {
            if (Operaciones.size(pila) == 0) {
                pila[0] = numero;
            } else {// Si el tamaño de la pila es > 0

                // Duplicamos el vector
                for (int i = 0; i < pila.length; i++) {
                    pilaAuxPush[i] = pila[i];
                }

                // Pasamos el nuevo numero a la posicion 0 de la pila

                pila[0] = numero;

                // Copiamos los numeros de la pilaAuxPush a la pila original pero con una
                // posicion mas

                for (int i = 0; i < (pilaAuxPush.length - 1); i++) {
                    pila[i + 1] = pilaAuxPush[i];
                }
            }
        } else {
            System.out.println("El vector esta lleno [100/100]");
        }

    }

    // pop - Quitar la posicion 1 del vector y mover todo una posicion alante
    public static void pop(int[] pila) {

        int[] pilaAuxPop = new int[100];

        // Copiamos el vector
        for (int i = 0; i < pila.length; i++) {
            pilaAuxPop[i] = pila[i];
        }

        // Pasamos el vector aux a el vector original
        for (int i = 1; i < pila.length; i++) {
            pila[i - 1] = pilaAuxPop[i];
        }
    }

    // size
    public static int size(int[] vector) {

        int tam = 0;
        if (vector[0] == 0) {
            tam = 0;
        } else {

            for (int i = 0; i < vector.length; i++) {
                if (vector[i] != 0) {
                    tam = i + 1;
                }
            }
        }
        return tam;
    }

    // Imprimimos el vector
    public static void impVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("|" + vector[i]);
        }
        System.out.println("\n");
    }
}