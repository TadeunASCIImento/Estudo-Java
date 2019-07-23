package br.com.estudo;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteCollections01 {

	public static void main(String[] args) {

		String[] nomes = { "nome_01", "nome_02", "nome_03", "nome_04", "nome_01", "nome_06", "nome_01", "nome_01",
				"nome_04" };

		List<String> listaNomes01 = Arrays.asList(nomes);

		ArrayList<String> listaNomes02 = new ArrayList<String>();

		ArrayList<Number> numeros = new ArrayList<Number>();

		numeros.add(10.9);
		numeros.add(12L);
		numeros.add(123456);
		numeros.add(1.5F);

		System.out.print("\nConteúdo do ArrayList numeros: ");
		for (Number numero : numeros)
			System.out.print(" " + "(" + numero + ")");

		listaNomes02.add("nome_07");
		listaNomes02.add("nome_08");
		listaNomes02.add("nome_09");

		System.out.print("\n\nConteúdo em listaNomes02: ");
		for (String nome : listaNomes02)
			System.out.print(" " + "(" + nome + ")");

		System.out.print("\n\nConteúdo em listaNomes01: ");
		for (String nome : listaNomes01)
			System.out.print(" " + "(" + nome + ")");
		;

		// passa os elementos do Array nomes para List listaNomes
		Collections.addAll(listaNomes02, nomes);
		Collections.sort(listaNomes02);// ordena os elementos em ordem crescente

		System.out.print("\n\nConteúdo de listaNomes2 após a adição do Array nomes e  ordenação:");
		for (String nome : listaNomes02)
			System.out.print(" " + "(" + nome + ")");

		// retorna a recorrência do nome01 em listaNomes2
		int frequencia = Collections.frequency(listaNomes02, "nome_01");
		if (frequencia > 0)
			System.out.println("\n\nnome_01 foi encontrado " + frequencia + " vezes em listaNome02.");
		else
			System.out.println("\n\nnome_01 não localizado existe na lista.");

		int frequencia2 = Collections.frequency(listaNomes02, "nome_20");
		if (frequencia2 > 0)
			System.out.println("\nnome_20 foi encontrado " + frequencia2 + " vezes em listaNome02.");
		else
			System.out.println("\nnome_20 não localizado existe na lista.");

		// Retorna true se existir nomes correspondentes em ambas as listas.
		boolean disjoint = Collections.disjoint(listaNomes01, listaNomes02);
		System.out.printf("\nLista 1 e lista 2 %s nomes em comum.\n", (disjoint ? "não pussuem" : "possuem"));

	}

}
