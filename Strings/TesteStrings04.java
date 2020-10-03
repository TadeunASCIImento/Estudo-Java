package br.com.estudo;

/*
 * Obtendo uma substring de uma string maior.
 */

public class TesteStrings04 {

	public static void main(String[] args) {

		String str = "Usando método substring";

		System.out.printf("Substring a partir do indice 10.  \"%s\"\n", obterSubstring(str, 10));

		System.out.printf("%s \"%s\"\n", "Substring do indice 4 até o final da String.",
				obterSubstring(str, 4, str.length()));
	}

	// retorna uma substring definindo o inicio e o fim da nova string.
	public static String obterSubstring(String string, int inicio, int fim) {
		return string.substring(inicio, fim);
	}

	// método sobrecarregado retorna a substring definindo o inicio.
	public static String obterSubstring(String string, int inicio) {
		return string.substring(inicio);
	}

}
