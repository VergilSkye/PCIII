package br.com.prog3.aula3;

public class Taxi extends Carro  {
	private String companhia;
	public Taxi() {
		
	}
	public Taxi(String placa, double valor, String companhia) {
		super(placa,valor);
		this.setCompanhia(companhia);
	}
	
	@Override
	public Double calcularIpva(double valor) {
		return valor * PERCENTUAL;
	}
	public String getCompanhia() {
		return companhia;
	}
	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}
	
}
