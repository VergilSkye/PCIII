package br.com.prog3.aula3;

public class Refrexao2 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println(Class.forName("br.com.prog3.Carro"));
		
		Class<?> [] c3 =Character.class.getClasses();
		for(Class cs : c3) {
			
			System.out.println("Nome Completo:" + cs.getName());
			System.out.println("Nome Simples:" + cs.getSimpleName());
		}
		
	}

}
