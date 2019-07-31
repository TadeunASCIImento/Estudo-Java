package br.com.estudo;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class UsandoToArrayLinkedList {

	public static void main(String[] args) {

		// cria um array de nomes
		String[] nomes = { "nome07", "nome04", "nome01", "nome05", "nome02", "nome03", "nome06" };

		// coloca os nomes em uma LinkedList
		LinkedList<String> listaNomes = new LinkedList<String>(Arrays.asList(nomes));

		System.out.print("\n<Lista de nomes como uma LinkedList fora de ordem>\n" + listaNomes);

		// ordena os nomes na lista em ordem alfabética usando sort de Collections
		Collections.sort(listaNomes);

		nomes = listaNomes.toArray(new String[listaNomes.size()]);
		System.out.println("\n\n<Lista de nomes como array em ordem alfabética>");
		System.out.print("Nome: ");
		for (String nome : nomes)
			System.out.print("  " + "<" + nome + ">");

	}

}
