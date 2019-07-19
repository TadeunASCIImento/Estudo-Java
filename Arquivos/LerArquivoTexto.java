package br.com.estudo;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LerArquivoTexto {

	private Scanner scanner;

	public void abrirArquivo() {

		try {

			scanner = new Scanner(new File("C:Contatos.txt"));

		} catch (FileNotFoundException fileNotFoundException) {
			System.err.println("Erro ao abrir o arquivo");
			System.exit(1);
		}
	}

	public void mostrarContato() {

		Contato contato = new Contato();
		System.out.printf("%-12s%-12s%-12s%-12s\n", "Nome", "Sobrenome", "Telefone", "Email");

		try {

			while (scanner.hasNext()) {

				contato.setNome(scanner.next());
				contato.setSobrenome(scanner.next());
				contato.setTelefone(scanner.next());
				contato.setEmail(scanner.next());

				System.out.printf("%-10s%-12s%-12s%-10s\n", contato.getNome(), contato.getSobrenome(),
						contato.getTelefone(), contato.getEmail());
			}

		} catch (NoSuchElementException elementException) {
			System.err.println("Formato do arquivo inválido.");
			scanner.close();
			System.exit(1);

		} catch (IllegalStateException stateException) {
			System.err.println("Erro ao ler arquivo.");
			System.exit(1);
		}
	}

	public void fecharArquivo() {
		if (scanner != null)
			scanner.close();
	}
}
