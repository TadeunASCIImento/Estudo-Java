package br.com.estudo;

public class UsandoExcecoes {

	public static void main(String[] args) {

		try {

			lancaExcecao();

		} catch (Exception exception) {

			System.err.println("Exceção do handler main.");
		}

		naoLancaExcecao();
	}

	public static void lancaExcecao() throws Exception {

		try {

			System.out.println("Metodo throws Exception.");

			throw new Exception();

		} catch (Exception exception) {

			System.err.println("Exceção lançada no metodo lancaExcecao." + exception);

			throw exception;

		} finally {

			System.err.println("Finally executado em lancaExcecao.");
		}
	}

	public static void naoLancaExcecao() {

		try {

			System.out.println("Metodo naoLancaExcecao");

		} catch (Exception exception) {

			System.err.println(exception);

		} finally {

			System.err.println("Finally executado em naoLancaExcecao.");
		}

		System.out.println("Fim do metodo naoLancaExcecao.");
	}

}
