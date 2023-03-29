package Ejercicio1;

public class Disco {
	private String titulo;
	private Integer nCanciones;
	private Double precio;
	private String fechaCompra;

	// Getters & Setters Titulo
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNombre() {
		return titulo;
	}

	// Getters & Setters nCanciones
	public void setNCanciones(Integer nCanciones) {
		this.nCanciones = nCanciones;
	}

	public Integer getNCanciones() {
		return nCanciones;
	}

	// Getters & Setters Precio
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Double getPrecio() {
		return precio;
	}

	// Getters & Setters fechaCompra
	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public String getFechaCompra() {
		return fechaCompra;
	}

}
