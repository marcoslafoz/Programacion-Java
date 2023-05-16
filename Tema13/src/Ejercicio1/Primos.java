package Ejercicio1;

public class Primos {
	public static boolean esPrimo(int n1) {
		
		boolean esPrimo = false;
		int acumulador = 0;
		
		for(int i = 1 ; i <= n1 ; i++) {
			if(n1%i == 0) {acumulador++;} 
		}
	
		if(acumulador <= 2) {esPrimo = true;}
		
		return esPrimo; 
	
	}
}
