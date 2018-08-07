package br.com.prog3.trab1.questoes;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import br.com.prog3.trab1.classes.Aluno;

public class Q13_14 {
	public static void main(String[] args) {
		{
			Map<Integer, Aluno> ListaMap = new HashMap<Integer, Aluno>();
			// Inserindo 20.000 alunos na ListaMap
			for (int i = 0; i < 20000; i++) {
				Aluno al = new Aluno(i);
				Date d = new Date();
				al.setDataNasc(d);

				ListaMap.put(al.getRg(), al);
			}

			// Comparando o tempo busca, da key 19999, utilizando o método contaisKey
			long t1 = Calendar.getInstance().getTimeInMillis();
			Boolean find = ListaMap.containsKey(19999);
			long t2 = Calendar.getInstance().getTimeInMillis();

			// Calculando a diferença de milisegundos
			long t3 = t2 - t1;

			if (find) {
				System.out.println("O aluno " + 19999 + " existe no HashMap");
				System.out.println("E levou " + t3 + " milisegundos");
			} else {
				System.out.println("O aluno " + 19999 + " não existe existe no HashMap");
				System.out.println("E levou " + t3 + " milisegundos");
			}
			;
		}
		Set<Aluno> ListaSet = new HashSet<Aluno>();
		for (int i = 0; i < 20000; i++) {

			Aluno al = new Aluno(i);
			Date d = new Date();
			al.setDataNasc(d);

			ListaSet.add(al);
		}

		// Comparando o tempo busca, da key 19999, utilizando o método contaisKey
		Aluno test = new Aluno(19999);

		long t1 = Calendar.getInstance().getTimeInMillis();
		Boolean find = ListaSet.contains(test);
		long t2 = Calendar.getInstance().getTimeInMillis();

		// Calculando a diferença de milisegundos
		long t3 = t2 - t1;

		if (find) {
			System.out.println("O aluno " + 19999 + " existe no HashSet");
			System.out.println("E levou " + t3 + " milisegundos");
		} else {
			System.out.println("O aluno " + 19999 + " não existe existe no HashSet");
			System.out.println("E levou " + t3 + " milisegundos");
		}
		;
		/*
		 * Comentarios: Em uma comparação entre hashSet e hashMap achei a seguinte
		 * ponderação "Performance of both is almost the same. But, some developers say
		 * that HashMap is slightly faster than the HashSet."
		 */

	}
}
