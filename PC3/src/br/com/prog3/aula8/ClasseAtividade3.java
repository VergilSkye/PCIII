package br.com.prog3.aula8;

public class ClasseAtividade3 {

	public void metodoComInnerClass(){
		int numero = 123;
		
		class ClasseInternaComoVariavelLocal{
			public void imprimir(){
			System.out.println("Método da inner class exibindo o valor da variáve local: "+numero);
			}
			}
		ClasseInternaComoVariavelLocal civl = new ClasseInternaComoVariavelLocal();
		civl.imprimir();
		}
}
