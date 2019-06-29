package br.com.estudo;

import java.util.Scanner;

public class TesteArrays02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);// cria fluxo de entrada de caracteres.
		float numeros[] = new float[3];
		float mediaNumeros = 0;

		System.out.println("\nDigite 3 números para cálculo da média.");
		for (int cont = 0; cont < numeros.length; cont++) {
			numeros[cont] = input.nextFloat();// solicita a entrada dos numeros via teclado.
		}
		// Percorre o array e efetua a soma de todos elementos contidos.
		for (int cont1 = 0; cont1 < numeros.length; cont1++) {
			mediaNumeros += numeros[cont1];
		}
		// mostra no console o resultado da média dos números.
		System.out.println("A média dos números é: " + mediaNumeros / numeros.length);
		input.close();// Fecha o fluxo de entrada de caracteres.

	}

}
