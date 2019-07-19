package br.com.arquivos.fluxos;

import java.io.File;
import java.util.Scanner;

public class AnalizaCaminhoArquivo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o nome do arquivo ou diretório: ");
		analizarCaminho(scanner.nextLine());
		scanner.close();
	}

	public static void analizarCaminho(String caminho) {

		File arquivo = new File(caminho);

		if (arquivo.exists()) {

			System.out.printf("\n%s", arquivo.getName() + " existe");
			System.out.printf("\n%s", (arquivo.isFile() ? "É um arquivo" : "não é um arquivo"));
			System.out.printf("\n%s", (arquivo.isDirectory() ? "É diretório" : "Não é diretótio"));
			System.out.printf("\n%s", (arquivo.isAbsolute() ? "É caminho absoluto" : "não é caminho absoluto"));
			System.out.printf("\nUltima modificação %s ", arquivo.lastModified());
			System.out.printf("\nTamanho %s:  ", arquivo.length());
			System.out.printf("\nCaminho: %s ", arquivo.getPath());
			System.out.printf("\nCaminho absoluto: %s ", arquivo.getAbsolutePath());
			System.out.printf("\nParente: %s ", arquivo.getParent());

			if (arquivo.isDirectory()) {
				String[] directory = arquivo.list();
				System.out.println("\n\nDiretório contém:\n");

				for (String directoryName : directory)
					System.out.println(directoryName);
			}
		} else {
			System.out.printf("%s %s", caminho, "não existe.");
		}
	}
}
