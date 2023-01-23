package Tema6;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            
            int[] vectorInt = {11 , 22 , 33 , 44 ,55};
            
            System.out.println(vectorInt[0]); //Posicion 0 del vector (11)
            System.out.println(vectorInt.length); //Numero de numeros que almacena el vector (5)

            String[] vectorString = {"hola" , "adios"}; //Vector con string
            System.out.println(vectorString[0]);
            System.out.println(vectorString[1]);
        }
    }
}
