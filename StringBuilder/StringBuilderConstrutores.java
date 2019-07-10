package br.com.classe.string.stringbuilder.character;

public class StringBuilderConstrutores {

	public static void main(String[] args) {

		StringBuilder buffer1 = new StringBuilder();
		StringBuilder buffer2 = new StringBuilder();
		StringBuilder buffer3 = new StringBuilder("Teste construtores StringBuilder");

		System.out.printf("buffer1 = \"%s\"\n", buffer1.toString());
		System.out.printf("buffer2 = \"%s\"\n", buffer2.toString());
		System.out.printf("buffer3 = \"%s\"\n", buffer3.toString());

		System.out.printf("Tamanho do buffer3: %d", buffer3.length());
		System.out.printf("\nTamanho do buffer1: %d", buffer1.length());
		System.out.printf("\nTamanho do buffer2: %d", buffer2.length());

		if (buffer3.length() < 10)
			System.out.println("\nTamanho do buffer3 é menor que 10.");
		else
			System.out.println("\nTamanho do buffer3 é maior que 10.");

	}

}
