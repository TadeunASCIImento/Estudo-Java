package br.com.estudo;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * Simula auto completar palavras.
 */

public class AutoCompletarPalavra {

	private static Scanner scanner = new Scanner(System.in);

	private static String prefixo;// inicio da palavra a ser completada.

	private static List<String> palavras = Arrays.asList("carroceiro", "carroceria", "carrocinha", "carro",
			"carrapato","passaro","passageiro","passagem");

	public static void main(String[] args) {

		// apenas uma parte de qualquer palavra na lista palavras.
		System.out.println("Entre com o prefixo da palavra?");
		prefixo = scanner.next();

		// busca na lista e exibe as plavras com o prefixo informado.
		autoCompletarPalavra(prefixo);

	}

	// verifica o prefixo da palavra usando startWith.
	private static void autoCompletarPalavra(String prefixo) {
		for (String palavra : palavras) {
			if (palavra.startsWith(prefixo)) {
				System.out.println(palavra);
			}
		}

	}

}
