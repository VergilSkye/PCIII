package br.com.prog3.aula1_2;
import java.util.*;


public class TesteList {

	public static void main(String[] args){
		UsandoList ul = new UsandoList();
		LinkedList<String> lista1 = ul.listaLinked();
		ArrayList<String> lista2 = ul.listaArray();
		Vector<String> lista3 = ul.listaVector();
		List<String>lista4 = ul.listaList();
		List<Aluno>lista5 = ul.listarAlunos();
		Collections.sort(lista4);
		for(String s : lista4) {
			System.out.println(s);
		}
	}
	//UsandoList ul = new UsandoList();
	//LinkedList<String> lista1 = ul.listaLinked();
	//ArrayList<String> lista2 = ul.listaArray();
	//Vector<String> lista3 = ul.listaVector();

	//List<String> lista4 = ul.listaList();
	// for(String s : lista1) {

	//}


}


