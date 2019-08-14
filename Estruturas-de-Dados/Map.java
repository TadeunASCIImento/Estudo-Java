package br.com.estudo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ContaPalavrasUtilizandoHashMap {

	public static void main(String[] args) {

		// Cria um novo mapa com chaves de String e valores Integer.
		Map<String, Integer> meuMapa = new HashMap<String, Integer>();

		// Cria o mapa apartir da entrada do teclado.
		criarMapa(meuMapa);

		// Mostra o mapa criado.
		mostrarMapa(meuMapa);
	}

	// Metodo para criar o mapa apartir de entradas do teclado.
	private static void criarMapa(Map<String, Integer> mapa) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a frase: ");
		String input = scanner.nextLine();

		// tokeniza a String digitada.
		String[] tokens = input.split(" ");

		for (String token : tokens) { // percorre o array com a String tokenizada.
			String palavra = token.toLowerCase(); // converte em letras minusculas.

			if (mapa.containsKey(palavra)) { // Verifica se a palavra existe no mapa.
				int count = mapa.get(palavra);
				mapa.put(palavra, count + 1); // incrementa a contagem.

			} else {

				mapa.put(palavra, 1); // insere vova palavra com contagem de 1 para o mapa.
			}

		}
		scanner.close();
	}

	private static void mostrarMapa(Map<String, Integer> mapa) {

		// obtem as chaves utilizando metodo KeySet.
		Set<String> chaves = mapa.keySet();

		// classifica as chaves.
		TreeSet<String> chavesClassificadas = new TreeSet<String>(chaves);

		// gera saída das chaves no mapa.
		System.out.println("\nO mapa contém:\nChave\t\tValor ");
		for (String chave : chavesClassificadas)
			System.out.printf("%-10s%10s\n", chave, mapa.get(chave));

		// exibe tamanho do mapa e verifica se o mapa está vazio.
		System.out.printf("\nTamanho: %d\nVazio: %b\n", mapa.size(), mapa.isEmpty());

	}

}
