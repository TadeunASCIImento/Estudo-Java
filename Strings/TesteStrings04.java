package br.com.estudo;

public class TesteStrings04 {

	public static void main(String[] args) {

		String str = "Usando método substring";

		System.out.printf("Substring apartir do indice 10.  \"%s\"\n", str.substring(10));

		System.out.printf("%s \"%s\"\n", "Substring do indice 4 até o final da String.",
				str.substring(4, str.length()));
	}
}
