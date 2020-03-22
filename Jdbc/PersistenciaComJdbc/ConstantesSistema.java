xpackage br.com.jdbc;

import java.util.Scanner;

public interface ConstantesSistema {

	final static String URL_BD = "jdbc:mysql://localhost:3306/Loja?serverTimezone=UTC";

	final static String USUARIO_BD = "usuarioLoja";

	final static String SENHA_USUARIO = "senhaUsuarioLoja";

	final static String ATUALIZAR_REGISTRO = "UPDATE cliente SET nome_cliente = ?,sobrenome_cliente = ? WHERE codigo_cliente = ";

	final static String NOVO_REGISTRO = "INSERT INTO cliente(nome_cliente,sobrenome_cliente)VALUES(?,?)";

	final static String LOCALIZAR_REGISTRO = "SELECT codigo_cliente,nome_cliente,sobrenome_cliente FROM cliente WHERE codigo_cliente =";

	final static String EXCLUIR_REGISTRO = "DELETE FROM cliente WHERE codigo_cliente = ";

	final static String VISUALIZAR_TODOS_REGISTROS = "SELECT * FROM cliente";

	final static int CADASTRAR_NOVO_CLIENTE = 1;

	final static int MOSTRAR_LISTA_CLIENTES = 2;

	final static int EXCLUIR_CLIENTE = 3;

	final static int BUSCAR_CLIENTE = 4;

	final static int ATUALIZAR_CADASTRO_CLIENTE = 5;

	final static int SAIR_SISTEMA = 9;

	final static Scanner SCANNER = new Scanner(System.in);

	final static Conexao CONEXAO = new Conexao();

	static Cliente CLIENTE = new Cliente();

}
