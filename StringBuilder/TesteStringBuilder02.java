package br.com.estudo;

import java.util.Scanner;

/*
 * Usando métodos da classe StrigBuilder.
 */

public class TesteStringBuilder02 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Entre com a string?");
		String string = scanner.nextLine();
		StringBuilder builder = getBuilder(string);
		System.out.printf("%s\n", builder);
		System.out.println("caracteres de string:");
		for (char c : toCharArray(builder)) {
			System.out.println(c);
		}

	}

	public static StringBuilder getBuilder(String string) {
		StringBuilder builder = new StringBuilder();
		return builder.append(string);

	}

	public static char[] toCharArray(StringBuilder builder) {
		char[] charArray = new char[builder.length()];
		builder.getChars(0, builder.length(), charArray, 0);
		return charArray;
	}
}
