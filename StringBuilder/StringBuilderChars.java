package br.com.estudo;

public class StringBuilderChars {

	public static void main(String[] args) {

		StringBuilder buffer = new StringBuilder("Programação orientada a objetos.");

		System.out.printf("buffer = %s\n", buffer.toString());
		System.out.printf("Caracter em 0: %s\nCaracter em 4: %s\n\n", buffer.charAt(0), buffer.charAt(4));

		char[] charArray = new char[buffer.length()];

		buffer.getChars(0, buffer.length(), charArray, 0);
		System.out.print("Os caracteres são: ");

		for (char character : charArray)
			System.out.print(character);

		buffer.setCharAt(0, 'p');
		buffer.setCharAt(6, 'M');
		System.out.printf("\n\nbuffer = %s", buffer.toString());

		buffer.reverse();
		System.out.printf("\n\nbuffer = %s\n", buffer.toString());
	}
}
