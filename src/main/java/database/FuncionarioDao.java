package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * DAO = Data Access Object.
 */
public class FuncionarioDao {

	private static final String URL = "jdbc:derby:bd;create=true";

	public static void inclui(String nome, String cpf, String rg, String endereco, String datanasc, String sexo, String salario) throws SQLException {
		// Abrir uma conexão com o banco de dados.
		Connection conn = DriverManager.getConnection(URL);
		// Executar instrução SQL.
		String sql = "insert into funcionario (nome, cpf, rg, endereco, datanasc, sexo, salario) values (?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, nome);
		pstmt.setString(2, cpf);
		pstmt.setString(3, rg);
		pstmt.setString(4, endereco);
		pstmt.setString(5, datanasc);
		pstmt.setString(6, sexo);
		pstmt.setString(7, salario);
		
		pstmt.executeUpdate();
		// Fechar sentença.
		pstmt.close();
		// Fechar conexão.
		conn.close();
	}

	public static void alterar(int matricula, String nome) throws SQLException {
		// Abrir uma conexão com o banco de dados.
		Connection conn = DriverManager.getConnection(URL);
		// Executar instrução SQL.
		String sql = "update aluno set nome = ? where matricula = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, nome);
		pstmt.setInt(2, matricula);
		pstmt.executeUpdate();
		// Fechar sentença.
		pstmt.close();
		// Fechar conexão.
		conn.close();
	}

	public static void excluir(int matricula) throws SQLException {
		// Abrir uma conexão com o banco de dados.
		Connection conn = DriverManager.getConnection(URL);
		// Executar instrução SQL.
		String sql = "delete from aluno where matricula = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, matricula);
		pstmt.executeUpdate();
		// Fechar sentença.
		pstmt.close();
		// Fechar conexão.
		conn.close();
	}
}
