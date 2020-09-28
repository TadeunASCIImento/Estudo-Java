package br.com.estudo;

import java.security.SecureRandom;
/*
 *  Operações de cálculo com arrays.
 */
public class TesteArrays04 {

	private static int size = 10;// define o tamanho dos arrays.

	public static void main(String[] args) {

		// cria e exiibe 2 arrays de numeros inteiros aleatórios.
		print("Elementos no array1: ");
		int array1[] = gerarArrayDeInteiros(size);
		exibirArrayDeInteiros(array1);

		print("Elementos no array2: ");
		int array2[] = gerarArrayDeInteiros(size);
		exibirArrayDeInteiros(array2);

		// multiplica todos os elementos do array1 com os do array2.
		print("Array2 multiplicado pelo Array1: ");
		int array3[] = multiplicarArraysDeInteiros(array1, array2);
		exibirArrayDeInteiros(array3);

		// exibi somente os elementos pares em array1 e array2.
		print("Somente elementos pares do array1: ");
		exibirElementosParesDoArray(array1);

		print("Somente elementos pares do array2: ");
		exibirElementosParesDoArray(array2);

	}

	private static int[] multiplicarArraysDeInteiros(int[] array1, int[] array2) {
		int array3[] = new int[size];
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				array3 = multiplicar(array1, array2);
			}
		}
		return array3;
	}

	private static int[] multiplicar(int[] array1, int[] array2) {
		int array3[] = new int[size];
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				array3[i] = array1[i] * array2[i];
			}
		}
		return array3;
	}

	private static boolean evitarDivisaoPorZero(int[] array1) {
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == 0) {
				return true;
			}
		}
		return false;
	}

	private static void exibirElementosParesDoArray(int[] arrayInt) {
		for (int i = 0; i < arrayInt.length; i++) {
			if (evitarDivisaoPorZero(arrayInt)) {
				continue;
			} else if (arrayInt[i] % 2 == 0) {
				printf(arrayInt[i]);
			}
		}
		print("\n");
	}

	private static void exibirArrayDeInteiros(int[] array) {
		for (int e : array) {
			System.out.printf(" %d ", e);
		}
		print("\n");
	}

	private static int[] gerarArrayDeInteiros(int size) {
		SecureRandom random = new SecureRandom();
		int[] arrayInt = new int[size];
		for (int i = 0; i < arrayInt.length; i++) {
			arrayInt[i] = (1 + random.nextInt(20));
		}
		return arrayInt;
	}

	private static void print(String string) {
		System.out.print(string);
	}

	private static void printf(int inteiro) {
		System.out.printf(" %d ", inteiro);
	}

}
