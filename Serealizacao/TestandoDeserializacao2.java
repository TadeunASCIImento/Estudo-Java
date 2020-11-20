package br.com.java.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 *
 * Deserializando um objeto da classe Produto,com ObjectInputStream.
 * 
 *
 */

public class TestandoDeserializacao2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// Deserealiza o objeto da classe Produto.
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("arquivos/produto.bin"));
		Produto produto = (Produto) ois.readObject();
		ois.close();
		System.out.printf("Produto deserializado %s", produto);

	}

}
