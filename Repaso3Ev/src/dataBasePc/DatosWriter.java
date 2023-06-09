package dataBasePc;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DatosWriter {
    
	public void guardarDatos(List<Profesional> listaProfesional, List<Sobremesa> listaSobremesa, List<Portatil> listaPortatil, String nombreArchivo) {
        
    	try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
           
    		for (Profesional profesional : listaProfesional) {
                bw.write(profesional.toString() + "\n");
            }
    		
            for (Sobremesa sobremesa : listaSobremesa) {
                bw.write(sobremesa.toString() + "\n");
            }
            
            for (Portatil portatil : listaPortatil) {
                bw.write(portatil.toString() + "\n");
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    	
    }


}

