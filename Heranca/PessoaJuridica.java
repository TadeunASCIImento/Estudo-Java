package br.com.estudo;

// Classe PessoaJuridica que herda de PessoaFisica diretamente
// e indiretamente da super-classa Pessoa

public class PessoaJuridica extends PessoaFisica {

	private String cnpj;

	public PessoaJuridica(String nome, String endereco, String telefone, String cargo, int idade, String cpf, String rg,
			String ctps, String cnpj) {
		super(nome, endereco, telefone, cargo, idade, cpf, rg, ctps);
		this.cnpj = cnpj;

	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return String.format("\n\t\t\t\tEMPRESA: " + getNome()//
				+ "\n\t\t\t\tENDEREÇO: " + getEndereco()//
				+ "\n\t\t\t\tTELEFONE: " + getTelefone()//
				+ "\n\t\t\t\tSETOR: " + getCargo()//
				+ "\n\t\t\t\tCNPJ: " + cnpj);
	}
}
