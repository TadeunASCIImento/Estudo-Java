package br.com.java.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 *
 * Serializando um objeto do tipo String, com ObjectOutputStream.
 *
 */

public class TestandoSerializacao1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		String palavra = "Serializa��o";

		// Serializa a string
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("arquivos/objeto.bin"));
		oos.writeObject(palavra);
		oos.close();


	}

}
