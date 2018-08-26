package br.com.prog3.aula5;

public enum Uf {
	AC("Acre"),
	AL("Alagoas"),
	AP("Amapá"),
	AM("Amazonas"),
	BA("Bahia"),
	CE("Ceará"),
	DF("DistritoFederal");
	
	private String descricao;

	Uf(String descricao){
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
}

