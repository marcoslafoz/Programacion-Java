
/** 
Este programa te dice si tienes derecho a evaluacion continua evaluando tus faltas de asistencia de un asignatura.
Tiene 4 salidas:
    -No tienes faltas.
    -Tienes menos del 5% de las faltas.
    -Has superado el 5% de las faltas.
    -Has superado el 10% de las faltas.
    -Has superado el 15% de las faltas, lo que significa que has perdido el derecho a la evaluacion continua.

Marcos.
3/10/22           
**/

import java.util.Scanner;

public class FaltasDeAsistencia {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int hTotales, hFaltas;
            float aviso5, aviso10, aviso15;

            System.out.println("Ingrese el numero de faltas: ");
            hFaltas = teclado.nextInt();
            System.out.println("Ingrese el numero de horas de la asignatura: ");
            hTotales = teclado.nextInt();

            aviso5 = (hTotales * 5) / 100;
            aviso10 = (hTotales * 10) / 100;
            aviso15 = (hTotales * 15) / 100;

            if (hFaltas < 1)
                System.out.println("No tienes Faltas ");
            else if (hFaltas > 0 && hFaltas < aviso5)
                System.out.println("Tienes " + hFaltas + " faltas, lo que supone menos del 5% ");
            else if (hFaltas > aviso5 && hFaltas < aviso10)
                System.out.println("Aviso, has superado el 5% de faltas ");
            else if (hFaltas >= aviso10 && hFaltas < aviso15)
                System.out.println("Aviso, has superado el 10% de faltas ");
            else if (hFaltas >= aviso15)
                System.out.println(
                        "Estimado Alumno;" + '\n' +
                                "Tienes un nuevo aviso." + '\n' +
                                "Has superado el limite de faltas. " + hFaltas + "/" + hTotales + '\n' +
                                "Lo que supone mas del 15% de las horas totales de la asignatura." + '\n' +
                                "Lo que significa que ha perdido el derecho a la evaluacion continua");
        }
    }
}