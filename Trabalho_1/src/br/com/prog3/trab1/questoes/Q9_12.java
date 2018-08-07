package br.com.prog3.trab1.questoes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Q9_12 {

	public static void main(String[] args) {
//		
//		Questão 9
//		
		//Adicione os números 100, 20, 200, 30, 80, 40, 100, 200 a um List, percorra
		//todos os elementos utilizando for-enhanced (for-each) e calcule a média.
		
		List<Integer>listaList = new ArrayList<Integer>();
		Integer media =0;	
		listaList.add(100);
		listaList.add(20);
		listaList.add(200);		
		listaList.add(30);
		listaList.add(80);
		listaList.add(40);
		listaList.add(100);
		listaList.add(200);
		
		for(Integer it : listaList) {			
			media +=it;
			
		}
		media = media/listaList.size();
		System.out.println("A média do List utilizando For Each foi de " + media);
//		
//		Questão 10
//		
		//Adicione os números 100, 20, 200, 30, 80, 40, 100, 200 a um List, percorra
		//todos os elementos utilizando um Iterator e calcule a média.
		media =0;		
		Iterator<Integer> ite = listaList.iterator();
		while(ite.hasNext()) {			
			media +=ite.next();			
		}
		media = media/listaList.size();
		System.out.println("A média do List utilizando o método Iterator foi de " + media);
//		
//		Questão 11
//		
		//Adicione os números 100, 20, 200, 30, 80, 40, 100, 200 a um Set, percorra
		//todos os elementos utilizando for-enhanced (for-each) e calcule a média.
		Set<Integer>listaSet = new HashSet<Integer>();
		media = 0;
		listaSet.add(100);
		listaSet.add(20);
		listaSet.add(200);		
		listaSet.add(30);
		listaSet.add(80);
		listaSet.add(40);
		listaSet.add(100);
		listaSet.add(200);
		for(Integer it:listaSet) {
			media +=it;
		}
		media = media/listaSet.size();
		System.out.println("A média do Set utilizando For Each foi de " + media);
//		
//		Questão 12
//		
		//Porque as médias encontradas nos exercícios 10 e 11 ficaram diferentes?
		//A diferença entre a media entre a lista List e a lista Set se deve, pois,
		//a coleção(Collection) Set não aceita itens duplicados, somente itens únicos.
		//Por isso que esta contém apenas 6 números em vez dos 8 que a List lista tem.
		
	}
}
