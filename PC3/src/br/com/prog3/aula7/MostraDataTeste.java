package br.com.prog3.aula7;

public class MostraDataTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MostraData md1 = new MostraData("Olá");
		MostraData md2 = new MostraData("Adeus");
		md2.setPriority(Thread.MAX_PRIORITY);
		md1.start();
		md2.start();

	}

}
