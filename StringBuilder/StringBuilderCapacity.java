package br.com.estudo;

public class StringBuilderCapacity {

	public static void main(String[] args) {

		StringBuilder buffer = new StringBuilder("Estudo de programação em Java");

		System.out.printf("buffer = %s\nTamanho= %d\ncapacidade = %d\n\n", buffer.toString(), buffer.length(),
				buffer.capacity());

		buffer.ensureCapacity(75);
		System.out.printf("Nova capacidade = %d\n\n", buffer.capacity());

		buffer.setLength(500);
		System.out.printf("Novo tamanho = %d\nbuffer = %s\n", buffer.length(), buffer.toString());

	}
}
