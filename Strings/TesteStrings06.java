package br.com.estudo;

/*
 *  Analisando inicio e fim de uma string com startsWith e endsWith.
 */

public class TesteStrings06 {

	public static void main(String[] args) {
		startsWith(getArray(), "in", 0);
		startsWith(getArray(), "ici", 2);
		endsWith(getArray(), "ado");
		endsWith(getArray(), "ndo");

	}

	// retorna o array de Strings.
	public static String[] getArray() {
		String[] array = { "inicio", "iniciando", "terminado", "terminando" };
		return array;
	}

	// analisa o inicio da string apartir da posição desejada.
	public static void startsWith(String[] array, String prefixo, int posicao) {
		for (String string : array) {
			if (string.startsWith(prefixo, posicao)) {
				System.out.printf("%s inicia com %s a partir da posição %d\n", string, prefixo, posicao);
			}
		}
	}

	// exibe as strings terminadas com o prefixo.
	public static void endsWith(String[] array, String prefixo) {
		for (String string : array) {
			if (string.endsWith(prefixo)) {
				System.out.printf("%s termina com %s\n", string, prefixo);
			}
		}
	}

}
