package br.com.estudo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListTeste01 {

	public static void main(String[] args) {

		String[] nomes = { "nome01", "nome02", "nome03", "nome04", "nome05" };

		List<String> listaNomes = new ArrayList<String>();

		for (String nome : nomes)
			listaNomes.add(nome);

		String[] nomesRemovidos = { "nome01", "nome02", "nome03" };
		List<String> listaNomesRemover = new ArrayList<String>();

		for (String nome : nomesRemovidos)
			listaNomesRemover.add(nome);

		System.out.printf("\n\n\t\t\t(ArrayList nomes completo): ");
		for (int count = 0; count < listaNomes.size(); count++)
			System.out.printf("%s ", listaNomes.get(count));

		removerNomesDaLista(listaNomes, listaNomesRemover);

		System.out.print("\n\n\t\t\t( ArrayList nomes após a chamada a removerNomesDaLista): ");
		for (String nome : listaNomes)
			System.out.printf("%s ", nome);

	}

	// remove elementos da listaNomes
	private static void removerNomesDaLista(Collection<String> colecao1, Collection<String> colecao2) {

		// percorre listaNomes
		Iterator<String> iterador = colecao1.iterator();
		while (iterador.hasNext()) {
			if (colecao2.contains(iterador.next()))// verifica se elemento em listaNomesRemover existe em listaNomes
				iterador.remove();// remove se existir
		}

	}

}
