package Ejercicio4;

public class Operaciones {
	public static Float ingresoDinero(float saldo, float ingreso) {
		Float nuevoSaldo = saldo + ingreso;
		
		return nuevoSaldo;
	}
	
	public static Float retirarDinero(float saldo, float retirada) {
		Float nuevoSaldo = saldo - retirada;
		
		return nuevoSaldo;
	}
	
	public static Boolean comprobarSaldo(float saldo, float retirada) {
		
		Boolean balanceSaldo;
		
		if(saldo >= retirada) {
			balanceSaldo = true;
		}else {
			balanceSaldo = false;
		}
		
		return balanceSaldo;
	}
}
