package br.com.jdbc;

public class Cliente {

	private Integer codigo;
	private String nome;
	private String sobrenome;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
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

	@Override
	public String toString() {
		return String.format("=============================================\n"//
				+ "Codigo: %s Nome: %s  %s", getCodigo(), getNome(),
				getSobrenome() + "\n=============================================");
	}

}
