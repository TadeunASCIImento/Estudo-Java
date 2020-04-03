package br.com.entities;

public class Usuario extends Entitie {

	private int id;
	private String nome;
	private String cpf;
	private String usuario;
	private String senha;

	public Usuario(int id, String nome, String cpf, String usuario, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.usuario = usuario;
		this.senha = senha;
	}

	public Usuario() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("id:");
		builder.append(id);
		builder.append(" nome: ");
		builder.append(nome);
		builder.append(" cpf: ");
		builder.append(cpf);
		builder.append(" usuario: ");
		builder.append(usuario);
		builder.append(" senha: ");
		builder.append(senha);
		return builder.toString();
	}

}
