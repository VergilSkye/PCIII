package br.com.prog3.thread;

public class ProdutoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto produto = new Produto();
		Compra C0 = new Compra(produto, 100);
		Venda V0 = new Venda(produto, 100);
		Compra C1 = new Compra(produto, 100);
		Venda V1 = new Venda(produto, 100);
		
		C0.start();
		V0.start();
		C1.start();
		V1.start();
	}

}
