package br.com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class Dao {

	private final String SERVIDOR = "localhost:3306";
	private final String TIME_ZONE = "?serverTimezone=UTC";
	private final String NOME_BANCO = "nomeBanco";
	private final String USUARIO_BANCO = "usuarioBanco";
	private final String SENHA_BANCO = "senhaBanco";

  	protected PreparedStatement pstm;
	protected ResultSet resultado;
	protected Connection conn;

	public Connection obterConexao() {

		String url_banco = "jdbc:mysql://" + SERVIDOR + "/" + NOME_BANCO + TIME_ZONE;

    try {

    	conn = DriverManager.getConnection(url_banco, USUARIO_BANCO, SENHA_BANCO);

    } catch (SQLException e) {

    	e.printStackTrace();

    }

    return conn;

	}

}
