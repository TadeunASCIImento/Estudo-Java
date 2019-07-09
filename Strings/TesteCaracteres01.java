package br.com.estudo;

// Metodos para testar caracteres, e converter maiúsculas e minúsculas
import java.util.Scanner;

public class TesteCaracteres01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um caracter e pressoine enter");
		String input = scanner.next();

		char c = input.charAt(0);

		System.out.printf("É definido: %b\n", Character.isDefined(c));

		System.out.printf("É um Digito: %b\n", Character.isDigit(c));

		System.out.printf("pode ser o primeiro caracter de  um indentificador Java %b\n",
				Character.isJavaIdentifierStart(c));

		System.out.printf("pode ser parte de um identificador em Java: %b\n", Character.isJavaIdentifierPart(c));

		System.out.printf("É Letra: %b\n", Character.isLetter(c));

		System.out.printf("É letra ou digito: %b\n", Character.isLetterOrDigit(c));

		System.out.printf("É minuscula: %b\n", Character.isLowerCase(c));

		System.out.printf("É maiuscula: %b\n", Character.isUpperCase(c));

		System.out.printf("Em minuscula: %s\n", Character.toLowerCase(c));

		System.out.printf("Em maiuscula: %s\n", Character.toUpperCase(c));

		scanner.close();

	}

}
