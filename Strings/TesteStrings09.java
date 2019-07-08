package br.com.estudo;

public class TesteStrings09 {

	public static void main(String[] args) {

		String string01 = "Outros métodos da classe String";
		String string02 = "Convertendo uma String em minusculas com toLowerCase";
		String string03 = "		espaços 	   ";
		String string04 = "Utilisando método replace";

		System.out.printf("string01 = %s\nstring02 = %s\nstring03 = %s\nstring04 = %s\n\n", string01, string02,
				string03, string04);

		// teste metodo replace, substitui caracteres na string.
		System.out.println(string04);
		System.out.printf("Substituir 's' por 'z' em string04: %s\n\n", string04.replace('s', 'z'));

		// teste toLowerCase e toUpperCase.
		// converte em maiusculas.
		System.out.printf("string01.toUpperCase() = %s\n", string01.toUpperCase());

		// converte em minusculas.
		System.out.printf("string02.toLowerCase() = %s\n\n", string02.toLowerCase());

		// Teste metodo trim.
		// remove os caracteres de espaço no inicio e fim
		System.out.printf("string03 após trim = \"%s\"\n\n", string03.trim());

		// Teste metodo toCharArray.
		char[] charArray = string01.toCharArray();// converte a string em um array de caracteres.
		System.out.println("string01 como um  array de caracteres:");
		for (char character : charArray) {
			System.out.println(character);

		}
		// caracteres nos indices 0 e 3.
		System.out.println("\n\n" + charArray[0] + charArray[3]);

	}
}
