<!DOCTYPE html>
<html>

  <head>
    <title>Login</title>
    <link rel="stylesheet" href="estilo.css">
  </head>

  <body>
    <div class="container">
        <div class="card card-container">
            <!-- <img class="profile-img-card" src="//lh3.googleusercontent.com/-6V8xOA6M7BA/AAAAAAAAAAI/AAAAAAAAAAA/rzlHcD0KYwo/photo.jpg?sz=120" alt="" /> -->
            <img id="profile-img" class="profile-img-card" src="//ssl.gstatic.com/accounts/ui/avatar_2x.png" />
            <p id="profile-name" class="profile-name-card"></p>
            <form class="form-signin">
                <span id="reauth-email" class="reauth-email"></span>
                <input type="text" name="usuario" id="inputEmail" class="form-control" placeholder="Usuario" required autofocus>
                <input type="password" id="inputPassword" name="senha" class="form-control" placeholder="Senha" required>
                <div id="remember" class="checkbox">
                <b>${msg}</b>
                </div>
                <button class="btn btn-lg btn-success btn-block btn-signin" type="submit" name="operacao" value="entrar">Entrar</button>
            </form><!-- /form -->
            <a href="#" class="forgot-password">
                Criar Conta
            </a>
        </div><!-- /card-container -->
    </div><!-- /container -->

	
	
  </body>

</html>