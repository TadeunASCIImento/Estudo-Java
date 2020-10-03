package br.com.estudo;

/*
 * 	Concatenando strings.
 */
public class TesteStrings03 {

	public static void main(String[] args) {

		// strings a serem concatenadas.
		String nome = "Tadeu";
		String sobrenome = "Nascimento";

		/* Strings antes da chamada ao método concatenarStrings. */
		System.out.printf("string nome = %s\nstring sobrenome = %s\n\n", nome, sobrenome);

		/*
		 * concatenando as strings nome e sobrenome chamando o metodo concatenarStrings
		 * gerando uma nova string nomeCompleto.
		 */
		String nomeCompleto = concatenarStrings(nome, sobrenome);

		/* exibe a nova string nomeCompleto */
		System.out.printf("Resultado da concatenção das strings é %s", nomeCompleto);
	}

	/* concatena e retorna a string concatenada. */
	public static String concatenarStrings(String string1, String string2) {
		return string1.concat(string2);
	}

}
