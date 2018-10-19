<%@page import="br.com.prog3.rh.persistencia.ConnectionFactory"%>
<%@page import="java.util.List"%>
<%@page import="br.com.prog3.rh.controller.*"%>
<%@page import="br.com.prog3.rh.negocio.*"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>



<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DEPENDENTE FORM</title>
</head>
<body class="bg-light">
	<link rel="stylesheet"
		href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
		integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
		crossorigin="anonymous">

	<style type="text/css">
.container {
	max-width: 460px;
}
</style>
	<%
Connection conn = ConnectionFactory.getConnection();

%>

	<div class="container">
		<div class="py-5 text-center">
			<img class="d-block mx-auto mb-4"
				src="../../assets/brand/bootstrap-solid.svg" alt="" width="72"
				height="72">
			<h2>Dependente Formulário</h2>
			<p class="lead">Página para fazer alterações em Dependente</p>
		</div>

	</div>

	<div class="col-md-8 order-md-1">
		<h4 class="mb-3">Dependente</h4>

		<form name="formdependente" action="DependenteOp.jsp" method="get"
			class="needs-validation" novalidate>
			<div class="row">
				<div class="col-md-2 mb-3">


					<label for="cpf">Nome do Emp</label> <select name="depCpf">
						<%EmpregadoController ec = new EmpregadoController();
					List<Empregado> listaEmp = ec.listarTodos();
							%>

						<option value=""></option>

						<%
					for(Empregado e : listaEmp){
						%>
						<option value="<%=e.getCpf()%>"><%=e.getNome()%></option>
						<%
					}
					%>
					</select>
				</div>
				<div class="col-md-2 mb-3">
					<label for="nome">Nome</label> <input type="text"
						class="form-control" name="depNome" placeholder="" value="">

				</div>
			</div>




			<div class="row">
				<div class="col-md-2 mb-3">
					<label for="grauDepedente">Grau parentesco</label> <input
						type="text" class="form-control" name="depGrau" placeholder=""
						value="">

				</div>


				<div class="col-md-2 mb-3">
					<label for="data">Data Nascimento</label> <input type="date"
						class="form-control" name="depDataNascimento">

				</div>
			</div>

			<hr class="mb-4">
			<input id='inserir-submit' type='submit' name='submit'
				class="btn btn-primary btn-md  col-md-2 " value='inserir'></input>
			<input id='alterar-submit' type='submit' name='submit'
				class="btn btn-success btn-md  col-md-2 " value='alterar'></input>
			 <input id='remover-submit' type='submit' name='submit'
				class="btn btn-danger btn-md  col-md-2 " value='excluir'></input>
			<input id='visualizar-submit' type='submit' name='submit'
				class="btn btn-info btn-md  col-md-2 " value='pesquisar'></input>
			 <input id='visualizar-submit' type='submit' name='submit'
				class="btn btn-warning btn-md col-md-2 " value='visualizar'></input>
		</form>
	</div>
	</div>



	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery-slim.min.js"><\/script>')</script>
	<script src="../../assets/js/vendor/popper.min.js"></script>
	<script src="../../dist/js/bootstrap.min.js"></script>
	<script src="../../assets/js/vendor/holder.min.js"></script>
	<script>
      // Example starter JavaScript for disabling form submissions if there are invalid fields
      (function() {
        'use strict';

        window.addEventListener('load', function() {
          // Fetch all the forms we want to apply custom Bootstrap validation styles to
          var forms = document.getElementsByClassName('needs-validation');

          // Loop over them and prevent submission
          var validation = Array.prototype.filter.call(forms, function(form) {
            form.addEventListener('submit', function(event) {
              if (form.checkValidity() === false) {
                event.preventDefault();
                event.stopPropagation();
              }
              form.classList.add('was-validated');
            }, false);
          });
        }, false);
      })();
    </script>

</body>
</html>