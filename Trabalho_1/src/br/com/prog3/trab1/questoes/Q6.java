package br.com.prog3.trab1.questoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import br.com.prog3.trab1.classes.Servico;

public class Q6 {
	private static Scanner sc;

	public static void main(String[] args) {

		
		sc = new Scanner(System.in);
		Integer sair = 0;
		List<Servico> lista = new ArrayList<Servico>();

		
		System.out.println("Digite 1 para acrecentar um serviço ou 0 para sair");		
		sair = Integer.parseInt(sc.nextLine());

		while(sair != 0){

			System.out.print("Digite o preço Hora do Serviço ");
			Servico srv = new Servico(Double.parseDouble(sc.nextLine()));
			System.out.println("Digite a descrição: ");
			srv.setDescricao(sc.nextLine());
			System.out.println("Digite 1 para acrecentar um novo serviço ou 0 para sair");
			sair = Integer.parseInt(sc.nextLine());
			// Inserindo o objeto Servico srv no ArrayList lista
			lista.add(srv);
		}
		//Ordenando a lista pelo atributo descrição, implementanda na classe
		Collections.sort(lista);
		for(int i=0;i<lista.size();i++){
			Servico s = lista.get(i);
			System.out.printf("\nItem %d\n",i+1);
			System.out.println(s.getDescricao());
			System.out.println(s.getPrecoHora());
		}

		System.out.println("Final da execução");
	}

}
