package br.com.prog3.aula3;

public class Reflexao1 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		Integer i = new Integer(6);
		Class ci = i.getClass();
		
		System.out.println(ci);
		String s = new String("Hello");
		Class cs = s.getClass();
		System.out.println(cs);
		
		Carro Car = new Carro();
		Class cc = Car.getClass();
		System.out.println(cc);
		
		Class.forName("br.com.prog3.aula3.Carro");
		
	}	
	

}
