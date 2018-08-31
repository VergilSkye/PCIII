package br.com.prog3.aula5;

public enum Servico {
    CC("Carga de Cartucho", 30.0),
    CI("Conserto de Impressora", 70.0),
    CS("Configuração de Servidor", 40.0),
    CA("Cabeamento de Redes", 200.0),
    FO("Formatacao do Sistema", 25.0);
	
    private String descricao;
    private Double valor;

    Servico(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }
}
