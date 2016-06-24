package database;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/alterar")
public class AlterarFuncionarioController extends HttpServlet {

	private String valor(HttpServletRequest req, String param, String padrao) {
		String result = req.getParameter(param);
		if (result == null) {
			result = padrao;
		}
		return result;
	}

	private int toInt(HttpServletRequest req, String param, String padrao) {
		return Integer.parseInt(valor(req, param, padrao));
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			Funcionario func = new Funcionario();
			String msg = "";
			String op = valor(req, "operacao", "");
			String nome = valor(req, "xx", "");
			String cpf = valor(req, "cpf", "");
			String endereco = valor(req, "xx", "");
			String salario = valor(req, "xx", "");
			
			
			if (op.equals("alteraNome")) {
				AlterarFuncionarioDao.alterarNome(nome, cpf);
				msg = "Funcionario alterado com sucesso.";
				resp.sendRedirect("alterar");
			} else if (op.equals("alteraEndereco")) {
				AlterarFuncionarioDao.alterarEndereco(cpf, endereco);
				msg = "Funcionario alterado com sucesso.";
				resp.sendRedirect("alterar");
			} else if (op.equals("alteraSalario")) {
					AlterarFuncionarioDao.alterarSalario(cpf, salario);
					msg = "Funcionario alterado com sucesso.";
					resp.sendRedirect("alterar");
			} else if (op.equals("")) {
				msg = "";
			} else {
				throw new IllegalArgumentException("Operação \"" + op + "\" não suportada.");
			}
			
			req.setAttribute("msg", msg);
			req.getRequestDispatcher("AlterarFuncionarioView.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace(resp.getWriter());
		}
	}
}
