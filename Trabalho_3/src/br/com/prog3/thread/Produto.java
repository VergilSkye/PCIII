package br.com.prog3.thread;

public class Produto {

	private Integer quantidade;
	
	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade() {
		quantidade = 0;
	}

	public Produto() {
		 quantidade =0;
	}
	
	public synchronized void compra(Integer unidades) {
		System.out.print("Comprando " + unidades);
		Integer novoQuantidade = quantidade + unidades;
		System.out.println(", nova quantidade é" + novoQuantidade);
		quantidade = novoQuantidade;
		notifyAll();
	}
	public synchronized void venda(Integer unidades) throws InterruptedException {
		while(quantidade<unidades) {
			wait();
		}
		System.out.print("Vendendo " + unidades);
		Integer novoQuantidade = quantidade - unidades;
		System.out.println(", nova quantidade é" + novoQuantidade);
		quantidade = novoQuantidade;
		
	}
}
