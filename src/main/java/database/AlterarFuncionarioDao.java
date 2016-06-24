package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 * DAO = Data Access Object.
 */
public class AlterarFuncionarioDao {

	private static final String URL = "jdbc:derby:bd;create=true";

	public static void alterarNome(String nome, String cpf) throws SQLException {
		// Abrir uma conexão com o banco de dados.
		Connection conn = DriverManager.getConnection(URL);
		// Executar instrução SQL.
		String sql = "update funcionario set nome = ? where cpf = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, nome);
		pstmt.setString(2, cpf);
		pstmt.executeUpdate();
		// Fechar sentença.
		pstmt.close();
		// Fechar conexão.
		conn.close();
	}
	public static void alterarEndereco(String cpf, String endereco) throws SQLException {
		// Abrir uma conexão com o banco de dados.
		Connection conn = DriverManager.getConnection(URL);
		// Executar instrução SQL.
		String sql = "update funcionario set endereco = ? where cpf = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(2, cpf);
		pstmt.setString(1, endereco);
		pstmt.executeUpdate();
		// Fechar sentença.
		pstmt.close();
		// Fechar conexão.
		conn.close();
	}
	public static void alterarSalario(String cpf, String salario) throws SQLException {
		// Abrir uma conexão com o banco de dados.
		Connection conn = DriverManager.getConnection(URL);
		// Executar instrução SQL.
		String sql = "update funcionario set salario = ? where cpf = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(2, cpf);
		pstmt.setString(1, salario);
		pstmt.executeUpdate();
		// Fechar sentença.
		pstmt.close();
		// Fechar conexão.
		conn.close();
	}
}
