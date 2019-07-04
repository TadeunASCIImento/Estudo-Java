package br.com.estudo;

/* Comparando Strings com os métodos equals e compareTo. */


public class TesteStrings01 {

	public static void main(String[] args) {

		String str1 = "Manipulando Strings com os metodos da classe String";
		String str2 = new String(str1);// constrói uma nova String com o mesmo argumento de str1.
		String str3 = "Utilizando alguns métodos da classe String";
		int result;

		// Mostra o tamanho da String.
		System.out.println("Tamanho de str1: " + str1.length());

		for (int i = 0; i < str1.length(); i++)
		System.out.println(str1.charAt(i));// Mostra no console cada caractere da String.

		if (str1.equals(str2))// Compara str1 e str2 retorna true se for verdadeiro.
		System.out.println("str1 é igual á str2");

		else// retorna false senão forem iguais.
		System.out.println("str1 diferente de str2");

		if (str1.equals(str3))
		System.out.println("str1 é igual á str3");
		else
		System.out.println("str1 diferent de str3");

		result = str1.compareTo(str3);/* Compara as strings str1 e str3 pelo tamanho */
		if (result == 0)// se forem iguais retorna 0.
		System.out.println(" str1 e str3 são iguais");

		else if (result < 0) //retorna um inteiro negativo se str1 for menor.
		System.out.println("str1 é menor que str3");

		else if (result > 0)// retorna um inteiro maior que 0 se str1 for maior
		System.out.println("str1 é maior que str3");

	}

}
