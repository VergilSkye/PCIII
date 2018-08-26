package br.com.prog3.aula5;

public enum EstadoCivil {
	SOLTEIRO(1),CASADO(2),DIVORCIADO(3),
	VIUVO(4),OUTRO(5);
	private int valor;
	private EstadoCivil(int valor) {
		this.valor = valor;
	}
	public int getValor() {
		return valor;
	}

}
