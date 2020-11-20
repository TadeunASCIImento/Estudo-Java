package br.com.java.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * 
 * Lendo um arquivo de texto com Scanner.
 * 
 */
public class TestandoLeitura2 {

	public static void main(String[] args) throws FileNotFoundException {

		String arquivo = "arquivos/lorem1.txt";
		
		Scanner scanner = new Scanner(new File(arquivo));	
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println(linha);

		}
		scanner.close();

	}

}
