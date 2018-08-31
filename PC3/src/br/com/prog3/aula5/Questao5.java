package br.com.prog3.aula5;

import java.util.List;

public class Questao5 {
	
	public Double valor(Servico Sv, Integer qtd) {
		return Sv.getValor()*qtd;
	
		}
	public Double valorTotal(List<Servico> listaS, List<Integer> qtd) {
		Double total = 0.0;
		
		for(int i=0; i<listaS.size();i++) {
			total +=valor(listaS.get(i),qtd.get(i));
		}
		return total;
		
	}
	

}
