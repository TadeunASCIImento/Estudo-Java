package br.com.estudo;

public class Contato {

	private String nome;
	private String sobrenome;
	private String telefone;
	private String email;

	public Contato() {
		this("", "", "", "");
	}

	public Contato(String nome, String sobrenome, String telefone, String email) {

		setNome(nome);
		setSobrenome(sobrenome);
		setTelefone(telefone);
		setEmail(email);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}
}
