package br.com.prog3.aula7;

public class ContaBancariaTeste {
	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria();
		DepositoThread t0 = new DepositoThread(conta, 100);
		SaqueThread t1 = new SaqueThread(conta, 100);
		DepositoThread t2 = new DepositoThread(conta, 100);
		SaqueThread t3 = new SaqueThread(conta, 100);
		t0.start();
		t1.start();
		t2.start();
		t3.start();
	}
}
