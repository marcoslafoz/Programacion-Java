
//Importamos bibliotecas
import java.util.Scanner;

//Clase Ej2Tema3
public class Ejercicio2T3 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            // Ejercicio 1
            // Definimos Variables
            int operacion;
            int cont = 1;
            int correctas = 0;
            // Print Menu eleccion operacion
            System.out.println();
            System.out.println("Selecciona el tipo de operacion");
            System.out.println();
            System.out.println("1 - Suma");
            System.out.println("2 - Resta");
            System.out.println("3 - Multiplicacion");
            System.out.println();
            operacion = teclado.nextInt();

            // Switch eleccion operacion
            switch (operacion) {
                case 1:
                    // Print operacion seleccionada
                    System.out.println();
                    System.out.println("Has selecciona la suma");
                    System.out.println();
                    // Generador 10 operaciones de suma
                    while (cont < 10) {
                        // Definimos y asignamos un numero aleatorio a n1 y n2 de 0 al 10
                        double n1 = Math.random() / Math.nextDown(0.1);
                        double n2 = Math.random() / Math.nextDown(0.1);
                        // Definimos y operamos la suma de los numeros random
                        int suma = (int) n1 + (int) n2;
                        // Print operaciones y lo pasamos a Int
                        System.out.println("- " + cont + ": " + (int) n1 + " + " + (int) n2 + " =");
                        // Definimos y Introducimos resultado
                        System.out.println();
                        int resultado = teclado.nextInt();
                        // Validamos y imprimimos resultado
                        System.out.println();
                        if (suma == resultado) {
                            System.out.println("Correcto");
                            correctas++;
                        } else {
                            System.out.println("Incorrecto");
                        }
                        System.out.println();
                        // Contador +1
                        cont++;
                    }
                    // Print nota
                    System.out.println("Nota = " + correctas +"/10");
                    if (correctas>=5) {
                        System.out.println("Has aprobado");
                    } else {
                        System.out.println("Has suspendiodo");
                    }
                    break;
                case 2:
                // Print operacion seleccionada
                System.out.println();
                System.out.println("Has selecciona la resta");
                System.out.println();
                // Generador 10 operaciones de suma
                while (cont < 10) {
                    // Definimos y asignamos un numero aleatorio a n1 y n2 de 0 al 10
                    double n1 = Math.random() / Math.nextDown(0.1);
                    double n2 = Math.random() / Math.nextDown(0.1);
                    // Definimos y operamos la suma de los numeros random
                    int suma = (int) n1 - (int) n2;
                    // Print operaciones y lo pasamos a Int
                    System.out.println("- " + cont + ": " + (int) n1 + " - " + (int) n2 + " =");
                    // Definimos y Introducimos resultado
                    System.out.println();
                    int resultado = teclado.nextInt();
                    // Validamos y imprimimos resultado
                    System.out.println();
                    if (suma == resultado) {
                        System.out.println("Correcto");
                        correctas++;
                    } else {
                        System.out.println("Incorrecto");
                    }
                    System.out.println();
                    // Contador +1
                    cont++;
                }
                // Print nota
                System.out.println("Nota = " + correctas +"/10");
                if (correctas>=5) {
                    System.out.println("Has aprobado");
                } else {
                    System.out.println("Has suspendiodo");
                }
                    break;
                case 3:
                // Print operacion seleccionada
                System.out.println();
                System.out.println("Has selecciona la multiplicacion");
                System.out.println();
                // Generador 10 operaciones de suma
                while (cont < 10) {
                    // Definimos y asignamos un numero aleatorio a n1 y n2 de 0 al 10
                    double n1 = Math.random() / Math.nextDown(0.1);
                    double n2 = Math.random() / Math.nextDown(0.1);
                    // Definimos y operamos la suma de los numeros random
                    int suma = (int) n1 * (int) n2;
                    // Print operaciones y lo pasamos a Int
                    System.out.println("- " + cont + ": " + (int) n1 + " x " + (int) n2 + " =");
                    // Definimos y Introducimos resultado
                    System.out.println();
                    int resultado = teclado.nextInt();
                    // Validamos y imprimimos resultado
                    System.out.println();
                    if (suma == resultado) {
                        System.out.println("Correcto");
                        correctas++;
                    } else {
                        System.out.println("Incorrecto");
                    }
                    System.out.println();
                    // Contador +1
                    cont++;
                }
                // Print nota
                System.out.println("Nota = " + correctas +"/10");
                if (correctas>=5) {
                    System.out.println("Has aprobado");
                } else {
                    System.out.println("Has suspendiodo");
                }
                    break;
                default:
                 System.out.println("Opcion no valida, seleccione un numero del 1-3");
                    break;
            }
        }
    }
}
