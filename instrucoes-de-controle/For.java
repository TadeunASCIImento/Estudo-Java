package br.com.estudo;

import java.util.Random;

public class For {

	public static void main(String[] args) {

		// cria objeto da classe Random
		Random gerador = new Random();

		// Cria array de inteiros de 20 elementos.
		int numeros[] = new int[20];

		// Variáveis para armazenar o resultado da soma.
		int somaPares = 0;
		int somaImpares = 0;

		// Laço for controlado por contator para preencher o array com números
		// aleatóriamente.
		for (int i = 0; i < numeros.length; i++) {
			// Gera números aleatórios de 1 á 100
			numeros[i] = gerador.nextInt(100);
		}

		// Laço ( foreach ) para percorrer e mostrar os números no array
		for (int numero : numeros) {// variante melhorada do laço for
			System.out.println("< Número gerado>: " + numero);
			// Verifica se o número é par
			if (numero % 2 == 0) {
				somaPares += numero;// Soma os pares.

			} else if (numero % 2 == 1) {
				// Verifica se o número é impar.
				somaImpares += numero;// Soma os impares.
			}

		}

		// Exibe o resultado da soma dos números pares e impares.
		System.out.println(
				"\n<A soma dos números pares é> : " + somaPares + "\n<A soma dos númerosimpares é> : " + somaImpares);

	}
}
