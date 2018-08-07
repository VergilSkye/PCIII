package br.com.prog3.trab1.questoes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q7_8 {

	public static void main(String[] args) {
		//
		// Questão 7
		//
		// Faça um HashSet e insira as Strings “String 1”, “String 2” e “String 3” cada
		// uma duas vezes
		System.out.println("Trabalhando com Set.");
		Set<String> listaSet = new HashSet<String>();
		listaSet.add("String 1");
		listaSet.add("String 1");
		listaSet.add("String 2");
		listaSet.add("String 2");
		listaSet.add("String 3");
		listaSet.add("String 3");

		for (String s : listaSet) {
			System.out.println(s);
		}
		System.out.printf("A quantidade de itens inseridos foram %d\n", listaSet.size());
		//
		// Questão 8
		//
		// Faça um HashMap e insira as Strings “String 1”, “String 2” e “String 3” cada
		// uma duas vezes,
		System.out.println("\nTrabalhando com Map.");
		Map<Integer, String> listaMap = new HashMap<Integer, String>();
		listaMap.put(1, "String 1");
		listaMap.put(1, "String 1");
		listaMap.put(2, "String 2");
		listaMap.put(2, "String 2");	
		listaMap.put(3, "String 3");
		listaMap.put(3, "String 3");
		for (Integer i : listaMap.keySet()) {
			String value = listaMap.get(i);
			System.out.println(i + " = " + value);
		}
		System.out.printf("A quantidade de itens inseridos foram %d\n", listaMap.size());
	}
}
