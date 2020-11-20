package br.com.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 *
 * Escrevendo no arquivo com OutputStream, FileOutputStream, Writer e BufferedWriter.
 *
 */
public class TestandoEscrita1 {

	public static void main(String[] args) throws IOException {
		String lorem1 = "arquivos/lorem1.txt";
		BufferedReader br = TestandoLeitura1.read(lorem1);
		String linha = br.readLine();
		String lorem2 = "arquivos/lorem2.txt";
		escreve(br, linha, lorem2);
		System.out.println("Escrevendo no arquivo...");

	}

	// Escreve o conteúdo de br (cópia do arquivo lorem1.txt) para arquivo passado
	// como parâmetro.
	private static void escreve(BufferedReader br, String linha, String arquivo) {

		try {
			BufferedWriter bw = getWriter(arquivo);
			bw.write("Texto copiado do arquivo lorem1.txt novamente.\n\n");
			bw.newLine();
			while (linha != null) {
				bw.write(linha);
				bw.newLine();
				linha = br.readLine();
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Retorna um BufferedWriter para escrita no arquivo.
	private static BufferedWriter getWriter(String arquivo) {
		try {
			return new BufferedWriter(new FileWriter(arquivo));
		} catch (IOException e) {
			throw new ArquivoNaoLocalizadoException(e.getMessage());
		}
	}

}
