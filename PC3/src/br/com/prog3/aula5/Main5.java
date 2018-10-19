package br.com.prog3.aula5;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class Main5 {

    //Funcao para a criacao e impressao da tabela
    public static void imprimir(List<Servico> serv, List<Integer> qd){
        //TODO Função ainda não implementadaa
    	// 
    	System.out.println("I\'m sorry.");
    }

    public static void main(String[] args) {
        List<Servico> serv = new ArrayList<>();
        List<Integer> qd = new ArrayList<>();  

        //Pegando os valores do Enum
        Servico[] possibleValues = Servico.class.getEnumConstants(); 

        
        String[] opcoes = {"Sim", "Nao"};

        //Iterator para o while
        Integer it = 0;

        //While para Receber o input das listas
        while(it == 0){
        	
            //Adicionando a lista de Servico um objeto com cast para Servico e esse objeto sendo retornado do InputDialog com escolhas
            serv.add((Servico)JOptionPane.showInputDialog(null,"Escolha o Servico: ","Escolha o servico",JOptionPane.QUESTION_MESSAGE,null, possibleValues,possibleValues[0]));
            

            qd.add(Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade do Servico:")));

            //Option Dialog para continuacao do while
            it = JOptionPane.showOptionDialog(null,"Deseja Continuar Inserindo?","Confirmacao",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcoes,opcoes[0]);
        }

        imprimir(serv,qd);
    }
}