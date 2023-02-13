import java.util.Random;

/*
 * Generar dos vectores de dimensión 10 (dar valores aleatorios entre 1 y 5) y comprobar para
 *   cada uno de los elementos del primer vector cuántas veces está en el segundo, es decir
 *   primero: 3,7,2
 *   segundo: 3,3,5
 *   el resultado debe ser:
 *   elemento 1 (3): 2 veces
 *   elemento 2 (7): 0 veces
 *   elemento 3 (2): 0 veces
*/

public class Ejercicio4T6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] vector1 = new int[10];
        int[] vector2 = new int[10];

        // Generamos los números aleatorios para los dos vectores
        for (int i = 0; i < 10; i++) {
            vector1[i] = rand.nextInt(5) + 1;
            vector2[i] = rand.nextInt(5) + 1;
        }

        // Recorremos el primer vector y contamos cuántas veces está cada elemento en el
        // segundo
        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < 10; j++) {
                if (vector1[i] == vector2[j]) {
                    count++;
                }
            }
            System.out.println("Elemento " + (i + 1) + " (" + vector1[i] + "): " + count + " veces");
        }
    }
}
