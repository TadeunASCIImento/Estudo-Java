package br.com.estudo;

/*
 * Usando string builder.
 */

public class TesteStringBuilder01 {

	public static void main(String[] args) {

		String string = "Usando StringBuilder";
		StringBuilder builder = new StringBuilder();
		builder.append(string);
		System.out.println(builder);

		int size = obterTamanhoStringBuilder(builder);
		System.out.printf("tamanho: %d\n", size);

		System.out.printf("Invertido: %s\n", inverterStringBuffer(builder));

		builder = substituirCaracteres(inverterStringBuffer(builder), 0, 'u');
		System.out.println(builder);

	}

	// retorna o tamanho do buffer.
	public static int obterTamanhoStringBuilder(StringBuilder builder) {
		return builder.length();
	}

	// inverte o conteúdo do buffer.
	public static StringBuilder inverterStringBuffer(StringBuilder builder) {
		return builder.reverse();
	}

	// substitui a letra no indice indicado.
	public static StringBuilder substituirCaracteres(StringBuilder builder, int indice, Character letra) {
		builder.setCharAt(indice, letra);
		return builder;

	}

}
