package Ejercicio4;

public class Herramientas {	

    // Método para mostrar usuarios
    public static void showUsers(Usuario[] usuario) {
        for (int i = 0; i < usuario.length; i++) {
            System.out.println(usuario[i].getId() + " " + usuario[i].getUsername() + " " + usuario[i].getPassword());
        }
    }

    // Método para instanciar usuarios
    public static void instUsers(Usuario[] usuario) {
        for (int i = 0; i < usuario.length; i++) {
            usuario[i] = new Usuario();
            usuario[i].setUsuario(i, null, null);
        }
    }

    // Método para comprobar el tamaño
    public static int checkTam(Usuario[] usuario) {
        int tam = 0;
        for (int i = 0; i < usuario.length; i++) {
            if (usuario[i].getUsername() != null) {
                tam++;
            }
        }
        return tam;
    }

    //Metodo que muestra todas las opciones
    public static void showOptions() {
    	System.out.println("0 | Exit");
    	System.out.println("1 | Add user");
    }
    
    
}

