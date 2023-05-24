package Ejemplos;

import java.util.*;

public class Pares {
	public static void main(String[] args) {
		TreeMap<String,Integer> tm = new TreeMap<>();
		tm.put("Juan", 8);
		tm.put("Maria", 7);
		tm.put("Pedro", 9);
		for ( Map.Entry<String,Integer> x: tm.entrySet() ){
			Integer nota = x.getValue();
			String clave = x.getKey();
			System.out.println(clave + " : " + nota);
		}
	}
}