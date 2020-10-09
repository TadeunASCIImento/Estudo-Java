package br.com.estudo;

import java.util.Scanner;

/*
 * Metodos toLowerCase, toUpperCase e trim.
 */

public class TesteStrings09 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Entre com a string?");
		String string = scanner.nextLine();

		// toUpperCase os caracteres da em maiúsculos.
		System.out.printf("string após toUppercase: %s\n", string.toUpperCase());

		// toLowerCase converte os caracteres em minusculos.
		System.out.printf("string após toLowerCase: %s\n", string.toLowerCase());

		// remove os caracteres de espaço no inicio e fim.
		System.out.printf("string após trim: \"%s\"\n\n", string.trim());

		// converte a string em um array de caracteres.
		char[] charArray = string.toCharArray();
		System.out.println("string0 como um  array de caracteres:");
		for (char character : charArray) {
			System.out.println(character);

		}
		// caracteres nos indices 0 e 3.
		System.out.println("\ncaracteres nos indices 0 e 3:" + charArray[0] + charArray[3]);

	}

}
