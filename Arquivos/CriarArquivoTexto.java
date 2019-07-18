package br.com.estudo;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CriarArquivoTexto {

	private Formatter formatter;
	private Scanner scanner = new Scanner(System.in);

	public void abrirArquivo() {

		try {
			// cria o arquivo no disco se houver permissão
			formatter = new Formatter("C:Contatos.txt");

		} catch (SecurityException securityException) {
			System.err.println("Você não tem acesso de gravação neste arquivo.");
			System.exit(1);

		} catch (FileNotFoundException fileNotFoundException) {
			System.err.println("Erro ao abrir ou criar o arquivo.");
			System.exit(1);
		}
	}

	public void inserirContato() { // metodo para escrever no arquivo.

		Contato contato = new Contato();

		System.out.println("Entrada de dados de contato");
		System.out.printf("%s\n%s\n%s\n%s\n\n", "Para encerrar a entrada de dados,digite:",
				"quando você for solicitado a inserir dados.", "( No Linux / Mac  digite <ctrl> d e pressione Enter",
				"No Windows, digite <ctrl> z e pressione Enter");

		System.out.println("Digite o primeiro nome, sobrenome,telefone e email ? ");

		while (scanner.hasNext()) // Loop para indicar o fim do arquivo.
		{
			try {

				contato.setNome(scanner.next());
				contato.setSobrenome(scanner.next());
				contato.setTelefone(scanner.next());
				contato.setEmail(scanner.next());

				formatter.format("%s %s %s %s\n", contato.getNome(), contato.getSobrenome(), contato.getTelefone(),
						contato.getEmail());

			} catch (FormatterClosedException formatterClosedException) {
				System.err.println("Erro ao gravar no arquivo.");
				return;
			} catch (NoSuchElementException elementException) {
				System.err.println("Dados inválidos. Por favor, tente novamente.");
				scanner.nextLine();

			}

			System.out.println("Digite o primeiro nome, sobrenome,telefone e email ? ");
		}
		scanner.close();
	}

	public void fecharArquivo() {
		if (formatter != null)
			formatter.close();
	}
}
