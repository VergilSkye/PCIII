package br.com.prog3.trab1.classes;

public class Servico implements Comparable<Servico> {
	
	private Integer codigo;
	private String descricao;
	private Double precoHora;
	private Integer qtdHora;
	public Servico(Double precoHora) {
		super();
		this.precoHora = precoHora;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getPrecoHora() {
		return precoHora;
	}
	public void setPrecoHora(Double precoHora) {
		this.precoHora = precoHora;
	}
	public Integer getQtdHora() {
		return qtdHora;
	}
	public void setQtdHora(Integer qtdHora) {
		this.qtdHora = qtdHora;
	}

	public Double valorFinal(){
		return this.precoHora * this.qtdHora;		
	}	

	public int compareTo(Servico srv) {
		return descricao.compareTo(srv.descricao);	

	}

}
