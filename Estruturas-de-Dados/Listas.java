package br.com.estudo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Listas {

	public static void main(String[] args) {

		// cria uma List do tipo Integer
		List<Integer> listaInteiros1 = new ArrayList<Integer>();

		int[] arrayInteiros1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, };

		// armazena arrayInteiros1 em listaInteiros1
		for (Integer numeros : arrayInteiros1)
			listaInteiros1.add(numeros);

		// cria a segunda List do tipo Integer
		List<Integer> listaInteiros2 = new ArrayList<Integer>();

		int[] arrayInteiros2 = { 10, 11, 12, 13, 14, 15, 16 };

		// armazena arrayInteiros2 em listaInteiros2
		for (Integer numeros : arrayInteiros2)
			listaInteiros2.add(numeros);

		// armazena todos elementos de listaInteiros2 em listaInteiros1
		listaInteiros1.addAll(listaInteiros2);
		listaInteiros2 = null;// libera resursos do sistema

		// mostra listaInteiros1 contendo elementos de listaInteiros2
		System.out.print("\n(Lista de números original.)--> ");
		imprimirListaInteiros(listaInteiros1);
		System.out.println();

		// mostra lista em ordem inversa
		System.out.print("\n(Lista de números na ordem invertida.) --> ");
		imprimeOrdemInversaInterios(listaInteiros1);

		// removendo elementos da lista
		System.out.print("\n\n(Removidos items do indice 5 ao 8 da lista.)--> ");
		removerItems(listaInteiros1, 4, 8);
		imprimirListaInteiros(listaInteiros1);

		// mostrando somente os números impares na lista
		System.out.print("\n\n(Lista somente números impares.)--> ");
		removeNumerosPares(listaInteiros1);
		imprimirListaInteiros(listaInteiros1);

	}

	// metodo para mostrar os elementos na lista
	private static void imprimirListaInteiros(List<Integer> lista) {

		// usa um ListIterator para percorrer a lista
		ListIterator<Integer> iterador = lista.listIterator();
		while (iterador.hasNext()) {
			System.out.printf("%d ", iterador.next());
		}
	}

	// metodo para mostrar elementos da lista em ordem invertida
	private static void imprimeOrdemInversaInterios(List<Integer> lista) {

		// usa o metodo static hasPrevious() para percorrer a lista
		// em ordem invertida
		ListIterator<Integer> iterador = lista.listIterator(lista.size());
		while (iterador.hasPrevious()) {
			System.out.printf("%d ", iterador.previous());
		}
	}

	// metodo para remover elementos da lista
	private static void removerItems(List<Integer> lista, int i, int f) {

		// cria uma subList e remove a sublist contendo os elementos
		// indicados pelo indíce inicial (i) e final (f) usando o metodo static clear()
		lista.subList(i, f).clear();
	}

	// metodo para remover elemento par da lista
	private static void removeNumerosPares(List<Integer> lista) {

		// usa o metodo static remove() para remover o elemento indicado
		ListIterator<Integer> iterador = lista.listIterator();
		while (iterador.hasNext()) {
			if (iterador.next() % 2 == 0)
				iterador.remove();
		}
	}

}
