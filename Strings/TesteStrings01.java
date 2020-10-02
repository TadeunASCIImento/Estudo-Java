
import java.util.Scanner;

/*
 * Testando métodos da classe String e Character.
 */

public class TesteStrings01 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		print("informe string?");
		String string = inputString();
		char c = string.charAt(0);
		analisarCaracteres(c);
	}

	// entrada de dados String.
	public static String inputString() {
		return scanner.next();
	}

	// imprime no console.
	public static void print(String string) {
		System.out.print(string);
	}

	// analisando o caractere.
	private static void analisarCaracteres(char c) {
		// verifica se é definido.
		if (Character.isDefined(c)) {
			print("é definido.\n");
		}
		// verifica se é um digito.
		if (Character.isDigit(c)) {
			print("é digito.");
		}
		// verifica se é uma letra.
		if (Character.isLetter(c)) {
			print("é letra");
		}
		// verifica se é minúscula.
		if ((Character.isLowerCase(c))) {
			print(" minúscula");
		}
		// verifica se é maiúscula.
		if (Character.isUpperCase(c)) {
			print(" maiúscula.");
		}
	}
}
