package br.com.prog3.aula2;

import java.util.LinkedHashMap;

import br.com.prog3.aula1.Apartamento;

public class UsandoLinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Apartamento ap1 = new Apartamento(1);
		ap1.setNumeroComodo(4);
		ap1.setArea(40.1);
		
		Apartamento ap2 = new Apartamento(2);
		ap2.setNumeroComodo(6);
		ap2.setArea(50.1);
		
		Apartamento ap3 = new Apartamento(3);
		ap3.setNumeroComodo(2);
		ap3.setArea(11.1);
		LinkedHashMap<Integer, Apartamento> lista = new LinkedHashMap<Integer, Apartamento>();
		lista.put(ap1.getCodigo(), ap1);
		lista.put(ap2.getCodigo(), ap2);
		lista.put(ap3.getCodigo(), ap3);
		
		for(Integer codigo : lista.keySet()) {
			System.out.println(lista.get(codigo).toString());
		}
	}

}
