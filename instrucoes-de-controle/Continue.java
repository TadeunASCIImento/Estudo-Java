package br.com.estudo;

public class Continue {

	public static void main(String[] args) {

		System.out.println("\nSomente os números impares entre 1 e 10.");

		// laço for controlado por contador
		for (int cont = 1; cont <= 10; cont++) {

			// verifica se cont é par ( % )operador módulo
			if (cont % 2 == 0)

				// retorna controle para o laço for se count for par
				continue;// usando a instrução continue

			System.out.printf("%d ", cont);// mostra cont se for impar
		}

	}
}
