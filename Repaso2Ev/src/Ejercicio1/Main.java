package Ejercicio1;

/*Define tres vectores de 20 números enteros cada uno, con nombres numero, cuadrado y
cubo. Carga el vector numero con valores aleatorios entre 0 y 100. En el vector cuadrado se
deben almacenar los cuadrados de los valores que hay en el vector numero. En el vector
cubo se deben almacenar los cubos de los valores que hay en numero. A continuación,
muestra el contenido de los tres vectores dispuesto en tres columnas, separados por
tabuladores.*/

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		//Creamos el objeto random
		Random rand = new Random();
		
		//Definimos los vectores
		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];
		
		for(int i = 0 ; i < 20 ; i++) {
			numero[i] = rand.nextInt(101);
			cuadrado[i] = numero[i] * numero[i];
			cubo[i] = numero[i] * numero[i] * numero[i];
			
			System.out.println(numero[i] + " | " + cuadrado[i] + " | " + cubo[i]);
		}
	}
}
