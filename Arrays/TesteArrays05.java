package br.com.estudo;

public class TesteArrays05 {

	public static void main(String[] args) {


		// cria um array multidimensional de inteiros
		Integer integerarray[][] = { { 1, 2, 3 }, { 2, 6, 7 }, { 7, 9, 0 }, { 1 } };

		// cria um array multidimensional de doubles
		Double doubleArray[][] = { { 12.9, 3.4 }, { 7.8, 1.2 }, { 2.3, 6.7, 4.7 } };

		// cria um array multidimensional de strings
		String stringArray[][] = { { "nome01", "nome02" }, { "nome03", "nome04" } };
		// chamada ao metodo mostrarArray

		System.out.print("\nElementos em integerArray:");
		mostrarArrayInteger(integerarray);

		System.out.print("\n\nElementos em doubleArray:");
		mostrarArrayDouble(doubleArray);

		System.out.print("\n\nElementos em stringArray:");
		mostrarArraString(stringArray);
	}

	// metodos para mostrar o conteúdo nos arrays

	public static void mostrarArrayInteger(Integer[][] array) {
		// percorre as linhas
		for (Integer linha = 0; linha < array.length; linha++) {
			// percorre colunas
			for (Integer coluna = 0; coluna < array[linha].length; coluna++) {
				// mostra linhas e colunas
				System.out.print("(" + array[linha][coluna] + ") ");
			}
		}
	}

	public static void mostrarArrayDouble(Double[][] array) {
		// percorre as linhas
		for (Integer linha = 0; linha < array.length; linha++) {
			// percorre colunas
			for (Integer coluna = 0; coluna < array[linha].length; coluna++) {
				// mostra linhas e colunas
				System.out.print("(" + array[linha][coluna] + ") ");
			}
		}
	}

	public static void mostrarArraString(String[][] array) {
		// percorre as linhas
		for (Integer linha = 0; linha < array.length; linha++) {
			// percorre colunas
			for (Integer coluna = 0; coluna < array[linha].length; coluna++) {
				// mostra linhas e colunas
				System.out.print("(" + array[linha][coluna] + ") ");
			}
		}
	}
}
