package br.com.estudo;


//classe abstrata Pessoa (Super-classe )
public abstract class Pessoa {

	private String nome;
	private String endereco;
	private String telefone;
	private String cargo;
	private int idade;

	public Pessoa(String nome, String endereco, String telefone, String cargo, int idade) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cargo = cargo;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return String.format("\n\t\t\t\tNOME: " + getNome() + "\n\t\t\t\tENDEREÇO: " + getEndereco() + "\n\t\t\t\tTELEFONE: "
				+ getTelefone() + "\n\t\t\t\tCARGO: " + getCargo() + "\n\t\t\t\tIDADE: " + getIdade());
	}

}
