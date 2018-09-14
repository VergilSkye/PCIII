package br.com.prog3.aula7;

public class ConhecendoThread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		try {
			int tempo=0;
			System.out.println("Tempo: "+tempo+"s");
			for(int i = 0;i<10;i++) {
				Thread.sleep(1000);
				tempo += 1;
				System.out.println("Tempo: "+tempo+"s");
			}
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

}
