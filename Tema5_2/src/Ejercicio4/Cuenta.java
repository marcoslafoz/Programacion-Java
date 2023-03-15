package Ejercicio4;

public class Cuenta {
	private String titular;
	private float saldo;
	private String codigo;
	
	//Getter & Setter para titular
	
		public void setTitular(String titular) {
			this.titular = titular;
		}
		
		public String getTitular() {
			return titular;
		}
		
		//Getter & Setter para saldo
		
		public void setSaldo(float saldo) {
			this.saldo = saldo;
		}
		
		public float getSaldo() {
			return saldo;
		}
		
		//Getter & Setter para saldo
		
		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}
		
		public String getCodigo() {
			return codigo;
		}
	

}
