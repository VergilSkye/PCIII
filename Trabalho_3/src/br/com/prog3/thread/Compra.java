package br.com.prog3.thread;

public class Compra extends Thread {

	private Produto produto;
	private Integer quantidade;
	private static final int REPETICOES = 10;
	private static final int ESPERA = 10;

	public Compra(Produto produto, Integer quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public void run() {
		try {
			for (int i = 0; i < REPETICOES && isInterrupted(); i++) {
				produto.compra(quantidade);
				sleep(ESPERA);
			}
		} catch (InterruptedException ie) {
			System.err.println(ie.getMessage());
		}
	}

}
