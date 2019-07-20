package br.com.estudo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CriaArquivoSequencial {

	private ObjectOutputStream output;

	Scanner scanner = new Scanner(System.in);

	public void abrirArqiuvo() {
		try {
			output = new ObjectOutputStream(new FileOutputStream("c:Contatos.ser"));
		} catch (IOException ioException) {
			System.err.println("Erro ao abrir arquivo.");
		}
	}

	public void inserirContato() {

		ContatoSerealizado contato;
		String nome;
		String sobrenome;
		String telefone;
		String email;

		System.out.println("Entrada de dados de contato");
		System.out.printf("%s\n%s\n%s\n%s\n\n", "Para encerrar a entrada de dados,digite:",
				"quando você for solicitado a inserir dados.", "( No Linux / Mac  digite <ctrl> d e pressione Enter",
				"No Windows, digite <ctrl> z e pressione Enter");
		System.out.println("Digite o primeiro nome, sobrenome,telefone e email ? ");

		while (scanner.hasNext()) {

			try {

				nome = scanner.next();
				sobrenome = scanner.next();
				telefone = scanner.next();
				email = scanner.next();

				contato = new ContatoSerealizado(nome, sobrenome, telefone, email);
				output.writeObject(contato);

			} catch (IOException ioException) {
				System.err.println("Erro ao  escrever no arquivo.");
				return;

			} catch (NoSuchElementException elementException) {
				System.err.println("Entrada inválida, tente novamente.");
				scanner.nextLine();
			}

			System.out.println("Digite o primeiro nome, sobrenome,telefone e email ? ");

		}
	}

	public void fecharArquivo() {

		try {
			if (output != null)
				output.close();

		} catch (IOException ioException) {
			System.err.println("Erro ao fechar arquivo");
			System.exit(1);
		}
	}
}
