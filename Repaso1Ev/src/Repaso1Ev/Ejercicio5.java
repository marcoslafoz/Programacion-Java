package Repaso1Ev;

//Importamos bibliotecas
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            //Variables
	double nex1,nex2,pex1,pex2,notad;
	
    //Inicializar variables
        System.out.print("Escribe la nota del primer examen > ");
        nex1 = teclado.nextDouble();
        System.out.print("Escribe la nota que quieres sacar > ");
        notad = teclado.nextDouble();
        
    //Operaciones
        pex1 = nex1 * 0.3;
        pex2 = notad - pex1;
        nex2 = pex2 / 0.7;
    
    //Resultado
        if (nex2 <=10) {
            System.out.println("Necesitas sacar un " + nex2 + " en el segundo examen");
        }
        else {
            System.out.println("NO LO VAS A CONSEGUIR :)");
        }

        }
    }
}