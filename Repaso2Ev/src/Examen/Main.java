package Examen;

import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		try(Scanner teclado = new Scanner(System.in)){
			
			//Instanciamos los objetos de cada electrodomestico
			Electrodomestico[] cafetera = new Cafetera[1000000];
			Electrodomestico[] horno = new Horno[1000000];
			Electrodomestico[] frigorifico = new Frigorifico[1000000];

			//Creamos el objeto para el numero aleatorio
			Random rand1 = new Random();
			int nAleatorioElectro , nAleatorioPesoCafetera, nAleatorioPesoHorno, nAleatorioPesoFrigorifico, nAleatorioColor, colorAleatiorio, nAleatorioPintar;
			
			//Definimos los colores en variables
			int rojo = 100 , verde = 010, azul = 001, blanco = 111, negro = 000;
			
            // Bucle para crear los 1000000 objetos aleatorios de electrodomesticos -- mesa[i] = new Mesa();
            for (int i = 0; i < 1000000; i++) {
            	nAleatorioElectro = rand1.nextInt(3);
            	nAleatorioPesoCafetera = rand1.nextInt(4)+2;
            	nAleatorioPesoHorno = rand1.nextInt(40)+60;
            	nAleatorioPesoFrigorifico = rand1.nextInt(80)+70;
            	nAleatorioColor = rand1.nextInt(5);
            	nAleatorioPintar = rand1.nextInt(2);
            	colorAleatiorio = blanco;
            	
            	switch(nAleatorioColor) {
            	case 0 : 
            		colorAleatiorio = rojo;
            		;break;
            	case 1 : 
            		colorAleatiorio = verde;
            		;break;
            	case 2 : 
            		colorAleatiorio = azul;
            		;break;
            	case 3 : 
            		colorAleatiorio = blanco;
            		;break;
            	case 4 : 
            		colorAleatiorio = negro;
            		;break;
            		
            	}
            	
            	switch (nAleatorioElectro) {
            	
            	//En caso de que el nAleatorioElectro sea 0 se creara una cafetera
            	case 0 : 
            		cafetera[i] = new Cafetera();
            		//Asignamos propiedades al objeto cafetera
            		cafetera[i].setPeso(nAleatorioPesoCafetera);
            		cafetera[i].setDiasTranscurridos(30);
            		//Decidimos si pintar o no segun el numero aleatorio de nAleatorioPintar
            		if(nAleatorioPintar == 0) {
            			cafetera[i].pintar(colorAleatiorio);
            		}else {
            			cafetera[i].pintar(blanco);
            		}
            		
            		System.out.println("Cafetera");
            		System.out.println("Peso: " + cafetera[i].getPeso() +"kg");
            		System.out.println("DiasTranscurridos: " + cafetera[i].getDiasTranscurridos());
            		System.out.println("Color: " + cafetera[i].getColor());
            		
            		; break;
            	
            	//En caso de que el nAleatorioElectro sea 1 se creara un horno
            	case 1 : 
            		horno[i] = new Horno();
            		//Asignamos propiedades al objeto horno
            		horno[i].setPeso(nAleatorioPesoHorno);
            		horno[i].setDiasTranscurridos(30);
            		//Decidimos si pintar o no segun el numero aleatorio de nAleatorioPintar
            		if(nAleatorioPintar == 0) {
            			horno[i].pintar(colorAleatiorio);
            		}else {
            			horno[i].pintar(blanco);
            		}
            		
            		System.out.println("Horno");
            		System.out.println("Peso: " + horno[i].getPeso() +"kg");
            		System.out.println("DiasTranscurridos: " + horno[i].getDiasTranscurridos());
            		System.out.println("Color: " + horno[i].getColor());
            		
            		; break;
            	
            	//En caso de que el nAleatorioElectro sea 2 se creara un frigorifico
            	case 2 : 
            		frigorifico[i] = new Frigorifico();
            		//Asignamos propiedades al objeto frigorifico
            		frigorifico[i].setPeso(nAleatorioPesoFrigorifico);
            		frigorifico[i].setDiasTranscurridos(30);
            		//Decidimos si pintar o no segun el numero aleatorio de nAleatorioPintar
            		if(nAleatorioPintar == 0) {
            			frigorifico[i].pintar(colorAleatiorio);
            		}else {
            			frigorifico[i].pintar(blanco);
            		}
            		
            		System.out.println("Frigorifico");
            		System.out.println("Peso: " + frigorifico[i].getPeso() +"kg");
            		System.out.println("DiasTranscurridos: " + frigorifico[i].getDiasTranscurridos());
            		System.out.println("Color: " + frigorifico[i].getColor());
            		
            		; break;
            		
            	//Default
            	default: 
            			break;
            	}
            }
			

			
		}
	}
}
