package br.com.prog3.trab1.questoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q2_5 {
	public static void main(String[] args) {

		List<String> lista = new ArrayList<String>();
		//
		// Questão 2
		//
		// Adicionando String 1,2 e 3 duas vezes no ArrayList
		lista.add("String 1");
		lista.add("String 2");
		lista.add("String 3");
		lista.add("String 1");
		lista.add("String 2");
		lista.add("String 3");
		System.out.println("Questão 2\n---------");
		for (String s : lista) {
			System.out.println(s);
		}
		//
		// Questão 3
		//
		// Reordenando, randomicamente, o ArrayList lista
		System.out.println("\nQuestão 3\n---------");
		Collections.shuffle(lista);
		for (String s : lista) {
			System.out.println(s);
		}
		//
		// Questão 4
		//
		// Procurando pela "String 2" e quantas vezes ela foi inserida
		System.out.println("\nQuestão 4\n---------");
		String a = "String 2";
		System.out.printf("Utilizando o metodo binary Search, a posição do Array é %d\n",
				Collections.binarySearch(lista, a));
		;
		System.out.printf("Utilizando o metodo frenquency a quantidade de vezes que esse elemento aparece é %d\n",
				Collections.frequency(lista, a));

		//
		// Questão 5
		//
		// Ordenando o ArrayList lista
		System.out.println("\nQuestão 5\n---------");
		Collections.sort(lista);
		for (String s : lista) {
			System.out.println(s);
		}

	}
}
