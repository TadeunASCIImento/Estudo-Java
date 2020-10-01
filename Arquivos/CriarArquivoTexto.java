package br.com.estudo;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CriaArquivoTexto {

	private Formatter formatter;

	private Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		CriaArquivoTexto application = new CriaArquivoTexto();
		application.abrirArquivo();
		application.gravar();
		application.fecharArquivo();
	}

	// abri/cria o arquivo.
	public void abrirArquivo() {
		try {
			// cria o arquivo no disco.
			formatter = new Formatter("c:contatos.txt");

			// sem permissão de acesso ao disco.
		} catch (SecurityException securiException) {
			System.err.println("sem acesso para gravação.");
			System.exit(1);

			// arquivo não localizado.
		} catch (FileNotFoundException foundException) {
			System.err.println("falha ao abrir/criar arquivo.");
			System.exit(1);
		}
	}

	// escreve no aquivo.
	public void gravar() {

		Contato contato = new Contato();
		exibirInformacoesDeEntradaDeDados();
		while (scanner.hasNext()) {
			try {
				contato = obterContato();
				formatter.format("%s  %s %s %s\n\n", contato.getNome(), contato.getSobrenome(), contato.getTelefone(),
						contato.getEmail());

			} catch (FormatterClosedException formatterClosedException) {
				System.err.println("Erro ao gravar no arquivo.");
				return;

			} catch (NoSuchElementException noSuchElementException) {
				System.err.println("Dados inválidos, tente novamente.");
				scanner.nextLine();

			}
			exibirInformacoesDeEntradaDeDados();
		}
	}

	// exibe as informações de entrada de dados de contato.
	private void exibirInformacoesDeEntradaDeDados() {
		System.out.println("Entrada de dados de contato:");
		System.out.printf("%s\n%s\n%s\n%s\n\n", "Para encerrar a entrada de dados,digite:",
				"quando você for solicitado a inserir dados.", "( No Linux / Mac  digite <ctrl> d e pressione Enter",
				"No Windows, digite <ctrl> z e pressione Enter");
		System.out.println("Informe o nome, sobrenome, telefone e email:");

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
		if (formatter != null) {
			formatter.close();
		}
	}

}
