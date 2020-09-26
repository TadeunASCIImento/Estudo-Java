package br.com.estudo;

import java.util.Scanner;

public class Break {

	private static Scanner scanner = new Scanner(System.in);

	private static int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	static String inputELement = "Elemento para busca no array? ";
	static String foundMessage = "Elemento localizado no array ";
	static String notfoundMessage = "Elemento não localizado no array ";

	public static void main(String[] args) {

		for (;;) {
			showMessage(inputELement);
			int elemento = input();
			if (findOne(elemento, array))
				break;
			showMessage(notfoundMessage);
		}
		showMessage(foundMessage);

	}

	private static void showMessage(String message) {
		System.out.println(message);
	}

	private static int input() {
		return scanner.nextInt();
	}

	private static boolean findOne(int elemento, int array[]) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == elemento) {
				return true;
			}
		}
		return false;
	}
}
