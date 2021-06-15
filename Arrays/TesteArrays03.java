package br.com.estudo;

import java.util.Scanner;
/*
 * Comparando Strings entre arrays diferentes.
 */
public class TesteArrays03 {

	private static Scanner scanner = new Scanner(System.in);
	private static String inputNomeMessage = "Informe 3 nomes ?";
	private static String equalMessage = " existe no arrayNomes2.";
	private static String showArrayMessage = "Nomes no array:";

	public static void main(String[] args) {
		showMessage(inputNomeMessage);
		String[] arrayNomes1 = getArrayNomes();
		exibirArrayDeNomes(arrayNomes1);
		System.out.println("\n");
		showMessage(inputNomeMessage);
		String[] arrayNomes2 = getArrayNomes();
		exibirArrayDeNomes(arrayNomes2);
		System.out.println("\n");
		getEquals(arrayNomes1, arrayNomes2);

	}

	// verifica quais nomes são e não são iguais.
	private static void getEquals(String[] arrayNomes1, String[] arrayNomes2) {
		for (int j = 0; j < arrayNomes1.length; j++) {
			for (int i = 0; i < arrayNomes1.length; i++) {
				if (arrayNomes1[i].contains(arrayNomes2[j])) {
					showMessage("O nome ".concat(arrayNomes1[i].concat(equalMessage)));
					System.out.println("\n");
				}
			}
		}
	}

	private static String[] getArrayNomes() {
		String[] arrayNomes = new String[3];
		for (int i = 0; i < arrayNomes.length; i++) {
			arrayNomes[i] = scanner.next();
		}
		return arrayNomes;
	}

	private static void exibirArrayDeNomes(String[] arrayNomes) {
		showMessage(showArrayMessage);
		for (String e : arrayNomes) {
			showMessage("  ".concat(e));
		}
	}

	private static void showMessage(String message) {
		System.out.print(message);
	}

}
