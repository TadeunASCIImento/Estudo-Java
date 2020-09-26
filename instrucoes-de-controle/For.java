package br.com.estudo;

import java.util.Random;
import java.util.Scanner;

public class For {

	// mensagens exibidas ao usuário.
	static String inputSizeMessage = "Tamanho para o array?";
	static String inputSeedMessage = "Semente para o  array?";
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		showMessage(inputSizeMessage);
		int size = getInputScanner();
		showMessage(inputSeedMessage);
		int semente = getInputScanner();
		int[] randomArray = getRandomArray(semente, size);
		showIntArray(randomArray);
	}

	// exibe as mensagens ao usuário.
	private static void showMessage(String mensagem) {
		System.out.print(mensagem);
	}

	// exibe os elementos do array usando o laço foreach.
	private static void showIntArray(int[] array) {
		showMessage("Elementos do array: ");
		for (int e : array) {
			System.out.printf(" %d", e);
		}
	}

	// retorna os valores de configuração do array.
	private static int getInputScanner() {
		int valorInt = scanner.nextInt();
		return valorInt;
	}

	// popula o array randômico usando o laço for.
	private static int[] getRandomArray(int semente, int size) {
		Random randon = new Random();
		int randomArray[] = new int[size];
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = (1 + randon.nextInt(semente));
		}
		return randomArray;
	}

}
