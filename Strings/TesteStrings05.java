package br.com.estudo;

public class TesteStrings05 {

	public static void main(String[] args) {

		String strFrase = "Tokenizando uma frase ou texto com o método split";

		String[] tokens = strFrase.split(" ");
		System.out.printf("\t\tQuantidade de palavras: %d\n\n\t\tAs palavras são:\n", tokens.length);

		for (String palavra : tokens)
			System.out.println("\t\t<" + palavra.toString() + ">");

		System.out.println();

	}
}
