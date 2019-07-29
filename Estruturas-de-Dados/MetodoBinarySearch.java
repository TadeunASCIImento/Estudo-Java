package br.com.estudo;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class MetodoBinarySearch {

	public static void main(String[] args) {

		String[] nomes = { "nome01", "nome02", "nome03", "nome04", "nome05", "nome06", "nome07", "nome08" };

		List<String> listaNomes = new ArrayList<String>(Arrays.asList(nomes));

		Collections.sort(listaNomes);

		System.out.printf("Nomes na lista: %s\n", listaNomes);

		mostrarResultadoBusca(listaNomes, "nome01");
		mostrarResultadoBusca(listaNomes, nomes[1]);
		mostrarResultadoBusca(listaNomes, "nome06");
		mostrarResultadoBusca(listaNomes, "nome03");
		mostrarResultadoBusca(listaNomes, "nome20");
		mostrarResultadoBusca(listaNomes, nomes[4]);

	}

	private static void mostrarResultadoBusca(List<String> lista, String chave) {

		int resultadoBusca = 0;
		System.out.printf("\nBuscar por: %s\n", chave);
		resultadoBusca = Collections.binarySearch(lista, chave);
		if (resultadoBusca >= 0)
			System.out.printf(chave + " encontrado no indíce: %d\n", resultadoBusca);
		else
			System.out.printf(chave + " não encontrado (%d)\n", resultadoBusca);

	}

}
