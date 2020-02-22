package br.com.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IniciarSistemaCadastro implements ConstantesSistema {

	private static PreparedStatement pstm = null;
	private static ResultSet resultSet = null;

	public static void main(String[] args) {

		for (;;) {
			System.out.print("\n\n(1 - Cadastrar | 2 - Visualizar | 3 - Excluir "//
					+ "| - 4 Buscar cliente | 5 - Atualizar | 9 - Sair)");
			switch (SCANNER.nextInt()) {
			case CADASTRAR_NOVO_CLIENTE:
				cadastrarCliente(digitarDadosCliente());
				break;
			case MOSTRAR_LISTA_CLIENTES:
				mostrarTodosRegistros();
				break;
			case EXCLUIR_CLIENTE:
				excluirRegistro();
				break;
			case BUSCAR_CLIENTE:
				buscarCliente();
				break;
			case ATUALIZAR_CADASTRO_CLIENTE:
				atualizarRegistro();
				break;
			case SAIR_SISTEMA:
				System.out.println("\n( Terminado )");
				System.exit(1);
				break;
			}
		}
	}

	private static void atualizarRegistro() {

		System.out.println("\nDigite o código do cliente?");
		int codigo = SCANNER.nextInt();
		System.out.println("Primeiro nome ?");
		String nome = SCANNER.next();
		System.out.println("Sobrenome ?");
		String sobrenome = SCANNER.next();
		try {
			pstm = CONEXAO.obterConexao().prepareStatement(ATUALIZAR_REGISTRO + codigo);
			pstm.setString(1, nome);
			pstm.setString(2, sobrenome);
			pstm.executeUpdate();
			System.out.println("\nDados atualizados com Sucesso!");
			mostrarTodosRegistros();

		} catch (SQLException e) {
			System.out.println("\nErro ao atualizar Cliente.");
			e.printStackTrace();

		} finally {
			fecharConexao();
		}
	}

	private static void buscarCliente() {

		int codigo;
		System.out.println("\nDigite o código do cliente?");
		codigo = SCANNER.nextInt();
		try {
			pstm = CONEXAO.obterConexao().prepareStatement(LOCALIZAR_REGISTRO + codigo);
			resultSet = pstm.executeQuery();
			while (resultSet.next()) {
				CLIENTE.setCodigo(resultSet.getInt("codigo_cliente"));
				CLIENTE.setNome(resultSet.getString("nome_cliente"));
				CLIENTE.setSobrenome(resultSet.getString("sobrenome_cliente"));
			}
			if (CLIENTE.toString() != null)
				System.out.println(CLIENTE.toString());
			else
				System.out.println("Cliente não Localizado!");
		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {
			fecharConexao();
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private static void excluirRegistro() {

		int codigo;
		System.out.println("\nDigite o código do cliente?");
		codigo = SCANNER.nextInt();
		try {
			pstm = CONEXAO.obterConexao().prepareStatement(EXCLUIR_REGISTRO + codigo);
			pstm.executeUpdate();
			System.out.println("\nCliente excluído com sucesso!");
			mostrarTodosRegistros();
		} catch (SQLException e) {
			System.out.println("\nErro ao excluir cliente!");
			e.printStackTrace();
		} finally {
			fecharConexao();
		}
	}

	private static Cliente digitarDadosCliente() {

		String nome, sobrenome;
		System.out.println("\nPrimeiro nome ?");
		nome = SCANNER.next();
		System.out.println("Sobrenome ?");
		sobrenome = SCANNER.next();
		CLIENTE.setNome(nome);
		CLIENTE.setSobrenome(sobrenome);
		return CLIENTE;

	}

	private static void mostrarTodosRegistros() {

		List<Cliente> listaClientes = new ArrayList<Cliente>();
		try {
			pstm = CONEXAO.obterConexao().prepareStatement(VISUALIZAR_TODOS_REGISTROS);
			resultSet = pstm.executeQuery();
			while (resultSet.next()) {
				Cliente cliente = new Cliente();
				cliente.setCodigo(resultSet.getInt("codigo_cliente"));
				cliente.setNome(resultSet.getString("nome_cliente"));
				cliente.setSobrenome(resultSet.getString("sobrenome_cliente"));
				listaClientes.add(cliente);
			}
			if (listaClientes.isEmpty()) {
				System.out.println("\nSem clientes cadastrados! ");
			} else {
				System.out.printf("\n\t< Lista de clientes >\n");
				for (int count = 0; count < listaClientes.size(); count++)
					System.out.printf("\n%s", listaClientes.get(count));
			}
		} catch (SQLException e) {
			System.out.println("\nErro ao localizar cliente!");
			e.printStackTrace();
		} finally {
			fecharConexao();
		}
	}

	private static void cadastrarCliente(Cliente cliente) {

		try {
			pstm = CONEXAO.obterConexao().prepareStatement(NOVO_REGISTRO);
			pstm.setString(1, cliente.getNome());
			pstm.setString(2, cliente.getSobrenome());
			pstm.execute();
			System.out.println("\nCliente cadastrado com Sucesso!");
		} catch (SQLException e) {
			System.out.println("\nErro ao cadastrar Cliente.");
			e.printStackTrace();
		} finally {
			fecharConexao();
		}
	}

	private static void fecharConexao() {
		try {
			CONEXAO.obterConexao().close();
			pstm.close();
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
}
