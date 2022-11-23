
//Importamos bibliotecas
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            
            //Pedimos jugada a j1
            System.out.println();
            System.out.print("Turno de Jugador 1> ");
            //Recogemos jugada j1
            String j1 = teclado.next();

            //Pedimos jugada a j2
            System.out.print("Turno de Jugador 2> ");
            //Recogemos jugada j2
            String j2 = teclado.next();

            System.out.println();

            //operamos 

            if (j1.equals("piedra") & j2.equals("papel")){System.out.println("Ha ganado el Jugador 2");}
            if (j1.equals("piedra") & j2.equals("tijera")){System.out.println("Ha ganado el Jugador 1");}

            if (j1.equals("papel") & j2.equals("piedra")){System.out.println("Ha ganado el Jugador 1");}
            if (j1.equals("papel") & j2.equals("tijera")){System.out.println("Ha ganado el Jugador 2");}

            if (j1.equals("tijera") & j2.equals("piedra")){System.out.println("Ha ganado el Jugador 2");}
            if (j1.equals("tijera") & j2.equals("papel")){System.out.println("Ha ganado el jugador 1");}

            //Mensaje de error

            if ( j1.equals(j2)){
                System.out.println("Error");
            }
        }
    }
}