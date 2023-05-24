package Ejercicio2;

import java.util.Random;

public class Herramientas {
	
	//Clase para generar partidos y asignarle votos
	public static void GenerarPartidos(int[][] matriz) {
		
		Random rand = new Random();
		
		for(int i = 0 ; i < matriz.length ; i++) {
			for(int k = 0 ; k < matriz[0].length ; k++) {
				matriz[i][k] = rand.nextInt(9000)+1000;
			}
		}

	}
	
	//Clase para imprimir los datos
	public static void ImpPartidos(int[][] matriz, int[] totalVotos) {
		
		for(int i = 0 ; i < matriz.length ; i++) {
			for(int k = 0 ; k < matriz[0].length ; k++) {
				System.out.println("PARTIDO " + i + " ESCAÑO> " + k + " VOTOS> " + matriz[i][k]);
			}
		}
		
		System.out.println("");
	}
	
	//Clase para sumar los votos de cada partido
	public static int[] SumarVotos(int[][] matriz, int nPartidos, int[] totalVotos ) {
		
		int acumuladorVotos = 0;
		
		for(int i = 0 ; i < matriz.length ; i++) {
			for(int k = 0 ; k < matriz[0].length ; k++) {
				acumuladorVotos += matriz[i][k];
			}
			totalVotos[i] = acumuladorVotos;
			acumuladorVotos = 0;
		}
		
		return totalVotos;
	}
	
	//Clase para imprimir los partidos ordenados descendentemente segun el numero de votos 
	public static void ordPartidos(int[] nVotos) {

	    int n = nVotos.length;
	    for (int i = 0; i < n-1; i++) {
	        for (int j = 0; j < n-i-1; j++) {
	            if (nVotos[j] < nVotos[j+1]) {
	                int temp = nVotos[j];
	                nVotos[j] = nVotos[j+1];
	                nVotos[j+1] = temp;
	            }
	        }
	    }    
	    
	    for(int i = 0 ; i < nVotos.length ; i++) {
	    	System.out.println("PARTIDO > " + i +" " + nVotos[i]);
	    }
	    
	    System.out.println("");
	}
	
}
