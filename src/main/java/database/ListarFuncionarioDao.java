package database;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 * DAO = Data Access Object.
 */
public class ListarFuncionarioDao {

	private static final String URL = "jdbc:derby:bd;create=true";

	public static ArrayList<Funcionario> listar() throws SQLException {
		// Abrir uma conexão com o banco de dados.
		Connection conn = DriverManager.getConnection(URL);
		// Executar instrução SQL.
		String sql = "select nome, cpf, rg, endereco, datanasc, sexo, salario from funcionario";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs;
		rs = pstmt.executeQuery();
		ArrayList<Funcionario> lista = new ArrayList<>();
		while(rs.next()) {
			Funcionario func = new Funcionario();
			func.setNome(rs.getString("nome"));
			func.setCpf(rs.getString("cpf"));
			func.setRg(rs.getString("rg"));
			func.setEndereco(rs.getString("endereco"));
			func.setDatanasc(rs.getString("datanasc"));
			func.setSexo(rs.getString("sexo"));
			func.setSalario(rs.getString("salario"));
			lista.add(func);
		}
		// Fechar sentença.
		pstmt.close();
		// Fechar conexão.
		conn.close();
		return lista;
	}
}
