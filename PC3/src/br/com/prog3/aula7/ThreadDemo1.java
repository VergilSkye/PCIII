package br.com.prog3.aula7;

public class ThreadDemo1 implements Runnable {
	Thread thread;
	public ThreadDemo1(String nome) {
		thread = new Thread(this,nome);
		thread.start();
	}

	@Override
	public void run() {
		String name = thread.getName();
		for(int i=0;i<100;i++) {
			System.out.println(name);
		}
		
	}
	public static void main(String args[]) {
		ThreadDemo pnt1 = new ThreadDemo("A");
		ThreadDemo pnt2 = new ThreadDemo("B");
		ThreadDemo pnt3 = new ThreadDemo("C");
		ThreadDemo pnt4 = new ThreadDemo("D");
	}

}
