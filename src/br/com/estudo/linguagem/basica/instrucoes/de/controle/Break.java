package br.com.estudo.linguagem.basica.instrucoes.de.controle;

import java.util.Scanner;

public class Break {

	// Declara um array de 10 numeros para pesquisa.
	private static int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	static final String INPUT_MESSAGE = "Elemento para busca no array? ";
	static final String FOUND_MESSAGE = "Elemento localizado no array ";
	private static final String NOT_FOUND_MESSAGE = "Elemento não localizado no array ";;
	
	// stream de entrada do teclado.
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		for (;;) {
			showMessage(INPUT_MESSAGE);
			int elemento = input();
			if (findOne(elemento, array))
				break;
			showMessage(NOT_FOUND_MESSAGE);
		}
		showMessage(FOUND_MESSAGE);

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
