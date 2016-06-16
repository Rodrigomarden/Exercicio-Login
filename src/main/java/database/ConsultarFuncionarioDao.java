package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 * DAO = Data Access Object.
 */
public class ConsultarFuncionarioDao {

	private static final String URL = "jdbc:derby:bd;create=true";

	public static Funcionario consultar(String nome, String cpf) throws SQLException {
		// Abrir uma conexão com o banco de dados.
		Connection conn = DriverManager.getConnection(URL);
		// Executar instrução SQL.
		String sql = "select nome, cpf, rg, endereco, datanasc, sexo, salario from funcionario where nome = ? AND cpf = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, nome);
		pstmt.setString(2, cpf);
		ResultSet rs;
		rs = pstmt.executeQuery();
		Funcionario func = new Funcionario();
		while(rs.next()) {
			func.setNome(rs.getString("nome"));
			func.setCpf(rs.getString("cpf"));
			func.setRg(rs.getString("rg"));
			func.setEndereco(rs.getString("endereco"));
			func.setDatanasc(rs.getString("datanasc"));
			func.setSexo(rs.getString("sexo"));
			func.setSalario(rs.getString("salario"));
		}
		// Fechar sentença.
		pstmt.close();
		// Fechar conexão.
		conn.close();
		return func;
	}

	public static void excluir(String nome, String cpf) throws SQLException {
		// Abrir uma conexão com o banco de dados.
		Connection conn = DriverManager.getConnection(URL);
		// Executar instrução SQL.
		String sql = "delete from funcionario where nome = ? AND cpf = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, nome);
		pstmt.setString(2, cpf);
		pstmt.executeUpdate();
		// Fechar sentença.
		pstmt.close();
		// Fechar conexão.
		conn.close();
	}
}
