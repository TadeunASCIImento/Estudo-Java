package br.com.estudo;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *  Criando um ArrayList de strings e exibindo as Strings.
 */

public class TesteArrayList03 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<String> arrayListNomes = new ArrayList<String>();
		print("informe os nomes ou sair para finalizar:");
		arrayListNomes = obterArraListDeNomes();
		print("nomes no ArrayList");
		exibirOarrayListDeNomes(arrayListNomes);

	}

	// exibe os nomes em arraylistNomes.
	private static void exibirOarrayListDeNomes(ArrayList<String> nomes) {
		for (String nome : nomes) {
			if (!nome.equalsIgnoreCase("Sair")) {
				print(nome);
			}
		}

	}

	// imprime no console.
	private static void print(Object object) {
		System.out.println(object);
	}

	// obtem os nomes para o arrayListNomes.
	private static ArrayList<String> obterArraListDeNomes() {
		ArrayList<String> arrayListNomes = new ArrayList<String>();
		// obtem entrada de nomes enquanto a entrada for diferente de sair.
		do {
			arrayListNomes.add(scanner.nextLine());
		} while (!arrayListNomes.contains("Sair"));
		return arrayListNomes;
	}

}
