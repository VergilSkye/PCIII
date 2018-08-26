package br.com.prog3.aula3;

public class Carro {
	public static final Double PERCENTUAL = 0.0035;

	private String placa;
	private Integer anoFabricacao;
	private Integer anoModelo;
	private String marca;
	private String modelo;
	private Double valor;

	public Carro() {

	}
	public Carro(String placa) {
		this.placa = placa;
	}
	public Carro(String placa, double valor) {
		this.placa = placa;
		this.valor = valor;
	}

	public Double calcularIpva(double valor) {
		return valor * PERCENTUAL;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Integer getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}


}
