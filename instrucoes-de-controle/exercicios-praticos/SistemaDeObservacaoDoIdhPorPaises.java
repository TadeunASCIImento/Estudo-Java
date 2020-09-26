package br.com.estudo;

import java.util.Scanner;

public class SistemaDeObservacaoDoIdhPorPaises {

	private static Scanner scanner = new Scanner(System.in);
	private static String endMessage = "programa finalizado.";

	public static void main(String[] args) {

		do {
			showCountryOptionsMenu();
			int opcao = getScannerInputInt();
			exit(opcao);// sai do laço e finaliza o programa.
			showCountryIdh(opcao);
		} while (true);

	}

	// deve exibir menu com lista de países.
	private static void showCountryOptionsMenu() {
		String[] opcaoes = { "Escolha um País para ver o IDH 2018.", "(1)Noruega", "(2)Suiça", "(3)Austrália",
				"(4)Irlanda", "(5)Alemanha", "(6)Islândia", "(7)Hong Kong", "(8)Suécia", "(9)Singapura", "(10)Holanda",
				"(11)Brasil", "(-1)Para sair\n\n" };
		for (String opcao : opcaoes) {
			System.out.println(opcao);
		}

	}

	// deve obter a opção do usuário.
	private static int getScannerInputInt() {
		int valorInt = scanner.nextInt();
		return valorInt;
	}

	// deve finalizar o programa caso opcao seja -1.
	private static void exit(int opcao) {
		if (opcao == -1) {
			showMessage(endMessage);
			System.exit(1);
		}

	}

	// deve exibir as mensagens ao usuário.
	private static void showMessage(String message) {
		System.out.println(message);

	}

	// deve exibir os dados de idh do país selecionado.
	private static void showCountryIdh(int opcao) {
		String[] paises = { "01° Noruega - 0.953", "02° Suiça - 0.944", "03° Austrália - 0.939", "04° Irlanda - 0.938",
				"05° Alemanha - 0.936", "06° Islândia - 0.935", "07° Hong Kong - 0.933", "08° Suécia - 0.933",
				"09° Singapura - 0.932", "10° Holanda - 0.931", "79° Brasil - 0.759" };
		int[] opcoes = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < opcoes.length; i++) {
			if (opcao == opcoes[i]) {
				showMessage(paises[opcao - 1].concat("\n"));
			}
		}
	}
}
