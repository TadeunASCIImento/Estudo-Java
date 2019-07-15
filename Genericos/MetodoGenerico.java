package br.com.estudo;

public class MetodoGenerico {

	public static void main(String[] args) {

		Integer[] integerArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9 };

		Character[] characterArray = { 'G', 'e', 'n', 'e', 'r', 'i', 'c', 'o', 's' };

		System.out.println("Array integerArray: ");
		printArray(integerArray);

		System.out.println("\nArray doubleArray: ");
		printArray(doubleArray);

		System.out.println("\nArray characterArray:");
		printArray(characterArray);

	}

	// Metodo genérico.
	public static <T> void printArray(T[] inputArray) {

		for (T elemento : inputArray)
			System.out.printf("%s", elemento);
		System.out.println();

	}

}
