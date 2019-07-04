package br.com.estudo;

public class TesteStrings02 {

	public static void main(String[] args) {

		/* cria strings para comparação */
		String string1 = "Carro";
		String string2 = "Motocicleta";
		String string3 = "Barco";
		String string4 = "barco";

		/* exibe as strings a serem comparadas. */
		System.out.printf("string1 = %s\nstring2 = %s\nstring3 = %s\nstring4 = %s", string1, string2, string3, string4);

		/*
		 * Compara se string1 é igual a string Carro utilizando o método equals que
		 * retorna true se for igual ou false se for diferente.
		 */
		if (string1.equals("Carro"))
			System.out.println("\nstring1 é igual á Carro.");
		else
			System.out.println("\nstring1 não é igual á Carro.");

		/* Compara se string1 contém a mesma referência de objeto da string Carro. */
		if (string1 == "Carro")
			System.out.println("string1 é o mesmo objeto.");
		else
			System.out.println("string1 não é o mesmo objeto.");

		/* compara string3 com string4 ignorando maisculas e minusculas. */
		if (string3.equalsIgnoreCase(string4))
			System.out.println("string3 e string4 são iguais.");
		else
			System.out.println("string3 e string4 não são iguais.");

		/*
		 * comparando strings usando método compareTo que retorna 0 se as strings forem
		 * iguais, um inteiro negativo se a string chamadora do método for menor
		 * alfabéticamente e um iteiro positivo se for maior.
		 */
		System.out.printf("\nstring1 copareTo( string2 ) é %d", string1.compareTo(string2));
		System.out.printf("\nstring2 copareTo( string1 ) é %d", string2.compareTo(string1));
		System.out.printf("\nstring1 copareTo( string1 ) é %d", string1.compareTo(string1));
		System.out.printf("\nstring3 copareTo( string4 ) é %d", string3.compareTo(string4));
		System.out.printf("\nstring4 copareTo( string3 ) é %d", string4.compareTo(string3));

		/*
		 * comparando caracteres em uma determinada região da strings com o método
		 * regionsMatches.
		 */
		if (string3.regionMatches(0, string4, 0, 5))
			System.out.println("\nPrimeiros 5 caracteres de string3 encontrados em string4.");
		else
			System.out.println("\nPrimeiros 5 caracteres de string3 não encontrados em string4.");

		/* compara caracteres por região ignorando maisculas e minusculas. */
		if (string3.regionMatches(true, 0, string4, 0, 5))
			System.out.println("\nPrimeiros 5 caracter de string3 encontrados em string4;");
		else
			System.out.println("\nPrimeiros 5 caracteres de string3 não encontrados em string4.");

		System.out.println(string1.compareTo("Motocicleta"));

	}

}
