package br.com.estudo;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTeste {
	public static void main(String[] args) {

		String[] nomes = { "nome05", "nome02", "nome01", "nome03", "nome04", "nome06" };

		// Cria TreeSet apartir do array nomes.
		SortedSet<String> arvore = new TreeSet<String>(Arrays.asList(nomes));

		System.out.print("Set ordenado: ");
		imprimirSet(arvore); // saída do conteúdo da arvore.

		// exibe os valores antes de nome04
		System.out.print("headSet (\"nome04\"):  ");
		imprimirSet(arvore.headSet("nome04"));

		// exibe valores depois de nome04 incluindo nome04.
		System.out.print("tailSet (\"nome04\"):  ");
		imprimirSet(arvore.tailSet("nome04"));

		// exibe o primeiro elemento da arvore.
		System.out.printf("Primeiro: %s\n", arvore.first());

		// exibe o último elemento na arvore
		System.out.printf("Ultimo: %s\n", arvore.last());
	}

	// método responsável por imprimir os dados do SortedSet no console
	private static void imprimirSet(SortedSet<String> set) {
		for (String s : set)
			System.out.printf("%s ", s);
		System.out.println("\n");
	}
}
