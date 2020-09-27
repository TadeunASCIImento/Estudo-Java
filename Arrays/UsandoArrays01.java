package br.com.estudo;

public class UsandoArrays01 {

	public static void main(String[] args) {

		exibirArrayInt(gerarArrayDeInteiros());
	}

	private static int[] gerarArrayDeInteiros() {
		// constante, define o tamanho do array.
		final int ARRAY_LENGTH = 10;
		int[] arrayInt = new int[ARRAY_LENGTH];
		for (int i = 0; i < arrayInt.length; i++) {
			// populando o array.
			arrayInt[i] = (int) Math.pow(i, 2);
		}
		return arrayInt;
	}

	private static void exibirArrayInt(int[] arrayInt) {
		System.out.print("elementos no array: ");
		for (int e : arrayInt) {
			System.out.printf(" %d ", e);
		}
	}

}
