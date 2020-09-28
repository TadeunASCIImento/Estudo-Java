package br.com.estudo;

import java.util.Scanner;

/*
 * Calculando a média dos elementos em um array.
 */

public class TesteArrays02 {

	private static Scanner scanner = new Scanner(System.in);
	private static String inputMessage = "informe 4 numeros?";
	private static final int ARRAY_LENGTH = 4;

	public static void main(String[] args) {
		showInputMessage(inputMessage);
		double[] arrayDouble = gerarArrayDouble(ARRAY_LENGTH);
		exibirArrayDouble(arrayDouble);
		exibirMediaDosValoresNoArrayDouble(arrayDouble);
	}

	private static void exibirMediaDosValoresNoArrayDouble(double[] arrayDouble) {
		double media = 0, total = 0;
		for (int i = 0; i < arrayDouble.length; i++) {
			total += arrayDouble[i];
		}
		media = total / arrayDouble.length;
		System.out.printf("\nmédia dos elementos no array double: %.2f", media);

	}

	private static double[] gerarArrayDouble(int arrayLength) {
		double[] arrayDouble = new double[arrayLength];
		for (int i = 0; i < arrayDouble.length; i++) {
			arrayDouble[i] = scanner.nextDouble();
		}
		return arrayDouble;
	}

	private static void exibirArrayDouble(double[] arrayDouble) {
		System.out.print("elementos do array double: ");
		for (double e : arrayDouble) {
			System.out.printf("( %.2f )", e);
		}
	}

	private static void showInputMessage(String message) {
		System.out.println(message);
	}

}
