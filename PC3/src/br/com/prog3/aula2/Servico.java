package br.com.prog3.aula2;

public class Servico implements Comparable<Servico> {
	private Integer codigo;
	private Integer qtddeHora;
	private String descricao;
	private Float precoHora;

	public Servico(Integer codigo, Integer qtddeHora, String descricao, Float precoHora) {
		super();
		this.codigo = codigo;
		this.qtddeHora = qtddeHora;
		this.descricao = descricao;
		this.precoHora = precoHora;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getQtddeHora() {
		return qtddeHora;
	}

	public void setQtddeHora(Integer qtddeHora) {
		this.qtddeHora = qtddeHora;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Float getPrecoHora() {
		return precoHora;
	}

	public void setPrecoHora(Float precoHora) {
		this.precoHora = precoHora;
	}

	
	public Float calValor(Float precoHora, Integer qtdHora) {
		return precoHora * qtdHora;
	}

	@Override
	public int compareTo(Servico servico) {
		return this.descricao.compareTo(servico.getDescricao());
	}
}
