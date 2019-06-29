package br.com.estudo;

public class TesteArrays06 {

	public static void main(String[] args) {

		int intArray[] = { 1, 2, 3, 4, 5 };

		System.out.print("\nArray original: ");
		for (int valor : intArray)
			System.out.printf("(%d) ", valor);

		// passando o array para o método, realizar a operação
		modificarArray(intArray);

		System.out.print("\nArray modoficado após a chamadad ao método modificarArray: ");
		for (int valorModificado : intArray)
			System.out.printf("(%d)", valorModificado);

		System.out.print("\nvalor do elemento array[3] após chamada do método modificarArray: " + intArray[3]);

		System.out.println("\n\nElemento array[3] antes da chamado do método modificarElemento: " + intArray[3]);

		System.out.print("Elemento array[3] após a chamada ao método modificarElemento: ");
		// chamada ao método modificarElemento
		modificarElemento(intArray[3]);

	}

	public static void modificarArray(int array[]) {
		for (int cont = 0; cont < array.length; cont++)
			array[cont] *= 2;

	}

	public static void modificarElemento(int elemento) {
		elemento *= 2;
		System.out.println(elemento);

	}

}
