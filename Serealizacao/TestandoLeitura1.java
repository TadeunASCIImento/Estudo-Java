package br.com.java.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *
 * Lendo um arquivo de texto com FileInputStream, InputStream e BufferedReader.
 *
 */
public class TestandoLeitura1 {

	public static void main(String[] args) {
		exibirArquivo("arquivos/lorem2.txt");
	}

	public static void exibirArquivo(String arquivo) {
		try {
			BufferedReader br = TestandoLeitura1.read("arquivos/lorem1.txt");
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// L� o arquivo se ele existir e retorna um BufferedReader
	public static BufferedReader read(String file) {
		try {
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis);
			return new BufferedReader(isr);
		} catch (FileNotFoundException e) {
			throw new ArquivoNaoLocalizadoException(e.getMessage());
		}
	}

}

class ArquivoNaoLocalizadoException extends RuntimeException {
	private static final long serialVersionUID = 7412464886235534375L;

	public ArquivoNaoLocalizadoException(String msg) {
		super("Erro na leitura do arquivo, ".concat(msg));
	}
}
