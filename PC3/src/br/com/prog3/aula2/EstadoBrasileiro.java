package br.com.prog3.aula2;

import java.util.Hashtable;
import java.util.Map;

public class EstadoBrasileiro {
	public static Map<String, String> retornaEstados(){
			Map<String,String> estados = new Hashtable<>();
			estados.put("AC", "Acre");
			estados.put("DF", "Distrito Federal");
			estados.put("BA", "Bahia");
			estados.put("AM", "Amazonas");
			estados.put("SC", "Santa Catarina");
			estados.put("SL", "Sei La");
			return estados;
					
	}
}
