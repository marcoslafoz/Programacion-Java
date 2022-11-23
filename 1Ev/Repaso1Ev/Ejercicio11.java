
//Importamos bibliotecas
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            // Definimos algunas variables
            double precio;

            // Recopilamos datos

            System.out.println("Tienes tarjeta Cinepass (true/false)");
            boolean cinepass = teclado.nextBoolean();

            System.out.println("Numero de personas");
            double personas = teclado.nextDouble();

            System.out.println("Dia de la semana");
            String dia = teclado.next();

            // Filtro cinepass
            if (cinepass == true) {
                // Filtro dia de la semana
                switch (dia.toLowerCase()) {
                    case "lunes", "martes", "viernes", "sabado", "domingo":
                        // Operamos
                        precio = (personas * 8) * 0.9;
                        // Imprimimos resultados
                        System.out.println("Dia: " + dia);
                        System.out.println("Entradas: " + personas);
                        System.out.println("Precio: " + precio + "(Dto. Cinepass)");
                        break;

                    case "miercoles":
                        // Operamos precio dia espectador
                        precio = (personas * 5) * 0.9;
                        // Imprimimos resultados
                        System.out.println("Dia: " + dia + "(Día del espectador)");
                        System.out.println("Entradas: " + personas);
                        System.out.println("Precio: " + precio + "(Dto. Cinepass)");
                        break;

                    case "jueves":
                        if (personas % 2 == 0) {
                            // Operamos precio dia espectador
                            precio = (personas * 5.5) * 0.9;
                            // Imprimimos resultados
                            System.out.println("Dia: " + dia + " (Dia de parejas)");
                            System.out.println("Entradas: " + personas);
                            System.out.println("Precio: " + precio + "(Dto. Cinepass)");
                        } else {
                            // Operamos
                            precio = (((personas - 1) * 5.5) + 8) * 0.9;
                            // Imprimimos resultados
                            System.out.println("Dia: " + dia + " (Dia de parejas)");
                            System.out.println("Entradas: " + personas);
                            System.out.println("Precio: " + precio + "(Dto. Cinepass)");
                        }
                        break;

                    default:
                        System.out.println("Error.");
                        break;
                }
            } else {
                // Filtro dia de la semana
                switch (dia.toLowerCase()) {
                    case "lunes", "martes", "viernes", "sabado", "domingo":
                        // Operamos
                        precio = (personas * 8) * 1;
                        // Imprimimos resultados
                        System.out.println("Dia: " + dia);
                        System.out.println("Entradas: " + personas);
                        System.out.println("Precio: " + precio + "(Dto. Cinepass)");
                        break;

                    case "miercoles":
                        // Operamos precio dia espectador
                        precio = (personas * 5) * 1;
                        // Imprimimos resultados
                        System.out.println("Dia: " + dia + "(Día del espectador)");
                        System.out.println("Entradas: " + personas);
                        System.out.println("Precio: " + precio);
                        break;

                    case "jueves":
                        if (personas % 2 == 0) {
                            // Operamos precio dia espectador
                            precio = (personas * 5.5) * 1;
                            // Imprimimos resultados
                            System.out.println("Dia: " + dia + " (Dia de parejas)");
                            System.out.println("Entradas: " + personas);
                            System.out.println("Precio: " + precio);
                        } else {
                            // Operamos
                            precio = (((personas - 1) * 5.5) + 8) * 1;
                            // Imprimimos resultados
                            System.out.println("Dia: " + dia + " (Dia de parejas)");
                            System.out.println("Entradas: " + personas);
                            System.out.println("Precio: " + precio);
                        }
                        break;

                    default:
                        System.out.println("Error.");
                        break;
                }
            }
        }
    }
}