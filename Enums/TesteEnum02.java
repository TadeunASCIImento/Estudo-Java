package br.com.estudo;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class TesteEnum01 {

	private static MenuOpcoes tipoOperacao;
	private final static MenuOpcoes[] selecaoOperacao = { MenuOpcoes.SALVAR_ARQUIVO, MenuOpcoes.ABRIR_ARQUIVO,
			MenuOpcoes.ATUALIZAR_ARQUIVO, MenuOpcoes.EXCLUIR_ARQUIVO, MenuOpcoes.SAIR_SISTEMA };

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		processarSelecao();

	}

	private static MenuOpcoes selecionarOperacao() {

		int opcao = 1;
		System.out.println(
				"\n\n\t\t( Entre com a opção )\n ( 1 - Salvar, 2 - Abrir, 3 - Atualizar, 4 - Deletar, 5 - Sair )");
		try {
			for (;;) {
				System.out.println("\n?");
				opcao = scanner.nextInt();
				if (!(opcao < 1) || (opcao > 4))
					break;
			}
		} catch (NoSuchElementException elementException) {
			System.err.println("Entrada inválida!");
			System.exit(1);

		}
		return selecaoOperacao[opcao - 1];

	}

	public static void processarSelecao() {

		tipoOperacao = selecionarOperacao();

		while (tipoOperacao != MenuOpcoes.SAIR_SISTEMA) {
			switch (tipoOperacao) {
			case ABRIR_ARQUIVO:
				System.out.println("\t\t\tAbrindo arquivo...");
				break;

			case ATUALIZAR_ARQUIVO:
				System.out.println("\t\t\tAtualizar arquivo.");
				break;

			case SALVAR_ARQUIVO:
				System.out.println("\t\t\tSalvando arquivo..");
				break;

			case EXCLUIR_ARQUIVO:
				System.out.println("\t\t\tExcluindo arquivo.");
				break;

			default:
				break;

			}

			tipoOperacao = selecionarOperacao();

		}
		System.out.println("\t\t\tTerminado...");

	}

}

enum MenuOpcoes {

	SALVAR_ARQUIVO(1), ABRIR_ARQUIVO(2), ATUALIZAR_ARQUIVO(3), EXCLUIR_ARQUIVO(4), SAIR_SISTEMA(5);

	int intValor;

	MenuOpcoes(int valor) {

		this.intValor = valor;

	}

	int getValor() {

		return intValor;
	}
}
