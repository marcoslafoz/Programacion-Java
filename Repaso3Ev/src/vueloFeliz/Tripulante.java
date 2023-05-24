package vueloFeliz;

public class Tripulante {

	private String nombre, dni, idAvion;

	//Metodo que crea un avion
	public void crearTripulante(String nombre, String dni, String idAvion) {

		char letraDni = dni.charAt(8);

		if(dni.length() == 9 && Character.isLetter(letraDni)  ) {
			this.nombre = nombre.toUpperCase();
			this.dni = dni.toUpperCase();
			this.idAvion = idAvion.toUpperCase();
		}else {
			System.out.println("Error, el DNI no es valido");
		}

	}

	//Getters
	public String getNombre() {
		return this.nombre;
	}

	public String getDni() {
		return this.dni;
	}

	public String getIdAvion() {
		return this.idAvion;
	}

	//Metodo para obtener los datos en un string
	public String verTripulante() {
		String detallesTripulante = this.nombre + ", " + this.dni + ", " + this.idAvion;
		return detallesTripulante;
	}


}
