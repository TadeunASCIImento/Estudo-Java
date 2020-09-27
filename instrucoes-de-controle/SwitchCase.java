package br.com.estudo;

import java.util.Scanner;

public class SwitchCase {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			exibirMenuDeOpcoes();
			int opcao = getScannerInputInt();
			String mensagem = switchCase(opcao);
			exibirMensagem(mensagem);
		} while (true);
	}

	private static void exibirMenuDeOpcoes() {
		String[] operacoes = { "Escolha uma opção: ", "(1)Create", "(2)Read", //
				"(3)Update", "(4)Delete", "(5)Exit" };
		for (String operacao : operacoes) {
			System.out.println(operacao);
		}
	}

	private static void exibirMensagem(String mensagem) {
		System.out.print(mensagem);
	}

	private static int getScannerInputInt() {
		int valorInt = scanner.nextInt();
		return valorInt;
	}

	private static void finalizar() {
		System.out.println("finalizado.");
		System.exit(1);
	}

	private static String switchCase(int opcao) {
		String operacao = null;
		switch (opcao) {
		case 1:
			operacao = "Cadastrando...\n\n";
			break;
		case 2:
			operacao = "Visualizando...\n\n";
			break;
		case 3:
			operacao = "Atualizando...\n\n";
			break;
		case 4:
			operacao = "Removendo...\n\n\n";
			break;
		case 5:
			finalizar();
			break;
		}
		return operacao;
	}

}
