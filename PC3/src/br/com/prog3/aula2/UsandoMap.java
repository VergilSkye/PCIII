package br.com.prog3.aula2;

import java.util.Map;

public class UsandoMap {
	public static void main(String[] args) {
		Map<String, String> estados = EstadoBrasileiro.retornaEstados();
		System.out.println(estados.get("DF"));
		
		System.out.println(estados.containsKey("DF"));

	}
}
