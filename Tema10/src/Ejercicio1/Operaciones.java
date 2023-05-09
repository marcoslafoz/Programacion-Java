package Ejercicio1;

public class Operaciones {

	//Selector de opciones
	public static void impOpciones() {
		System.out.println("0 | exit | Salir");
		System.out.println("1 | push | Apilar en la cima");
		System.out.println("2 | pop | Desapilar de la cima");
		System.out.println("3 | size | Conocer el número de elementos apilados");
		System.out.println("4 | print | Imprimir la pila");
		System.out.println();
		System.out.print("Opcion> ");
		System.out.println();
	}
	

    
    //push - Añadir el nuevo numero la posicion 1 del vector y desplazar todo lo demas una posicion mas
    public static void push(int numero, int[] pila) {
    	
    }
    
    //pop - Quitar la posicion 1 del vector y mover todo una posicion alante
    public static void pop() {
    	
    }
    
    //size
    public static int size(int[] vector) {
    	
    	int tam = 0;
    	
    	for (int i = 0 ; i < vector.length ; i++) {
    		if(vector[i] != 0) {tam = i;}
    	}
    	
    	return tam;
    }
    
    // Imprimimos el vector
    public static void impVector(int[] vector) {
        for (int i = 1; i < vector.length; i++) {
            System.out.print("|" + vector[i] );
        }
    }
     
}
