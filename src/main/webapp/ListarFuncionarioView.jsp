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
				<li><a href="funcionario">Cadastrar</a></li>
				<li><a href="consultar">Consultar/Excluir</a></li>
				<li class="active"><a href="#">Listar</a></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</nav>
	<div class="janela">
		<form>
		<h1>Funcionarios</h1>
		<br>
		<br>
		<table border="2">
			<tr>
				<td width="15%"><b><center/>${tnome}</b></td>
				<td width="15%"><b><center/>${tcpf}</b></td>
				<td width="15%"><b><center/>${trg}</b></td>
				<td width="15%"><b><center/>${tendereco}</b></td>
				<td width="15%"><b><center/>${tdataNasc}</b></td>
				<td width="15%"><b><center/>${tsexo}</b></td>
				<td width="15%"><b><center/>${tsalario}</b></td>
			</tr>
			<tr>
				<td><center/>${nome}</td>
				<td><center/>${cpf}</td>
				<td><center/>${rg}</td>
				<td><center/>${endereco}</td>
				<td><center/>${dataNasc}</td>
				<td><center/>${sexo}</td>
				<td><center/>${salario}</td>
			</tr>
		</table>
			<b>${msg}</b>
		</form>
	</div>
  </body>

</html>