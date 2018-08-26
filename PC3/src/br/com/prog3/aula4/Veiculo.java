package br.com.prog3.aula4;

import java.util.ArrayList;
import java.util.List;

public class Veiculo {
	protected String descricaoVeiculo = null;

	public String getDescricaoVeiculo() {
		return descricaoVeiculo;
	}

	public void setDescricaoVeiculo(String descricaoVeiculo) {
		this.descricaoVeiculo = descricaoVeiculo;
	}

	public List<String> adicionaVeiculoLista(List<String> descricaoVeiculos) {

		List<String> descricoes = descricaoVeiculos;
		if (descricoes == null) {
			descricoes = new ArrayList<>();
		}
		descricoes.add(getDescricaoVeiculo());
		return descricoes;
	}
}
