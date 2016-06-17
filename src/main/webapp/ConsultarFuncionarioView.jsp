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
			<a class="navbar-brand" href="#">Gestão De Funcionário</a>
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
				<li><a href="funcionario">Cadastrar</a></li>
				<li class="active"><a href="#">Consultar/Excluir</a></li>
				<li><a href="listar">Listar</a></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</nav>
	<div class="janela">
		<form>
		<h1>Consultar/Excluir</h1>
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
					<td><br></td>
				</tr>
				<tr>
					<td><button name="operacao" value="consulta">Consultar</button></td>
					<td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<button name="operacao" value="exclui">Excluir</button></td>
				</tr>
				<tr>
					<td><br></td>
				</tr>
			</table>
			<table border="1">
				<tr>
					<td>${tnome}</td>
					<td>${tcpf}</td>
					<td>${trg}</td>
					<td>${tendereco}</td>
					<td>${tdataNasc}</td>
					<td>${tsexo}</td>
					<td>${tsalario}</td>
				</tr>
				<tr>
					<td>${nome}</td>
					<td>${cpf}</td>
					<td>${rg}</td>
					<td>${endereco}</td>
					<td>${dataNasc}</td>
					<td>${sexo}</td>
					<td>${salario}</td>
				</tr>
			</table>
			<b>${msg}</b>
		</form>
	</div>
  </body>

</html>