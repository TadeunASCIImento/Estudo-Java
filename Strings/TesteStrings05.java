package br.com.estudo;

import java.util.Scanner;

/*
 * Criando tokens de uma frase ou texto.
 */

public class TesteStrings05 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String texto = inputScannerString();
		String[] tokens = obterTokens(texto);
		printTokens(tokens);
	}

	// exibe o texto tokenizado e a quantidade de palavras.
	private static void printTokens(String[] tokens) {
		System.out.printf("\nQuantidade de palavras: %d\nPalavras:\n", tokens.length);
		for (String token : tokens) {
			System.out.println(token.toString());
		}
	}

	private static String inputScannerString() {
		System.out.println("Entre com o texo?");
		String texto = scanner.nextLine();
		return texto;
	}

	// tokeniza o texto informado.
	public static String[] obterTokens(String texto) {
		texto = texto.replace(".", " ").replace(",", "");
		return texto.split(" ");
	}

}
