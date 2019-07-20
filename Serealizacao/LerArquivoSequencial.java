package br.com.estudo;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LerArquivoSequencial {

	private ObjectInputStream input;

	public void abrirArquivo() {

		try {

			input = new ObjectInputStream(new FileInputStream("C:Contatos.ser"));

		} catch (IOException ioException) {

			System.err.println("Erro ao abrir arquivo.");
		}
	}

	public void lerContato() {

		ContatoSerealizado contato;

		System.out.printf("%-10s%-12s%-12s%10s\n", "Nome", "Sobrenome", "Telefone", "Email");

		try {
			while (true) {

				contato = (ContatoSerealizado) input.readObject();

				System.out.printf("%-10s%-12s%-12s%10s\n", contato.getNome(), contato.getSobrenome(),
						contato.getTelefone(), contato.getEmail());
			}

		} catch (EOFException endOfFileException) {

			return;

		} catch (ClassNotFoundException classNotFoundException) {

			System.err.println("Não é possível criar objeto.");

		} catch (IOException ioException) {

			System.err.println("Erro durante a leitura do arquivo.");
		}
	}

	public void fecharArquivo() {
		try {
			if (input != null)
				input.close();
			System.exit(0);
		} catch (IOException ioException) {
			System.err.println("Erro ao fechar arquivo.");
			System.exit(1);
		}
	}
}
