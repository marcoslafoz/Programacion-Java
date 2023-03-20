package Examen;

public class Cafetera extends Electrodomestico{
	
	private int servicios;
	private boolean mantenimientoCafetera;
	
	//Servicios
	
	public void setServicios(int servicios) {
		this.servicios = servicios;
	}
	
	public int getServicios() {
		return servicios;
	}
	
	//Mantenimiento
	
	public void setMantenimientoCafetera(boolean mantenimientoCafetera) {
		this.mantenimientoCafetera = mantenimientoCafetera;
	}
	
	public boolean getMantenimientoCafetera() {
		return mantenimientoCafetera;
	}
	
}
