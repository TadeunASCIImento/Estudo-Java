package br.com.estudo;

public class TesteArrays04 {

	public static void main(String[] args) {

		// Declara 3 arrays de numeros inteiros.

		int x[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int y[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int z[] = new int[10];

		System.out.print("\nSomente números pares em z: ");

		// Percorre os arrays x e y.
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {

				// evita erro de divisão por zero
				if (x[i] == 0 & y[i] == 0) {// se elementos em x e y forem zero,
					continue; // retorna para o laço for inicial.

				} else {
					// se não for zero multiplica os elementos e armazena em z.
					z[i] = x[i] * y[i];
				}
			}

			if (z[i] % 2 == 0)// verifica se o elemento em z é par.
				System.out.printf("(%d)", z[i]);// mostra o elemento se for par.

			else
				System.out.print(" ");// insere um espaço entre os números em z.

		}
	}

}
