package br.com.estudo;

public class TesteStrings06 {

	public static void main(String[] args) {

		String[] strings = { "inicio", "iniciando", "terminado", "terminando" };

		for (String string : strings) {
			if (string.startsWith("in"))
				System.out.printf("\n%s Inicia com in", string);
		}

		for (String string : strings) {
			if (string.startsWith("ici", 2))
				System.out.printf("\n%s Inicia com ici apartir da posição 2.", string);
		}

		System.out.println("\n");

		for (String string : strings) {
			if (string.endsWith("ado"))
				System.out.printf("\n%s termina com ado", string);

		}

		for (String string : strings) {
			if (string.endsWith("ndo"))
				System.out.printf("\n%s termina com ndo", string);

		}

	}

}
