
import java.util.Scanner;

/*
 * 	Usando métodos da classe String
 */

public class TesteStrings07 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Entre com a string:");
		String string1 = inputStringScanner();
		System.out.printf("String informada: %s\n", string1);
		exibirTamanhoDaString(string1);
		System.out.print("String invertida: ");
		inverterString(string1);

		System.out.println("\ninforme os índices de inicio e fim para nova string:");
		System.out.println("inicio?");
		int inicio = scanner.nextInt();
		System.out.println("fim?");
		int fim = scanner.nextInt();
		char[] charArray = getChars(string1, inicio, fim);
		exibirCharArray(charArray);

	}

	// inverte a string.
	private static void inverterString(String string) {
		for (int i = string.length() - 1; i >= 0; i--) {
			System.out.printf("%c", string.charAt(i));
		}
	}

	// entrada de dados do tipo String
	public static String inputStringScanner() {
		String string = scanner.nextLine();
		return string;
	}

	// exibe o tamanho da String.
	public static void exibirTamanhoDaString(String string) {
		System.out.printf("Tamanho: %d\n", string.length());
	}

	// passa os caracteres dos indices inicio até fim para charArray.
	public static char[] getChars(String string, int inicio, int fim) {
		char[] charArray = new char[string.length()];
		string.getChars(inicio, fim, charArray, 0);
		return charArray;
	}

	// exibe os caracteres em charArray.
	public static void exibirCharArray(char[] charArray) {
		for (char c : charArray) {
			System.out.printf("%c", c);
		}
	}

}
