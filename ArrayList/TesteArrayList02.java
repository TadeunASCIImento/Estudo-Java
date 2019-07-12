package br.com.estudo;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteArrayList02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<String> items = new ArrayList<String>();

		do {
			System.out.println("Digite os items da lista ou Sair.");
			items.add(scanner.nextLine());
		} while (!items.contains("Sair"));

		System.out.println("Lista de items em Arraylist.");
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).equals("Sair"))
				System.out.printf("");
			else
				System.out.println(items.get(i));
		}


		System.out.println("Digite o nome do item para exclusão e preesione Enter.");
		items.remove(scanner.nextLine());

		System.out.println("Lista de items em Arraylist após a exclusão.");
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).equals("Sair"))
				System.out.printf("");
			else
				System.out.println(items.get(i));

			scanner.close();
		}

	}

}
