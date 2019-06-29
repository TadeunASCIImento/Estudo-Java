package br.com.estudo;

public class TesteArrays03 {

	public static void main(String[] args) {

		// Declara dois arrays de Strings com os nomes.
		String arrayNomes01[] = { "nome01", "nome02", "nome03" };
		String arrayNomes02[] = { "nome04", "nome05", "nome06" };

		System.out.print("\n\tElementos do arrayNomes01: ");
		mostrarNomesNoArray(arrayNomes01);

		System.out.print("\n\tElementos do arrayNomes02: ");
		mostrarNomesNoArray(arrayNomes02);

		compararNomes(arrayNomes01, arrayNomes02);

	}

	private static void compararNomes(String[] array1, String[] array2) {
		int contador = 0;
		int elementos = array1.length + array2.length;// quantidade de elementos nos dois arrays.

		// Percorre os dois arrays consecutivamente indice a indice usuando laços
		// aninhados.
		for (int a = 0; a < array1.length; a++) {
			for (int b = 0; b < array2.length; b++) {
				if (array1[a].equals(array2[b])) {// efetua a comparação entre os nomes.
					// se forem iguais mostra no console.
					System.out.println("\nOs nomes " + array1[a] + " e " + array2[b] + " são iguais");
					contador += 1;
				} else {

				}
			}
		}
		System.out
				.println("\n\tQtd de nomes nos arrays: (" + elementos + ")\n\tQtd de nomes iguais: (" + contador + ")");

		if (contador == 0)
			System.out.println("\tNão foram encontrados nomes iguais nos arrays.\n\n");
		else
			System.out.println("\tEncontrados nomes iguais nos arrays.\n\n");
	}

	private static void mostrarNomesNoArray(String[] array) {
		for (String elemento : array) {
			System.out.printf("(%s)", elemento);

		}

	}

}
