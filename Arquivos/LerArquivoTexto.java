package br.com.estudo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*
 * Lendo o arquivo de texto do disco.
 */
public class LerArquivoTexto {

	private static Scanner scanner;

	public static void main(String[] args) {
		LerArquivoTexto application = new LerArquivoTexto();
		application.abrirArquivo();
		application.exibir();
		application.fecharArquivo();
	}

	// abrindo o arquivo se ele existir.
	public void abrirArquivo() {
		try {
			scanner = new Scanner(new File("c:contatos.txt"));
		} catch (FileNotFoundException fileNotFoundException) {
			System.err.println("Erro ao abrir arquivo.");
			System.exit(1);

		}
	}

	// exibe os dados de contato gravados no arquivo.
	public void exibir() {
		Contato contato = new Contato();
		System.out.printf("%-12s%-12s%-12s%-16s\n", "Nome", "Sobrenome", "Telefone", "Email");

		try {
			while (scanner.hasNext()) {
				contato = obterContato();
				System.out.printf("%-12s%-12s%-12s%-16s\n", contato.getNome(), contato.getSobrenome(),
						contato.getTelefone(), contato.getEmail());
			}
		} catch (NoSuchElementException noSuchElementException) {
			System.err.println("Formato inválido.");
			System.exit(1);
		} catch (IllegalStateException illegalStateException) {
			System.err.println("Erro ao ler arquivo.");
			System.exit(1);
		}

	}

	// obtem os dados de contato.
	private Contato obterContato() {
		Contato contato = new Contato();
		contato.setNome(scanner.next());
		contato.setSobrenome(scanner.next());
		contato.setTelefone(scanner.next());
		contato.setEmail(scanner.next());
		return contato;
	}

	// fecha o arquivo.
	public void fecharArquivo() {
		if (scanner != null) {
			scanner.close();
		}
	}

}
