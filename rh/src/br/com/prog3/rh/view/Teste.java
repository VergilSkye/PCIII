
package br.com.prog3.rh.view;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.prog3.rh.controller.DependenteController;
import br.com.prog3.rh.controller.EmpregadoController;
import br.com.prog3.rh.negocio.Dependente;
import br.com.prog3.rh.negocio.Empregado;
import br.com.prog3.rh.persistencia.ConnectionFactory;

public class Teste {
	public static void main(String[] args) {
		Connection con = ConnectionFactory.getConnection();
		if (con != null) {
			System.out.println("OK");

		}
	
		List<Dependente> lista = new ArrayList<>();
		DependenteController dc = new DependenteController();
		lista = dc.pesquisarPorEmpregado("11111");
		if (lista != null){
		for(Dependente d : lista){
		System.out.println("Empregado: "+d.getCpfempregado());
		System.out.println("Nome: "+d.getNome());
		}
		}
		

		ConnectionFactory.close(con);
	}

}