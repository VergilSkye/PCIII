package br.com.prog3.trab1.questoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import javax.swing.JOptionPane;

import br.com.prog3.trab1.classes.Servico;

public class Q6 {

	public static void main(String[] args) {

		int i =0; 
		Object[] opcoes = {"Sim", "Não"} ;
		String message = "\n Lista de serviços \n ";
		List<Servico> lista = new ArrayList<Servico>();

		while(i == 0){

			
			Servico srv = new Servico(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor hora do serviço")));
			srv.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código")));
			srv.setDescricao(JOptionPane.showInputDialog(("Digite a descrição")));
			srv.setQtdHora(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas")));
			// Inserindo o objeto Servico srv no ArrayList lista
			lista.add(srv);
			i = JOptionPane.showOptionDialog(null, "Deseja Continuar", "Continuar?",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null, opcoes, opcoes[0]);
			
			
		}
		//Ordenando a lista pelo atributo descrição, implementanda na classe
		Collections.sort(lista);
		// Imprimindo a lista com o JOptionPane
		for(Servico s: lista) {
			message += "\n\n\n" + "Codigo:" + s.getCodigo() + "\nPreço Hora:" + s.getPrecoHora() 
			+ "\nDescrição:" + s.getDescricao() + "\nQuantidade de Horas:" + s.getQtdHora()+"\n\n";
		}
		
		JOptionPane.showMessageDialog(null, message);
		System.out.println("Final da execução");
	}

}
