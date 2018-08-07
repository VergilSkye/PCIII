package br.com.prog3.trab1.questoes;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
	// Questão 1
	// Implemente uma classe que possua um ArrayList e insira 200 Strings nesta lista.
	{
		List<String> lista = new ArrayList<String>();

		for (int i = 0; i < 200; i++) {
			String a = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
					+ i;
			lista.add(a);
		}
	}
}
