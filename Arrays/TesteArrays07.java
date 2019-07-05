package br.com.estudo;

import java.util.Arrays;
import java.util.Scanner;

public class TesteArrays07 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double[] doubleArray = { 8.4, 4.5, 9.2, 0.2, 7.9, 4.9 };
		Arrays.sort(doubleArray);// classifica elementos no array na ordem crescente.

		System.out.println("\ndoubleArray: ");
		for (double x : doubleArray)
			System.out.print(" " + x);

		int[] intArray1 = new int[10];
		Arrays.fill(intArray1, 7);// preenche todos os indíces no array com valor 7.
		mostrarArray(intArray1, "\nintArray1");

		int[] intArray2 = { 12, 45, 43, 78, 16, 10 };
		int[] intArrayCopia = new int[intArray2.length];

		System.arraycopy(intArray2, 0, intArrayCopia, 0, intArray2.length);// copia dados de um array para outro.
		mostrarArray(intArray2, "\nintArray2");

		mostrarArray(intArrayCopia, "\nintArrayCopia");

		boolean b = Arrays.equals(intArray2, intArrayCopia);// compara se os elementos são equivalentes em dois arrays.
		System.out.printf("\n\nIntArray2 %s intArrayCopia", (b ? "é igual ao" : "é diferente de "));

		System.out.println("\n\nDigite o número para busca: ");

		int num = input.nextInt();
		int localizacao = Arrays.binarySearch(intArray2, num);// realiza busca binária por elemento no array.

		if (localizacao >= 0)
			System.out.printf("\n\nEncontrado " + num + " na posição " + localizacao);
		else
			System.out.println(num + " não encontrado em intArray2.");

		input.close();

	}

	// método para exibição do conteúdo do array.
	public static void mostrarArray(int[] array, String descricao) {
		System.out.printf("\n%s ", descricao);
		for (int valor : array)
			System.out.printf("%d ", valor);

	}

}
