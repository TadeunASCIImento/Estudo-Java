package br.com.java.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * 
 * Deserializando um objeto do tipo String,com ObjectInputStream.
 * 
 * 
 */

public class TestandoDeserializacao1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// Deserealiza a string
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("arquivos/objeto.bin"));
		String palavra = (String) ois.readObject();
		ois.close();
		System.out.println(palavra);

	}

}
