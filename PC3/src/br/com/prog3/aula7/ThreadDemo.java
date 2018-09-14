package br.com.prog3.aula7;

public class ThreadDemo extends Thread{
	public ThreadDemo(String nome) {
		super(nome);
		start();
	}
	@Override 
	public void run() {
		for(int i=0; i<100;i++) {
			System.out.println(getName());
		}
	}
	public static void main(String args []){
		ThreadDemo pnt1 = new ThreadDemo("A");
		pnt1.setPriority(MIN_PRIORITY);
		
		ThreadDemo pnt2 = new ThreadDemo("B");
		ThreadDemo pnt3 = new ThreadDemo("C");
		ThreadDemo pnt4 = new ThreadDemo("D");
		pnt4.setPriority(MAX_PRIORITY);
		
		
	}

}
