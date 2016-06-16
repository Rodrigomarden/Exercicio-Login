package database;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listar")
public class ListarFuncionarioController extends HttpServlet {

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
			ArrayList<Funcionario> listaFunc = new ArrayList();
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
			tNome = "Nome";
			tCpf = "Cpf";
			tRg = "Rg";
			tDatanasc = "Data Nascimento";
			tEndereco = "Endereço";
			tSalario = "Salario";
			tSexo = "Sexo";
			
			req.setAttribute("tnome", tNome);
			req.setAttribute("tcpf", tCpf);
			req.setAttribute("trg", tRg);
			req.setAttribute("tdataNasc", tDatanasc);
			req.setAttribute("tendereco", tEndereco);
			req.setAttribute("tsalario", tSalario);
			req.setAttribute("tsexo", tSexo);
			
			listaFunc=ListarFuncionarioDao.listar();
			if(listaFunc.size()==0) {
				msg = "Funcionário não encontrado.";
			} else {
				nome=listaFunc.get(0).getNome();
				cpf=listaFunc.get(0).getCpf();
				rg=listaFunc.get(0).getRg();
				dataNasc=listaFunc.get(0).getDatanasc();
				endereco=listaFunc.get(0).getEndereco();
				salario=listaFunc.get(0).getSalario();
				sexo=listaFunc.get(0).getSexo();
				
				for(int i=1; i<listaFunc.size(); i++) {
					nome=nome+"<br>"+listaFunc.get(i).getNome();
					cpf=cpf+"<br>"+listaFunc.get(i).getCpf();
					rg=rg+"<br>"+listaFunc.get(i).getRg();
					dataNasc=dataNasc+"<br>"+listaFunc.get(i).getDatanasc();
					endereco=endereco+"<br>"+listaFunc.get(i).getEndereco();
					salario=salario+"<br>"+listaFunc.get(i).getSalario();
					sexo=sexo+"<br>"+listaFunc.get(i).getSexo();
				}
				req.setAttribute("nome", nome);
				req.setAttribute("cpf", cpf);
				req.setAttribute("rg", rg);
				req.setAttribute("dataNasc", dataNasc);
				req.setAttribute("endereco", endereco);
				req.setAttribute("salario", salario);
				req.setAttribute("sexo", sexo);
			}
			req.setAttribute("msg", msg);
			req.getRequestDispatcher("ListarFuncionarioView.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace(resp.getWriter());
		}
	}
}
