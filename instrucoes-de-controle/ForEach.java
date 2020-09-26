package br.com.estudo;

import java.security.SecureRandom;
import java.util.Scanner;

public class ForEach {

	private static Scanner scanner = new Scanner(System.in);

	static String sizeMessage = "Tamanho para o array?";
	static String seedMessage = "Semente para o  array?";
	static String elementNotFound = "elemento não encontrado";
	static String elementFound = "elemento encontrado.";
	static String elementsRandonArray = "elementos em randomArray: ";

	public static void main(String[] args) {
		showMessage(sizeMessage);
		int size = getScannerInputInt();
		showMessage(seedMessage);
		int seed = getScannerInputInt();
		int[] randomArray = getRandomArrayInt(size, seed);
		showRandomArray(randomArray);
		int element = getScannerInputInt();
		boolean result = seekElement(element, randomArray);
		showSearchResult(result);

	}

	private static void showRandomArray(int[] randomArray) {
		showMessage(elementsRandonArray);
		for (int e : randomArray) {
			System.out.printf(" %d ", e);
		}

	}

	private static void showMessage(String message) {
		System.out.print(message);
	}

	private static int[] getRandomArrayInt(int size, int seed) {
		SecureRandom secureRandom = new SecureRandom();
		int[] randomArray = new int[size];
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = (1 + secureRandom.nextInt(seed));
		}
		return randomArray;
	}

	private static int getScannerInputInt() {
		int valorInt = scanner.nextInt();
		return valorInt;
	}

	private static boolean seekElement(int element, int[] randomArray) {
		for (int e : randomArray) {
			if (element == e) {
				return true;
			}
		}
		return false;
	}

	private static void showSearchResult(boolean result) {
		if (result)
			showMessage(elementFound);
		else
			showMessage(elementNotFound);
	}
}
