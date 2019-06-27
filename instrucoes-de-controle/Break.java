package br.com.estudo;

public class Break {

	public static void main(String[] args) {

		System.out.print("\nNúmeros antes da interrupção: ");

		// laço for controlado por contador
		for (int cont = 1; cont <= 10; cont++) {

			// verifica se cont é igual 5
			if (cont == 7)

				// interrompe o laço se cont for 7
				break;// usando a instrução break;

			System.out.printf("%d ", cont);// mostra cont diferente de 7
		}

	}
}
