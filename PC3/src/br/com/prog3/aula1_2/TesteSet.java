package br.com.prog3.aula1_2;
import java.util.*;
public class TesteSet {
	public static void main(String [] args) {
		
		UsandoSet us = new UsandoSet();
		HashSet<String> lista1 = us.listarHashSet();
		LinkedHashSet<String> lista2 = us.listarLinked();
		TreeSet<String> lista3 = us.listarTreeSet();
		Set<String> lista4 = us.listar();
		Set<Aluno> lista5 = us.listarAlunos();

		Iterator <String>it = lista3.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
//		  for(String s : lista2){
//		  System.out.println(s);
//		  }		 
		 

		//for(Aluno a : lista5) {
			//System.out.println(a);
		//}

	}
}
