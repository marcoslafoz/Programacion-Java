package Ejercicio1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        
        try {
            
        	BufferedWriter writer = new BufferedWriter(new FileWriter("primos.txt"));
        	
            for (int numero = 1; numero <= 500; numero++) {
                if (Primos.esPrimo(numero)) {
                    writer.write(Integer.toString(numero));
                    writer.newLine();
                }
            }
            
            writer.close();
            
            System.out.println("Los números primos se han escrito en el archivo primos.txt.");
            
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo primos.txt: " + e.getMessage());
        }
        
        
    }
}
