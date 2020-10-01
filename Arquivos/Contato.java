package br.com.estudo;

/*
 * Dados para gravação no arquivo.
 */

public class Contato {

	private String nome;
	private String sobrenome;
	private String telefone;
	private String email;

	public Contato() {

	}

	public Contato(String nome, String sobrenome, String telefone, String email) {
		setNome(nome);
		setSobrenome(sobrenome);
		setTelefone(telefone);
		setEmail(email);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
