package br.com.prog3.trab1.questoes;

import java.util.HashSet;
import java.util.Set;

import br.com.prog3.trab1.classes.Aluno;

public class Q17_18 {
	// Questão 17
	/*
	 * Pergunta: Qual interface do Framework Collections você utilizaria para
	 * representar uma Turma de faculdade, considerando que cada aluno está
	 * matriculado apenas uma vez?
	 * 
	 * Resposta: Para não permitir a possibilidade de matriculas duplicadas, Eu
	 * utilizaria qualquer implementação da Coleção (Collection) Set, provavelmente
	 * a classe HashSet.
	 */

	public static void main(String[] args) {
		// Questão 18
		/*
		 * Pergunta:Existem alunos nesta turma com o mesmo código?
		 *
		 * Resposta: Não, mas sim com o mesmo rg, este que deveria ser um identificador
		 * único, pois não houve a substituição do método hascode na classe Aluno, por
		 * isso é possível inserir "duplicatas" na Collecion Set. (O qual não é uma
		 * duplicata pois cada hashcode é diferente).
		 */

		Set<Aluno> listaSet = new HashSet<Aluno>();

		for (int i = 0; i < 5; i++) {
			Aluno alUnico = new Aluno(i);
			alUnico.setNome("Aluno que deve ser inserido");
			Aluno alDupl = new Aluno(i);
			alDupl.setNome("Aluno que não deve ser inserido");
			listaSet.add(alUnico);
			listaSet.add(alDupl);
		}
		for (Aluno a : listaSet) {

			System.out.println(a.getNome());
		}
	}

	// Questão 19
	// Foi inserido o método hascode na classe Aluno.
	//
}
