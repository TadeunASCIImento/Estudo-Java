package br.com.estudo;

public class TesteStrings10 {

	public static void main(String[] args) {

		String letters = "abcdefghijklmabcdefghijklm";

		/*
		 * usando indexOf para localizar um caracter em uma string
		 */
		System.out.printf("'c' está localizado no indíce %d\n", letters.indexOf('c'));
		System.out.printf("'a' está localizado no indíce %d\n", letters.indexOf('a', 1));
		System.out.printf("'m' está localizado no indíce %d\n\n", letters.indexOf('m'));

		/*
		 * testa lastIndexOf para localizar um caractere na string.
		 */
		System.out.printf("Ultimo 'c' está localizado no indíce %d\n", letters.lastIndexOf('c'));
		System.out.printf("Ultimo 'a' está localizado no indíce %d\n", letters.lastIndexOf('a', 25));
		System.out.printf("Ultimo 'm' está localizado no indíce %d\n\n", letters.lastIndexOf('m'));

		/*
		 * testa indexOf para localizar uma substring na string.
		 */
		System.out.printf("\"def\"  está localizado no indíce %d\n", letters.indexOf("def"));
		System.out.printf("\"def\"  está localizado no indíce %d\n", letters.indexOf("def", 7));
		System.out.printf("\"Java\" está localizado no indíce %d\n\n", letters.indexOf("Java"));

		/*
		 * testa lastIndexOf para localizar uma substring em uma string.
		 */
		System.out.printf("Ultimo \"def\"  está localizado no indíce  %d\n", letters.lastIndexOf("def"));
		System.out.printf("Ultimo \"def\"  está localizado no indíce  %d\n", letters.lastIndexOf("def", 25));
		System.out.printf("Ultimo \"Java\" está localizado no indíce  %d\n", letters.lastIndexOf("Java"));
	}
}
