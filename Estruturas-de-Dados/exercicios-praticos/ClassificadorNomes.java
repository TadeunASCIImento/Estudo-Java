package br.com.estudo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Classificador {

	public static void main(String[] args) {

		// Cria um array de String com os nomes que serão classificados.

		String[] nomes = { "Tadeu", "João", "Cauã", "Antônio", "Vicente", "Calel", "Gael", "Bento", "Caio", "Emanuel",
				"Vinícius", "Luis Silva Jr", "Davi Lucas", "Noah", "João Gabriel", "João Victor", "Luiz Jon",
				"Francisco", "Kaique", "Otávio", "Augusto", "Levi", "Micchaela", "Ian", "João", "Maria", "Angela",
				"Tadeu", "José", "José Matos" };

		// coloca os nomes em uma lista

		List<String> listaNomes = new ArrayList<String>(Arrays.asList(nomes));

		// exibe a lista de nomes fora de ordem

		System.out.println("\n< Nomes na ordem original da lista >:");

		mostrarNomes(listaNomes);

		Collections.sort(listaNomes);// coloca os nomes em ordem crescente

		// exibe os nomes ordenados

		System.out.println("\n< Nomes classificados na ordem crescente >:");

		mostrarNomes(listaNomes);

		// Classifica na ordem decrescente com a chamada ao metodo reverseOrder.

		Collections.sort(listaNomes, Collections.reverseOrder());

		// Mostra nomes classificados na ordem decrescente

		System.out.println("\n< Nomes classificados em ordem decrescente >:");

		mostrarNomes(listaNomes);
	}

	public static void mostrarNomes(List<String> lista) {
		for (String nome : lista)
			System.out.println("<" + nome + ">");

	}

}
