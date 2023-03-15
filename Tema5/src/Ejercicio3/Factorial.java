package Ejercicio3;

public class Factorial {
	public static Integer resFactorial(int n1) {
		
		int resultado = 1;
		
		for(int i = 1 ; i <= n1 ; i++) {
			resultado = resultado * i ;
		}
		
		return resultado;
	}
}
