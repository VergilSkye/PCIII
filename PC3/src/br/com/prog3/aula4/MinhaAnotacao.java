package br.com.prog3.aula4;

public @interface MinhaAnotacao {
	String matricula() default "100";
	String nome();
	int idade();
	String[] novosNomes();

}
