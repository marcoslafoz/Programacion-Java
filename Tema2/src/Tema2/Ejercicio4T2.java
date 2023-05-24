package Tema2;


/** 
Este programa te dice el mes introduciendo el numero de mes del 1 al 12

Marcos.
4/10/22           
**/


import java.util.Scanner;

public class Ejercicio4T2 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int nMes;

            System.out.println("Ingrese el numero de mes: ");
            nMes = teclado.nextInt();

            switch (nMes) {
                case 1:
                    System.out.println("("+nMes+") El mes seleccionado es Enero");
                    break;
                case 2:
                    System.out.println("El mes seleccionado es Febrero");
                    break;
                case 3:
                    System.out.println("El mes seleccionado es Marzo");
                    break;
                case 4:
                    System.out.println("El mes seleccionado es Abril");
                    break;
                case 5:
                    System.out.println("El mes seleccionado es Mayo");
                    break;
                case 6:
                    System.out.println("El mes seleccionado es Junio");
                    break;
                case 7:
                    System.out.println("El mes seleccionado es Julio");
                    break;
                case 8:
                    System.out.println("El mes seleccionado es Agosto");
                    break;
                case 9:
                    System.out.println("El mes seleccionado es Septiembre");
                    break;
                case 10:
                    System.out.println("El mes seleccionado es Octubre");
                    break;
                case 11:
                    System.out.println("El mes seleccionado es Noviembre");
                    break;
                case 12:
                    System.out.println("El mes seleccionado es Diciembre");
                    break;

                default: System.out.println("Opcion no valida, por favor introduzca un numero del 1 -12");
                    break;
            }
        }
    }
}
