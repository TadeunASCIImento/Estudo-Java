package br.com.arquivos.fluxos;

import java.io.File;
import java.util.Scanner;

/*
 *  Analizando o caminho de um arquivo/diretório.
 */

public class AnalisaCaminhoDoArquivoOuDiretorio {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		print("Informe o nome do arquivo ou diretório?");
		String arquivo = obterNomeDoArquivoOuDiretorio();
		analizarCaminhoDoArquivo(arquivo);

	}

	// obtem o nome do arquivo ou diretório.
	private static String obterNomeDoArquivoOuDiretorio() {
		String arquivo = scanner.nextLine();
		return arquivo;
	}

	// analiza o arquivo ou diretório.
	private static void analizarCaminhoDoArquivo(String arquivo) {
		File file = new File(arquivo);
		if (file.exists()) {
			printInfo(file);
			if (file.isDirectory()) {
				String[] directory = file.list();
				print("\nLista de arquivos do diretório:\n");
				exibirConteudoDoDiretorio(directory);
			}
		} else {
			print(arquivo.concat(" não encontrado."));
		}

	}

	// exibe o conteúdo do diretório.
	private static void exibirConteudoDoDiretorio(String[] directory) {
		for (String name : directory) {
			print(name);
			print("\n");
		}
	}

	// exibe as mensagens.
	private static void print(Object object) {
		System.out.print(object);

	}

	// exibe as informações do arquivo.
	private static void printInfo(File file) {
		System.out.printf("\n%s: ", file.getName().concat(" encontrado"));
		System.out.printf("\n%s", (file.isFile() ? "é arquivo" : "não é arquivo"));
		System.out.printf("\n%s", (file.isDirectory() ? "é diretório" : "não é diretório"));
		System.out.printf("\nmodificado em: %s", file.lastModified());
		System.out.printf("\ntamanho: %s", file.length());
		System.out.printf("\nCaminho: %s", file.getPath());
		System.out.printf("\nCaminho absoluto: %s", file.getAbsolutePath());
		System.out.printf("\nParent: %s\n", file.getParent());

	}

}
