package br.com.estudo;

public class TesteStrings08 {

	public static void main(String[] args) {

		// array de caracteres
		char[] charArray = { 'C', 'o', 'n', 's', 't', 'r', 'u', 't', 'o', 'r', 'e', 's' };

		// construtores strings
		String string01 = new String("Construtor");
		String string02 = new String();
		String string03 = new String(string01);
		String string04 = new String(charArray);
		
    // cria uma substring com 3 caracteres iniciando no indice 5
		String string05 = new String(charArray, 5, 3);

		System.out.printf("string01 = %s\nstring02 = %s\nstring03 = %s", string01, string02, string03);

		System.out.printf("\nstring04 = %s\nstring05 = %s\n", string04, string05);

	}

}
