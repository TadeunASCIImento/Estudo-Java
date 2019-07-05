package br.com.estudo;

public class TesteStrings03 {

	public static void main(String[] args) {

		// strings a serem concatenadas.
		String nome = "Tadeu";
		String sobrenome = "Nascimento";

		/* Strings antes da chamada ao método concat. */
		System.out.printf("string nome = %s\nstring sobrenome = %s\n\n", nome, sobrenome);

		/*
		 * concatenando as strings nome e sobrenome chamando o metodo concat gerando uma
		 * nova string nomeCompleto.
		 */
		String nomeCompleto = nome.concat(" " + sobrenome);

		/* exibe a nova string nomeCompleto */
		System.out.printf("Resultado da concatenção das strings é %s", nomeCompleto);
	}
}
