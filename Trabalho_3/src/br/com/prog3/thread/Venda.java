package br.com.prog3.thread;

public class Venda extends Thread {
	
	private Produto produto;
	private Integer quantidade;
	private static final int REPETICOES = 10;
	private static final int ESPERA = 10;
	
	public Venda(Produto prod,Integer qtd) {
		this.produto=prod;
		this.quantidade = qtd;
	}
	public void run() {
		
		try {
			for(int i=0;i<REPETICOES;i++) {
				produto.venda(quantidade);
				sleep(ESPERA);				
			}
		}catch(InterruptedException ie){
			System.err.println(ie.getMessage());
			
		}
	}

}
