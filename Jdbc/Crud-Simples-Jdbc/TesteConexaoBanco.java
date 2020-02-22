package br.com.jdbc;

public class TesteConexaoBanco {

	private static Conexao conexao = new Conexao();

	public static void main(String[] args) {

		if (!conexao.obterConexao().equals(null)) {

			System.out.println("CONECTADO AO BANCO COM SUCESSO.");
		} else {
			System.out.println("FALHA NA CONEXAO COM O BANCO!");
		}

	}
}
