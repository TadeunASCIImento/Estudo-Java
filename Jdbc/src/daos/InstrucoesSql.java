package br.com.dao;

public interface InstrucoesSql {

	static final String VALIDAR_USUARIO = "Select id,usuario,senha from Usuario";

	static final String INSERT_USUARIO = "Insert into Usuario (nome,cpf,usuario,senha) values(?,?,?,?)";

	static final String DELETE_USUARIO = "Delete from Usuario WHERE id =";

	static final String SELECT_USUARIO = "Select id,nome,cpf,usuario,senha from Usuario Where id =";

	static final String UPDATE_USUARIO = "Update Usuario Set nome = ?, cpf = ?, usuario = ?,senha = ? Where id =";

	static final String LISTAR_USUARIOS = "Select id,nome,cpf,usuario,senha from Usuario";

	static final String INSERT_CUPOM = "Insert into Cupom(codigo,descricao,pontos)values(?,?,?)";

	static final String DELETE_CUPOM = "Delete from Cupom Where id = ";

	static final String SELECT_CUPOM = "Select id,codigo,descricao,pontos from Cupom Where id = ";

	static final String LISTAR_CUPONS = "Select id,codigo,descricao,pontos from Cupom";

	static final String UPDATE_CUPOM = "Update Cupom Set id = ?,codigo = ?,descricao = ?,pontos = ? Where id = ";
}
