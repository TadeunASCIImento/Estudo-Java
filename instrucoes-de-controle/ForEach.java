package br.com.estudo;

import java.util.Scanner;

public class Foreach {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// cria um array de numeros
		int numeros[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int valor;
		boolean valorBusca = false;

		System.out.printf("\n\tDigite um número: ");
		valor = scanner.nextInt();

		// Laço foreach
		for (int numero : numeros) {
			if (numero == valor) {
				valorBusca = true;
				break;
			}
		}

		// Se o número for localizado no array exibe a mensagem.
		if (valorBusca)
			System.out.println("\nValor encontrado.");
		else
			// Senão exibe a mensagem
			System.out.println("\nValor não encontrado.");

		scanner.close();
	}

}
