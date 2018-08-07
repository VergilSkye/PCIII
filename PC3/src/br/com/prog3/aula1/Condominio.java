package br.com.prog3.aula1;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import br.com.prog3.aula1_2.Aluno;

public class Condominio {

	public static void main(String[] args) {

		Apartamento ap1 = new Apartamento(1);
		Apartamento ap2 = new Apartamento(2);
		Apartamento ap3 = new Apartamento(2);
		ap1.setArea(100.0);
		ap2.setArea(200.0);
		ap3.setArea(300.0);
		ap1.setNumeroComodo(2);
		ap2.setNumeroComodo(3);
		ap3.setNumeroComodo(4);

		Set<Apartamento> lista = new HashSet<>();
		lista.add(ap1);
		lista.add(ap2);
		lista.add(ap3);
		System.out.println(lista.size());
		Iterator<Apartamento> it = lista.iterator();
		it.next();
		
		while(it.hasNext()) {

			System.out.println(it.equals(it.next()));
		}
		
		long a =Calendar.getInstance().getTimeInMillis();
		for(int i = 0; i<10000;i++) {
			Apartamento ap4 = new Apartamento(i);
			lista.add(ap4);			
		}
		long b = Calendar.getInstance().getTimeInMillis();
		System.out.printf("Tempo de demora de criação da lista: %d%n", b-a);
		
		long c =Calendar.getInstance().getTimeInMillis();
		lista.removeIf((Apartamento ap) -> ap.getCodigo() == 5000);
		long d = Calendar.getInstance().getTimeInMillis();
		System.out.printf("Tempo de demora de remoção de um objeto da lista: %d%n \n",d-a);
	}

}
