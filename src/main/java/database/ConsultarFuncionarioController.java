package database;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/consultar")
public class ConsultarFuncionarioController extends HttpServlet {

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
			String nome = valor(req, "nome", "");
			String cpf = valor(req, "cpf", "");
			String rg = "";
			String dataNasc = "";
			String endereco = "";
			String salario = "";
			String sexo = "";
			
			String tNome = "";
			String tCpf = "";
			String tRg = "";
			String tDatanasc = "";
			String tEndereco = "";
			String tSalario = "";
			String tSexo = "";
			
			if (op.equals("cadastra")) {
				System.out.println("aaa");
				resp.sendRedirect("funcionario");
			} else if (op.equals("consultaa")) {
				resp.sendRedirect("consultar");
			} else if (op.equals("lista")) {
				resp.sendRedirect("listar");
			}
			
			if (op.equals("consulta")) {
				func=ConsultarFuncionarioDao.consultar(nome, cpf);
				nome=func.getNome();
				cpf=func.getCpf();
				rg=func.getRg();
				dataNasc=func.getDatanasc();
				endereco=func.getEndereco();
				salario=func.getSalario();
				sexo=func.getSexo();
				
				tNome = "Nome";
				tCpf = "Cpf";
				tRg = "Rg";
				tDatanasc = "Data Nascimento";
				tEndereco = "Endereço";
				tSalario = "Salario";
				tSexo = "Sexo";
				
				req.setAttribute("nome", nome);
				req.setAttribute("cpf", cpf);
				req.setAttribute("rg", rg);
				req.setAttribute("dataNasc", dataNasc);
				req.setAttribute("endereco", endereco);
				req.setAttribute("salario", salario);
				req.setAttribute("sexo", sexo);
				
				req.setAttribute("tnome", tNome);
				req.setAttribute("tcpf", tCpf);
				req.setAttribute("trg", tRg);
				req.setAttribute("tdataNasc", tDatanasc);
				req.setAttribute("tendereco", tEndereco);
				req.setAttribute("tsalario", tSalario);
				req.setAttribute("tsexo", tSexo);
				
				if(func.getNome()==null) {
					msg = "Funcionário não encontrado.";
				}
				resp.sendRedirect("consultar");
			} else if (op.equals("exclui")) {
				ConsultarFuncionarioDao.excluir(nome, cpf);
				msg = "Funcionario excluido com sucesso.";
				resp.sendRedirect("consultar");
			} else if (op.equals("")) {
				msg = "";
			} else {
				throw new IllegalArgumentException("Operação \"" + op + "\" não suportada.");
			}
			
			req.setAttribute("msg", msg);
			req.getRequestDispatcher("ConsultarFuncionarioView.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace(resp.getWriter());
		}
	}
}
