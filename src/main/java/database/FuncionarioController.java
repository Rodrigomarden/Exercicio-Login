package database;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/funcionario")
public class FuncionarioController extends HttpServlet {

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
			String msg;
			String op = valor(req, "operacao", "");
			System.out.println(op);
			String nome = valor(req, "nome", "");
			String cpf = valor(req, "cpf", "");
			String rg = valor(req, "rg", "");
			String endereco = valor(req, "endereco", "");
			String datanasc = valor(req, "datanasc", "");
			String sexo = valor(req, "sexo", "");
			String salario = valor(req, "salario", "");
			if (op.equals("cadastrar")) {
				FuncionarioDao.inclui(nome, cpf, rg, endereco, datanasc, sexo, salario);
				msg = "Cadastro realizado com sucesso.";
			} else if (op.equals("")) {
				msg = "";
			} else {
				throw new IllegalArgumentException("Operação \"" + op + "\" não suportada.");
			}
			if (op.equals("cadastra")) {
				resp.sendRedirect("funcionario");
			} else if (op.equals("consulta")) {
				System.out.println("bb");
				resp.sendRedirect("consultar");
			} else if (op.equals("lista")) {
				resp.sendRedirect("listar");
			}
			req.setAttribute("msg", msg);
			req.getRequestDispatcher("FuncionarioView.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace(resp.getWriter());
		}
	}
}
