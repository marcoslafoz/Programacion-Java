package Ejercicio4;

public class Usuario {
	private int id;
	private String username;
	private String password;
	
	//Setter
	public void setUsuario(int id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
	//Getters
	public int getId() {
		return this.id;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	//Metodo para crear un nuevo usuario
	public static Usuario addUser(int id, String username, String password) {		
			Usuario nuevoUsuario = new Usuario();
			nuevoUsuario.setUsuario(id, username, password);

			return nuevoUsuario;	
		}

}
	
	

