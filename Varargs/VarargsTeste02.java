package br.com.estudo;

public class TesteVarargs02 {

	public static void main(String args[]) {

		/* Cria Arrays de strings com os nomes */
		String[] nome1 = { "João", "Maria", "Pedro", "José", "Silva" };

		String[] nome2 = { "Nascimento", "Gomes", "Souza" };

		/* Exibe os nomes no array nome1 */
		mostrarNomes(nome1);
		System.out.println("\n");

		/* Exibe os nomes no array nome2 */
		mostrarNomes(nome2);

	}

	/* Método utilizando varargs para exibição dos nomes */
	public static void mostrarNomes(String... nomes) {

		for (String nome : nomes)
			System.out.println("<" + nome + ">");
	}
}
