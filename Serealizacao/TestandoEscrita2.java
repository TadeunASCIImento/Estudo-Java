package br.com.java.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

/*
 *
 * Escrevendo no arquivo com PrintStream.
 *
 */
public class TestandoEscrita2 {

	public static void main(String[] args) throws FileNotFoundException {
		String arquivo = "arquivos/lorem2.txt";
		PrintStream ps = new PrintStream(new File(arquivo));
		ps.println("Escrevendo no arquivo com PrintStream.");
		ps.close();

		PrintWriter pw = new PrintWriter(new File(arquivo));
		pw.println("Escrevendo no arquivo com PrintStream.");
		pw.close();
	}

}
