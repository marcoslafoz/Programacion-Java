package Ejercicio3;

public class AlgoritmoOrdenacion {
    // Ordenamos el vector
    public static void ordenarVector(int[] vector) {
    
    	        int n = vector.length;
    	        int min, max;
    	        int inicio = 0;
    	        int fin = n - 1;
    	        while (inicio < fin) {
    	            // Encontrar el mínimo y máximo del segmento actual
    	            min = max = vector[inicio];
    	            for (int i = inicio + 1; i <= fin; i++) {
    	                if (vector[i] < min) {
    	                    min = vector[i];
    	                } else if (vector[i] > max) {
    	                    max = vector[i];
    	                }
    	            }
    	            // Poner el mínimo al inicio y el máximo al final
    	            vector[inicio] = min;
    	            vector[fin] = max;
    	            // Avanzar el inicio y retroceder el final
    	            inicio++;
    	            fin--;
    	}
    }
}
