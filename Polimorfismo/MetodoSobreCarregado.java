package br.com.estudo;

public class MetodoSobreCarregado {

	public static void main(String[] args) {

		Integer[] integerArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 0.0 };

		Character[] characterArray = { 'J', 'A', 'V', 'A' };

		System.out.println("Array integerArray: ");
		mostrarArray(integerArray);

		System.out.println("\nArray doubleArray: ");
		mostrarArray(doubleArray);

		System.out.println("\nArray characterArray:");
		mostrarArray(characterArray);
	}

	// Metodos sobrecarregados.
	public static void mostrarArray(Integer[] array) {
		for (Integer elemento : array)
			System.out.printf("%s ", elemento);

		System.out.println();
	}

	public static void mostrarArray(Double[] array) {
		for (Double elemento : array)
			System.out.printf("%s ", elemento);

		System.out.println();
	}

	public static void mostrarArray(Character[] array) {
		for (Character elemento : array)
			System.out.printf("%s ", elemento);

		System.out.println();
	}
}
