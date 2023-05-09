package Ejercicio3;

/*3) Escribe un programa que rellene un vector de 100 elementos con números enteros
aleatorios comprendidos entre 100 y 500 (ambos incluidos). A continuación, el programa
mostrará el mínimo y el máximo de los cien.*/

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		//Creamos el vector
		int[] vector = new int[100];
		//Creamos el objeto random
		Random rand = new Random();
		
		//Asignamos un numero aleatorio del 100 al 500 en cada posicion del vector
		for(int i = 0 ; i < 100 ; i++) {
			vector[i] = rand.nextInt(401)+100;
			System.out.print(vector[i] + " ");
		}
		
		//Comprobamos el mayor y el menor
		
		int nMayor = 0;
		int nMenor = 501;
		
		for(int i = 0 ; i < 100 ; i++) {
			if(vector[i] > nMayor) {nMayor = vector[i];}
			if(vector[i] < nMenor) {nMenor = vector[i];}
		}
		
		System.out.println("\nnMayor: " + nMayor);
		System.out.println("nMenor: " + nMenor);
		
	}
}
