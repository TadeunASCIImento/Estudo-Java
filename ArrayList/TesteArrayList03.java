package br.com.estudo;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteArrayList03 {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<String> listaNomes = new ArrayList<String>();

		do {
			System.out.println("Digite os nome: < Digite S para Sair >");
			listaNomes.add(scanner.nextLine());

		} while (!listaNomes.contains("S"));
		mostrarNomes(listaNomes);
		scanner.close();
	}

	public static void mostrarNomes(ArrayList<String> nomes) {

		System.out.println("Nomes na lista:");
		for (String str : nomes) {
			if (str.contains("S")) {
				System.out.println();
			} else {
				String strNomes = str;
				System.out.println(strNomes);
			}
		}
	}

}
