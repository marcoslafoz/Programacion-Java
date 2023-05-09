package Ejemplos;

import java.util.*;

public class Iterador {
	public static void main(String[] args) {
	
		TreeMap<String,Integer> tm = new TreeMap<>();
		tm.put("Uno", 1);
		tm.put("Dos", 2);
		tm.put("Tres", 3);

		Iterator<String> it = tm.keySet().iterator();
		while ( it.hasNext() ) {
		    String clave = it.next();
		    System.out.println(clave + " : " + tm.get(clave));
		}		
	}
}