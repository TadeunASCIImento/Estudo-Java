package br.com.estudo;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteArrayList02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<String> itens = new ArrayList<String>();

		do {
			System.out.println("Digite os itens da lista ou Sair.");
			itens.add(scanner.nextLine());
		} while (!itens.contains("Sair"));

		System.out.println("Lista de itens em Arraylist.");
		for (int i = 0; i < itens.size(); i++) {
			if (itens.get(i).equals("Sair"))
				System.out.printf("");
			else
				System.out.println(itens.get(i));
		}


		System.out.println("Digite o nome do item para exclusão e pressione Enter.");
		itens.remove(scanner.nextLine());

		System.out.println("Lista de items em Arraylist após a exclusão.");
		for (int i = 0; i < itens.size(); i++) {
			if (itens.get(i).equals("Sair"))
				System.out.printf("");
			else
				System.out.println(itens.get(i));

			scanner.close();
		}

	}

}
