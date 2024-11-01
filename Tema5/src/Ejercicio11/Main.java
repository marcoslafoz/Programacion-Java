package Ejercicio11;

import java.util.Scanner;

/*Desarrollar un programa en Java que utilice una clase que se llame Hora con
miembros de tipo int para hora, minutos y segundos. Deberá tener un constructor para
inicializar la hora a 0 o a una hora determinada (hora, minutos, segundos).Se deberá
poder sumar y restar horas, así como imprimir y leer una hora. El formato de
impresión y lectura será hh:mm:ss, todo en modo 24 horas.*/

public class Main {
	public static void main(String[] args) {
		try(Scanner teclado = new Scanner(System.in)){
			
			//Creamos el objeto hora1
			Hora hora1 = new Hora();
			
			Boolean bucle = true;
			
			while(bucle == true) {
				
				//Selector
				System.out.println("Introduca la opcion");
				System.out.println("1 | Fijar hora");
				System.out.println("2 | Modificar hora");
				System.out.println("3 | Sumar horas");
				System.out.println("4 | Restar horas");
				System.out.println("5 | Mostrar hora");
				System.out.println("6 | Salir");
				
				//Le asignamos una variable a la seleccion anterior de tipo char
				String selecString = teclado.next();
				char selec = selecString.charAt(0);
				
				//Switch con Selector
				switch(selec) {
				case '1': 
					System.out.println("Fija un hora");
					System.out.print("Hora> ");
					int hora = teclado.nextInt();
					System.out.print("Minuto> ");
					int minutos = teclado.nextInt();
					System.out.print("Segundo> ");
					int segundos = teclado.nextInt();
					
					//Setter hora
					if(hora >= 0 & hora < 24) {hora1.setHora(hora);}else {hora1.setHora(23);}
					if(minutos >= 0 & minutos < 60) {hora1.setMinutos(minutos);}else {hora1.setMinutos(59);}
					if(segundos >= 0 & segundos < 60) {hora1.setSegundos(segundos);}else {hora1.setSegundos(59);}
					; 
					break;
				case '2': 
					System.out.println("Modifica la hora");
					System.out.print("Hora> ");
					hora = teclado.nextInt();
					System.out.print("Minuto> ");
					minutos = teclado.nextInt();
					System.out.print("Segundo> ");
					segundos = teclado.nextInt();
					
					//Setter hora
					if(hora >= 0 & hora < 24) {hora1.setHora(hora);}else {hora1.setHora(23);}
					if(minutos >= 0 & minutos < 60) {hora1.setMinutos(minutos);}else {hora1.setMinutos(59);}
					if(segundos >= 0 & segundos < 60) {hora1.setSegundos(segundos);}else {hora1.setSegundos(59);}
					; 
					break;
				case '3': 
						System.out.println("Introduce la hora para sumarla a la hora fijada");
						System.out.print("Hora> ");
						int sumHora = teclado.nextInt();
						System.out.print("Minuto> ");
						int sumMinutos = teclado.nextInt();
						System.out.print("Segundo> ");
						int sumSegundos = teclado.nextInt();
						
						String sumHora1 = hora1.getHora()+ ":" + hora1.getMinutos() + ":" + hora1.getSegundos() ;
						String sumHora2 = sumHora + ":" + sumMinutos + ":" + sumSegundos;
						
						int resHora = hora1.getHora() + sumHora ;
						int resMinutos = hora1.getMinutos() + sumMinutos ;
						int resSegundos = hora1.getSegundos() + sumSegundos ;
						
						if(resHora > 23) {resHora = 23;}
						if(resMinutos > 59) {resMinutos = 59;}
						if(resSegundos > 59) {resSegundos = 59;}
						
						String resHora1 = resHora + ":" + resMinutos + ":" + resSegundos;
						System.out.println("Resultado> "+ sumHora1 + " + " + sumHora2 + " = " + resHora1);
					; 
					break;
				case '4': 
					System.out.println("Introduce la hora para restarla a la hora fijada");
					System.out.print("Hora> ");
					sumHora = teclado.nextInt();
					System.out.print("Minuto> ");
					sumMinutos = teclado.nextInt();
					System.out.print("Segundo> ");
					sumSegundos = teclado.nextInt();
					
					sumHora1 = hora1.getHora()+ ":" + hora1.getMinutos() + ":" + hora1.getSegundos() ;
					sumHora2 = sumHora + ":" + sumMinutos + ":" + sumSegundos;
					
					resHora = hora1.getHora() - sumHora ;
					resMinutos = hora1.getMinutos() - sumMinutos ;
					resSegundos = hora1.getSegundos() - sumSegundos ;
					
					if(resHora > 23) {resHora = 23;}
					if(resMinutos > 59) {resMinutos = 59;}
					if(resSegundos > 59) {resSegundos = 59;}
					if(resHora < 0) {resHora = 0;}
					if(resMinutos < 0) {resMinutos = 0;}
					if(resSegundos < 0) {resSegundos = 0;}
					
					resHora1 = resHora + ":" + resMinutos + ":" + resSegundos;
					System.out.println("Resultado> "+ sumHora1 + " - " + sumHora2 + " = " + resHora1);
					; 
					break;
				case '5': 
					System.out.println("Hora> " + hora1.getHora()+ ":" + hora1.getMinutos() + ":" + hora1.getSegundos());
					; 
					break;
				case '6':
					System.out.println("Saliendo...");
					bucle = false;
					; 
					break;
				}
			}
			
		}
	}
}
