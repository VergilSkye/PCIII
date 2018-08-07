package br.com.prog3.trab1.questoes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Implementação Classe aluno pedida pela questão 15
import br.com.prog3.trab1.classes.ContaCorrente;

public class Q15_16 {
	public static void main(String[] args) {
		Set<ContaCorrente> listaCC = new HashSet<ContaCorrente>();
		// Criando 5 contas Correntes
		ContaCorrente c1 = new ContaCorrente(1);
		c1.setAgencia(10);
		c1.setCPF("454");
		c1.setSaldo(80.0);
		ContaCorrente c2 = new ContaCorrente(2);
		c2.setAgencia(10);
		c2.setCPF("635");
		c2.setSaldo(8.5);
		ContaCorrente c3 = new ContaCorrente(3);
		c3.setAgencia(11);
		c3.setCPF("667");
		c3.setSaldo(120.0);
		ContaCorrente c4 = new ContaCorrente(4);
		c4.setAgencia(11);
		c4.setCPF("111");
		c4.setSaldo(9808.0);
		ContaCorrente c5 = new ContaCorrente(5);
		c5.setAgencia(1);
		c5.setCPF("524");
		c5.setSaldo(0.5);
		// Adicionando as contas correntes c1,...,c5
		listaCC.add(c1);
		listaCC.add(c2);
		listaCC.add(c3);
		listaCC.add(c4);
		listaCC.add(c5);

		// Iterando sobre a HashSet listaCC e obtendo seus valores
		Iterator<ContaCorrente> it = listaCC.iterator();
		while (it.hasNext()) {
			ContaCorrente ccr = it.next();

			System.out.println("Numero:" + ccr.getNumero());
			System.out.println("CPF:" + ccr.getCPF());
			System.out.println("Agencia:" + ccr.getAgencia());
			System.out.println("Saldo:" + ccr.getSaldo() + "\n");

		}

	}
}
