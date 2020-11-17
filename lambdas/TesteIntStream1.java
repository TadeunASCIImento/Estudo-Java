package br.com.tadeu.estudo.lambda;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/*
 * Fluxo epecializado para manipular valores int
 */

public class TesteIntStream1 {

	public static void main(String[] args) {

		int[] valores = { 1, 4, 5, 8, 9, 10, 6, 3, 2, 7 };

		// exibindo os valores originais.
		System.out.print("Valores iniciais:");
		IntStream.of(valores).forEach(valor -> System.out.printf("%d\t", valor));
		System.out.println("\n");

		// filtra os elementos pares
		System.out.print("Números pares:");
		IntStream.of(valores).filter(valor -> valor % 2 == 0).forEach(valor -> System.out.printf("%d ", valor));

		System.out.println("\n");

		// métodos count, min, max, sum e average.
		System.out.printf("Count: %d\n\n", IntStream.of(valores).count());
		System.out.printf("Min:  %d\n\n", IntStream.of(valores).min().getAsInt());
		System.out.printf("Max: %d\n\n", IntStream.of(valores).max().getAsInt());
		System.out.printf("Sum: %d\n\n", IntStream.of(valores).sum());
		System.out.printf("Average: %f\n\n", IntStream.of(valores).average().getAsDouble());

		// Somando os valores com o método reduce.
		System.out.printf("Soma com reduce: %d", IntStream.of(valores).reduce(0, (a, b) -> a + b));
		System.out.println("\n");

		// valores exibidos de forma ordenada crescente.
		System.out.printf("Ordem crescente: ");
		IntStream.of(valores).sorted().forEach(valor -> System.out.printf("%d ", valor));
		System.out.println("\n");

		// metodo summaryStatistics
		System.out.println("SummaryEstatistics: " + IntStream.of(valores).summaryStatistics());
		System.out.println();

		// Usando IntPredicate
		// compondo a expressão lambda com condoções mais detalhadas.
		IntPredicate pares = valor -> valor % 2 == 0;
		IntPredicate vaiorQue4 = valor -> valor > 4;
		System.out.print("Pares maiores que 4: ");
		IntStream.of(valores).filter(pares.and(vaiorQue4)).forEach(valor -> System.out.printf("%d ", valor));

	}

}
