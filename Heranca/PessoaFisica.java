package br.com.estudo;

//classe PessoaFisica que herda de Pessoa

public class PessoaFisica extends Pessoa {

	private String cpf;
	private String rg;
	private String ctps;

	public PessoaFisica(String nome, String endereco, String telefone, String cargo, int idade, String cpf, String rg,
			String ctps) {
		super(nome, endereco, telefone, cargo, idade);
		this.cpf = cpf;
		this.rg = rg;
		this.ctps = ctps;

	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCtps() {
		return ctps;
	}

	public void setCtps(String ctps) {
		this.ctps = ctps;
	}

	@Override
	public String toString() {
		return String.format(
				super.toString() + "\n\t\t\t\tCPF: " + cpf + "\n\t\t\t\tIDENTIDADE: " + rg + "\n\t\t\t\tCTPS: " + ctps);
	}

}
