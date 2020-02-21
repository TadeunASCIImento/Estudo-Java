package br.com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

	private final static String URL_BANCO = "jdbc:mysql://localhost:3306/Loja?serverTimezone=UTC";
	private final static String USUARIO_BANCO = "usuarioLoja";
	private final static String SENHA_USUARIO = "senhaUsuarioLoja";
	private static Connection conexao;

	public Connection obterConexao() {
		try {
			conexao = DriverManager.getConnection(URL_BANCO, USUARIO_BANCO, SENHA_USUARIO);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conexao;

	}

}
