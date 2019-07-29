package br.com.estudo;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListasVinculadas {

	public static void main(String[] args) {

		String[] palavras = { "Livro", "Escola", "Aluno", "Professor" };

		List<String> lista1 = new LinkedList<String>();
		for (String palavra : palavras)
			lista1.add(palavra);

		String[] palavras2 = { "Java", "Html", "Css", "JavaScript" };

		List<String> lista2 = new LinkedList<String>();
		for (String palavra : palavras2)
			lista2.add(palavra);

		lista1.addAll(lista2);
		lista2 = null;

		imprimirLista(lista1);

		imprimirListaOrdemInversa(lista1);

		System.out.println("\n\nRemovido elementos do 5 ao 7 da lista: ");
		removerItems(lista1, 5, 8);
		imprimirLista(lista1);

		converterPalavraMaisculas(lista1);

		imprimirSubList(lista1, 2, 4);

	}

	private static void imprimirLista(List<String> lista) {

		System.out.print("Lista: ");
		for (String palavra : lista)
			System.out.printf("%s ", palavra);
		System.out.println();
	}

	private static void converterPalavraMaisculas(List<String> lista) {

		System.out.printf("\nLista palavras maiusculas:");
		ListIterator<String> iterador = lista.listIterator();
		while (iterador.hasNext()) {
			String palavra = iterador.next();
			iterador.set(palavra.toUpperCase());

		}
		for (String palavra2 : lista)
			System.out.printf("%s ", palavra2);
	}

	private static void removerItems(List<String> lista, int inicio, int fim) {

		lista.subList(inicio, fim).clear();

	}

	private static void imprimirListaOrdemInversa(List<String> lista) {

		ListIterator<String> iterador = lista.listIterator(lista.size());
		System.out.print("\nLista invertida: ");
		while (iterador.hasPrevious()) {
			System.out.printf("%s ", iterador.previous());

		}

	}

	private static void imprimirSubList(List<String> lista, int i, int f) {

		System.out.println("\n\nSublista: " + lista.subList(i, f));
	}

}
