package br.com.java.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * 
 * Serializando e deserealizando um objeto da classe Produto,com ObjectOutputStream. 
 * 
 * 
 */

public class TestandoSerializacao2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Produto produto = new Produto(1001l, "Teclado", 129.90);

		// Serializa o objeto da classe Produto.
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("arquivos/produto.bin"));
		oos.writeObject(produto);
		oos.close();

	}

}
