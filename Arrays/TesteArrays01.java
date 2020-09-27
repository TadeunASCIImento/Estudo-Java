package br.com.estudo;

public class TesteArrays01 {

	public static void main(String[] args) {

		final int ARRAY_LENGTH = 10;// declara uma constante para o tamanho do array.

		int array[] = new int[ARRAY_LENGTH];// Declara um array de inteiros com tamanho
											// 10(constante ARRAY_LENGHT)

		for (int cont = 0; cont < array.length; cont++) {// Percorre o array
			array[cont] = 2 + 2 * cont;// atribui valores calculados no array
		}

		// Mostra o conteúdo do array após processamento.
		System.out.println("\n\tIndíce " + "\t\tValor ");
		for (int cont = 0; cont < array.length; cont++) {

			System.out.println("\t [" + cont + "]" + " \t\t[" + array[cont] + "]");
		}

	}

}
