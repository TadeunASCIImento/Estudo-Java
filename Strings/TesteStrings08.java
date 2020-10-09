package br.com.estudo;

/*
   Construtores e outros métodos da classe String.
*/
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


		System.out.println("Informe a string:");
		String string = scanner.nextLine();
		System.out.print("String digitada: ");
		exibirAstringNoConsole(string);

		System.out.println("Informe o caractere antigo para substituição:");
		String antigo = scanner.next();
		System.out.println("novo caractere?");
		String novo = scanner.next();

		string = substituirCaractere(string,antigo,novo);
		System.out.println("String após a substituição de caracteres.");
		System.out.println(string);


	}

	//substitui os caracteres da string.
	private static String substituirCaractere(String string, String antigo,String novo) {
		return string.replace(antigo, novo);

	}

	// exibe a xtring informada.
	private static void exibirAstringNoConsole(String string) {
		System.out.println(string);
	}

}
