package br.com.estudo;

import java.util.ArrayList;
import java.util.Scanner;

// Testa Herança entre as classes
public class TestePessoa {

	private static final int MOSTRAR_LISTA = 1;
	private static final int SAIR_SISTEMA = 2;

	public static void main(String[] args) {

		// objetos das classes com seus atributos próprios e herdados
		PessoaFisica pessoa1 = new PessoaFisica("Tadeu Nascimento", "Av.Paulista,000", "+55(11)99999-8888",
				"Desenvolvedor Java Jr", 36, "333.444.555-66", "77.888.999-0", "000-111");

		PessoaFisica pessoa2 = new PessoaFisica("nASCIImento", "Av.Consoloção,000", "+55(11)44444-5555",
				"Desenvolvedor Web", 36, "444.333.222-11", "88.777.666-0", "010-202");

		PessoaJuridica pessoa3 = new PessoaJuridica("Google",
				"Av. Brg. Faria Lima, 3477\n\t\t\t\tItaim Bibi.\n\t\t\t\tSão Paulo - SP, 04538-133", " (11)2395-8400",
				"Tecnologia da Informação", 0, "", "", "", "06.990.590/0001-23");

		PessoaJuridica pessoa4 = new PessoaJuridica("Oracle Brasil Sistemas",
				"Rua Dr. José Áureo Bustamante, 455\n\t\t\t\tVila Sao Francisco (Zona Sul)\n\t\t\t\tSão Paulo - SP, 04710-090",
				"(11)5189-1000", "Tecnologia da Informação", 0, "", "", "", "59.456.277/0001-76");

		// arrayList do tipo Pessoa (Superclasse) armazena tanto objetos da classe
		// PessoFisica
		// como PessoaJuridica pois ambas são subclasse da classe Pessoa
		ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		listaPessoas.add(pessoa1);
		listaPessoas.add(pessoa2);
		listaPessoas.add(pessoa3);
		listaPessoas.add(pessoa4);

		Scanner scanner = new Scanner(System.in);
		System.out.println("\n\t\t\t\t   < Digite uma opção >");
		System.out.println("\n\t\t\t( 1 - MOSTRAR LISTA ) ( 2 - SAIR DO SISTEMA )");
		int opcao = scanner.nextInt();

		switch (opcao) {

		case MOSTRAR_LISTA:
			mostrarPessoas(listaPessoas);
			break;

		case SAIR_SISTEMA:
			System.out.println("\n\t\t\t< Terminado >");
			System.exit(1);
			break;
		}
		scanner.close();

	}

	private static void mostrarPessoas(ArrayList<Pessoa> lista) {

		System.out.println("\n\t\t\t\t< Lista >");

		// verifica a classe do objeto usando instanceof
		for (Pessoa pessoa : lista) {
			if (pessoa instanceof PessoaJuridica) {
				System.out.println("\n\t\t\t\t< Pessoa Juridica >");
				System.out.println(pessoa);

			} else if (pessoa instanceof PessoaFisica) {
				System.out.println("\n\t\t\t\t< Pessoa Fisica >");
				System.out.println(pessoa);

			}
		}

	}

}
