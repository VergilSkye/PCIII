package br.com.prog3.aula1;

public class Apartamento {
    private Integer codigo;
    private Double area;
    private Integer numeroComodo;

    public Apartamento(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

	public Integer getNumeroComodo() {
		return numeroComodo;
	}

	public void setNumeroComodo(Integer numeroComodo) {
		this.numeroComodo = numeroComodo;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}
	public boolean equals(Object obj) {
		if((obj instanceof Apartamento) && ((Apartamento)obj).getCodigo().equals(this.codigo)) {
			return true;
		}{
			return false;
		}
	}
	public int hashCode() {
		return codigo;
	}
}
