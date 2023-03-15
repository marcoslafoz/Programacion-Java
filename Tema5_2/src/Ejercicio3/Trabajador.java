package Ejercicio3;

public class Trabajador {
	private int id;
	private String nombre;
	private char  turno;
	private int nivelTitulacion;
	private int antiguedad;
	
	//Definimos una clase para Trabajador
	public Trabajador(int id, String nombre, char turno, int nivelTitulacion, int antiguedad) {
		this.id = id;
		this.nombre = nombre;
		this.turno = turno;
		this.nivelTitulacion = nivelTitulacion;
		this.antiguedad = antiguedad;
	}
	
	//Definimos una clase para cambiar el nombre del trabajador
	public void cambiarNombreTrabajador(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}
	
	//Creamos una clase para visualizar los datos
	public void visualizarDatos() {
		System.out.println("ID: " + this.id);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Turno: " + this.turno);
		System.out.println("NTitulacion: " + this.nivelTitulacion);
		System.out.println("Antiguedad: " + this.antiguedad);
	}
	
	public double calcularNomina() {
		
		double resultadoNomina = 0;
		final double salarioBase = 425;
		
		//Le añadimos al resultado el salario base
		resultadoNomina = resultadoNomina + salarioBase;
		
		//Si es de turno de noche (N) le añadimos 100 a el resultado
		if(this.turno == 'N' | this.turno == 'n') {
			resultadoNomina = resultadoNomina + 100;
		}
		
		//Le añadimos 75 por cada año de antiguedad
		resultadoNomina = resultadoNomina + (this.antiguedad * 75);
		
		//Le añadimos cierta cantidad depende de el nivel de titulacion
		switch(this.nivelTitulacion) {
		case 0: resultadoNomina = resultadoNomina + 250 ;
		break; 
		case 1: resultadoNomina = resultadoNomina + 500 ;
			break; 
		case 2: resultadoNomina = resultadoNomina + 1000 ;
			break; 
		case 3: resultadoNomina = resultadoNomina + 1250 ;
			break; 
		case 4: resultadoNomina = resultadoNomina + 1500 ;
			break; 
			default: resultadoNomina = resultadoNomina + 0 ;
				break;
		
		}
		
		//switch (this.turno)
		
		return resultadoNomina;
	}
	
	
}
