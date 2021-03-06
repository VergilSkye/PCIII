package br.com.prog3.rh.persistencia;

import java.util.List;
import br.com.prog3.rh.negocio.Empregado;

public interface EmpregadoDAO {
		
	public String inserir(Empregado emp);
	public String alterar(Empregado emp);
	public String excluir(Empregado emp);
	public List<Empregado> listarTodos();
	public Empregado pesquisarPorCpf(String cpf);

}
