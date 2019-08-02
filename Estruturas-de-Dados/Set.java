package br.com.estudo;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

public class SetTeste {
	public static void main(String[] args) {

		Integer[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7 };

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(numeros));
		System.out.printf("Lista: %s\n", list);

		// Elimina valores duplicados.
		eliminarDuplicados(list);
	}

	// Cria um set eliminando os valores duplicados.
	private static void eliminarDuplicados(Collection<Integer> values) {

		// Cria um HashSet
		Set<Integer> set = new HashSet<Integer>(values);

		System.out.print("\nValores não duplicados são: ");
		for (Integer valor : set)
			System.out.printf("%s ", valor);
		System.out.println();
	}
}
