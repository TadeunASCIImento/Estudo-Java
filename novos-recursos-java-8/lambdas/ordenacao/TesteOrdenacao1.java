package br.com.tadeu.ordenacao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteOrdenacao1 {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("novos");
		palavras.add("recursos");
		palavras.add("linguagem");
		palavras.add("java");

		//Ordenando da forma antiga
		Comparator<String> comparator = new ComparadorPorTamanhoDaString();
		Collections.sort(palavras, comparator);
		palavras.sort(comparator);
		System.out.println(palavras);

		//Ordena usando lambda
		palavras.sort((palavra1, palavra2) -> Integer.compare(palavra1.length(),
		palavra2.length()));

		System.out.println(palavras);

		// imprime as palavras da lista usando lambda
		palavras.forEach(palavra -> System.out.println(palavra));

		palavras.sort(Comparator.comparing(p -> p.length()));

		// nova sintaxe
		palavras.sort(Comparator.comparing(String::length));
    
		palavras.forEach(System.out::println);
	}

}

// Implementa interface comparator para realizar a ordenação.
class ComparadorPorTamanhoDaString implements Comparator<String> {

	@Override
	public int compare(String string1, String string2) {

		if (string1.length() < string2.length()) {
			return -1;
		}

		if (string1.length() > string2.length()) {
			return 1;
		}

		return 0;
	}
}
