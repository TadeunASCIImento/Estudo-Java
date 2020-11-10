package br.com.tadeu.banco;

public class Cliente {

	private String cpf;
	private String nome;

	public Cliente(String documento, String nome) {
		this.cpf = documento;
		this.nome = nome;
	}

	public Cliente() {

	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String documento) {
		this.cpf = documento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
