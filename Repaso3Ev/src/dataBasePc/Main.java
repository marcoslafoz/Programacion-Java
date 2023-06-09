package dataBasePc;

/**
 * 
 * @author Marcos
 * @date 31/05/2023
 * 
 * Programa para la gestion de una base de datos de ordenadores con 
 * distintas opciones
 * 
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            // Creamos objetos de las clases
            DatosReader datosReader = new DatosReader();
            DatosWriter datosWriter = new DatosWriter();

            // Llamamos al metodo leer datos
            datosReader.leerDatos("datos.dat");

            // Asignamos los datos leidos a las listas
            List<Portatil> listaPortatil = datosReader.getListaPortatil();
            List<Sobremesa> listaSobremesa = datosReader.getListaSobremesa();
            List<Profesional> listaProfesional = datosReader.getListaProfesional();

            // Declaramos algunas variables
            int opcion;

            // Bucle para el menu de opciones
            do {
                Services.mostrarMenu();
                try {
                    opcion = teclado.nextInt();
                    System.out.println();

                    switch (opcion) {
                        case 0: // Salir
                            datosWriter.guardarDatos(listaProfesional, listaSobremesa, listaPortatil, "datos.dat");
                            System.out.println("\nDatos guardados\nSaliendo...");
                            break;

                        case 1: // Añadir ordenador
                            Services.agregarOrdenador(listaProfesional, listaSobremesa, listaPortatil, teclado);
                            datosWriter.guardarDatos(listaProfesional, listaSobremesa, listaPortatil, "datos.dat");
                            break;

                        case 2: // Eliminar ordenador
                            Services.eliminarOrdenador(listaProfesional, listaSobremesa, listaPortatil, teclado);
                            datosWriter.guardarDatos(listaProfesional, listaSobremesa, listaPortatil, "datos.dat");
                            break;

                        case 3: // Mostrar listado de equipos
                            Services.mostrarListadoEquipos(listaProfesional, listaSobremesa, listaPortatil);
                            break;

                        case 4: // Mostrar datos de un ordenador
                            Services.mostrarDatosOrdenador(listaProfesional, listaSobremesa, listaPortatil);
                            break;

                        case 5: // Mostrar ordenadores por marca
                            Services.mostrarOrdenadoresPorMarca(listaProfesional, listaSobremesa, listaPortatil);
                            break;

                        case 6: // Mostrar datos de sobremesa por tipo de disco duro
                            Services.mostrarDiscosDurosSobremesa(listaSobremesa);
                            break;

                        case 7: // Mostrar ordenadores de un año y recuento total
                            Services.mostrarOrdenadoresPorAño(listaProfesional, listaSobremesa, listaPortatil);
                            break;

                        case 8: // Guardar
                            datosWriter.guardarDatos(listaProfesional, listaSobremesa, listaPortatil, "datos.dat");
                            System.out.println("Datos guardados");
                            break;

                        default: // Default
                            System.out.println("Opción inválida. Intente nuevamente.");
                            break;
                    }

                    System.out.println();
                } catch (InputMismatchException e) {
                    System.out.println("Opción no válida. Intente nuevamente.");
                    teclado.nextLine(); // Limpiar el búfer del escáner
                    opcion = -1; // Establecer una opción inválida para repetir el bucle
                }
            } while (opcion != 0);

            System.out.println("Programa finalizado.");
        }
    }
}
