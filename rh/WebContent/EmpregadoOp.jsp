<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.Locale"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.time.LocalDate"%>

<%@page import="br.com.prog3.rh.controller.EmpregadoController"%>
<%@page import="br.com.prog3.rh.util.Util"%>
<%@page import="br.com.prog3.rh.negocio.Empregado"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EmpregadoCRUD</title>
<style type="text/css">
>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 5px;
	text-align: center;
}
</style>
</head>
<body>
	<style type="text/css">
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 5px;
	text-align: center;
}
</style>
	<% switch(request.getParameter("submit")){
				case "inserir":
					Empregado emp = new Empregado();
					Empregado emp1 = new Empregado();
					EmpregadoController ec = new EmpregadoController();
					emp.setCpf(request.getParameter("CpfEmpregado"));
					emp.setNome(request.getParameter("nomeEmpregado"));
					emp.setIdade(Integer.parseInt(request.getParameter("idadeEmpregado")));
					
					emp.setSalario(Double.parseDouble(request.getParameter("salarioEmpregado")));
					emp1 = ec.pesquisarPorCpf(emp.getCpf());
					if (emp1 != null) { %>
	<p>Ja existe um empregado com este cpf</p>
	<%
					} else {
						out.print(ec.inserir(emp));
					}
					break;
				case "alterar":
					emp = new Empregado();
					ec = new EmpregadoController();
					emp.setCpf(request.getParameter("CpfEmpregado"));
					emp.setNome(request.getParameter("nomeEmpregado"));
					emp.setIdade(Integer.parseInt(request.getParameter("idadeEmpregado")));
					emp.setSalario(Double.parseDouble(request.getParameter("salarioEmpregado")));
					out.print(ec.alterar(emp));
					break;
				case "excluir":
					emp = new Empregado();
					ec = new EmpregadoController();
					emp.setCpf(request.getParameter("CpfEmpregado"));
					break;
				case "visualizar": Locale lc = new Locale("pt","BR"); NumberFormat nf = NumberFormat.getCurrencyInstance(lc);
				%>
	<p>Aqui estão as informações recebidas</p>
	<table style="width: 100%">
		<tr>
			<th>CPF</th>
			<th>Nome</th>
			<th>Idade</th>
			<th>Salario</th>
		</tr>

		<% List<Empregado> listaEmp = new ArrayList<>();
						ec = new EmpregadoController();
						listaEmp = ec.listarTodos(); 
						for(Empregado e : listaEmp){%>
		<tr>
			<td><%=e.getCpf()%></td>
			<td><%=e.getNome()%></td>
			<td><%=e.getIdade().toString()%></td>
			<td><%=nf.format(e.getSalario()) %></td>
		</tr>

		<%
						}%>
	</table>
	<%
					break;
			}
	
	%>



</body>
</html>