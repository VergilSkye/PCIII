package br.com.prog3.aula8;

public class ClasseExterna {
	private Integer numero;
	
	private class ClasseInterna {
		public void imprimir() {
			System.out.println("Dentro do método da inner class");
		}
	}
	public void mostrarInnerClass(){
		ClasseInterna ci = new ClasseInterna();
		ci.imprimir();
		}

}

