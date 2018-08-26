package br.com.prog3.aula6;

/**
 * @author Vergil
 */

public class Divida {
	/**
	 * @serial Número gerado automaticamente
	 */
	private Integer id;
	private Double valor;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	/**
	 * @return double - retorno um valor do tipo double
	 * @param taxa do tipo double
	 */
	public double calcularDesconto(double taxa) {
		return valor*taxa/100;
	}
	/*
	 * @see double#calcularDesconto(double taxa)
	 */
	public double calcularValorLiquido(double taxa) {
		return valor - calcularDesconto(taxa);
	}
}
