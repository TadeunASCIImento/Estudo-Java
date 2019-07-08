package br.com.estudo;

public class TesteStrings07 {

	public static void main(String[] args) {

		// cria a string
		String str1 = "Outros métodos da classe String";

		// cria um array de caracteres
		char[] charArray = new char[5];

		// exibe a string
		System.out.printf("str1: %s", str1);

		// exibe o tamanho da string
		System.out.printf("\nTamanho de str1: %d ", str1.length());

		// exibe a string invertida
		System.out.print("\nInvertendo str1 é : ");
		for (int count = str1.length() - 1; count >= 0; count--)
			System.out.printf("%c", str1.charAt(count));

		// passa os caracteres do indice 0 ao 5 para charArray
		str1.getChars(0, 5, charArray, 0);
		System.out.print("\nOs caracteres em charArray do indíce 0 ao 5: ");
		for (char letra : charArray)
			System.out.print(" " + letra);

	}

}
