package br.com.prog3.aula7;

import java.util.Date;


public class MostraData extends Thread {
	private String mensagem;
	private static final int REPETICOES=10;
	private static final int ESPERA=1000;
	
	public MostraData(String mensagem) {
		this.mensagem = mensagem;	
	}
	
	@Override
	public void run() {
		try {
			for(int i=0; i<=REPETICOES;i++) {
				Date agora = new Date();
				System.out.println(agora+""+mensagem);
				sleep(ESPERA);
			}
			
		}
		catch(InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
	}
	
	

}
