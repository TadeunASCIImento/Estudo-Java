package br.com.tadeu.estudo.lambda;

import java.util.stream.IntStream;

/*
 * Fluxo epecializado para manipular valores int
 */

public class TesteIntStream1 {

	public static void main(String[] args) {

		int[] valores = { 1, 4, 5, 8, 9, 10, 6, 3, 2, 7 };

		// exibindo os valores originais.
		System.out.println("Valores iniciais:");
		IntStream.of(valores).forEach(valor -> System.out.printf("%d\t", valor));

		System.out.println("\n");

		// métodos count, min, max, sum e average.
		System.out.printf("Count %d\n", IntStream.of(valores).count());
		System.out.printf("Min  %d\n", IntStream.of(valores).min().getAsInt());
		System.out.printf("Max %d\n", IntStream.of(valores).max().getAsInt());
		System.out.printf("Sum %d\n", IntStream.of(valores).sum());
		System.out.printf("Average %f\n", IntStream.of(valores).average().getAsDouble());

		// Somando os valores com o método reduce.
		System.out.printf("Soma com reduce %d", IntStream.of(valores).reduce(0, (a, b) -> a + b));

		System.out.println("\n");

		// valores exibidos de forma ordenada crescente.
		System.out.printf("Ordem crescente \n");
		IntStream.of(valores).sorted().forEach(valor -> System.out.printf("%d ", valor));
	}

}
