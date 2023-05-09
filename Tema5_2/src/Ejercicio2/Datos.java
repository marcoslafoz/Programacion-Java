package Ejercicio2;

public class Datos {

	public static String leerDatos(String nombre, Integer nEmpleado) {

		Empleado empleado1 = new Empleado();
		empleado1.setNombre(nombre);
		empleado1.setNEmpleado(nEmpleado);

		return null;
	}

	public static String verDatos(String nombre, Integer nEmpleado) {

		String resultado = "Nombre: " + nombre + " nEmpleado: " + nEmpleado;
		return resultado;
	}
}
