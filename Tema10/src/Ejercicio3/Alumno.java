package Ejercicio3;

public class Alumno {
    private String nombre;
    private String apellido;
    private int nota1;
    private int nota2;
    private int nota3;
    private double notaMedia;
    
    public void setAlumno(String nombre, String apellido, int nota1, int nota2, int nota3, double notaMedia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.notaMedia = notaMedia;
    }
    
    //Get de todos los datos
    public String getAlumno() {
        return this.nombre + " " + this.apellido + " [" + this.nota1 +"|"+ this.nota2 +"|"+ this.nota3 + "] " + notaMedia;
    }
    
    //Get de la nota media
    public double getNotaMedia() {
    	return this.notaMedia;
    }
    
    //Funcion que crea los objetos y les asigna datos
    public static Alumno[] crearVectorAlumnos(int nAlumnos) {
        
    	Alumno[] alumno = new Alumno[nAlumnos];
        
        for(int i = 0 ; i < nAlumnos ; i++) {
            
        	alumno[i] = new Alumno();
            int[] nota = new int[3];
            
            for(int k = 0 ; k < nota.length ; k++) {
            	nota[k] = Herramientas.generarNota();
            }
            
            double sumNotas = nota[0] + nota[1] + nota[2];
            double notaMedia = sumNotas/nota.length;
            notaMedia = ((double)Math.round(notaMedia * 100d) / 100d);
            
            alumno[i].setAlumno(Herramientas.generarNombre(), Herramientas.generarApellido(), nota[0], nota[1], nota[2], notaMedia);
        }
        
        return alumno;
        
    }

}
