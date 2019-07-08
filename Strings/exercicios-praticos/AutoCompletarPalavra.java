package br.com.estudo;

import java.util.Scanner;

public class AutoCompletarPalavra {

	static Scanner scanner = new Scanner(System.in);

	static String strBusca;

	static String[] palavras = { "carroceiro", "carroceria", "carrocinha", "passarinho", "passageiro", "passatempo",
			"computação", "computador", "combinação" };

	public static void main(String[] args) {

		// digite apenas uma parte da palavra contida no array
		// e pressione enter
		System.out.println("Digite a palavra?");
		strBusca = scanner.next();

		// exibe as palavras começadas com as letras digitadas
		autoCompletar(strBusca);

	}

	private static void autoCompletar(String strBusca) {
		for (String str : palavras)
			if (str.startsWith(strBusca))
				System.out.println(str);

	}

}
