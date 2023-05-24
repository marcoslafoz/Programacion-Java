package vueloFeliz;

public class Avion {
	private String nombre;
	private int capacidad;


	//Metodo que crea un avion
	public void crearAvion(String nombre, int capacidad) {

		if(capacidad >= 50 && capacidad <= 348) {
			this.capacidad = capacidad;
			this.nombre = nombre.toUpperCase();
		}else {
			System.out.println("Error al crear el avion, debe tener entre 50 y 348 pasajeros");
		}
	}

	//Getters
	public String getNombre() {
		return this.nombre;
	}

	public int getCapacidad() {
		return this.capacidad;
	}

	//Metodo para obtener los datos en un string
	public String verAvion() {
		String detallesAvion = this.nombre + ", " + this.capacidad;
		return detallesAvion;
	}


}
