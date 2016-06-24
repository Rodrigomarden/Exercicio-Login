<!DOCTYPE html>
<html>

  <head>
    <title>Funcionario</title>
    <link rel="stylesheet" href="estiloFuncionario.css">
    <link rel="stylesheet" href="estiloLogin.css">
    <link href="bootstrap.css" rel="stylesheet">
	<link href="sb-adm.css" rel="stylesheet">
	<link href="morris.css">
	<link
			href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"
			rel="stylesheet">
	<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
	<script
		src="http://netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js">
	</script>
  </head>

  <body style="background-color: #BDBDBD">
<!-- Menu Superior -->
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-ex1-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Gest�o De Funcion�rio</a>
		</div>
		<!-- Top Menu Items -->
		<ul class="nav navbar-right top-nav">
			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown"><i class="fa fa-user"></i> ${usuario} <b
					class="caret"></b></a>
				<ul class="dropdown-menu">
					<li><a href="logout"><i class="fa fa-fw fa-power-off"></i>
							Sair</a></li>
				</ul></li>
		</ul>
		<!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
		<div class="collapse navbar-collapse navbar-ex1-collapse">
			<ul class="nav navbar-nav side-nav">
				<li class="active"><a href="#">Cadastrar</a></li>
				<li><a href="consultar">Consultar/Excluir</a></li>
				<li><a href="alterar">Alterar</a></li>
				<li><a href="listar">Listar</a></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</nav>
	<div class="janela">
		<form>
		<h1>Cadastrar</h1>
		<br>
		<br>
			<table>
				<tr>
					<td>Nome:</td>
					<td><input name="nome" class="form-control" required></td>
				</tr>
				<tr>
					<td><br></td>
				</tr>
				<tr>
					<td>Cpf:</td>
					<td><input name="cpf" class="form-control" required></td>
				</tr>
				<tr>
					<td><br></td>
				</tr>
				<tr>
					<td>Rg:</td>
					<td><input name="rg" class="form-control" required></td>
				</tr>
				<tr>
					<td><br></td>
				</tr>
				<tr>
					<td>Endere�o:</td>
					<td><input name="endereco" class="form-control" required></td>
				</tr>
				<tr>
					<td><br></td>
				</tr>
				<tr>
					<td>Data Nascimento:</td>
					<td><input name="datanasc" class="form-control" required></td>
				</tr>
				<tr>
					<td><br></td>
				</tr>
				<tr>
					<td>Sexo:</td>
					<td><input name="sexo" class="form-control" required></td>
				</tr>
				<tr>
					<td><br></td>
				</tr>
				<tr>
					<td>Salario:</td>
					<td><input name="salario" class="form-control" required></td>
				</tr>
				<tr>
					<td><br></td>
				</tr>
				<tr>
					<td></td>
					<td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<button name="operacao" value="cadastrar">Cadastrar</button></td>
				</tr>
			</table>
			<td><b>${msg}</b></td>
		</form>
	</div>
  </body>

</html>