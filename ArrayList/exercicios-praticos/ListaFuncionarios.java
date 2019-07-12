package br.com.estudo;

import java.util.ArrayList;

class ListaFuncionarios {

	public static void main(String[] args) {

		// cria um ArrayList para armazenar os dados dos Funcionarios
		ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();

		// dados dos funcionarios a serem armazenados no ArrayList listaFuncionarios
		Funcionario funcionario_1 = new Funcionario("João"//
				, "souza"//
				, 1982//
				, "(11)999-9999"//
				, "22.4444.666-22"//
				, "00.22.44-7"//
				, "joão.souza@email.com.br"//
				, "Bacharelado"//
				, "Analista de Sistemas Embarcados."//
				, "22233344455");//

		Funcionario funcionario_2 = new Funcionario("Maria"//
				, "Silva"//
				, 1985//
				, "(11)888-8888"//
				, "44.5555.222-11"//
				, "22.55.99-4"//
				, "maria.silva@email.com.br"//
				, "Mestrado"//
				, "Desenvolvedora Blockchain Senior"//
				, "1122233388");//

		Funcionario funcionario_3 = new Funcionario("José"//
				, "Santos"//
				, 1989//
				, "(11)77777-7777"//
				, "66.777.222-33"//
				, "22.11.44-5"//
				, "jose.santos@email.com.br"//
				, "Doutorado"//
				, "Engenheiro de Software"//
				, "2217202010");//

		// insere os funcionários na lista
		listaFuncionarios.add(funcionario_1);
		listaFuncionarios.add(funcionario_2);
		listaFuncionarios.add(funcionario_3);

		System.out.println("\n\t\t<Lista de Funcionários Cadastrados no Sistema>");
		for (Funcionario funcionario : listaFuncionarios)
			System.out.println(funcionario);
	}
}

//classe Funcionario que estende a classe Pessoa
class Funcionario extends Pessoa {

	// variável de instância da classe
	private String matriculaFuncionario;

	// construtor da classe Funcionario herda da classe Pessoa
	public Funcionario(String nome, //
			String sobrenome, //
			int nascimento, //
			String telefone, //
			String cadastroPessoaFisica, //
			String identidade, //
			String email, //
			String escolaridade, //
			String profissao, //
			String matricula) {//

		// chama contrutor da classe Pessoa
		super(nome, //
				sobrenome, //
				nascimento, //
				telefone, //
				cadastroPessoaFisica, //
				identidade, //
				email, //
				escolaridade, //
				profissao);//
		matriculaFuncionario = matricula;

	}

	// getter da classe Funcionario
	public String getRegistroAluno() {
		return matriculaFuncionario;
	}

	// Método toString da classe Funcionario
	// chama toString da classe abstrata Pessoa
	@Override
	public String toString() {
		return super.toString() + "\n\t\tMatricula: " + getRegistroAluno();
	}

}

//classe abstrata Pessoa
abstract class Pessoa {

	// variáveis de instância
	private String nome;
	private String sobrenome;
	private int nascimento;
	private String telefone;
	private String cadastroPessoaFisica;
	private String identidade;
	private String email;
	private String escolaridade;
	private String profissao;

	// construtor da classe
	public Pessoa(String nome, //
			String sobrenome, //
			int nascimento, //
			String telefone, //
			String cadPessFis, //
			String identidade, //
			String email, //
			String escolaridade, //
			String profissao) {//

		this.nome = nome;
		this.sobrenome = sobrenome;
		this.nascimento = nascimento;
		this.telefone = telefone;
		this.cadastroPessoaFisica = cadPessFis;
		this.identidade = identidade;
		this.email = email;
		this.escolaridade = escolaridade;
		this.profissao = profissao;
	}

	// getters da classe Pessoa
	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public int getNascimento() {
		return nascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getCadastroPessoaFisica() {
		return cadastroPessoaFisica;
	}

	public String getIdentidade() {
		return identidade;
	}

	public String getEmail() {
		return email;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public String getProfissao() {
		return profissao;
	}

	@Override
	public String toString() {// método toString da classe Pessoa
		return "\t\t============================================\n"//
				+ "\t\tNome:" + getNome() + " " + getSobrenome()//
				+ "\n\t\tData de Nascimento: " + getNascimento()//
				+ "\n\t\tTelefone: " + getTelefone()//
				+ "\n\t\tCPF: " + getCadastroPessoaFisica() //
				+ "\n\t\tDocumento de identidade: " + getIdentidade()//
				+ "\n\t\tEmail: " + getEmail()//
				+ "\n\t\tEscolaridade: " + getEscolaridade()//
				+ "\n\t\tProfissao: " + getProfissao();//
	}

}
